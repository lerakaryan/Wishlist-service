package practice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "board")
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id", nullable = false)
    private Long boardId;
    @Column(name = "board_name", nullable = false)
    private String boardName;
    @Column(name = "event_date")
    private LocalDate eventDate;
//    @Column(name = "author_id", nullable = false)
//    private Long authorId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name = "author_id")
    private User user;
}



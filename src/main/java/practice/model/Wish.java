package practice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "wish")
public class Wish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wish_id", nullable = false)
    private Long userId;
    @Column(name = "link", nullable = false)
    private String link;
    @Column(name = "wish_name", nullable = false)
    private String wishName;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "price", nullable = false)
    private Integer price;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "wishes")
    private Set<User> users = new HashSet<>();
}

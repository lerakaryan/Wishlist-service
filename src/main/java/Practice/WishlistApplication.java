package Practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import Practice.Repository.*;
import Practice.Model.*;

@SpringBootApplication
public class WishlistApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(WishlistApplication.class, args);
        UserRepository userReporsitory = context.getBean(UserRepository.class);
//        User user = new User();
//        user.setUserName("Lera");
//        userReporsitory.save(user);
//        User myUser = userReporsitory.findById(1l).get();
//        BoardRepository boardRepository = context.getBean(BoardRepository.class);
//        Board board = new Board();
//        board.setBoardName("Birthday");
//        board.setUser(myUser);
//        boardRepository.save(board);
    }

}
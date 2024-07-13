package practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import practice.repository.*;

@SpringBootApplication
public class WishlistApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(WishlistApplication.class, args);
        UserRepository userRepository = context.getBean(UserRepository.class);
//        User user = new User();
//        user.setUserName("Lera");
//        userRepository.save(user);
//        User myUser = userRepository.findById(1l).get();
//        BoardRepository boardRepository = context.getBean(BoardRepository.class);
//        Board board = new Board();
//        board.setBoardName("Birthday");
//        board.setUser(myUser);
//        boardRepository.save(board);
    }

}
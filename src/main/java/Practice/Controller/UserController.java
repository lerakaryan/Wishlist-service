package Practice.Controller;

import Practice.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import Practice.Model.User;
import javax.persistence.Access;

@RestController
@RequestMapping("")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "{user_id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<User> getUser () {
        return null;
    }
}

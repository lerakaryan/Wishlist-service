package practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import practice.model.User;
import practice.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = {"user_id"})
    public ResponseEntity<User> getUser (@PathVariable("user_id") Long userId) {
        if (userId == null) {
            return new ResponseEntity<User>(HttpStatus.BAD_REQUEST);
        }
        User user = this.userService.getById(userId);
        if (user == null) {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

    @PostMapping ()
    public ResponseEntity<User> saveUser (@RequestBody @Validated User user) {
        HttpHeaders headers = new HttpHeaders();
        if (user == null) {
            return new ResponseEntity<User>(HttpStatus.BAD_REQUEST);
        }
        this.userService.save(user);
        return new ResponseEntity<User>(user, HttpStatus.CREATED);
    }

    @PutMapping()
    public ResponseEntity<User> updateUser (@RequestBody @Validated User user) {
        HttpHeaders headers = new HttpHeaders();
        if (user == null) {
            return new ResponseEntity<User>(HttpStatus.BAD_REQUEST);
        }
        this.userService.save(user);
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<User> deleteUser (Long id) {
        User user = this.userService.getById(id);
        if (user == null) {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
        this.userService.deleteById(id);
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<User>> getAllUsers () {
        List<User> users = this.userService.getAll();
        if (users == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

}

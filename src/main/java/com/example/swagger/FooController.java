package com.example.swagger;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;


@RestController
public class FooController {

    @GetMapping(path = "user/{id}")
    public User getUser(@PathVariable String id) {
        return new User(id, "ichiro");
    }

    @GetMapping(path = "users")
    public List<User> getUsers() {
        return List.of( //
                new User("001", "ichiro"),
                new User("002", "jiro") //
        );
    }

    @PostMapping(path = "user")
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(final @Valid @RequestBody User user, final BindingResult bindingResult) {
        // do something
    }

    @PutMapping(path = "user/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public void updateUser(@PathVariable String id, @Valid @RequestBody User user,
                           final BindingResult bindingResult) {
        // do something
    }

    @DeleteMapping(path = "user/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable String id) {
        // do something
    }
}

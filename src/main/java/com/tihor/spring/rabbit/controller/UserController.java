package com.tihor.spring.rabbit.controller;

import com.tihor.spring.rabbit.model.UserRequest;
import com.tihor.spring.rabbit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type User controller.
 */
@RestController
public class UserController {
    /**
     * User Service.
     */
    private final UserService userService;

    /**
     * Instantiates a new User controller.
     *
     * @param userService the user service
     */
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * Save user response entity.
     *
     * @param request the request
     * @return the response entity
     */
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ResponseEntity saveUser(@RequestBody final UserRequest request) {
        userService.publishUser(request);
        return new ResponseEntity(HttpStatus.OK);
    }
}

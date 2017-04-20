package com.tihor.spring.rabbit.service;

import com.tihor.spring.rabbit.model.UserRequest;
import com.tihor.spring.rabbit.publisher.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type User service.
 */
@Service
public class UserService {
    /**
     * Publisher.
     */
    private final Publisher publisher;

    /**
     * Instantiates a new User service.
     *
     * @param publisher the publisher
     */
    @Autowired
    public UserService(Publisher publisher) {
        this.publisher = publisher;
    }

    /**
     * Publish user.
     *
     * @param request the request
     */
    public void publishUser(final UserRequest request) {
        publisher.publish(request);
    }
}

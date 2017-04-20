package com.tihor.spring.rabbit.publisher;

import com.tihor.spring.rabbit.model.UserRequest;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

/**
 * SI Gateway Interface to manage publishing to RabbitMQ.
 */
@MessagingGateway
public interface Publisher {
    /**
     * Publish the the transaction to the SI gateway.
     * @param request request.
     */
    @Gateway(requestChannel = "publish-channel")
    void publish(final UserRequest request);
}

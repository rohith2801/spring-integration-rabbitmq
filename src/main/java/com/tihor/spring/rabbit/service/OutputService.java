package com.tihor.spring.rabbit.service;

import com.tihor.spring.rabbit.model.UserRequest;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Service;

/**
 * The type Output service.
 */
@Service
public class OutputService {
    /**
     * Print object.
     *
     * @param request the request
     * @param header  the header
     */
    @ServiceActivator(inputChannel = "output-channel")
    public void printObject(final UserRequest request, @Header("headerKey") final String header) {
        System.out.println(request);
        System.out.println(header);
    }
}

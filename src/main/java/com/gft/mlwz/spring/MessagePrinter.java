package com.gft.mlwz.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MessagePrinter {

    final static Logger logger = LoggerFactory.getLogger(MessagePrinter.class);

    @Autowired
    private MessageService service;

    public void printMessage() {
        logger.info(service.getMessage());
    }
}

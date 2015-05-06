package com.gft.mlwz.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class HelloApp {

    final static Logger logger = LoggerFactory.getLogger(HelloApp.class);

    @Bean
    MessageService mockMessageService() {
        return new MessageService() {
            public String getMessage() {
                return "Hello World from Mocked Service!";
            }
        };
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloApp.class);
        HelloService helloService = context.getBean(HelloService.class);
        logger.info(helloService.sayHello());

        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();
    }
}

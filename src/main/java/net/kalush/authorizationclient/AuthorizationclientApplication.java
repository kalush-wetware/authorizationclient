package net.kalush.authorizationclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AuthorizationclientApplication extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(AuthorizationclientApplication.class, args);
    }

}

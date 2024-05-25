package com.ifrutcommerce.ifrut.config;

import com.ifrutcommerce.ifrut.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TesteConfig implements CommandLineRunner {
    @Autowired
    private UserRepository Userrepository;

    @Override
    public void run(String... args) throws Exception
        User u =
}

package com.example.app;

import com.example.app.sec.Entity.AppRole;
import com.example.app.sec.Entity.AppUser;
import com.example.app.sec.Service.AccountService;
import com.example.app.sec.Service.AccountServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class AppApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);

    }
    @Bean
    CommandLineRunner start(AccountService accountService){
        return  args -> {
            accountService.addNewRole(new AppRole(null,"USER"));
            accountService.addNewRole(new AppRole(null,"ADMIN"));
            accountService.addNewRole(new AppRole(null,"PRODUCT_MANGER"));
            accountService.addNewRole(new AppRole(null,"CUSTOMER_MANAGER"));
            accountService.addNewRole(new AppRole(null,"BILLS_MANAGER"));
            accountService.addNewUser(new AppUser(null,"user1" , "123" , new ArrayList<>()));
            accountService.addNewUser(new AppUser(null,"user2" , "123" , new ArrayList<>()));
            accountService.addNewUser(new AppUser(null,"user3" , "123" , new ArrayList<>()));
            accountService.addNewUser(new AppUser(null,"user4" , "123" , new ArrayList<>()));
            accountService.addRoleToUser("user1","ADMIN");
            accountService.addRoleToUser("user1","BILLS_MANAGER");
            accountService.addRoleToUser("user2","USER");
            accountService.addRoleToUser("user1","CUSTOMER_MANAGER");
            accountService.addRoleToUser("user1","PRODUCT_MANGER");
            accountService.addRoleToUser("user1","USER");
        };
    }
}

package com.example.webcontent;

import com.example.webcontent.app.AddressBook;
import com.example.webcontent.app.AddressBookRepository;
import com.example.webcontent.app.BuddyInfo;
import com.example.webcontent.app.BuddyInfoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServingWebContentApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServingWebContentApplication.class, args);

    }


/*    @Bean
    public CommandLineRunner demo(AddressBookRepository bookrepository, BuddyInfoRepository buddyInfoRepository) {
        return (args) -> {

            BuddyInfo buddy1 = new BuddyInfo("jack","123");
            BuddyInfo buddy2 = new BuddyInfo("jack","123");
            BuddyInfo buddy3 = new BuddyInfo("jack","123");
            buddyInfoRepository.save(buddy1);
            buddyInfoRepository.save(buddy2);
            buddyInfoRepository.save(buddy3);
            AddressBook book = new AddressBook();
            book.addBuddy(buddy1);
            book.addBuddy(buddy2);
            book.addBuddy(buddy3);

            bookrepository.save(book);


        };
    }*/


}

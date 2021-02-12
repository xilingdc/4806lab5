package com.example.webcontent.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerBuddy1 {

    @Autowired
    private AddressBookRepository adressbookR;


    @GetMapping("/aa")
    public String method (Model model){
        model.addAttribute("book",adressbookR.findAll());


        return "aa";
    }



}


package com.example.webcontent.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerBuddy1 {

    @Autowired
    private BuddyInfoRepository brepo;

    @GetMapping("/buddy")
    public String buddyForm(Model model) {
        model.addAttribute("BuddyInfo", new BuddyInfo());
        return "AddBuddy";
    }



}
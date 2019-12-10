package com.greenfox.CircleCIHeroku.controllers;

import com.greenfox.CircleCIHeroku.services.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


    @Autowired
    private HomeService homeService;

    @GetMapping(value="/")
    public String Index(Model model) {
        model.addAttribute("sum", homeService.sumNumbers(2,4));
        return "index";
    }

}

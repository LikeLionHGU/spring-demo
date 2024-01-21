package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/form")
    public String form(@RequestParam(defaultValue = "World") String name, Model model) {
        String newName = name + "!";
        model.addAttribute("name", newName);
        return "index";
    }
}
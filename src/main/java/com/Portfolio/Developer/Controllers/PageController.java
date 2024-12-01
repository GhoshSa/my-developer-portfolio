package com.Portfolio.Developer.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/home")
    public String Home() {
        return "Home";
    }

    @GetMapping("/about")
    public String About() {
        return "About";
    }

    @GetMapping("/projects")
    public String Projects() {
        return "Projects";
    }

    @GetMapping("/contact")
    public String Contact() {
        return "Contact";
    }
}

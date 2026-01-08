package pl.vistula.task1.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return "Hello from Spring Boot!";
    }

    @GetMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("message","Welcome to Spring MVC!");
        return "greeting";

    }

}

package com.example.igor.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Taskcontroller {

    @GetMapping("/create")
    public String create() {
        return "create";
    }
    
}

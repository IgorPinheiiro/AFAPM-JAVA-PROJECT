package com.example.AFAPM.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@Controller
public class Taskcontroller {



    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/cadastro")
    public String cadastro() {
        return "cadastro";
    }

    @PostMapping("/cadastro")
    public String () {
        return entity;
    }
    


    @GetMapping("/registrado")
    public String registrado() {
        return "registrado";
    }
    
}

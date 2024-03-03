package ru.agapov.DSP.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.agapov.DSP.Services.UserService;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/test")
    public String index(){
        return "index";
    }
}

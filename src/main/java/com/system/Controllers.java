package com.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controllers {
    @GetMapping("/index")
    public String hello(){
        return "index";
    }

    @GetMapping("/hr")
    public String widget(){
        return "/hr/index";
    }

    @GetMapping("/accounts")
    public String accounts(){
        return "/accounts/index";
    }

    @GetMapping("/jewelry")
    public String fleet(){
        return "/jewelry/index";
    }

    @GetMapping("/helpdesk")
    public String helpdesk(){
        return "/helpdesk/index";
    }

    @GetMapping("/parameters")
    public String parameters(){
        return "/parameters/index";
    }

    @GetMapping("/payroll")
    public String payroll(){
        return "/payroll/index";
    }


}

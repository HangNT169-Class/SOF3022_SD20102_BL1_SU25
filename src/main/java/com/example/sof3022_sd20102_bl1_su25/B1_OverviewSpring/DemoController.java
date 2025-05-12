package com.example.sof3022_sd20102_bl1_su25.B1_OverviewSpring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// class => bean => danh bang annotation (@)
@Controller
public class DemoController {

    /**
     * GET & POST => GetMapping , PostMapping
     * /demo => hien thi giao dien buoi 1 => Get
     * Tat ca cac ham trong class @Controller => LUON LUON TRA VE STRING (Return 1 VIEW)
     */

    @GetMapping("demo")
    public String hienThiGiaoDienDemo(Model m){
        // Day gia tri servlet => jsp: setAttribute
        // J5: Model(import .ui) => addAttribute
        String message = "Gia tri tu controller";
        m.addAttribute("mess",message);
        return "buoi1";
    }
}

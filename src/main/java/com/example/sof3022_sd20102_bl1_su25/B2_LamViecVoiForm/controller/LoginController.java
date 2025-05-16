package com.example.sof3022_sd20102_bl1_su25.B2_LamViecVoiForm.controller;

import com.example.sof3022_sd20102_bl1_su25.B2_LamViecVoiForm.request.LoginRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String hienThiGiaoDienLogin() {
        return "buoi2/login";
    }

    //    @PostMapping("/ket-qua")
//    public String xuLyFormLogin(
//            @RequestParam("username") String uname,
//            @RequestParam("password") String pword, Model m
//    ){
//        // J4: Lay gia tri vua nhap tu view: getParameter
//        // J5: @RequestParam => truyen truc tiep tham so vao ham
//        // => Lay thong qua name cua o input
//        m.addAttribute("username",uname);
//        m.addAttribute("password",pword);
//        return "buoi2/form-xu-ly";
//    }
    @PostMapping("/ket-qua")
    public String xuLyFormLogin(
            LoginRequest request, Model m
    ) {
        // J4: Lay gia tri vua nhap tu view: getParameter
        // J5: @RequestParam => truyen truc tiep tham so vao ham
        // => Lay thong qua name cua o input
        m.addAttribute("username", request.getUnam());
        m.addAttribute("password", request.getPass());
        return "buoi2/form-xu-ly";
    }
}

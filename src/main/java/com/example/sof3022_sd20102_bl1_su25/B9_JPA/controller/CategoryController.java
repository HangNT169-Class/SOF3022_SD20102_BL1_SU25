package com.example.sof3022_sd20102_bl1_su25.B9_JPA.controller;

import com.example.sof3022_sd20102_bl1_su25.B9_JPA.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {

    @Autowired
    private CategoryService cateService;

    @GetMapping("/category/test")
    public String hienThiDuLieu(Model m){
        m.addAttribute("lists",cateService.getAll());
        return "buoi9/hien-thi";
    }
}

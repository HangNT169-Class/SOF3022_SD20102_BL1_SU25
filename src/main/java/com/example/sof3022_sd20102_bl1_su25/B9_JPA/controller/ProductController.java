package com.example.sof3022_sd20102_bl1_su25.B9_JPA.controller;

import com.example.sof3022_sd20102_bl1_su25.B9_JPA.service.CategoryService;
import com.example.sof3022_sd20102_bl1_su25.B9_JPA.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/product/hien-thi")
    public String hienThiDanhSachProduct(Model m){
        m.addAttribute("listProduct", productService.hienThiDuLieu());
        m.addAttribute("listCategory", categoryService.getAll());
        return "buoi10/product";
    }
}

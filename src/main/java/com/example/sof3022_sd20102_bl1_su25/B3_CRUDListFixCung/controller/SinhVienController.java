package com.example.sof3022_sd20102_bl1_su25.B3_CRUDListFixCung.controller;

import com.example.sof3022_sd20102_bl1_su25.B3_CRUDListFixCung.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SinhVienController {

    @Autowired
    private SinhVienService svService;

    // default requestmapping => get
//    @RequestMapping(value = "/sinh-vien/hien-thi",method = RequestMethod.POST)
//    @PostMapping("")
    @GetMapping("sinh-vien/hien-thi")
    public String hienThiDanhSachSinhVien(Model m) {
        m.addAttribute("listSinhVien",
                svService.getListSinhVien());
        return "buoi3/sinh-viens";
    }

    @GetMapping("sinh-vien/detail")
    public String detailSinhVien(){
        return "";
    }

    @GetMapping("sinh-vien/remove/{a}")
    // @PathVariable: lay gia tri tren duong dan <=> Request Param
    public String removeSinhVien(@PathVariable("a")String mssv){
        svService.removeSinhVien(mssv);
        return "redirect:/sinh-vien/hien-thi";
    }

    @GetMapping("sinh-vien/view-update")
    public String viewUpdateSinhVien(){
        return "";
    }

    @PostMapping("sinh-vien/update")
    public String updateSinhVien(){
        return "";
    }

}

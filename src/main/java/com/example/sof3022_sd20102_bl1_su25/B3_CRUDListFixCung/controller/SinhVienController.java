package com.example.sof3022_sd20102_bl1_su25.B3_CRUDListFixCung.controller;

import com.example.sof3022_sd20102_bl1_su25.B3_CRUDListFixCung.entity.SinhVien;
import com.example.sof3022_sd20102_bl1_su25.B3_CRUDListFixCung.service.SinhVienService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
// MVC => View
// tach phan chung cua duong dan => RequestMapping
@RequestMapping("/sinh-vien/")
public class SinhVienController {

    @Autowired
    private SinhVienService svService;

    // default requestmapping => get
//    @RequestMapping(value = "/sinh-vien/hien-thi",method = RequestMethod.POST)
//    @PostMapping("")
    @GetMapping("hien-thi")
    public String hienThiDanhSachSinhVien(Model m) {
        m.addAttribute("listSinhVien",
                svService.getListSinhVien());
        return "buoi3/sinh-viens";
    }

    @GetMapping("detail/{b}")
    public String detailSinhVien(
            @PathVariable("b") String mssv,
            Model m
    ) {
        SinhVien sv = svService.detailSinhVien(mssv);
        m.addAttribute("sv1", sv);
        return "buoi3/detail-sinh-vien";
    }

    @GetMapping("remove/{a}")
    // @PathVariable: lay gia tri tren duong dan <=> Request Param
    public String removeSinhVien(@PathVariable("a") String mssv) {
        svService.removeSinhVien(mssv);
        return "redirect:/sinh-vien/hien-thi";
    }

    @GetMapping("view-update/{c}")
    public String viewUpdateSinhVien(@PathVariable("c") String ma, Model m) {
        SinhVien sv = svService.detailSinhVien(ma);
        m.addAttribute("sv", sv);
        return "/buoi3/update-sinh-vien";
    }

    @PostMapping("update")
    public String updateSinhVien() {
        return "";
    }

    @GetMapping("view-add")
    public String viewFormAddSinhVien(Model m) {
        m.addAttribute("sv1", new SinhVien());
        return "buoi3/add-sinh-vien";
    }

    // Model => De cuoi cung trong tham so truyen vao
    @PostMapping("add")
    public String addSinhVien(@Valid @ModelAttribute("sv1") SinhVien sv,
                              BindingResult result
    ) {
        if (result.hasErrors()) {
            return "buoi3/add-sinh-vien";
        }
        svService.add(sv);
        return "redirect:/sinh-vien/hien-thi";
    }

    // muon tra ve kieu du khac kieu String => controller => ResponseBody
    // Json => api
    @GetMapping("test")
    @ResponseBody
    public List<SinhVien> test() {
        return svService.getListSinhVien();
    }

}

package com.example.sof3022_sd20102_bl1_su25.B3_CRUDListFixCung.controller;

import com.example.sof3022_sd20102_bl1_su25.B3_CRUDListFixCung.entity.SinhVien;
import com.example.sof3022_sd20102_bl1_su25.B3_CRUDListFixCung.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
// API => 3 layer, microservice... (k chua view) => VueJS,ReactJS...
public class SinhVien1Controller {
    @Autowired
    private SinhVienService sinhVienService;

    @GetMapping("test")
    public List<SinhVien>test(){
        return sinhVienService.getListSinhVien();
    }
}

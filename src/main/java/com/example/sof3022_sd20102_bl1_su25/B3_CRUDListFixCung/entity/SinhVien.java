package com.example.sof3022_sd20102_bl1_su25.B3_CRUDListFixCung.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SinhVien {

    private String msv;

    private String tenSV;

    private Integer tuoi;

    private String diaChi;

    private Boolean gioiTinh;
    
}

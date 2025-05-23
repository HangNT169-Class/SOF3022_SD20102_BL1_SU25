package com.example.sof3022_sd20102_bl1_su25.B3_CRUDListFixCung.entity;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SinhVien {

    // lay message default spring
    @NotEmpty
//    // Check dinh dang => Pattern
//    @Pattern(regexp = "[a-z A-Z]+",message = "MSSV khong dung dinh dang")
//    //
//    @Size(min = 5, max = 10, message = "MSV khoang ki tu cho phep")
    // https://viblo.asia/p/dung-validation-bang-tay-trong-spring-boot-phan-1-3P0lPGyoZox
    private String msv;

    @NotEmpty(message = "Ten SV k duoc trong")
    private String tenSV;

    @NotNull(message = "Tuoi khong duoc de trong")
//    @Min(value = 10)
//    @Max(value = 50)
    private Integer tuoi;

    @NotBlank(message = "Dia chi khong duoc de trong")
    private String diaChi;

    @NotNull(message = "Gioi tinh khong duoc de trong")
    private Boolean gioiTinh;
    
}

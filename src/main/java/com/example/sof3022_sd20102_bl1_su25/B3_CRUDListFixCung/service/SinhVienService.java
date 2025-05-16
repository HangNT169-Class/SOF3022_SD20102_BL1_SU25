package com.example.sof3022_sd20102_bl1_su25.B3_CRUDListFixCung.service;

import com.example.sof3022_sd20102_bl1_su25.B3_CRUDListFixCung.entity.SinhVien;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SinhVienService {

    private List<SinhVien>listSinhVien = new ArrayList<>();

    public SinhVienService() {
        listSinhVien.add(new SinhVien("HE130461","Nguyen Van A",10,"Ha noi",true));
        listSinhVien.add(new SinhVien("HE130462","Nguyen Van A1",11,"Vinh phuc",false));
        listSinhVien.add(new SinhVien("HE130463","Nguyen Van A2",34,"Phu Tho",false));
        listSinhVien.add(new SinhVien("HE130464","Nguyen Van A3",65,"Thai binh",true));
        listSinhVien.add(new SinhVien("HE130465","Nguyen Van A4",3,"Ha nam",true));
    }

    public List<SinhVien> getListSinhVien() {
        return listSinhVien;
    }

    public void removeSinhVien(String mssv){
        listSinhVien.removeIf(s->s.getMsv().equalsIgnoreCase(mssv));
    }
}

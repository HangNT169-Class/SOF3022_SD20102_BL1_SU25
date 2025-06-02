package com.example.sof3022_sd20102_bl1_su25.B9_JPA.service;

import com.example.sof3022_sd20102_bl1_su25.B9_JPA.entity.Category1;
import com.example.sof3022_sd20102_bl1_su25.B9_JPA.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    /**
     * repository : Lay du lieu tu CSDL
     * service: Xu ly logic cua toan bo project
     * controller: trung chuyen trao doi client & server
     * controller => goi service => repository.
     * Cam tuyet doi trong controller goi repository
     */

    @Autowired
    private CategoryRepository cateRepository;

    public List<Category1> getAll() {
        return cateRepository.findAll();
    }

    public void addOrUpdate(Category1 cate) {
        cateRepository.save(cate);
    }

    public void deleteCate(Long id) {
        cateRepository.deleteById(id);
    }

    public Category1 getOne(Long id) {
        return cateRepository.findById(id).orElse(null);
    }

    // pageNo: so trang: trang dau tien bat dau bang 0
    // pageSize: so luong phan tu trong 1 trang
    public Page<Category1> phanTrang(Integer pageNo, Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNo, pageSize);
        return cateRepository.findAll(pageable);
    }

}

package com.example.sof3022_sd20102_bl1_su25.B9_JPA.repository;

import com.example.sof3022_sd20102_bl1_su25.B9_JPA.entity.Category1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category1,Long> {
    // extends JpaRepository<ts1,ts2>
    // TS1: Doi tuong muon thao tac CRUD
    // TS2: Kieu du lieu cua khoa chinh - KHONG NHAN KIEU NGUYEN THUY - KIEU HOC TRONG C
    // CRUD 1 BANG - KHONG CAN PHAI VIET (DEFAULT CO SAN)
    // Hien thi get all => findAll()
    // Detail - getOne(ID) => findById(khoa chinh)
    // add & update => save(doi tuong)
    // remove => deleteById(khoa chinh)
    // Custom SQL:
    // C1: Query creation: Dung menh de SQL => Truy van bang Object(Class)
    // C2: Raw SQL

    // C1: Query creation:
    // Dieu kieu cua ham => phu thuoc ten ham
    // Neu ten bien thay doi => phai sua lai cac ten ham bien day ton tai
//    List<Category1>findAllByIDAAndCategoryCode(Long id, String categoryCode);

    // C2: Raw SQL: @Query : JPQL: JPA QUERY LANUGAGE
    // C2.1: JPQL: Truy van tren thuc the(Object) <=> HQL: Hibernate Query Language

    // ? kem so: ?1,?2: 1,2: Thu tu tham so truyen vao trong ham
    // native = false
    @Query("SELECT cate FROM Category1 cate WHERE cate.categoryName = ?2 AND cate.categoryCode = ?1")
    List<Category1>searchTheoTenVaCode(String code, String name);

    // @Param: Dinh danh qua ten
    @Query("SELECT cate FROM Category1 cate WHERE cate.categoryName =:name AND cate.categoryCode =:code")
    List<Category1>searchTheoTenVaCode1(@Param("name") String name1, @Param("code")String code);

    // C2.2: Truy van tren class: native Query: TRUY VAN BANG SQL : SELECT *
    // CHAC CHAN CAU SQL PHAI CHAY TRONG SQL
//    @Query(value = """
//            SELECT * FROM category
//            WHERE  category_name =:name
//            AND category_code =:code
//        """,nativeQuery = true)
//    List<Category1>searchTheoTenVaCode2(@Param("name") String name1, @Param("code")String code);

    // Phan trang cung su dung ham co san: findAll => Page
}

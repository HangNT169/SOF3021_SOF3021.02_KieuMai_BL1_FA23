package com.poly.hangnt169.sof3021.B3_4_CRUDListCung.controller;

import com.poly.hangnt169.sof3021.B3_4_CRUDListCung.enttiy.SinhVien;
import com.poly.hangnt169.sof3021.B3_4_CRUDListCung.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SinhVienController {

    @Autowired
    private SinhVienService sinhVienService;

    private List<SinhVien> listSinhVien;

    @GetMapping("/sinh-vien/hien-thi")
    public String hienThiDuLieuSinhVien(Model model) {
        listSinhVien = sinhVienService.getAll();
        model.addAttribute("list", listSinhVien);
        return "/buoi3/sinhviens";
    }
}

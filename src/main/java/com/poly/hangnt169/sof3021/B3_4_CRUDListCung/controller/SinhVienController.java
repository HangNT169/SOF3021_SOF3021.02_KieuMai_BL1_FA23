package com.poly.hangnt169.sof3021.B3_4_CRUDListCung.controller;

import com.poly.hangnt169.sof3021.B3_4_CRUDListCung.enttiy.SinhVien;
import com.poly.hangnt169.sof3021.B3_4_CRUDListCung.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("/sinh-vien/detail/{id1}")
    public String detailSinhVien(@PathVariable("id1") String ma,
                                 Model model) {
        SinhVien sv = sinhVienService.detailSinhVien(ma);
        model.addAttribute("sv1", sv);
        return "/buoi3/detail-sinh-vien";
    }

    @GetMapping("/sinh-vien/view-update/{ma}")
    public String viewUpdate(@PathVariable("ma") String ma, Model model) {
        SinhVien sv = sinhVienService.detailSinhVien(ma);
        model.addAttribute("sv", sv);
        return "/buoi3/update-sinh-vien";
    }

    @GetMapping("/sinh-vien/remove/{ma}")
    public String xoaSinhVien(@PathVariable("ma") String ma, Model model) {
        sinhVienService.xoaSinhVien(ma);
        // Xoa xong quay lai trang chu
        // C1:
//        listSinhVien = sinhVienService.getAll();
//        model.addAttribute("list", listSinhVien);
//        return "/buoi3/sinhviens";
        // C2: Chuyen tra truc tiep
        return "redirect:/sinh-vien/hien-thi";
    }

    @GetMapping("/sinh-vien/view-add")
    public String viewAdd() {
        return "/buoi3/add-sinh-vien";
    }

    @PostMapping("/sinh-vien/add")
    public String add(@RequestParam("mssv")String mssv,
                      @RequestParam("ten") String ten,
                      @RequestParam("tuoi")String tuoi,
                      @RequestParam("diaChi")String diaChi1,
                      @RequestParam("gioiTinh") String gioiTinh){
        // B1: Tao doi tuong
        SinhVien sv = SinhVien.builder()
                .diaChi(diaChi1)
                .ten(ten)
                .mssv(mssv)
                .tuoi(Integer.valueOf(tuoi))
                .gioiTinh(Boolean.valueOf(gioiTinh))
                .build();

        // B2: Goi add trong service
        sinhVienService.addSinhVien(sv);
        // B3: Quay ve trang chu
        return "redirect:/sinh-vien/hien-thi";
    }

}

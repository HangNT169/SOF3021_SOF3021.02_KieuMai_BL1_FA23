package com.poly.hangnt169.sof3021.B3_4_CRUDListCung.service;

import com.poly.hangnt169.sof3021.B3_4_CRUDListCung.enttiy.SinhVien;

import java.util.List;

public interface SinhVienService {

    List<SinhVien>getAll();

    void addSinhVien(SinhVien sv);

    SinhVien detailSinhVien(String mssv);

    void xoaSinhVien(String mssv);

    void updateSinhVien(String mssv,SinhVien sinhVien);

}

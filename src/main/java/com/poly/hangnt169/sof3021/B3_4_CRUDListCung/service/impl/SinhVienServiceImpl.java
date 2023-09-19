package com.poly.hangnt169.sof3021.B3_4_CRUDListCung.service.impl;

import com.poly.hangnt169.sof3021.B3_4_CRUDListCung.enttiy.SinhVien;
import com.poly.hangnt169.sof3021.B3_4_CRUDListCung.service.SinhVienService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SinhVienServiceImpl implements SinhVienService {
    private List<SinhVien> lists = new ArrayList<>();

    public SinhVienServiceImpl() {
        // add du lieu vao day
        lists.add(new SinhVien("PH01", "Tao", 12, "Ha Noi", false));
        lists.add(new SinhVien("Ph02", "Mit", 10, "Thanh Hoa", true));
        lists.add(new SinhVien("PH03", "Tao", 12, "Ha Noi", false));
        lists.add(new SinhVien("Ph04", "Mit", 10, "Thanh Hoa", true));
    }

    @Override
    public List<SinhVien> getAll() {
        return lists;
    }

    @Override
    public void addSinhVien(SinhVien sv) {
        lists.add(sv);
    }

    @Override
    public SinhVien detailSinhVien(String mssv) {
        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i).getMssv().equalsIgnoreCase(mssv)) {
                // return doi tuong can tim
                return lists.get(i);
            }
        }
        return null;
    }

    @Override
    public void xoaSinhVien(String mssv) {
        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i).getMssv().equalsIgnoreCase(mssv)) {
                // xoa
                lists.remove(i);
                break;
            }
        }
    }

    @Override
    public void updateSinhVien(String mssv, SinhVien sinhVien) {
        // tu lam
    }
}

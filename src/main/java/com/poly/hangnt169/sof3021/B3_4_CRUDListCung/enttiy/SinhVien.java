package com.poly.hangnt169.sof3021.B3_4_CRUDListCung.enttiy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor // contructor khong tham so
@NoArgsConstructor// contructor co tham so
@Builder
public class SinhVien {

    private String mssv;
    private String ten;
    private int tuoi;
    private String diaChi;
    private Boolean gioiTinh;

}

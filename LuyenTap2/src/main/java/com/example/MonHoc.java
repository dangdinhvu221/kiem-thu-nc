package com.example;

public class MonHoc {
    private String maMH, tenMH, ghiChu;
    private int thoiLuong, soHocVien;
    private double hocPhi;

    public MonHoc() {
    }

    public MonHoc(String maMH, String tenMH, String ghiChu, int thoiLuong, int soHocVien, double hocPhi) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.ghiChu = ghiChu;
        this.thoiLuong = thoiLuong;
        this.soHocVien = soHocVien;
        this.hocPhi = hocPhi;



    }

    public String getMaMH() {
        return maMH;
    }

    public void testMaMHisEmpty() {
        if (maMH.isEmpty()) {
            throw new IllegalArgumentException("Mã khoá học không hợp lệ");
        }
    }

    public void setMaMH(String maMH) {

        this.maMH = maMH;
    }

    public void testTenMHisEmpty() {
        if (tenMH.isEmpty()) {
            throw new IllegalArgumentException("Tên khoá học không hợp lệ");
        }
    }

    public String getTenMH() {

        return tenMH;
    }

    public void setTenMH(String tenMH) {

        this.tenMH = tenMH;
    }

    public void testGhiChuisEmpty() {
        if (ghiChu.isEmpty()) {
            throw new IllegalArgumentException("Tên khoá học không hợp lệ");
        }
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public void testThoiLuongMonHoc() {
        if (String.valueOf(thoiLuong).isEmpty()) {
            throw new IllegalArgumentException("Thời lượng khoá học không hợp lệ");
        } else if (String.valueOf(soHocVien).isEmpty()) {
            throw new IllegalArgumentException("Số học viên không hợp lệ");
        } else if (thoiLuong > 90 || thoiLuong <= 0) {
            throw new IllegalArgumentException("Thời lượng khoá học không hợp lệ");
        }
    }

    public int getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public int getSoHocVien() {
        return soHocVien;
    }

    public void testSoHocVienMonHoc() {
        if (soHocVien > 40 || soHocVien <= 0) {
            throw new IllegalArgumentException("Số học viên không hợp lệ");
        }
    }
    public void setSoHocVien(int soHocVien) {
        this.soHocVien = soHocVien;
    }

    public void testHocPhiMonHoc() {
        if (hocPhi > 20000000 || hocPhi <= 0) {
            throw new IllegalArgumentException("Học phí khoá học không hợp lệ");
        }
    }
    public double getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(double hocPhi) {
        this.hocPhi = hocPhi;
    }
}

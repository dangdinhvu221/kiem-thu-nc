package com.example;

public class KhoaHoc {
    private String maKH, tenKH, ghiChu;
    private int thoiLuongKH, soHocVien;
    private double hocPhi;

    public KhoaHoc() {
    }

    public KhoaHoc(String maKH, String tenKH, String ghiChu, double hocPhi, int thoiLuongKH, int soHocVien) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.ghiChu = ghiChu;
        this.hocPhi = hocPhi;
        this.thoiLuongKH = thoiLuongKH;
        this.soHocVien = soHocVien;

        if (maKH.isEmpty()) {
            throw new IllegalArgumentException("Mã khoá học không hợp lệ");
        } else if (tenKH.isEmpty()) {
            throw new IllegalArgumentException("Tên khoá học không hợp lệ");
        } else if (String.valueOf(thoiLuongKH).isEmpty()) {
            throw new IllegalArgumentException("Thời lượng khoá học không hợp lệ");
        }else if (String.valueOf(soHocVien).isEmpty()) {
            throw new IllegalArgumentException("Số học viên không hợp lệ");
        } else if (thoiLuongKH > 120 || thoiLuongKH <= 0) {
            throw new IllegalArgumentException("Thời lượng khoá học không hợp lệ");
        } else if (hocPhi > 50000000 | hocPhi <= 0) {
            throw new IllegalArgumentException("Học phí khoá học không hợp lệ");
        } else if (soHocVien > 25 || soHocVien <= 0) {
            throw new IllegalArgumentException("Số học viên không hợp lệ");
        }
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public double getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(double hocPhi) {
        this.hocPhi = hocPhi;
    }

    public int getThoiLuongKH() {
        return thoiLuongKH;
    }

    public void setThoiLuongKH(int thoiLuongKH) {
        this.thoiLuongKH = thoiLuongKH;
    }

    public int getSoHocVien() {
        return soHocVien;
    }

    public void setSoHocVien(int soHocVien) {
        this.soHocVien = soHocVien;
    }
}

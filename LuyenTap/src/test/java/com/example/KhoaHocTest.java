package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KhoaHocTest {
    KhoaHoc kh;

    @Before
    public void setUp() throws Exception {
        kh= new KhoaHoc();
    }

    @After
    public void tearDown() throws Exception {
        kh = null;
    }

    @Test
    public void getMaKH() {
        assertNull(kh.getMaKH());
    }

    @Test
    public void setMaKH() {
        kh.setMaKH("SOF-304");
        assertEquals("SOF-304", kh.getMaKH());
    }

    @Test
    public void getTenKH() {
        assertNull(kh.getTenKH());
    }

    @Test
    public void setTenKH() {
        kh.setMaKH("Kiểm thử phần mềm");
        assertEquals("Kiểm thử phần mềm", kh.getTenKH());
    }

    @Test
    public void getGhiChu() {
        assertNull(kh.getGhiChu());
    }

    @Test
    public void setGhiChu() {
        kh.setGhiChu("note-new");
        assertEquals("note-new", kh.getGhiChu());
    }

    @Test
    public void getHocPhi() {
       assertEquals(0, kh.getHocPhi(), 0);
    }

    @Test
    public void setHocPhi() {
        kh.setHocPhi(24999999);
        assertEquals(24999999, kh.getHocPhi(), 0);

        kh.setHocPhi(25000000);
        assertEquals(25000000, kh.getHocPhi(), 0);
    }

    @Test
    public void getThoiLuongKH() {
        assertEquals(0, kh.getThoiLuongKH());
    }

    @Test
    public void setThoiLuongKH() {
        kh.setThoiLuongKH(119);
        assertEquals(119, kh.getThoiLuongKH());
        kh.setThoiLuongKH(120);
        assertEquals(120, kh.getThoiLuongKH());
    }

    @Test
    public void getSoHocVien() {
        assertEquals(0, kh.getSoHocVien());
    }

    @Test
    public void setSoHocVien() {
        kh.setSoHocVien(24);
        assertEquals(24, kh.getSoHocVien());
        kh.setSoHocVien(25);
        assertEquals(25, kh.getSoHocVien());
    }
}
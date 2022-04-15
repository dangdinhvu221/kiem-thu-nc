package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MonHocTest {

    MonHoc mh;
    @Before
    public void setUp() throws Exception {
        mh = new MonHoc();
    }

    @After
    public void tearDown() throws Exception {
        mh = null;
    }

    @Test
    public void getMaMH() {
        assertNull(mh.getMaMH());
    }

    @Test
    public void setMaMH() {
        mh.setMaMH("Sof304");
        assertEquals("Sof304", mh.getMaMH());
    }

    @Test
    public void getTenMH() {
        assertNull(mh.getTenMH());
    }

    @Test
    public void setTenMH() {
        mh.setTenMH("Kiểm thử nâng cao");
        assertEquals("Kiểm thử nâng cao", mh.getTenMH());
    }

    @Test
    public void getGhiChu() {
        assertNull(mh.getGhiChu());
    }

    @Test
    public void setGhiChu() {
        mh.setGhiChu("note-new");
        assertEquals("note-new", mh.getGhiChu());
    }

    @Test
    public void getThoiLuong() {
        assertEquals(0,mh.getThoiLuong());
    }

    @Test
    public void setThoiLuong() {
        mh.setThoiLuong(0);
        assertEquals(0, mh.getThoiLuong());

        mh.setThoiLuong(1);
        assertEquals(1, mh.getThoiLuong());

        mh.setThoiLuong(89);
        assertEquals(89, mh.getThoiLuong());

        mh.setThoiLuong(90);
        assertEquals(90, mh.getThoiLuong());
    }

    @Test
    public void getSoHocVien() {
        assertEquals(0,mh.getSoHocVien());
    }

    @Test
    public void setSoHocVien() {
        mh.setSoHocVien(0);
        assertEquals(0, mh.getSoHocVien());

        mh.setSoHocVien(1);
        assertEquals(1, mh.getSoHocVien());

        mh.setSoHocVien(39);
        assertEquals(39, mh.getSoHocVien());

        mh.setSoHocVien(40);
        assertEquals(40, mh.getSoHocVien());
    }

    @Test
    public void getHocPhi() {
        assertEquals(0,mh.getHocPhi(), 0);
    }

    @Test
    public void setHocPhi() {
        mh.setHocPhi(0);
        assertEquals(0, mh.getHocPhi(), 0);

        mh.setHocPhi(1);
        assertEquals(1, mh.getHocPhi(), 0);

        mh.setHocPhi(19999999);
        assertEquals(19999999, mh.getHocPhi(), 0);

        mh.setHocPhi(20000000);
        assertEquals(20000000, mh.getHocPhi(), 0);
    }
}
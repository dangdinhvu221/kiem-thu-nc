package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.*;

public class KhoaHocTestException {
    KhoaHoc kh;

    @Before
    public void setUp() throws Exception {
        kh = new KhoaHoc();
    }

    @After
    public void tearDown() throws Exception {
        kh = null;
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testMaKHisEmty() {
        expectedException.expect(IllegalArgumentException.class);
        new KhoaHoc("", "Kiểm thử nâng cao", "note-new", 25000000, 119, 12);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTenKHisEmpty() {
        new KhoaHoc("vudd", "", "note-new", 25000000, 119, 12);
    }

    @Test
    public void  testThoiLuongisEmpty() {
        try {
            new KhoaHoc("vudd", "Kiểm thử nâng cao", "note-new", 25000000, Integer.parseInt(""), 12);
            fail();
        }catch (IllegalArgumentException e){

        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testsoHocVIenisEmpty() {
        new KhoaHoc("vudd", "Kiểm thử nâng cao", "note-new", 25000000, 119, Integer.parseInt(""));
    }

    @Test
    public void testThoiLuongWithText() {
        try {
            new KhoaHoc("vudd", "Kiểm thử nâng cao", "note-new", 25000000,  Integer.parseInt("adfas"), 12);
            fail();
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void testHocPhiWithText() {
        try {
            new KhoaHoc("vudd", "Kiểm thử nâng cao", "note-new", Double.parseDouble("cvgjb"), 119, 12);
            fail();
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void testHocVienWithText() {
        try {
            new KhoaHoc("vudd", "Kiểm thử nâng cao", "note-new", 25000000, 119, Integer.parseInt("abc"));
            fail();
        } catch (IllegalArgumentException e) {

        }
    }

}
package com.example;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestGiaTriBien {
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
    public void testThoiLuongMin1() {
        expectedException.expect(IllegalArgumentException.class);
        new KhoaHoc("vudd", "Kiểm thử nâng cao", "note-new", 25000000, -1, 12);
    }

    @Test
    public void testThoiLuongMin2() {
        try {
            new KhoaHoc("vudd", "Kiểm thử nâng cao", "note-new", 25000000, 0, 12);
            fail();
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void testThoiLuongMin3() {
        try {
            new KhoaHoc("vudd", "Kiểm thử nâng cao", "note-new", 25000000, 1, 12);
            fail();
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void testThoiLuongMin4() {
        expectedException.expect(IllegalArgumentException.class);
        new KhoaHoc("vudd", "Kiểm thử nâng cao", "note-new", 25000000, 119, 12);
    }

    @Test
    public void testThoiLuongMin5() {
        try {
            new KhoaHoc("vudd", "Kiểm thử nâng cao", "note-new", 25000000, 120, 12);
            fail();
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void testThoiLuongMin6() {
        try {
            new KhoaHoc("vudd", "Kiểm thử nâng cao", "note-new", 25000000, 121, 12);
            fail();
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void testHocPhiMin() {
        try {
            new KhoaHoc("vudd", "Kiểm thử nâng cao", "note-new", -1, 120, 12);
            fail();
        } catch (IllegalArgumentException e) {

        }
    }
    @Test
    public void testHocPhiMin1() {
        try {
            new KhoaHoc("vudd", "Kiểm thử nâng cao", "note-new", 0, 120, 12);
            fail();
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void testHocPhiMin2() {
        try {
            new KhoaHoc("vudd", "Kiểm thử nâng cao", "note-new", 1, 120, 12);
            fail();
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void testHocPhiMin3() {
        try {
            new KhoaHoc("vudd", "Kiểm thử nâng cao", "note-new", 49999999, 120, 12);
            fail();
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void testHocPhiMin4() {
        try {
            new KhoaHoc("vudd", "Kiểm thử nâng cao", "note-new", 50000000, 120, 12);
            fail();
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void testHocPhiMin5() {
        try {
            new KhoaHoc("vudd", "Kiểm thử nâng cao", "note-new", 50000001, 120, 12);
            fail();
        } catch (IllegalArgumentException e) {

        }
    }

}

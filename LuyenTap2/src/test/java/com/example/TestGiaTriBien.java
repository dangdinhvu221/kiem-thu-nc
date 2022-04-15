package com.example;

import org.junit.*;
import org.junit.rules.ExpectedException;

public class TestGiaTriBien {
    MonHoc mh;
    @Before
    public void setUp() throws Exception {
        mh = new MonHoc();
    }

    @After
    public void tearDown() throws Exception {
        mh =null;
    }

    @Test
    public void testThoiLuongWithMin() {
        try {
            mh = new MonHoc("Sof304", "Kiểm thử phần mềm", "note", -1, 12, 10000000);
            mh.testThoiLuongMonHoc();

            Assert.fail();
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void testThoiLuongWithMax() {
        try {
            mh = new MonHoc("Sof304", "Kiểm thử phần mềm", "note", 91, 12, 10000000);
            mh.testThoiLuongMonHoc();

            Assert.fail();
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void testSoHocVienWithMin() {
        try {
            mh = new MonHoc("Sof304", "Kiểm thử phần mềm", "note", 32, -1, 10000000);
            mh.testSoHocVienMonHoc();
            Assert.fail();
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void testSoHocVienWithMax() {
        try {
            mh = new MonHoc("Sof304", "", "note", 91, 41, 10000000);
            mh.testSoHocVienMonHoc();

            Assert.fail();
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void testHocPhiWithMin() {
        try {
            mh = new MonHoc("Sof304", "Kiểm thử phần mềm", "note", 12, 12, -1);
            mh.testHocPhiMonHoc();

            Assert.fail();
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void testHocPhiWithMax() {
        try {
            mh = new MonHoc("Sof304", "ávgchbas", "note", 90, 41, 111000000);
            mh.testHocPhiMonHoc();

            Assert.fail();
        } catch (IllegalArgumentException e) {

        }
    }
}

package com.example;

import org.junit.*;
import org.junit.rules.ExpectedException;

public class TestMonHocException {
    MonHoc mh;

    @Before
    public void setUp() throws Exception {
        mh = new MonHoc();
    }

    @After
    public void tearDown() throws Exception {
        mh = null;
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testMaMHisEmtity() {
        expectedException.expect(IllegalArgumentException.class);

        mh = new MonHoc("", "Kiểm thử phần mềm", "note", 12, 12, 10000000);
        mh.testMaMHisEmpty();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaMHisEmtity1() {
        mh = new MonHoc("", "Kiểm thử phần mềm", "note", 12, 12, 10000000);
        mh.testMaMHisEmpty();
    }

    @Test
    public void testMaMHisEmtity2() {
        try {
            mh = new MonHoc("", "Kiểm thử phần mềm", "note", 12, 12, 10000000);
            mh.testMaMHisEmpty();
            Assert.fail();
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void testTenMHisEmtity() {
        expectedException.expect(IllegalArgumentException.class);
        mh = new MonHoc("Sof304", "", "note", 12, 12, 10000000);
        mh.testTenMHisEmpty();

    }

    @Test(expected = IllegalArgumentException.class)
    public void testTenMHisEmtity1() {
        mh = new MonHoc("Sof304", "", "note", 12, 12, 10000000);
        mh.testTenMHisEmpty();
    }

    @Test
    public void testTenMHisEmtity2() {
        try {
            mh = new MonHoc("Sof304", "", "note", 12, 12, 10000000);
            mh.testTenMHisEmpty();
            Assert.fail();
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void testGhiChuisEmtity() {
        expectedException.expect(IllegalArgumentException.class);
        mh = new MonHoc("Sof304", "Kiểm thử phần mềm", "", 12, 12, 10000000);
        mh.testGhiChuisEmpty();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGhiChuisEmtity1() {
        mh = new MonHoc("Sof304", "Kiểm thử phần mềm", "", 12, 12, 10000000);
        mh.testGhiChuisEmpty();

    }

    @Test
    public void testGhiChuisEmtity2() {
        try {
            mh = new MonHoc("Sof304", "Kiểm thử phần mềm", "", 12, 12, 10000000);
            mh.testGhiChuisEmpty();

            Assert.fail();
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void testThoiLuongisEmtity() {
        expectedException.expect(IllegalArgumentException.class);
        mh = new MonHoc("Sof304", "Kiểm thử phần mềm", "note", Integer.parseInt(""), 12, 10000000);
        mh.testThoiLuongMonHoc();

    }

    @Test(expected = IllegalArgumentException.class)
    public void testThoiLuongWithText() {
        mh = new MonHoc("Sof304", "Kiểm thử phần mềm", "note", Integer.parseInt("abc"), 12, 10000000);
        mh.testThoiLuongMonHoc();

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
    public void testSoHocVienisEmtity() {
        expectedException.expect(IllegalArgumentException.class);
        mh = new MonHoc("Sof304", "Kiểm thử phần mềm", "note", 12, Integer.parseInt(""), 10000000);
        mh.testHocPhiMonHoc();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSoHocVienWithText() {
        mh = new MonHoc("Sof304", "Kiểm thử phần mềm", "note", 12, Integer.parseInt("abc"), 10000000);
        mh.testHocPhiMonHoc();

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
    public void testHocPhiisEmtity() {
        expectedException.expect(IllegalArgumentException.class);
        mh = new MonHoc("Sof304", "Kiểm thử phần mềm", "note", 12, 12, Integer.parseInt(""));
        mh.testHocPhiMonHoc();

    }

    @Test(expected = IllegalArgumentException.class)
    public void testHocPhiWithText() {
        mh = new MonHoc("Sof304", "Kiểm thử phần mềm", "note", 12, 12, Integer.parseInt("abc"));
        mh.testHocPhiMonHoc();

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

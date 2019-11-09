package com.example.objectorientedprograming;

import android.util.Log;

public class Hocvien {

    // thuoc tinh
    private String ten;
    private int tuoi;
    private String diachi;
    static String hoclai;
    // hanh vi
    // constructor : phuong thức khởi tạo
    public Hocvien(String ten , int tuoi , String diachi){
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
    }

    public void dongTien(int money){
        Log.d("BBB","Hoc vien " + money + "");
    }

    //getter va setter : alt + insert
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
}

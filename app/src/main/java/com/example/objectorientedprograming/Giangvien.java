package com.example.objectorientedprograming;

public class Giangvien extends Hocvien{
    private String chuyennganh;

    public Giangvien(String ten,int tuoi , String diachi){
        super(ten,tuoi,diachi);
    }

    public Giangvien(String ten,int tuoi , String diachi,String chuyennganh){
        super(ten,tuoi,diachi);
        this.chuyennganh = chuyennganh;
    }

}

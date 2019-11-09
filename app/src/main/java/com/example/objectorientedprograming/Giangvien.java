package com.example.objectorientedprograming;

import android.util.Log;

public class Giangvien extends Hocvien{
    private String chuyennganh;

    public Giangvien(String ten,int tuoi , String diachi){
        super(ten,tuoi,diachi);
    }

    public Giangvien(String ten,int tuoi , String diachi,String chuyennganh){
        super(ten,tuoi,diachi);
        this.chuyennganh = chuyennganh;
    }

    // overide method : phương thức ghi đè
//        + Phương này đã được định nghĩa ở một nơi khác vì họ chia sẻ phương
//        này qua cho bạn nên bạn có thể viết lại chức năng của họ theo ý các bạn
//        + Super.methodoverride() : đây là đoạn xử lý bên thằng cha
    @Override
    public void dongTien(int money) {
        super.dongTien(money);
        Log.d("BBB","Giang vien " + money);
    }
}

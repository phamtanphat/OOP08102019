package com.example.objectorientedprograming;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Hocvien nguyenvana = new Hocvien("Nguyen Van A",20,"38 Nguyen Lam");
//
//
//        Hocvien nguyenvanb = new Hocvien("Nguyen Van B",25,"40 Nguyen Lam");
//        Giangvien giangvien = new Giangvien();
//        Hocvien.hoclai
//        show("Hello");
    }
    // overload method : phuong thuc nap chong
//            + Chỉ được tạo ra trong cùng 1 phạm vi hay 1 nơi
//            + Tên phương thức giống nhau,
//            + Tham số truyền vào
//                - Số lượng tham số bằng nhau thì phải khác về kiểu dữ liệu
//    private void show(String text){
//        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
//    }
//    private int show(int a){
//        return 5;
//    }


}

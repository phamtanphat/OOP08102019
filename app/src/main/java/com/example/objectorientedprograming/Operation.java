package com.example.objectorientedprograming;

import android.util.Log;

public abstract class Operation {
    abstract void square();
    abstract void perimeter();

    public int getSquare(){
        return 10;
    }
    public int getPerimeter(){
        return  5;
    }
}

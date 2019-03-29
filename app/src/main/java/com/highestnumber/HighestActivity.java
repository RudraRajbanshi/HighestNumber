package com.highestnumber;

import java.util.Random;

public class HighestActivity {
    private int first, second;

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int generateFirst(){
        Random ra = new Random();
        int num = ra.nextInt(100)+2;
        return num;
    }
    public int generateSecond(){
        Random ra = new Random();
        int num = ra.nextInt(100)+1;
        return num;
    }
}

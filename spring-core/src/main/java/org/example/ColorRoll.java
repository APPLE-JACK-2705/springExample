package org.example;

import org.springframework.stereotype.Component;


public class ColorRoll implements CameraRoll{
//    private int count;
//
//    public ColorRoll(int count) {
//        this.count = count;
//    }

    @Override
    public void processing() {
//        count--;
        System.out.println("-1 colored frame");
//        System.out.printf("Roll has %d frame(s)\n", count);
    }
}

package com.pack;


import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        SweetBox s = new SweetBox();
        s.addCandy(new Licorice("red"));
        s.addCandy(new Lollipop(10.5));
        s.addCandy(new Stickjaw("sweet"));
        s.addCandy(new Wafer(true));
        System.out.println("Price of your box is: " + s.getBoxPrice());
        System.out.println("Weight of your box is: " + s.getBoxWeight());
        s.getBoxInfo();
    }
}

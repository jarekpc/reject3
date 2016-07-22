package com.jarek;

/**
 * Created by zyzakj on 2016-07-22.
 */
public class App {

    public static void main(String [] args){
        StringBuilder buidBuilder = new StringBuilder();
        buidBuilder.append("aaaaaaaa");
        buidBuilder.append("bbbb");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(buidBuilder.toString());

    }
}

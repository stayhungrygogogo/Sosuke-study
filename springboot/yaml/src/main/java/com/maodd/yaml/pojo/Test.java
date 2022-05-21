package com.maodd.yaml.pojo;

import java.util.ArrayList;
import java.util.List;

import static com.sun.tools.doclint.Entity.or;

public class Test{
    public static void main (String[] args) throws InterruptedException {
        List<String> a = new ArrayList<String>();
        test(a);
        for (int i = 0;i< 10000;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(100000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        System.out.println(a.size());
        Thread.sleep(100000);
    }

    public static void test(List<String> a){
        a=new ArrayList<String>();
        a.add("abc");
    }
}
package com.tw.nho.practicesystem;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrintNumber {
    public static void main(String args[]) {

//
//        IntStream.range(0,99).forEach(i-> {
//            if (i%3==0) {
//                System.out.println("fizz" + i);
//            }
//            if (i%5 == 0) {
//                System.out.println("buzz" + i);
//            }
//
//            if(i%3==0&i%5 == 0) {
//                System.out.println("fizz buzz" + i);
//
//            }
//        });


    }


    public List<String> getRes() {
        return IntStream.range(0, 100).boxed()
                .map(PrintNumber::busRule)
                .collect(Collectors.toList());
    }


    public static String busRule(int i) {
        if (i % 3 == 0 & i % 5 == 0) {
            return "fizz buzz";
        }
        if (i % 3 == 0) {
            return "fizz";
        }
        if (i % 5 == 0) {
            return "buzz";
        }

        return Integer.valueOf(i).toString();
    }

}

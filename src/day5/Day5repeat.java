package day5;

import java.util.Scanner;

public class Day5repeat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        for (int i = 1; i <= 5; i++) {
//            System.out.println("i = " + i);

//        for(int a = 5; a <=10; a++){
//            System.out.println("a="+ a);
//        }

//            int count = 1;
//            while (count <= 5){
//                System.out.println("count =" + count);
//                count++;
//            }

//           int count = 5;
//            while (count >= 6) {
//                System.out.println("count = " + count);
//                count--;
//            }
//
//            do {
//                System.out.println("count = " + count);
//            } while(count >= 6);


//        for (int n = 1; n <= 9; n+=2){
//            System.out.println("n =" + n);
//        }

//        for (int n = 2; n <= 10; n+=2){
//            System.out.println(" n =" +n);
//
//        }

        System.out.print("출력할 단을 입력하세요(2~100): ");
        Long dan = sc.nextLong();

//        for (int t= 1; t <= 9; t++) {
//            System.out.println(dan + " x " + t + " = " + (dan * t));
//        }
        for (int t= 9; t >= 1; t--) {
            System.out.println(dan + " % " + t + " = " + (dan / t));
        }

        }
    }
package day2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Day2Scanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("int를 입력하세요: ");
        int i = sc.nextInt();
        System.out.println("i ="+ i);

        System.out.println("long을 입력하세요: ");
        long l = sc.nextLong();
        System.out.println("l = " + l);

        System.out.println("double을 입력하세요: ");
        double d = sc. nextDouble();
        System.out.println("d= " +d);

        System.out.println("문자열을 입력하세요");
        String s = sc.next();
        System.out.println("s= " +s);

        System.out.println("첫번째 문재 추출하기");
        char c = s.charAt(0);
        System.out.println("c=" + c);
    }
}
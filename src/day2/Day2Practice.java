package day2;

import java.util.Scanner;

public class Day2Practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1
//        System.out.println("출생 연도를 입력하세요");
//        int year = sc.nextInt();
//        int age = 2025 - year + 1;
//        System.out.println("당신의 나이는 " + age + "입니다.");

        // 2
//        System.out.println("사각형의 가로 길이를 입력하세요");
//        int number1 = sc.nextInt();
//        System.out.println("사각형의 세로 길이를 입력하세요");
//        int number2 = sc.nextInt();
//
//        System.out.println("사각형의 넓이는" + (number1 *  number2) + "입니다");


        // 3
//        System.out.println("첫 번째 숫자를 입력하세요");
//        int number3 = sc.nextInt();
//
//        System.out.println("두 번째 숫자를 입력하세요");
//        int number4 = sc.nextInt();
//
//        System.out.println(number3 + " + " + number4 + " = " + (number3 + number4));
//        System.out.println(number3 + " - " + number4 + " = " + (number3 - number4));
//        System.out.println(number3 + " * " + number4 + " = " + (number3 * number4));
//        System.out.println(number3 + " / " + number4 + " = " + (number3 / number4));
//        System.out.println(number3 + " % " + number4 + " = " + (number3 % number4));


        // 4
        System.out.println("이름을 입력해주세요");
        String name = sc.next();
        System.out.println("나이를 입력해주세요");
        int age = sc.nextInt();
        System.out.println("성별을 입력해 주세요");
        String gender = sc.next();

        System.out.println("제 이름은" + name + "이고 " + age + "살 " + gender + "입니다!");
    }

}

package day6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Day6RepeatAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("무한 반복문 시작");
//
//        while (true){
//            System.out.println("숫자를 입력하세요. 1부터 10 사이의 수를 입력하면 종료됩니다.");
//            int input = sc.nextInt();
//            if (input >= 1 && input <= 10){
//                break;
//            }
//            System.out.println(input);
//        }
//        System.out.println("hello");
//

//        for (int i =1; i <= 10; i++){
//            if (i==5){
//                System.out.println("5 건너뛰기");
//                continue;
//            }
//            System.out.println("i ="+ i);
//        }

//        for (int i = 0; i < 3; i++) {
//            System.out.println("i = " + i);
//
//            for (int j = 1; j <= 5; j++) {
//                System.out.println("j = " + j);
//            }
//            System.out.println("--------------------------");
//        }
//        for (int o = 0; o<= 10; o++) {
//            System.out.println("o = "+ o);
//
//            for (int p = 1; p <= 5; p++) {
//                System.out.println("p=" + p);
//
//            }
//            System.out.println("---------------------------");
//        }

//        System.out.println("구구단 표:");
//        for (int i = 1; i <= 9; i++){
//            for (int j = 2; j <= 9; j++){
//                System.out.print(j+"X" +i+ "=" + (j*i)+ "\t");
//            }
//            System.out.println();
//        }

        //        System.out.println("무한 반복문 시작");

//        for (int i =1; i <= 50; i++){
//            if (i % 2 == 1){
//                continue;
//            }
//            System.out.println("I = " + i);
//        }

//        System.out.pr     int sum = 0;
//        for (int i = 1; i <= number; i++) {
//            sum += i;
//
//            if (sum > 50) {
//                System.out.println("합계가 50을 넘었습니다. 반복 종료!");
//                break;
//            }
//
//            System.out.println("현재 합계: " + sum);
//        }
//        System.out.println("최종 합계: " + sum);int("숫자를 입력하세요: ");
//        int number = sc.nextInt();


        System.out.print("삼각형의 높이를 입력하세요: ");
        int height = sc.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }






    }
}

import java.util.Scanner;
public class Question {
    private static Scanner scan;
    public static void main(String[] args) {
        scan = new Scanner(System.in);


//        문제 1) 점수를 입력받아 점수 및 등급을 출력하는 프로그램을 작성하세요
//        else if문을 사용하여 작성
//        95이상 = A+, 90이상 = A, 85이상 = B+, 80이상 B, 75이상 = C+, 70이상 = C, 60이상 = D, 60 미만 = F
//        중첩 if문을 사용하여 각각의 + 대의 점수를 출력
//        System.out.print("점수를 입력해 주세요 : ");
//        int grade = 87;
//        String level = "F";
//
//        if (grade >= 90) {
//            System.out.println("A");
//            if (grade >= 95)
//                System.out.println("A+");
//        }
//        else if (grade >= 80) {
//            System.out.println("B");
//            if (grade >= 85)
//                System.out.println("B+");
//        }
//        else if (grade >= 70) {
//            System.out.println("C");
//            if (grade >= 75)
//                System.out.println("C+");
//        }
//        else if (grade >= 60) {
//            System.out.println("D");
//        }
//        else if (grade < 60) {
//            System.out.println("F ");
//        }

        System.out.println("\n ----- 실습 문제 6 ----- \n");
        System.out.print("돈의 액수를 입력하세요>> ");
        int money = scan.nextInt();

//          원금 / 50000 해서 5만원권 수를 확인
        int m50000 = money / 50000;
//          5만원권을 뺀 15,245원을 변수 money에 저장
        money = money % 50000;
        int m10000 = money / 10000; // 1만원권의 수를 확인하기 위해 10000으로 나눔
        money = money % 10000; // 1만원권을 제외한 금액을 저장하기 위해 10000으로 나머지 연산
        int m1000 = money / 1000; // 5,245에서 1천원권의 수를 확인하기 위해 1000으로 나눔
        money = money % 1000; // 5000을 뺀 나머지 금액을 계산하기 위해서 나머지 연산
        int m500 = money / 500; // 245에서 500원 동전의 수를 확인하기 위해 500으로 나눔
        money = money % 500; // 500을 나눈 후 나머지 금액을 계산하기 위해서 나머지 연산, 245 그대로 남음
        int m100 = money / 100; // 245에서 100원 동전의 수를 확인하기 위해서 100으로 나눔
        money = money % 100; // 200을 뺀 나머지 값을 계산
        int m10 = money / 10; // 45에서 10원 동전의 수 계산
        money = money % 10; // 1원 동전 수 계산

        System.out.println("오만원 권 " + m50000 + "개");
        System.out.println("일만원 권 " + m10000 + "개");
        System.out.println("일천원 권 " + m1000 + "개");
        System.out.println("오백원 동전 " + m500 + "개");
        System.out.println("백원 동전 " + m100 + "개");
        System.out.println("십원 동전 ");






        System.out.println("\n ----- 실습 문제 7 ----- \n");
        System.out.print("학점을 입력하세요>> ");
        level = scan.next();

        switch (level) {
            case "A":
            case "B":
                System.out.println("Excellent");
                break;

            case "C":
            case "D":
                System.out.println("Good");
                break;

            case 'F':
                System.out.println("Bye");
                break;

        default:
            System.out.println("잘못된 입력입니다.");
        }





        System.out.println("\n ----- 실습 문제 9 ----- \n");
        System.out.print("1~99 사이의 정수를 입력하세요>> ");
        int number = scan.nextInt(); // 사용자 숫자 입력
//        2자리의 숫자 중 10의 자리 숫자와 1의 자리 숫자를 분리
        int first = number / 10; // 10의 자리 숫자를 저장
        int second = number % 10; // 1의 자리 숫자를 저장
        int count = 0; // 3, 6, 9 의 수를 저장하기 위한 변수

        if ((first % 3 == 0) && (second % 3 == 0 )) {
            System.out.println("박수 짝짝");
        }
        else if ((first % 3 == 0 ) ^ (second % 3 == 0)) {
            System.out.println("박수 짝");
        }
        else {
            System.out.println("박수 없음");
        }

////        10의 자리 숫자가 3의 배수인지 확인
//        if (first % 3 == 0) {
//            count++; // 3의 배수이면 변수 count의 값 1 증가
////            count += 1;
////            count = count + 1;
//        }
//
////        1의 자리 숫자가 3의 배수인지 확인
//        if (second % 3 == 0) {
//            count++; // 3의 배수이면 변수 count의 값 1 증가
//        }
//
//        if (count == 1) {
//            System.out.println("박수 짝");
//        }
//        else if (count == 1) {
//            System.out.println("박수 짝짝");
//        }
//        else {
//            System.out.println("박수 없음");
//        }
    }

}






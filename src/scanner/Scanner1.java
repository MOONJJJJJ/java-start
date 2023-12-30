package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열을 입력하세요:");
        String str = scanner.nextLine();    //입력한 문자열을 스트링으로 가져온다
        System.out.println("입력한 문자열: "+ str);

        System.out.print("정수를 입력하세요:");
        int iv = scanner.nextInt();    //입력한 문자열을 정수형으로 가져온다
        System.out.println("입력한 문자열: "+ iv);

        System.out.print("실수를 입력하세요:");
        double dv = scanner.nextDouble();    //입력한 문자열을 double형으로 가져온다
        System.out.println("입력한 문자열: "+ dv);

    }
}

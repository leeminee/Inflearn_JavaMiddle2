package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx3 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("n개의 정수를 입력하세요 (종료 0)");

        int total = 0;
        while (true) {
            int input = sc.nextInt();
            if (input == 0) {
                break;
            }
            numbers.add(input);
            total += input;
        }

        double average = (double) total/numbers.size();


        System.out.println("입력한 정수의 합계 : "+total);
        System.out.println("입력한 정수의 평균 : "+average);

    }

}

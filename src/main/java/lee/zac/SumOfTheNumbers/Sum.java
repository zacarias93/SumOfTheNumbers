package lee.zac.SumOfTheNumbers;

import java.util.Scanner;


public class Sum {

    public static void main(String[] args) {

        System.out.println("Enter your number here: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int sum = 0;
        for(int i=0; i<=num; i++) {
            sum += i;
        }
        System.out.println("The sum of the numbers from 1 to " + num + " is : " + sum);
    }
}

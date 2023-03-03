package Day2;

import java.util.Scanner;

public class bt1 {

    public static void main(String[] args) {
        long sum = 0;
        int n;

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập n = ");
        n = scanner.nextInt();
        scanner.close();

        for(int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum = " + sum);
            }
        }


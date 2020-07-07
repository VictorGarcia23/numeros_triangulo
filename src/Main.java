package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dame un número de filas: ");
        int num = input.nextInt();

        for ( int a = num; a >= 1; a--) {
            for( int j = 1; j <= a ;j++){
                System.out.print(j + "  ");
            }
            System.out.println();
        }

    }

}

package com.company;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] array = scanner.nextLine().split(" ");
        int counter = 0;
        for(int i=0; i<array.length-1; i++){
            int a = Integer.parseInt(array[i]);
            int b = Integer.parseInt(array[i+1]);
            if(b > a){
                counter++;
            }
        }
        System.out.println(counter);
    }
}

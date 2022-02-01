package com.company;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        // не использую n&k в задаче, но раз уж они есть в задании, то пускай будут проинициализорованы

        String[] array1 = scanner.nextLine().split(" ");
        String[] array2 = scanner.nextLine().split(" ");

        for(int i=0; i<array2.length; i++){
            boolean flag = false;
            int a = Integer.parseInt(array2[i]);
            for(int j=0; j<array1.length; j++) {
                int b = Integer.parseInt(array1[j]);
                if(a==b){
                    flag = true;
                }
            }
            if(flag==true) {
                System.out.println(array2[i]+" YES");
            }else{
                System.out.println(array2[i]+" NO");
            }
        }
    }
}

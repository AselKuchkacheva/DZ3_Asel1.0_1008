package com.company;

public class Main {

    public static void main(String[] args) {

        double[] numbers = {1.54, -8.28, 6.39, 7.17, -1.83, 4.55, 2.844, -6.85,
                5.32, -4.69, 1.52, -15.8, 7.5, 8.47, 9.48};
        double sum = 0.0;
        boolean otrCh = false;
        double result;
        int kol = 0;


        for (double i: numbers) {
            if (i < 0) {
                otrCh = true;
            }
            if (otrCh){
                if (i>0){
                    sum +=i;
                    kol ++;
                }
            }
        }
        result = sum/kol;

        System.out.print(" Весь массив  ");
        printMass(numbers);
        System.out.println("Среднее арифметическое число = " + result);


    }
    public static void printMass (double[] numbers){
        for (double chislo: numbers) {
            System.out.print(chislo + " | ");
        }
        System.out.println();
    }




}

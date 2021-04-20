import javax.annotation.processing.Messager;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;


import java.util.Scanner;

public class Main {
    public static void  Task1() throws Exception {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введіть номер місяця(1-12):");
            int n = in.nextInt();
            if (n < 0 || n >12 || n == 0) {
                throw new Exception("Такого номера місяця не існує");
            }
            switch (n) {
                case 1:
                    System.out.print("Січень");
                    break;
                case 2:
                    System.out.print("Лютий");
                    break;
                case 3:
                    System.out.print("Березень");
                    break;
                case 4:
                    System.out.print("Квітень");
                    break;
                case 5:
                    System.out.print("Травень");
                    break;
                case 6:
                    System.out.print("Червень");
                    break;
                case 7:
                    System.out.print("Липень");
                    break;
                case 8:
                    System.out.print("Серпень");
                    break;
                case 9:
                    System.out.print("Вересень");

                    break;
                case 10:
                    System.out.print("Жовтень");
                    break;
                case 11:
                    System.out.print("Литсопад");
                    break;
                case 12:
                    System.out.print("Грудень");
                    break;
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void Task2() {
        double dx ;
        dx= Math.PI/20;
        double a=0;
        double b=Math.PI;
        double y;
        System.out.println("X:      Y: \n");
        while (a<=b){
            y=Math.pow(Math.tan(a)+13,0.25);
            System.out.printf("%.2f; \t %.3f \n",a,y) ;
            a=a+dx;
        }

    }
    public static void Task3(){
        Scanner in = new Scanner(System.in);
        System.out.print("\n Введіть розмірність масиву:");
        int s = in.nextInt();
        int []mas =new int [s];
        System.out.print("\n 1.Запонити масив рамдомно");
        System.out.print("\n 2.Ввести масив з клавіатури");
        System.out.print("\n Виберіть спосіб вводу масиву:");
        int n=in.nextInt();
        if (n==1){
            for (int i = 0; i < mas.length; i++) {
                mas[i] = ((int)(Math.random() * (100-(-100)+1) ) );
                System.out.println(mas[i]);
            }
        } else if (n==2){
            for(int i=0;i<mas.length;i++){
                System.out.print("А["+i+"]=");
                mas[i]=in.nextInt();
            }
        }
        else if(n<0||n>2||n==0){
            System.out.print("\n Виберіть із зазначених варінтів:");
        }



        int k=0;
        for(int i=0;i<mas.length;i++){

            if (mas[i]==0) {
                k++;
            }
        }
        System.out.println("Кількість нульових елементів масиву ="+k);

        int max=mas[0]; int j=0; int d=1;
        for (int i=0;i<mas.length;i++){
            if(Math.abs(mas[i])>=max){
                max=mas[i];
                j=i;
                ++j;

            }

        }
        for (int i=j;i<mas.length;i++){
            d=d*mas[i];

        }
        System.out.println("Максимальний елемент  ="+max);
        System.out.println("Добуток елементів розташованих після максимального елемента = " +d);


    }
    public static void Task4() {
        Scanner in = new Scanner(System.in);
        System.out.print("\n Введіть розмірність матриці nxn:");
        int n = in.nextInt();
        int[][] mas = new int[n][n];
        System.out.print("\n 1.Запонити масив рамдомно");
        System.out.print("\n 2.Ввести масив з клавіатури");
        System.out.print("\n Виберіть спосіб вводу масиву:");
        int k = in.nextInt();
        if (k == 1) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    mas[i][j] = ((int) (Math.random() * (100 - (-100) + 1)));

                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(mas[i][j] + "\t");
                }
                System.out.println();
            }
        } else
        if (k == 2) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("А[" + i + "][" + j + "]");
                    mas[i][j] = in.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(mas[i][j] + "\t");
                }
                System.out.println();
            }
        } else if (n < 0 || n > 2 || n == 0) {
            System.out.print("\n Виберіть із зазначених варінтів:");
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (i + j + 1 == n) {
                    mas[i][j] = 0;
                }
                else {
                    mas[i][j] = (int) Math.pow(mas[i][j], 2);
                }
            }

        }
        System.out.print("\n Відредагований масив:\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }


    }





    public static void main (String [] args) throws Exception {
        System.out.print("\n Завдання 1");
        System.out.print("\n Завдання 2");
        System.out.print("\n Завдання 3");
        System.out.print("\n Завдання 4");
        System.out.print("\n Введіть номер завдання:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        do {


            switch (n){
                case 1:
                    Task1();
                    break;
                case  2:
                    Task2();
                    break;
                case 3 :
                    Task3();
                    break;
                case 4:
                    Task4();
                    break;

                default:{
                    System.out.println("Завдань лише 4");}

            }


        } while (n>4);







    }
}


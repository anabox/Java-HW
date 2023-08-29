package Homework3;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {

        System.out.println(wordCreator());

        System.out.println(calcSum(5,7));
        System.out.println(calcDif(5,7));
        System.out.println(calcMulti(5,7));
        System.out.println(calcDiv(5,7));


        System.out.println(calcSum2());
        System.out.println(calcDif2());
        System.out.println(calcMulti2());
        System.out.println(calcDiv2());
    }
    //Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв (проверьте количество букв в слове).
//        Нужно получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.
//        Например:
//        ввод - mama, papa
//        вывод - mapa
   public static String wordCreator(){
       Scanner scanner2 = new Scanner(System.in);
       System.out.println("Введите первое слово ");
       String firstWord = scanner2.nextLine();
       System.out.println("Введите второе слово ");
       String secondWord = scanner2.nextLine();
       return firstWord.substring(0,firstWord.length()/2) + secondWord.substring(secondWord.length()/2);
    }
    //Реализовать программу, выводящую на экран результаты:
//        Сложения двух чисел
//        Вычитания двух чисел
//        Умножения двух чисел
//        Деления двух чисел
//        Каждая из арифметических операций должна быть реализована как отдельный метод.

    //Решение с указанием параметров:
   public static float calcSum(float a,float b){
       System.out.print("Сумма введенных в коде чисел = ");
        return a+b;
   }
    public static float calcDif(float a,float b){
        System.out.print("Разница введенных в коде чисел = ");
        return a-b;
    }
    public static float calcMulti(float a,float b){
        System.out.print("Произведение введенных в коде чисел = ");
        return a*b;
    }
    public static float calcDiv(float a,float b){
        System.out.print("Деление введенных в коде чисел = ");
        return a/b;
    }
    //Решение с указанием чисел пользователем:
    public static float calcSum2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число ");
        float a = scanner.nextFloat();
        System.out.println("Введите второе число ");
        float b = scanner.nextFloat();
        System.out.print("Сумма введенных чисел = ");
        return a+b;
    }
    public static float calcDif2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число ");
        float a = scanner.nextFloat();
        System.out.println("Введите второе число ");
        float b = scanner.nextFloat();
        System.out.print("Разница введенных чисел = ");
        return a-b;
    }
    public static float calcMulti2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число ");
        float a = scanner.nextFloat();
        System.out.println("Введите второе число ");
        float b = scanner.nextFloat();
        System.out.print("Произведение введенных чисел = ");
        return a*b;
    }
    public static float calcDiv2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число ");
        float a = scanner.nextFloat();
        System.out.println("Введите второе число ");
        float b = scanner.nextFloat();
        System.out.print("Деление введенных чисел = ");
        return a/b;
    }


}

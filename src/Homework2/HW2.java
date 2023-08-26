//Создайте строку через new - I study Basic Java!
//        Распечатать пред-последний символ строки. Используем метод String.charAt().
//        Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
//        Вырезать строку Java c помощью метода String.substring().
//        Заменить все символы “а” на “о”.
//        Преобразуйте строку к верхнему регистру.
//        Преобразуйте строку к нижнему регистру.
package Homework2;
import java.util.Arrays;
public class HW2 {
    public static void main(String[] args) {
//        Создайте строку через new - I study Basic Java!
        String objStr = new String("I study Basic Java!");
//        Распечатать пред-последний символ строки. Используем метод String.charAt().
        System.out.println(objStr.charAt(17));
//        Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
        System.out.println(objStr.contains("Java"));
//        Вырезать строку Java c помощью метода String.substring().
        System.out.println(objStr.substring(14,18));
//        Заменить все символы “а” на “о”.
        System.out.println(objStr.replace('a', 'o'));
//        Преобразуйте строку к верхнему регистру.
        System.out.println(objStr.toUpperCase());
//        Преобразуйте строку к нижнему регистру.
        System.out.println(objStr.toLowerCase());
//    Создайте программу, в которой нужно ввести 2 параметра, сделайте  операции с математическими операциями +, -, *, /
//    Результат распечатайте в консоль
        int[] ints = Calculation(5,7);
        System.out.println(Arrays.toString(ints));
    }

public static int[] Calculation(int a, int b){
    int sum = a+b;
    int dif = a-b;
    int mult = a*b;
    int div = a/b;

    return new int [] {sum,dif,mult,div};
    }

}

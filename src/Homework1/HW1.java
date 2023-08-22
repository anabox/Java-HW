package Homework1;
public class HW1 {
//  1.В методе main инициализировать все примитивные типы и не примитивные типы.
    public static void main(String[] args) {
        //примитивные
        char myChar = 'G';
        int myInt = 89;
        byte myByte = 4;
        short myShort = 56;
        float myFloat = 4.7333436F;
        double myDouble = 4.355453532D;
        long myLong = 12121;
        //не примитивные
        Character MyChar = 'G';
        Integer MyInt = 89;
        Byte MyByte = 4;
        Short MyShort = 56;
        Float MyFloat = 4.7333436F;
        Double MyDouble = 4.355453532D;
        Long MyLong = 12121L;
//  2.Вывести их результат в консоль:
        System.out.println("char: " + myChar);
        System.out.println("int: " + myInt);
        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);
        System.out.println("long: " + myLong);
        System.out.println();
        System.out.println("Character: " + MyChar);
        System.out.println("Integer: " + MyInt);
        System.out.println("Byte: " + MyByte);
        System.out.println("Short: " + MyShort);
        System.out.println("Float: " + MyFloat);
        System.out.println("Double: " + MyDouble);
        System.out.println("Long: " + MyLong);

//  3.Дано трехзначное число. Вывести на экран все цифры этого числа
//        Пример: 345
//        Вывод в консоль: Число 345 -> 3, 4, 5
        int myInt3 = 345;
//первый вариант
        System.out.println(myInt3/100 +","+ (myInt3%100)/10 +"," + myInt3%10 );
//второй вариант
        System.out.println("Число 345 -> "+ myInt3/100 + ", " + myInt3/10%30 +", " + myInt3%340);
    }
}

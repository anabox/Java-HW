package Homework4;
//Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
//Числа могут быть, как целочисленные, так и дробные.
//Например :
//ввод : m=10.5, n=10.45
//вывод: Число 10.45 ближе к 10.
public class HW4 {
    public static void main(String[] args) {
        System.out.println(calcCloserNum(8, 11));
        convertToHours(180);
    }

    static float calcCloserNum(float m, float n) {
        float dif1 = m - 10;
        float dif2 = n - 10;
        if (Math.abs(dif1) <= Math.abs(dif2)) {
            return m;
        } else return n;
    }

    //№2
    //Есть устройство, на табло которого показывается количество секунд, оставшихся до конца рабочего дня. Когда рабочий день начинается ровно в 9 часов утра — табло отображает «28800» (т.е. остаётся 8 часов), когда 14:30 — на табло «9000» (т.е. остаётся два с половиной часа), а когда наступает 17 часов — на табло отображается «0» (т.е. рабочий день закончился).
    //Некоторый сотрудники не умеют оценивать остаток рабочего дня в секундах.
    //Требуется написать программу, которая вместо секунд будет выводить на табло понятные фразы с информацией о том, сколько полных часов осталось до конца рабочего дня.
    //Например: «осталось 7 часов», «осталось 4 часа», «остался 1 час», «осталось менее часа».
    //Объяснение: в переменную n должно записываться случайное (на время тестирования программы) целое число из диапазона от 0 до 28800, далее оно должно выводиться на экран (для тех, кто понимает в секундах) и на следующей строке (для тех кто не понимает) должна выводиться фраза о количестве полных часов, содержащихся в n секундах.Ω
    static void convertToHours(int n) {
        System.out.println("Осталось " + n + " секунд ");
        int timeInHours = n / 3600;
        int minutes = n % 3600 / 60;
        String minutesAsString = Integer.toString(minutes);
        char lastMinuteNumber = minutesAsString.charAt(minutesAsString.length() - 1);
        int lastMinNum = Character.getNumericValue(lastMinuteNumber);


        if (timeInHours == 1) {
            if (lastMinNum == 1)
                System.out.println("Остался 1 час и " + minutes + " минута");
            else if ((lastMinNum >= 5 && lastMinNum <= 9) || lastMinNum == 0)
                System.out.println("Остался 1 час и " + minutes + " минут");
            else System.out.println("Остался 1 час и " + minutes + " минуты");
        }
        else if (timeInHours >=2 && timeInHours <=4){
            if (lastMinNum == 1)
                System.out.println("Осталось "+timeInHours+" часа и " + minutes + " минута");
            else if ((lastMinNum >= 5 && lastMinNum <= 9) || lastMinNum == 0 || (minutes>=10&&minutes<=20))
                System.out.println("Осталось "+timeInHours+" часа и " + minutes + " минут");
            else System.out.println("Осталось "+timeInHours+" часа и " + minutes + " минуты");
        }
        else if (timeInHours >=5 && timeInHours <=9){
            if (lastMinNum == 1)
                System.out.println("Осталось "+timeInHours+" часов и " + minutes + " минута");
            else if ((lastMinNum >= 5 && lastMinNum <= 9) || lastMinNum == 0 || (minutes>=10&&minutes<=20) )
                System.out.println("Осталось "+timeInHours+" часов и " + minutes + " минут");
            else System.out.println("Осталось "+timeInHours+" часов и " + minutes + " минуты");
        }
        else {
            if (lastMinNum == 1)
                System.out.println("Осталось меньше часа, всего лишь " + minutes + " минута");
            else if ((lastMinNum >= 5 && lastMinNum <= 9) || lastMinNum == 0 || (minutes>=10&&minutes<=20))
                System.out.println("Осталось меньше часа, всего лишь " + minutes + " минут");
            else System.out.println("Осталось меньше часа, всего лишь " + minutes + " минуты");
        }
    }

}

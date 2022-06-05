package guru.qa;

public class JavaBaseOne {
    public static void main (String[] args) {
        //от -128 до 127
        byte aByte = 12;
        System.out.println(aByte);

        //от -2147483648 до 2147483647
        int aInt = 214;
        System.out.println(aInt);

        //от -9223372036854775808 до 9223372036854775807
        long aLong = 9466;
        System.out.println(aLong);

        //от -32768 до 32767
        short aShort = 32;
        System.out.println(aShort);

        //от 2-1074 до (2-2-52)*21023
        double aDouble = 3.5;
        System.out.println(aDouble);

        //от 2-149 до (2-2-23)*2127
        float aFloat = 1.5f;
        System.out.println(aFloat);

        //беззнаковое целое число, которое преставляет собой символ UTF-16 (буквы и цифры)
        char aChar = '3';
        System.out.println(aChar);

        //true or false
        boolean aBoolean = aByte < aInt;
        System.out.println(aBoolean);
        System.out.println("mixed types " + "= " + aInt % aByte + aShort / 2 + (aDouble - aFloat) + aChar);

        //boolean
        int min = 0;
        int max = 100;
        int temperature = -20;
        boolean isIce = (temperature < min);
        boolean isSteam = (temperature > max);

       // переполнение
        int one = 2147483647;
        int two = 2147483647;
        int sum = one + two;
        System.out.println(sum);



        //if
        if (aInt != 222 && aByte < 15)
            System.out.println("OK");

        //if+else
        int age = 70;
        boolean isSenior = (age > 65);
        if (isSenior) {
            System.out.println("Old");
        } else {
            System.out.println("Young");
        }

    }
}
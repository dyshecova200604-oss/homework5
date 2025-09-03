//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача1");
        int clientOS = 0;
        {
            System.out.println("Установите приложение для ios по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите приложение для Android по ссылке");
        }
        {
            System.out.println("Задача2");
        }
        int clientDeviceYear = 2014;
        if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите приложение для ios по ссылке");
        }
        if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите приложение для Android по ссылке");
        }
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для ios по ссылке");
        }
        if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        {
            System.out.println("Задача3");
        }
        int year = 2021;
        boolean leap = false;
        if (year %  4 == 0){
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            } else
                leap = true;
        }else
            leap = false;


        if (leap)
            System.out.println( "год является високосным ");
        else
            System.out.println(" год не является високосным ");
        {
            System.out.println("Задача4");
        }
        int deliveryDistance= 95;
        int days;
        if (deliveryDistance<=20){
            days= 1;
        }else if (deliveryDistance>20&&deliveryDistance<=60){
            days =2;
        }else if (deliveryDistance>60&&deliveryDistance<=100) {
            days = 3;
        }else {
            days = -1;
        }
        if (days !=-1){
            System.out.println("Потребуется дней:"+ days);
        }else {
            System.out.println("Доставки нет");
        }

        System.out.println("Задача5");
        int monthNumber= 12;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.

                        println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.

                        println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.

                        println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.

                        println("Осень");
                break;
            default:
                System.out.

                        println("Неверный номер месяца!");
        }
    }
}


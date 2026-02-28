
public class Main {
    public static void main(String[] args) {
        //Задача 1
        short clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Для Вашей ОС нет мобильного приложения");
        }

        //Задача 2
        int clientDeviceYear = 2015;
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Для Вашей ОС нет мобильного приложения");
        }

        //Задача 3
        int year = 2021;
        if (year > 1584) {
            if (((year - 1584) % 4) == 0) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println(year + " год не является високосным");
        }

        //Задача 4
        short deliveryDistance = 95;
        short deliveryDays = 0;
        if (deliveryDistance < 100) {
            if (deliveryDistance < 20) {
                deliveryDays = 1;
            } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
                deliveryDays = 2;
            } else {
                deliveryDays = 3;
            }
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставки нет");
        }

        //Задача 5
        short monthNumber = 12;
        if (monthNumber <= 12) {
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Месяц " + monthNumber + "й относится к сезону зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Месяц " + monthNumber + "й относится к сезону весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Месяц " + monthNumber + "й относится к сезону лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Месяц " + monthNumber + "й относится к сезону осень");
                    break;
            }
        }
    }
}
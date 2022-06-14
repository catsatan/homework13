
    public class Main {
        public static void main(String[] args) {
            // задание 1
            int clientOc = 0;
            if (clientOc == 0) {
                System.out.println("установите версию для Android!");
            } else {
                System.out.println("установите версию для IOS!");
            }
            //задание 2
            int clientOC = 1;
            int clientDeviceYear = 2014;
            if (clientDeviceYear >= 2015 && clientOC == 0) {
               System.out.println("установите по ссылке для android");
            }
            else if (clientDeviceYear <= 2015 && clientOC == 0){
                System.out.println("установите по ссылке для android облегченную версию");
            }
            else if (clientDeviceYear <= 2015 && clientOC == 1){
                System.out.println("установите по ссылке для IOS облегченную версию");
            }
            else if (clientDeviceYear >= 2015 && clientOC == 1){
                System.out.println("установите по ссылке для IOS ");
            }


            // задание 3
            int year = 2012;
            if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0  ) {
                System.out.println("год  високосный");
            } else {
                System.out.println("год не високосный");
            }


            //задание 4
            int deliveryDistance = 95;
            float day = (deliveryDistance - 100)/40;
            if (deliveryDistance < 20) {
                System.out.println("потребуется 1 день");
            } else if (deliveryDistance < 60) {
                System.out.println("потребуется 2 дня");
            } else if (deliveryDistance < 100) {
                System.out.println("потребуется 3 дня");
            } else {
                System.out.println("потребуется 3 дня плюс срок доставки " + day+ " сутки");
            }
            // задание 5
            int monthNumber = 12;
            switch (monthNumber){
                case 1:
                    System.out.println("январь зима");
                    break;
                case 2:
                    System.out.println("февраль зима");
                    break;
                case 3:
                    System.out.println("март весна");
                    break;
                case 4:
                    System.out.println("апрель весна");
                    break;
                case 5:
                    System.out.println("май весна");
                    break;
                case 6:
                    System.out.println("июнь лето");
                    break;
                case 7:
                    System.out.println("июль лето");
                    break;
                case 8:
                    System.out.println("август лето");
                    break;
                case 9:
                    System.out.println("сентябрь осень");
                    break;
                case 10:
                    System.out.println("октябрь осень");
                    break;
                case 11:
                    System.out.println("ноябрь осень");
                    break;
                case 12:
                    System.out.println("декабрь зима");
                    break;
                default:
                    System.out.println("нет такого месяца");
            }
        }
    }


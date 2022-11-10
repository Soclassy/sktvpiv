import java.util.*;

public class lab1 {
    public static void main(String[] args)
    {
        System.out.println("Starting lab1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input task num: ");
        String zadanie = sc.nextLine();
        switch (zadanie)
        {
            case "1":
                System.out.println("Last number is: " + num1(sc));
                break;
            case "2":
                System.out.println("Sum of 3 numbers is: " + num2(sc));
                break;
            case "3":
                System.out.println("Final number is: " + num3(sc));
                break;
            case "4":
                System.out.println("Final number is: " + num4(sc));
                break;
            case "5":
                System.out.println("The smallest num is: " + num5(sc));
                break;
            case "6":
                System.out.println("number description: " + num6(sc));
                break;
            case "7":
                num7(sc);
                break;
            case "8":
                num8(sc);
                break;
            case "9":
                num9(sc);
                break;
            case "10":
                num10(sc);
                break;

        }

    }
    public static int num1(Scanner sc)
    {
        System.out.print("Input a number: ");
        int num = sc.nextInt();
        int numf = num % 10;
        return numf;
    }
    public static int num2(Scanner sc)
    {
        System.out.println("Input three-digit number: ");
        int num = sc.nextInt();
        int numf = (num / 100) + (num % 100 / 10) + (num % 10);
        return numf;
    }
    public static int num3(Scanner sc)
    {
        System.out.println("Input number:");
        int num = sc.nextInt();
        if (num > 0) {
            num = num + 1;
        }
        return num;
    }
    public static int num4(Scanner sc)
    {
        System.out.println("Input number:");
        int num = sc.nextInt();
        if (num > 0) {
            num = num + 1;
        } else if (num == 0) {
            num = 10;

        }
        else {
            num = num - 2;
        }
        return num;
    }
    public static int num5(Scanner sc)
    {
        System.out.println("Input first number: ");
        int num1 = sc.nextInt();
        System.out.println("Input second number: ");
        int num2 = sc.nextInt();
        System.out.println("Input third number: ");
        int num3 = sc.nextInt();
        if (num1 < num2 & num1 < num2){
            return num1;
        } else if (num2 < num1 & num2 < num3) {
            return num2;
        }
        else {
            return num3;
        }
    }
    public static String num6(Scanner sc)
    {
        System.out.println("Input number:");
        int num = sc.nextInt();
        String strok = "";
        if (num == 0){
            strok += "нулевое число";
            return strok;
        } else if (num > 0){
            strok += "положительное ";
            if (num % 2 == 0){
                strok += "четное число";
                return strok;
            }
            else {
                strok += "нечетное число";
                return strok;
            }
        }
        else {
            strok += "отрицательное ";
            if (num % 2 == 0){
                strok += "четное число";
                return strok;
            }
            else {
                strok += "нечетное число";
                return strok;
            }
        }
    }
    public static void num7(Scanner sc)
    {
        System.out.println("Input city code (905, 194, 491, 800): ");
        String num = sc.nextLine();
        switch (num) {
            case "905":
                double price1 = 4.15;
                System.out.println("Москва. Стоимость разговора: " + (price1*10));
                break;
            case "194":
                double price2 = 1.98;
                System.out.println("Ростов. Стоимость разговора: " + (price2*10));
                break;
            case "491":
                double price3 = 2.69;
                System.out.println("Краснодар. Стоимость разговора: " + (price3*10));
                break;
            case "800":
                double price4 = 5.00;
                System.out.println("Киров. Стоимость разговора: " + (price4*10));
                break;
        }

    }
    public static void num8(Scanner sc)
    {
        int[] mass =  {1,-10,5,6,45,23, 45,-34,0,32,56,-1,2,-2};
        int maxNum = mass[0];
        for (int j : mass) {
            if (j > maxNum) {
                maxNum = j;
            }
        }
        int sumplus = 0;
        for (int j : mass) {
            if (j > 0) {
                sumplus += j;
            }
        }
        int sumdva = 0;
        for (int j : mass) {
            if ((j < 0) & (j % 2 == 0)) {
                sumdva += j;
            }
        }
        int kolvo = 0;
        for (int j : mass) {
            if (j > 0) {
                kolvo += 1;
            }
        }
        int kolvootr = 0;
        int sumotr = 0;
        for (int j : mass) {
            if (j < 0) {
                sumotr += j;
                kolvootr += 1;
            }
        }
        int srAr = sumotr / kolvootr;
        System.out.println("максимальное значение: " + maxNum
                + "\nсумма положительных элементов: " + sumplus
                + "\nсуммa четных отрицательных элементов: " + sumdva
                + "\nколичество положительных элементов: " + kolvo
                + "\nсреднее арифметическое отрицательных элементов: " + srAr);
    }
    public static void num9(Scanner sc)
    {
        int[] mass =  {15,10,51, 6, 5,3, 10,-34,0,32,56, 12,24, 52};
        int[] fmass = new int[mass.length];
        for (int i = 0; i < mass.length; i++){
            fmass[i] = mass[mass.length - i -1];
        }
        for (int i = 0; i < fmass.length; i++){
            System.out.print(fmass[i] + "; ");
        }
    }
    public static void num10(Scanner sc)
    {
        System.out.println(" ");
        System.out.println("Задание 10");
        int[] Array = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, 52};
        System.out.println("Исходный массив: " + Arrays.toString(Array));
        int temp;
        for (int i = 0; i < Array.length; i++){
            if (Array[i] == 0){
                for (int j = i + 1; j < Array.length; j++) {
                    if (Array[j] != 0) {
                        temp = Array[j];
                        Array[j] = Array[i];
                        Array[i] = temp;
                        break;
                    }
                }
            }

        }
    }

}
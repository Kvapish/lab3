package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task9();
        //task32();
        //task55();
        //task66();
    }

    /**
     * Задание 9. Дано четное число N (> 0) и символы C1 и C2. Вывести строку длины N, которая состоит из чередующихся символов C1 и C2, начиная с C1.
     */


    private static void task9() {

        System.out.printf("Введите число : ");
        Scanner scan = new Scanner(System.in);//Считываем наше число
        int N = scan.nextInt();
        if (N > 0) {
            if (N % 2 == 0) //Остаток от деления нашего числа на 2 сравниваем с 0
            {
                System.out.printf("Введите значение С1: ");//Считываем С1 и С2
                String C1 = scan.next();
                System.out.printf("Введите значение С2: ");
                String C2 = scan.next();
                for (int i = 0; i < N / 2; i++) //Счетик в котором наше число делим на 2,чтобы наши символы чередовались
                {
                    System.out.print(C1 + " " + C2 + " ");//Выводим строку
                }
            }
        } else {
            System.out.println("Число не может быть меньше 0.");
        }
    }

    /**
     * Задание 32. Даны строки S и S0. Найти количество вхождений строки S0 в строку S.
     */
    private static void task32() {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите занчение S : ");
        String S = scan.nextLine();//Сканируем строки
        System.out.printf("Введите занчение S0 : ");
        String S0 = scan.nextLine();
        String[] words = S.split(" ");//Делим предложение на слова
        int count = 0;//Временная перименная
        System.out.println(Arrays.toString(words));//Выводим массив
        for (int i = 0; i < words.length; i++) {
            if (S0.equals(words[i])) //Сравниваем значение S0 с элементами нашей начальной строки
            {
                count++;
            }
        }
        System.out.println("Выводим количество вхождений : " + count);//Выводим
    }

    /**
     * Задание 55. Дана строка-предложение заданное кириллицей.
     * Вывести самое длинное слово в предложении.
     * Если таких слов несколько, то вывести первое из них.
     * Словом считать набор символов, не содержащий пробелов, знаков препинания и ограниченный пробелами, знаками препинания или началом/концом строки.
     */
    private static void task55() {
        System.out.printf("Введите предложение : ");
        Scanner scan = new Scanner(System.in);
        String offer = scan.nextLine();//Считываем предложение
        String[] words = offer.split(" ");//Делим предложение на слова
        int index = 0;
        int index1 = words[0].length();//Присваиваем 0 значение длины массива
        System.out.println(Arrays.toString(words));//Переводим строку в массив
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > index1) {
                index = i;
                index1 = words[i].length();//Переприсваиваем значение
            }
        }
        System.out.println("Выводим самое длинное слово :" + words[index]);//Выводим
    }

    /**
     * Задание 66.Дана строка-предложение.
     * Зашифровать ее, поместив вначале все символы,
     * расположенные на четных позициях строки, а затем, в обратном порядке,
     * все символы, расположенные на нечетных позициях (например, строка «Программа» превратится в «ргамПорма»).
     */
    private static void task66() {
        System.out.printf("Введите предложение : ");
        Scanner scan = new Scanner(System.in);
        String offer = scan.nextLine();
        String[] words = offer.split(" ");
        String buf1 = "", buf2 = "";//Переменные для четных и нечетных
        String result = "";
        for (int i = 0; i < words.length; i++) {
            char[] ch = words[i].toCharArray();//Символу присваиваем i элемент
            for (int j = 0; j < ch.length; j++) {
                if (j % 2 == 0) {//Остаток от деления на 2 сравниваем с 0
                    buf1 += ch[j];
                } else buf2 += ch[j];
            }
            result = buf2 + buf1 + " ";
        }
        System.out.println(result);
    }
}



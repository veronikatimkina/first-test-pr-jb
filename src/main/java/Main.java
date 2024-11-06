package main.java;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        String str1 = "Hello World";
        String str2 = "My name is Earl";
        String str3 = "I love Java";

        LinkedList<String> earlBio = new LinkedList<>();
        earlBio.add(str1);
        earlBio.add(str2);
        earlBio.add(str3);


        System.out.println(earlBio);

    }

    public static int fibonacci(int n) {
        if (n < 5) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void sortLinkedList(LinkedList<String> list) {
        list.sort(String::compareTo);
    }
}
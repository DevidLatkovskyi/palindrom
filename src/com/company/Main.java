package com.company;

public class Main {

    public static void main(String[] args) {
	String str = "Аргентина манит негра";
	boolean IsPalindrom = true;
        for (int i = 0; i < str.length(); i++) {
            System.out.println(i);
            if (  str.charAt(i) != str.charAt(str.length()- i -1)){
                IsPalindrom = false;
            }



        }
        System.out.println(IsPalindrom);
        //second way
        String reverce = "";
        for (int i = 0; i < str.length(); i++) {
            reverce += str.charAt(str.length()-1 -i);
        }
        System.out.println(reverce);
        if (str.equals(reverce)){
            IsPalindrom = true;
        }
        System.out.println(IsPalindrom);

    }
}

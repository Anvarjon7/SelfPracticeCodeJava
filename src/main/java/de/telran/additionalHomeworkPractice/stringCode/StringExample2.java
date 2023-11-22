package de.telran.stringCode;

public class StringExample2 {
    public static void main(String[] args) {

        String text1 = "Java";
        String text2 = "Java is the best programming language";
        String text3 = "java";
        boolean check1 = (text1 == text2);
        boolean check2 = (text1 != text3);
        System.out.println(check1);
        System.out.println(check2);

        String text4 = new String("Javaa");
        boolean check4 = text1.length() == text4.length();
        System.out.println(check4);
        text1 = text1 + "!";
        System.out.println(text1.charAt(4));


        int textLenght = text2.length();
        System.out.println(textLenght);

        System.out.println(text2.substring(0,textLenght-8));

        System.out.println(text2.toUpperCase());
        System.out.println(text1.replace('a','u'));
        System.out.println(text1.replaceAll("Java","Javascript"));

        int index = text1.indexOf("a");

        System.out.println(index);

        System.out.println(text2.contains("Java"));
    }
}
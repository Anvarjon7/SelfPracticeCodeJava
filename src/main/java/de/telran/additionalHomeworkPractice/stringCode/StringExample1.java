package de.telran.stringCode;

public class StringExample1 {
    public static void main(String[] args) {
        String text1 = "Assalomu alekum";
        System.out.println(text1.length() );

        String text2 = " va rohmatullohi va barokatuhu!";
        String text3 = text1 + text2;
        System.out.println(text3);
        System.out.println(text3.length());
    }
}

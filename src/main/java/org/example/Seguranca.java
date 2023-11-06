package org.example;

public class Seguranca {
    public static String encrypt(String message, int shift){
        StringBuilder  result = new StringBuilder();
        for (int i =0; i <message.length(); i++){
            char ch = message.charAt(i);
            ch = (char) (ch + shift);
            result.append(ch);
        }
        System.out.println(result.toString());
        return result.toString();
    }

    public String deCrypt(String encryptMessage, int shift){
        return encrypt(encryptMessage, shift);
    }
}

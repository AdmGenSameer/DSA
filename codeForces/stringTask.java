package codeForces;

import java.util.Scanner;

public class stringTask {
    public static void getNewString(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<str.length(); i++){
            char ch = Character.toUpperCase(str.charAt(i));

            switch (ch) {
                case 'A' -> {
                    continue;
                }
                case 'O' -> {
                    continue;
                }
                case 'Y' -> {
                    continue;
                }
                case 'E' -> {
                    continue;
                }
                case 'U' -> {
                    continue;
                }
                case 'I' -> {
                    continue;
                }
                default -> {
                    sb.append(".");
                    char c = Character.toLowerCase(str.charAt(i));
                    sb.append(c);
                }
            }
        }
        System.out.println(sb);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the string: ");
        String str = sc.next();
        getNewString(str);
    }}

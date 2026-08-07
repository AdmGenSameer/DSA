package codeForces;

import java.util.ArrayList;
import java.util.Scanner;

public class helpfulMaths{

    public static void modifyString(String str){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)!='+'){
                int num = str.charAt(i) - '0' ;
                list.add(num);
            }
        }
        list.sort(Integer::compareTo);
        for(int j = 0; j<list.size(); j++){
            System.out.print(list.get(j));
            if(j!=list.size()-1){
                System.out.print("+");
            }
        }
    }
    
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            modifyString(str);
        }

    }

}


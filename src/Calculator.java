import javax.sound.sampled.EnumControl;
import java.io.IOException;
import java.util.*;
import java.io.*;

public class Calculator{
    public static void main(String[] args) {
        double res;
        int nom1;
        int nom2;
        //String[] roman = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};

        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            String num = sc.next();
            if(num.equals("I"))  list.add("1");
            else if(num.equals("II"))  list.add("2");
            else if(num.equals("III"))  list.add("3");
            else if(num.equals("IV"))  list.add("4");
            else if(num.equals("V"))  list.add("5");
            else if(num.equals("VI"))  list.add("6");
            else if(num.equals("VII"))  list.add("7");
            else if(num.equals("VIII"))  list.add("8");
            else if(num.equals("IX"))  list.add("9");
            else if(num.equals("X"))  list.add("10");


            else
                list.add(num);
        }


        int num1 = Integer.parseInt(list.get(0));

        int num2 = Integer.parseInt(list.get(2));

        if (list.get(1).equals("+")){
            System.out.println(num1+num2);
        }
        else if (list.get(1).equals("/")){
            System.out.println((double)num1/num2);
        }
        else if (list.get(1).equals("-")){
        System.out.println((double)num1-num2);
        }
        else if (list.get(1).equals("*")){
        System.out.println((double)num1*num2);
        }

    }
    /*public static int romanToInt (String num){
        if(num.equals("X")){
            return 10;}
        else if(num.equals("IX")) {
            return 9;}
        else if(num.equals("VIII")) {
            return 8;}
        else if(num.equals("VII")) {
            return 7;}
        else if(num.equals("VI")) {
            return 6;}
        else if(num.equals("V")) {
            return 5;}
        else if(num.equals("IV")) {
            return 4;}
        else if(num.equals("III")) {
            return 3;}
        else if(num.equals("II")) {
            return 2;}
        else if(num.equals("I")) {
            return 1;}
        return 0;

    }*/
}

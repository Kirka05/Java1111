package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(HelloWorld(25, 26));
        System.out.println(HelloWorld(13, 20));
        System.out.println(HelloWorld(50, 23));
        System.out.println(HelloWorld(1,100));
        System.out.println(HelloWorld(150, 300));
    }


    public  static String HelloWorld(int age, int temp){
        if (age > 20 && age < 45 && temp > -20 && temp < 30){
            return "Можно идти гулять!";
        } else if(age <20 && temp <28) {
       return "Можно идти гулять1";
        } else if (age >45 && temp >-10 && temp <25){
            return "Можно идти гулять0";

        } else{
            return "Оставайтесь дома на улице холодно";

        }


    }

    }



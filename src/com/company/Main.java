package com.company;

public class Main {

    public static void main(String[] args) {
        String [] names = new String[3];
        names [0] = "Erlan";
        names [1] = "Beka";
        names [2] = "Mirlan";
        for (String newname:names)
            switch (newname){
                case "Erlan":
                    System.out.println("Доброе утро "+ names[0]);
                    break;
                case "Beka":
                    System.out.println("Добрый день "+ names[1]);
                    break;
                case "Mirlan":
                    System.out.println("Добрый вечер "+ names[2]);

                default:
                    System.out.println("Здравствуйте " +  names[0]+ " , " + names[1] +" , " + names[2]);
            }

    }
}

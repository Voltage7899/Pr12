package com.company;

public class Main {
    public static void main(String[] args) {
        Adress address = new Adress("a;v,d,s,d,f,d");
        System.out.println(address);





        Person personOne = new Person("PersonOneName", "PersonOneLastName", "PersonOnePatronymic");
        Person personTwo = new Person("PersonTwoName", "PersonTwoLastName");
        Person personThree = new Person("PersonThreeName");
        System.out.println(personOne);
        System.out.println(personTwo);
        System.out.println(personThree);



        String[] shirts = new String[]{ "S001,Black Polo Shirt,Black,XL", "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL", "S004,Blue Polo Shirt,Blue,M", "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL", "S007,White T-Shirt,White,XL", "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S", "S010,Orange T-Shirt,Orange,S", "S011,Maroon Polo Shirt,Maroon,S"
        };
        for(String i : shirts){
            Shirt shirt = new Shirt(i);
            System.out.println(shirt);
        }
    }
}

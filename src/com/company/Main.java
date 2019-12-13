package com.company;

public class Main {

    private String fullName;

    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;

        //напишите тут ваш код
        this.fullName=fullName;
//        fullName = "Rex";
//        lastName ="Jackson";
        System.out.println("His name is : "+firstName+lastName);
    }

    public static void main(String[] args) {

    }
}

package com.company;

public class Author {
    private String name = "Pushkin";
    private String email = "Pushkin@mail.ru";
    private char gender = 'M';

    public Author(String pushkin, String s, char m) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {return name;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    public char getGender() {return gender;}
    @Override
    public String toString(){
        return "Author @ ("+this.name+" "+this.gender+" "+"at"+" "+this.email+").";
    }
}

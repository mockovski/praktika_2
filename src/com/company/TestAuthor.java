package com.company;

public class TestAuthor {
    public static void main(String[] args) {
        Author Push = new Author("Pushkin", "Pushkin@mail.ru", 'M');
        Push.getEmail();
        System.out.println(Push);
    }
}

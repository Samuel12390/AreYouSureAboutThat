package com.company;

 class Doubt extends Question {
    int questionNumber;
    boolean yes;
    public String question;


     String getQuestion() { return question; }

     void respond() {

        if (yes) {
            System.out.println("Yeah, sure. Whatever.");
        } else {
            System.out.println("What the hell is wrong with you!? Of course not!.");
        }
    }
}





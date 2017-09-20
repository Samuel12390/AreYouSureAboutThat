package com.company;

public class Overreaction {
    int questionNumber;
    String question;


    void acknowledgeQuestionNumber() {
        System.out.println("Alright. Question #" + questionNumber + ", You're up! Make it quick, man. I don't got all day.");
    }

    void respondToTheQuestion() {
        System.out.print("What do you mean, " + question + " ,!? Are you calling me fat");
    }

    int getQuestionNumber() { return questionNumber; }

}


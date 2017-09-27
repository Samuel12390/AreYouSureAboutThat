package com.company;

class Overreaction extends Main {
    int questionNumber;
    public String question;


    void acknowledgeQuestionNumber() {
        System.out.println("Alright. Question #" + questionNumber + ", You're up! Make it quick, man. I don't got all day.");
    }

    String getQuestion() { return question; }

    void respondToTheQuestion() {
        System.out.println("What do you mean, " + question + "!? Are you calling me fat");
    }

}


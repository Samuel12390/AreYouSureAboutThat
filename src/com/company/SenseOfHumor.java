package com.company;

class SenseOfHumor extends Question {

    public int question;
    int questionNumber;
    public String question;




    String getQuestion() { return question; }

    void respondToTheQuestion() {
        System.out.println("What do you mean, " + question + "!? Are you calling me fat");
    }

}

}

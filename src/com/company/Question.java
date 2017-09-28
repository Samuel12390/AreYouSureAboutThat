package com.company;

public class Question {

    public int questionNumber;
    public String question;
    public String getQuestion;

    void acknowledgeQuestionNumber() {
        System.out.println("Alright. Question #" + questionNumber + ", You're up! Make it quick, man. I don't got all day.");
    }

    static void main(String[] args) {
        Overreaction question1 = new Overreaction();
        question1.questionNumber = 1;
        question1.question = "How was your day?";

        Overreaction question2 = new Overreaction();
        question2.questionNumber = 2;
        question2.question = "What's your favorite food?";

        Doubt question3 = new Doubt();
        question3.questionNumber = 3;
        question3.question = "Do you like the style of my shirt?";

        Doubt question4 = new Doubt();
        question4.questionNumber = 4;
        question4.question = "What is your opinion about communist?";
    }
}
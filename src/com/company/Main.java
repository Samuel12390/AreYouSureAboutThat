package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Overreaction question1 = new Overreaction();
        question1.questionNumber = 1;
        question1.question = "How was your day?";

        Overreaction question2 = new Overreaction();
        question2.questionNumber = 2;

        Overreaction question3 = new Overreaction();
        question3.questionNumber = 3;

        Overreaction question4 = new Overreaction();
        question4 .questionNumber = 4;

    //Acknowledge thr question number
        question1.acknowledgeQuestionNumber();
    }
}

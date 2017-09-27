package com.company;

class Main {

    public static void main(String[] args) {
	// write your code here
        Overreaction question1 = new Overreaction();
        question1.questionNumber = 1;
        question1.question = "How was your day?";
        question1.respondToTheQuestion();

        Overreaction question2 = new Overreaction();
        question2.questionNumber = 2;
        question2.question = "What's your favorite food?";
        question2.respondToTheQuestion();

        Overreaction question3 = new Doubt();
        question3.questionNumber = 3;
        question3.question = "Do you like the style of my shirt?";

        Overreaction question4 = new Doubt();
        question4.questionNumber = 4;
        question4.question = "";
        //Question Asker #1
        question1.acknowledgeQuestionNumber();
        System.out.println(question1.getQuestion());
    }
}

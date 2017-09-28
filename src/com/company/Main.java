package com.company;

class Main {

    public static void main(String[] args) {
	// write your code here

        //Question Asker #1
        Overreaction question1 = new Overreaction();
        question1.questionNumber = 1;
        question1.question = "How was your day?";
        question1.acknowledgeQuestionNumber();
        System.out.println(question1.getQuestion());
        question1.respondToTheQuestion();

        //Question Asker #2
        Overreaction question2 = new Overreaction();
        question2.questionNumber = 2;
        question2.question = "What's your favorite food?";
        question2.acknowledgeQuestionNumber();
        System.out.println(question2.getQuestion());
        question2.respondToTheQuestion();

        //Question Asker #3
        Doubt question3 = new Doubt();
        question3.questionNumber = 3;
        question3.question = "Do you like the style of my shirt?";
        question3.acknowledgeQuestionNumber();
        System.out.println(question3.getQuestion);
        question3.iAgree = true;
        System.out.println(question3.iAgree);

        //Question Asker #4
        Doubt question4 = new Doubt();
        question4.questionNumber = 4;
        question4.question = "What is your opinion about communist?";
        question4.acknowledgeQuestionNumber();
        System.out.println(question4.getQuestion);
        question4.iAgree = false;
        System.out.println(question4.iAgree);

    }

}

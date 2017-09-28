package com.company;

class Main extends Question{

    public static void main(String[] args) {
	// write your code here

        //Question Asker #1
        question1.acknowledgeQuestionNumber();
        System.out.println(question1.getQuestion());
        question1.respondToTheQuestion();

        //Question Asker #2
        question2.acknowledgeQuestionNumber();
        System.out.println(question2.getQuestion());
        question2.respondToTheQuestion();

        //Question Asker #3
        question3.acknowledgeQuestionNumber();
        System.out.println(question3.getQuestion);
        question3.iAgree = true;

        //Question Asker #4
        question4.acknowledgeQuestionNumber();
        System.out.println(question4.getQuestion);
        question4.iAgree = false;

    }

}

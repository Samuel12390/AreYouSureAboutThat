package com.company;

 class Doubt extends Question {
     int questionNumber;
     boolean iAgree;

     String getQuestion() {
         return question;
     }

     void respond() {
         System.out.println("Well, I mean...");

         if (iAgree) {
             System.out.println("Yeah sure. Whatever.");
         } else {
             System.out.println("Wait! What the hell is wrong with you, man?! Of course not!");
         }
     }
 }





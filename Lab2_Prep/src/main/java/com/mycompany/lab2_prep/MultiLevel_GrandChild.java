package com.mycompany.lab2_prep;

public class MultiLevel_GrandChild extends MultiLevel_Child {

    String researchTopic;

    void setResearchTopic(String researchTopic) {
        this.researchTopic = researchTopic;
    }

    void displayGraduate() {
        System.out.println("Graduate's Info: ");
        System.out.println("---------------------------");
        displayStudent();
        System.out.println("Research: " + researchTopic);
    }
}

package com.company.demo;

public class Main {

    public static void main(String[] args) {

        //Question 1
        System.out.println("Question 1");
        ConvertNumberToEnglish cnte = new ConvertNumberToEnglish();
        cnte.printNumberInEnglish(9923);

        //Question 2
        System.out.println("\nQuestion 2");
        String words = "ABCD EFGHI";
        String words1 = "Rotate the wheel through 180 degrees";

        RotateTheWords rtws = new RotateTheWords();
        rtws.printRotatedWords(words1);


        //Question 3
        System.out.println("\nQuestion 3");
        TwoStringsAreRotationOfEachOther obj = new TwoStringsAreRotationOfEachOther();
        obj.findSolution("Hello from here","reHello from he");


        //Question 4
        System.out.println("\nQuestion 4");
        RemoveFragment rf = new RemoveFragment();

        String[] inputs = { "Every morning I want to do exercise regularly",
                            "Every morning I want to do meditation without fail",
                            "It is important that I want to be happy always"};
        rf.findFragment(inputs);


        //Question 5
        System.out.println("\nQuestion 5");
        ShortestDuration sd = new ShortestDuration();
        int[] arr = {1,5,6};

        String[] times = {"12:34:55","1:12:13","8:12:15"};
        sd.convertToSeconds(times);

    }
}

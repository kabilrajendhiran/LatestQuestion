package com.company.demo;

public class RotateTheWords {
    public void printRotatedWords(String words)
    {
        words = words+" ";
        String word="";
        for (int i = 0; i < words.length(); i++) {
            word="";
            while (words.charAt(i)!=' ')
            {
                word =word + words.charAt(i);
                i++;
            }
            for (int j = word.length()-1; j >=0 ; j--) {
                System.out.print(word.charAt(j));
            }
            System.out.print(" ");

        }
        System.out.println();
    }
}

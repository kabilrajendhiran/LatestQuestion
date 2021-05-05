package com.company.demo;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveFragment {

    public ArrayList<WordCountModel> findWords(String input)
    {
        String word="";
        input = input + ' ';
        ArrayList<WordCountModel> wordCountModels = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            while (input.charAt(i)!=' ')
            {
                word = word + input.charAt(i);
                i++;
            }
            wordCountModels.add(new WordCountModel(word));
            word="";
        }



        return wordCountModels;
    }

    public ArrayList<WordCountModel> findFrequency(String[] inputs)
    {
        ArrayList<WordCountModel> wordCountModels = findWords(inputs[0]);
        String word = "";

        for (int i = 1; i < inputs.length; i++) {
            String words = inputs[i] + ' ';
            for (int j = 0; j < words.length(); j++) {
                while (words.charAt(j)!=' ')
                {
                    word = word + words.charAt(j);
                    j++;
                }

                for (WordCountModel w:wordCountModels) {
                    if(word.equals(w.getWord()))
                    {
                        w.setCount(w.getCount()+1);
                    }
                }
                word="";

            }
        }
        return wordCountModels;

    }

    public void findFragment(String[] inputs)
    {
        int n = inputs.length;
        ArrayList<WordCountModel> wordCountModels = findFrequency(inputs);

        for (int i=0;i<wordCountModels.size();i++) {
            WordCountModel w = wordCountModels.get(i);
            String result="";
            while (w.getCount()>=n)
            {
                result =result+  w.getWord()+" ";
                i++;
                w = wordCountModels.get(i);
            }
            System.out.print(result);
        }
        System.out.println();
    }

}

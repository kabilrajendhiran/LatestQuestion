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
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<String> arrayList1 = new ArrayList<>();
        int n = inputs.length;
        ArrayList<WordCountModel> wordCountModels = findFrequency(inputs);

        for (int i=0;i<wordCountModels.size();i++) {
            WordCountModel w = wordCountModels.get(i);
            while (w.getCount()>=n && i<wordCountModels.size())
            {
                arrayList.add(i);
                arrayList1.add(w.getWord());
                w = wordCountModels.get(i);
                i++;
            }
           /* System.out.print(result);*/

        }

        /*System.out.println(Arrays.toString(arrayList.toArray()));*/

        //check_Continuous

        for (int i = 1; i < arrayList.size(); i++) {
            if((arrayList.get(i-1)+1)==arrayList.get(i))
            {
                System.out.print(arrayList1.get(i)+" ");
            }
        }



        System.out.println();
    }


}

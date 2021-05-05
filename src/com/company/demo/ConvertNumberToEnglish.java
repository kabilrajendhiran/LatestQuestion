package com.company.demo;

public class ConvertNumberToEnglish {
    public void printNumberInEnglish(int num) {
        String[] ones = {"","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] secondDigit = {"","Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
                "Eighteen",
                "Nineteen"};
        String[] tens = {"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};


        int count = 0;
        String word = "";
        boolean flag = true;

        while (num>0)
        {
            int n = num%10;
            num = num/10;
            count++;

            if (count==1)
            {
                int temp = n;
                n = num%10;
                if(n==1)
                {
                    /*System.out.println(secondDigit[temp]);*/
                    flag = false;
                    word = secondDigit[temp]+" "+word;
                   // count++;
                }
                else
                {
                    /*System.out.println(ones[temp]);*/
                    word = ones[temp]+" "+word;
                }
            }
            else
            if(count==2 && flag)
            {
                /*System.out.println(tens[n]);*/
                word = tens[n]+" "+word;
            }
            else
            if(count==3)
            {
                if(n!=0)
                {
                    if (word.trim().isEmpty())
                    {
                        word = ones[n]+" hundred";
                    }
                    else {
                        word = ones[n]+" hundred and "+word;
                    }
                    /*System.out.println(ones[n]+ " hundred");*/

                }
                else
                {
                    word = " and "+ word;
                }

            }
            else
            if(count==4)
            {
               /* System.out.println(ones[n]+ " thousand");*/
                if (word.trim().isEmpty())
                {
                    word = ones[n]+" thousand";
                }
                else
                {
                    word = ones[n]+" thousand "+word;
                }

            }

        }
        System.out.println(word);



    }

}
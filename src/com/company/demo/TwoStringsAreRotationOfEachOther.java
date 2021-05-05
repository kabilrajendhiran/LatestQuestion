package com.company.demo;

public class TwoStringsAreRotationOfEachOther {

    public void findSolution(String s1, String s2)
    {
        boolean flag = false;

        for (int i = 0; i < s1.length(); i++) {
            s1 = s1.charAt(s1.length()-1) + s1.substring(0,s1.length()-1);
            if(s1.equals(s2))
            {
                flag = true;
                break;
            }
        }

        if (flag)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }

}

package com.company.demo;

public class ShortestDuration {
    public void findSolution(int[] times)
    {
        int min = 99999999;
        for (int i = 0; i < times.length-1; i++) {
            for (int j = i+1; j < times.length; j++) {
                int diff = Math.abs(times[i]-times[j]);
                if (min>diff)
                {
                    min = diff;
                }
            }
        }

        int hour =min/3600;
        int remainingSeconds =min%3600;
        int minutes= remainingSeconds/60;
        int seconds = remainingSeconds%60;

        System.out.println(hour+":"+minutes+":"+seconds);
    }

    public void convertToSeconds(String[] times)
    {
        int totalSecs[]= new int[times.length];
        for (int i=0;i<times.length;i++) {
            String time = times[i];
            String[] format = time.split(":");
            int hour = Integer.parseInt(format[0]);
            int min = Integer.parseInt(format[1]);
            int secs = Integer.parseInt(format[2]);
            totalSecs[i] = secs + (min*60) +(hour*3600);

        }

        findSolution(totalSecs);
    }
}

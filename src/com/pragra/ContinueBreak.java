package com.pragra;

public class ContinueBreak {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 9 )
        {
            i++;
            System.out.println("start" + i);
            if (i == 6) {
                continue;

            }
            System.out.println("end" + i);


        }

    }
}

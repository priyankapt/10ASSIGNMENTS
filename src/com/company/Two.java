package com.company;
public class Two {

    static final int MAX_CHAR = 26;
    static boolean checkCorrectOrNot(String s)
    {
        int[] count1 = new int[MAX_CHAR];
        int[] count2 = new int[MAX_CHAR];
        int n = s.length();
        if (n == 1)
            return true;
        for (int i = 0, j = n - 1; i < j; i++, j--)
        {
            count1[s.charAt(i) - 'a']++;
            count2[s.charAt(j) - 'a']++;
        }
        for (int i = 0; i < MAX_CHAR; i++)
            if (count1[i] != count2[i])
                return false;
        return true;
    }
    public static void main(String args[])
    {
        String s = "abab";

        if (checkCorrectOrNot(s))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}



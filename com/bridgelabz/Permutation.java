package com.bridgelabz;

public class Permutation {
    //main method
    public static void main(String[] args) {
        String string = "ABC";
        int n = string.length();
        Permutation permutation = new Permutation();
        permutation.permute(string, 0, n - 1);
    }


    //permute method to function
    public void permute(String string, int firstIndex, int lastIndex) {
        if (firstIndex == lastIndex) {
            System.out.println(string);
        } else {
            for (int i = firstIndex; i <= lastIndex; i++) {
                string = swap(string, firstIndex, i);
                permute(string, firstIndex + 1, lastIndex);
                string = swap(string, firstIndex, i);
            }
        }
    }

    // swap method
    public String swap(String a, int i, int j) {       //variables a is for string value i-position1 j-position2
        char temp;  //temporary variable to store the string value
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}

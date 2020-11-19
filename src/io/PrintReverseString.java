package io;

public class PrintReverseString {
    public static void main(String[] args) {
        printReverse("abcdefg");
    }

    private static void printReverse(String str) {
        if (str.length()==0)
            return;
        else{
            printReverse(str.substring(1));
            System.out.print(str.charAt(0));
        }
    }
}

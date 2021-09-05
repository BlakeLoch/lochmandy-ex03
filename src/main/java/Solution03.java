/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Blake Lochmandy
 */

import java.util.Scanner;

public class Solution03 {
    /*
        Print "What is the quote?"
        'quote' = read string from user
        Print "Who said it?"
        'author' = read string from user
        Print 'author'+" says, (quotation mark)"+'quote'+"(quotation mark)"
     */

    public static void main(String[] args) {
        System.out.print("What is the quote? ");
        Scanner input = new Scanner(System.in);
        String quote = input.nextLine();
        System.out.print("Who said it? ");
        String author = input.nextLine();
        System.out.println(author+" says, \""+quote+"\"");
    }
}

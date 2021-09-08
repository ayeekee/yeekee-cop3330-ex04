package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Alyssa Yee-Kee
 */

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        Scanner se = new Scanner(System.in);

        System.out.print("Enter a noun: ");
        String noun = se.nextLine();

        System.out.print("Enter a verb: ");
        String verb = se.nextLine();

        System.out.print("Enter an adjective: ");
        String adj = se.nextLine();

        System.out.print("Enter an adverb: ");
        String adv = se.nextLine();

        System.out.println("Once upon a time, a " + adj + " " + noun + " began to " + verb + " " + adv + ". How interesting!");
    }
}

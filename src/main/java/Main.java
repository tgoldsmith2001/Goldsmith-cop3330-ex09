/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int rate=350;
        System.out.print("What is the length of the room in feet? ");
        String Str1=input.nextLine();
        System.out.print("What is the width of the room in feet? ");
        String Str2=input.nextLine();
        int l=Integer.parseInt(Str1);
        int w=Integer.parseInt(Str2);
        double area=(l*w);
        int paintNeeded= (int)Math.ceil(area/rate);
        System.out.format("You will need to purchase %d gallons of paint to cover %d square feet."
                ,paintNeeded, l*w);
    }
}
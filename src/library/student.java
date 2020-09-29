/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package library;

/**
 *
 * @author Rashi Dhawan
 */



import java.util.Scanner;    
public class student {

String studentName;
String regNum;

book borrowedBooks[] = new book[3];
public int booksCount = 0;

Scanner input = new Scanner(System.in);

public student(){

    System.out.println("Enter Student Name:");
    this.studentName = input.nextLine();

    System.out.println("Enter Reg Number:");
    this.regNum = input.nextLine();

}
}
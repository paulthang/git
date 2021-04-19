import java.lang.*;

/**
Description: This program will displays a string without any user interaction
Class: Fall - COSC 1437.81002
Assignment1: Hello World
Date: 08/15/2011
@author  Zoltan Szabo
@version 0.0.0
*/ 
public class Payroll{

/**
*Entry point to application
* @param String as args
* @return void
* @throws Nothing is implemented
*/
public static void main(java.lang.String[] args){
	int hours = 40;
	double grossPay, payRate = 25.0;
	
	grossPay = hours * payRate;
	
	java.lang.System.out.println("Your gross pay is $" + grossPay);
}
}
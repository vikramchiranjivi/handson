package com.example.demo;

import java.util.Scanner;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 

@RestController
public class Calculatorcontroller {
	int num1;
	int num2;
	int operation;
    @RequestMapping("/")
    public void hello() {
//        return "Hello World!";

		Scanner input = new Scanner(System.in);

		System.out.println("please enter the first number");
		num1 = input.nextInt();

		System.out.println("please enter the second number");
		num2 = input.nextInt();

		Scanner op = new Scanner(System.in);

		System.out.println("your preference" + '\n' + "1-add" + '\n' + "2-sub" + '\n' + "3-mul" + '\n' + "4-div");

		
		System.out.println("operand");
		operation = op.nextInt();

		if (operation == 1) {
			System.out.println("Your Answer is " + (num1 + num2));
		} else if (operation == 2) {
			System.out.println("Your Answer is " + (num1 - num2));
		} else if (operation == 3) {
			System.out.println("Your Answer is " + (num1 * num2));
		} else if (operation == 4) {
			System.out.println("Your Answer is " + (num1 / num2));
		} 
    }
}
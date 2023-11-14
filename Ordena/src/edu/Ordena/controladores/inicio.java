package edu.Ordena.controladores;

import java.util.Scanner;

public class inicio {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		Scanner mi = new Scanner (System.in);
		
		
		
		System.out.println("Dime un numero");
		a = mi.nextInt();
		System.out.println("Dime otro numero");
		b = mi.nextInt();
		System.out.println("Dime otro numero");
		c = mi.nextInt();
		
		
		if (a > b & a > c)
		
		{
			if (b > c)
			{
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				
			}
			
			else 
			{
				System.out.println(a);
				System.out.println(c);
				System.out.println(b);
			}
			
		}
		
		if (b > a & b > c)
			
		{
			if (a > c)
			{
				System.out.println(b);
				System.out.println(a);
				System.out.println(c);
				
			}
			
			else 
			{
				System.out.println(b);
				System.out.println(c);
				System.out.println(a);
			}
			
		}
		
		if (c > b & c > a)
			
		{
			if (a > b)
			{
				System.out.println(c);
				System.out.println(a);
				System.out.println(b);
				
			}
			
			else 
			{
				System.out.println(c);
				System.out.println(b);
				System.out.println(a);
			}
			
		}
			
			
		
		

	}

}

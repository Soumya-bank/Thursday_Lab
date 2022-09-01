package restaurant1stSep2022Lab;

import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantBilling {
static ArrayList<Restaurant2nd> list=new ArrayList<Restaurant2nd>();
static Scanner sc=new Scanner(System.in);
static void callOrder(String f_name,float price)
{
	System.out.println(f_name+"Enter Quantity : ");
	float q=sc.nextFloat();
			list.add(new Restaurant2nd(f_name,price*q));
		}
		
		static void totalRestaurantBill()
		{
			System.out.println("total Restaurant Bill");
			System.out.println("============================");
			float total = (float) 0.0;
			for(Restaurant2nd rt: list)
			{
				System.out.println(rt.f_name+"  "+rt.price);
				total += rt.price;
			}
			
			System.out.println("Amount : "+total);
			float gst = (float) (total*0.05);
			System.out.println("GST(5%) : "+gst);
			float ftotal= total+gst;
			System.out.println("Total : "+ftotal);
		}
		
		static void cont()
		{
			System.out.println("\nDo you want to continue? y/n");
			char ch = sc.next().charAt(0); //taking the next character
			if(ch!='y') //if the char is not y or is n then the loop gets run 
			{
				System.out.println();
				totalRestaurantBill(); //we get the bill
				System.exit(0); //exit
			}
			System.out.println();
		}
		
		}

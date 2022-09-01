package restaurant1stSep2022Lab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import collectionframework.Employee;

public class Restaurant2ndMain {

	public static void main(String[] args) {
		HashMap<Integer,Restaurant2nd> resMap=new HashMap<Integer,Restaurant2nd>();
		resMap.put(1,new Restaurant2nd("VEG-CHAWMIN ",60));
		resMap.put(2,new Restaurant2nd("EGG-CHAW ",80));
		resMap.put(3,new Restaurant2nd("MOMO ",100));
		resMap.put(4,new Restaurant2nd("BIRIYANI ",400));
		System.out.println("Welcome to Bhuter Raja Dilo Bor");
		System.out.println("======================================");
		System.out.println("Menu");
		System.out.println("========================");
		System.out.println("Items ******* Price");
		// display
		Set<Map.Entry<Integer,Restaurant2nd>> rest=resMap.entrySet();
    	for(Map.Entry re:rest)
    	{
    		Restaurant2nd restu=(Restaurant2nd) re.getValue();
    		System.out.println(re.getKey());
    		restu.display();
    	}
        System.out.println("======================");
        Scanner sc = new Scanner(System.in);
        char ch;
        int id;
		do {
			System.out.println("Please enter food id:");
			id = sc.nextInt();
			switch(id)
			{
			case 1:
				Restaurant2nd restu = (Restaurant2nd) resMap.get(1);
				RestaurantBilling.callOrder(restu.getF_name(), restu.getPrice());
				break;
			
			case 2:
				Restaurant2nd restu1 = (Restaurant2nd) resMap.get(2);
				RestaurantBilling.callOrder(restu1.getF_name(), restu1.getPrice());
				break;
				
			case 3:
				Restaurant2nd restu3 = (Restaurant2nd) resMap.get(3);
				RestaurantBilling.callOrder(restu3.getF_name(), restu3.getPrice());
				break;
				
			case 4:
				Restaurant2nd restu4 = (Restaurant2nd) resMap.get(4);
				RestaurantBilling.callOrder(restu4.getF_name(), restu4.getPrice());
				break;
			default:
				System.out.println("Sorry This Item is Not Available!!" 
						+ " PLEASE ENTER RIGHT NUMBER......");
			}
			RestaurantBilling.cont();
			
		}
		while(true);
	}

}

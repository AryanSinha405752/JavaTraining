package shopping_cart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		BillGen obj = new BillGen();
		System.out.print("Enter no of items: ");
		int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		if(n==0) {
			System.out.println("Total: "+0.0);
			sc.close();
			return;
		}
		List<Double> price=new ArrayList<Double>();
//		List<Double> discount=new ArrayList<Double>();
		for(int i=0;i<n;i++) {
			double p;
			System.out.print("Enter the price and discount of "+(i+1)+" item: ");
			p=sc.nextDouble();
//			d=sc.nextDouble();
			price.add(p);
//			discount.add(d);
		}
		System.out.print("Enter the discount value if any: ");
		double discount=sc.nextDouble();
		System.out.println("Total: "+ obj.calculateCartTotal(price,discount));
		sc.close();
		
	}
}

package shopping_cart;


import java.util.List;

public class BillGen {
	public double calculateCartTotal(List<Double> price,double dis ) {
		double sum=0;
		if(price!=null) {
			for(Double i:price) {
				sum+=i;
			}
			if(dis>=0 && dis<=100) {
				sum=sum*(100-dis)/100;
			}
			else {
				System.out.println("Invalid discount!");
			}

		}
		return sum;
	}
}

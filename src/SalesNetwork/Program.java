package SalesNetwork;

public class Program {

	public static void main (String [] args) {
		
			Company c1 = new Company("Company", 1000, 10, 25);
			
			Seller Miguel = new Seller("Miguel", 10);
			
			Seller Sol = new Seller("Sol", 20);
			
			Seller Kelly = new Seller("Kelly", 40);
			
			Seller Stephanie = new Seller("Stephanie", 90);
			
			Seller Charlie = new Seller("Charlie", 77);
			
			Seller Michael = new Seller("Second Network", 45);
			
			c1.addSeller(Miguel);
			
			c1.addSeller(Michael);
			
			
			
			Miguel.right = Stephanie;
			Miguel.left = Sol;
			
			Stephanie.right = Kelly;
			
			System.out.println(Miguel.name + " Calculation: " + c1.sellerBalance2(Miguel));
			
			c1.totalBalance(Miguel);
			
			c1.allNetworkBiggerCalculation();
			c1.allNetWorkSmallerCalculation();
			
			
			
		}

	
		
		
	}



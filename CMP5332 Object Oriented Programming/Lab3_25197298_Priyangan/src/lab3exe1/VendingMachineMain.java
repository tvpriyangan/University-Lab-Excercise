package lab3exe1;

public class VendingMachineMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Test 1:
		//Object 
		VendingMachine v1 = new VendingMachine();
		System.out.println("Initial balance = " + v1.getBalance());
		
		//Test 2:
		VendingMachine v2 = new VendingMachine();
		System.out.println("Initial revenue= "+v2.getRevenue());
		
		// Test 3 :
		VendingMachine v3 = new VendingMachine();
		v1.insertCoin();
		System.out.println(v3.getBalance());
		System.out.println(v3.getRevenue());
		
		//Test 4 :
		VendingMachine v4 = new VendingMachine();
		v4.insertCoin();
		v4.insertCoin();
		int refundAmount = v4.refund();
		System.out.println("Refund Amount:" + refundAmount);
		System.out.println("Final Balance:" + v4.getBalance());
		
		//Test 5:
		VendingMachine v5 = new VendingMachine();
		System.out.println(v5.vendCandyBar());
		
		//Test 6:
		VendingMachine v6 = new VendingMachine();
		v6.insertCoin();
		v6.insertCoin();
		v6.insertCoin();
		
		boolean finalDecision = v6.vendCandyBar();
		System.out.println("Final Decision:"+finalDecision);
		System.out.println("Balance:"+v1.getBalance());
		System.out.println("Revenue:"+ v1.getRevenue());	

	}

}

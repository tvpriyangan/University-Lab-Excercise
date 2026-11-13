package lab3exe1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VendingMachineTest {

	@Test
	public void testInitialBalance() {
		VendingMachine v1 = new VendingMachine();
		assertEquals(0,v1.getBalance());
		
	}
	
	@Test
	public void testInitialRevenue() {
		VendingMachine v1 = new VendingMachine();
		assertEquals(0,v1.getRevenue());
		
	}
	
	@Test
	public void testInsertCoins() {
		VendingMachine v1 = new VendingMachine();
		v1.insertCoin();
		v1.insertCoin();
		assertEquals(2, v1.getBalance());
		assertEquals(0,v1.getRevenue());
		
		
	}
	
	@Test
	public void testRefund() {
		VendingMachine v1 = new VendingMachine();
		v1.insertCoin();
		v1.insertCoin();
		int amount=v1.refund();
		assertEquals(2,amount);
		assertEquals(0,v1.getBalance());
		assertEquals(0,v1.getRevenue());
		
	}
	
	@Test
	public void testVendFailure() {
		VendingMachine v1 = new VendingMachine();
		boolean finalDecision=v1.vendCandyBar();
		assertFalse(finalDecision);
		assertEquals(0,v1.getBalance());
		assertEquals(0,v1.getRevenue());
		
	}
	
	@Test
	public void testVendSuccess() {
		VendingMachine v1 = new VendingMachine();
		
		v1.insertCoin();
		v1.insertCoin();
		v1.insertCoin();
		
		boolean finalDecision= v1.vendCandyBar();
		
		assertTrue(finalDecision);
		assertEquals(0,v1.getBalance());
		assertEquals(3,v1.getRevenue());
		
		
	}
	
	
	

}

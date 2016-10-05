import org.junit.*;
import static org.junit.Assert.*;
import project.canbalance.classes.CanBalance;

public class CanBalanceTest {
	private CanBalance bal;

	@Before
	public void setUp() {
		bal = new CanBalance();
	}

	@Test
	public void testCanBalance() {
		int[] arr1 = {1,1,1,2,1};
		assertTrue(bal.canBalance(arr1));	

		int[] arr2 = {2,1,1,2,1};
		assertFalse(bal.canBalance(arr2));	

		int[] arr3 = {10,10};
		assertTrue(bal.canBalance(arr3));	

		int[] arr4 = {10,0,1,-1,10};
		assertTrue(bal.canBalance(arr4));	

		int[] arr5 = {1,1,1,1,4};
		assertTrue(bal.canBalance(arr5));	

		int[] arr6 = {2,1,1,1,4};
		assertFalse(bal.canBalance(arr6));	

		int[] arr7 = {2,3,4,1,2};
		assertFalse(bal.canBalance(arr7));	

		int[] arr8 = {1,2,3,1,0,2,3};
		assertTrue(bal.canBalance(arr8));	

		int[] arr9 = {1,2,3,1,0,1,3};
		assertFalse(bal.canBalance(arr9));	

		int[] arr10 = {1};
		assertFalse(bal.canBalance(arr10));	

		int[] arr11 = {1,1,1,2,1};
		assertTrue(bal.canBalance(arr11));	
}

}

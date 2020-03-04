
import static org.junit.Assert.*;
import org.junit.Test;

	public class MyUnitTest{
		
		@Test
		public void testChange() {
			//VendingMachine vm = new VendingMachine();
			assertEquals("7",VendingMachine.change());
		}
		
		@Test
		public void testDayOfWeek() {
			assertEquals("Wednesday",Util.dayOfWeek(4, 3, 2020));
		}
		
		@Test
		public void testTemperaturConversion() {
			assertEquals(0,Util.temperaturConversion(32),0);
		}
		
//		@Test
//		public void testMonthlyPayment() {
//			assertEquals(0,Util.monthlyPayment(1000,1,1),0);
//		}
		
		@Test
		public void testSqrt() {
			assertEquals(2,Util.sqrt(4),0);
		}

	public static void main(String[] args) {
		

	}

}

import junit.framework.TestCase;

import org.junit.Test;

import com.model.DaoImpl.AccountDaoImpl;
import com.model.DaoImpl.BeneficiaryDaoImpl;

import static org.junit.Assert.assertEquals;
public class TestJunit extends TestCase {
	
String bank="hdfc";
   BeneficiaryDaoImpl a= new BeneficiaryDaoImpl(25001);

   @SuppressWarnings("deprecation")
@Test
   public void testPrintMessage() {
      
      //assertEquals(a.getBalance(123456789012L),balance);
	   assertEquals(bank, a.getToBank(987645342112L));
      
   }
}
import junit.framework.TestCase;

import org.junit.Test;

import com.model.DaoImpl.AccountDaoImpl;
import com.model.DaoImpl.BeneficiaryDaoImpl;
import com.model.DaoImpl.BranchDaoImpl;

import static org.junit.Assert.assertEquals;
public class TestJunit extends TestCase {
	
boolean ifsc=true;
   BranchDaoImpl a= new BranchDaoImpl();

   @SuppressWarnings("deprecation")
@Test
   public void testPrintMessage() {
      
      //assertEquals(a.getBalance(123456789012L),balance);
	   assertEquals(ifsc, a.searchBranchIfsc("3003"));
      
   }
}
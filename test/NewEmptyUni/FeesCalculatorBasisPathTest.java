package NewEmptyUni;

import NewEmptyUnitTest.FeesCalculator;
import java.util.Arrays;
import java.util.Collection;
 
import org.junit.Test;
import org.junit.Before;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class FeesCalculatorBasisPathTest {
	@Parameter(0)
	public int amount;
	@Parameter(1)
	public int fromAccountBalance;
	@Parameter(2)
	public int toAccountBalance;
	@Parameter(3)
	public boolean transfer;
	@Parameter(4)
	public float feePercentage; //expected
	public FeesCalculator feeCalculator;
	
	@Before
	public void initialize() {
		feeCalculator = new FeesCalculator();
	}
	
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] { 
            {22, 50, 123004, 123005
        },
            {22, 50, 123004, 123005,
22, 50, 123004, 123005,
22, 50, 123004, 123005,
22, 50, 123004, 123005,
22, 50, 123004, 123005,
22, 50, 123004, 123005,
22, 50, 123004, 123005},
           
        });
    }
    
	@Test
    public void test() {
    	assertEquals(feePercentage, feeCalculator.calculateTransferFee(amount, fromAccountBalance, toAccountBalance, transfer), 0.5);
    }

}




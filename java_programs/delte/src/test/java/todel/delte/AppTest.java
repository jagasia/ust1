package todel.delte;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Mock
	MyDb mdb;
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    

    /**
     * @return the suite of tests being tested
     */

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void test()
	{
		when(mdb.checkConn()).thenReturn(true);
		boolean result = MyDb.checkConn();
//		assertFalse(result);
		assertFalse(result);
	}
}

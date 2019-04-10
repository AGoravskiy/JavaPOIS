package by.bsu.model.logic;

import by.bsu.model.container.Company;
import by.bsu.model.entity.Plane;
import by.bsu.model.entity.Transport;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class TotalSeatingTest {
    
    private static Company company;
    
    public TotalSeatingTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        company = new Company();
        
        Transport transport = new Plane("TU", "134", 6.7, 36, 1800);
        Transport transport2 = new Plane("AIRBUS", "A300", 99, 300, 7500);
        Transport transport3 = new Plane("BOEING", "737", 12, 176, 3150);
        
        company.add(transport);
        company.add(transport2);
        company.add(transport3);
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcTotalSeating method, of class TotalSeating.
     */
    @Test
    public void testCalcTotalSeating() {
//        System.out.println("calcTotalSeating");
        double expResult = 512;
        double result = TotalSeating.calcTotalSeating(company);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}

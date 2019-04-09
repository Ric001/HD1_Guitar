package com.ricks.InventoryApp;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.ricks.InventoryApp.models.Guitar;
import com.ricks.InventoryApp.models.EBuilder;
import com.ricks.InventoryApp.models.EType;
/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        final Guitar guitar = new Guitar();
        guitar.setBuilder(EBuilder.GIBSON);
        assertTrue("The Builder Value is equal to null",(guitar.getBuilder() == null));
    }
}

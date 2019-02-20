package test.java.edu.xavier.csci;

import org.junit.Test;

import static org.junit.Assert.*;.;

public class add{
    @Test
    public void Test() {
        Calculator classUnderTest = new Calculator();
        assertNotNull(classUnderTest.Calculator());
        int output = classUnderTest..add(1,2);
        assertEquals(3, output);
    }


}

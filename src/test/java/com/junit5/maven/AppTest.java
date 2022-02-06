package com.junit5.maven;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
  
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    /**
     * Failing the below test case purposefully to test different scenarios
     */
    @Test
    public void shouldAnswerWithFail()
    {
        assertTrue( false );
    }
}

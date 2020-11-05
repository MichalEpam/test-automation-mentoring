package com.test.mentoring;
 
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat; 

public class NumberTest {
 
// Using "//" is a comment that will be ignored by the program.
 
    @Test
    public void sum() {
// Declaring a variable
// [type] name_variable = [value];
// [type : int] [name_variable : v1] = [value : 1];
        int v1 = 1; 
        int v2 = 2;
 
        v1 = 4;
        v2 = 5;
 
        int total = v1 + v2;
        
    
assertThat(total).isEqualTo(9);

 } 

 @Test
    public void minus() {
        int v1 = 3; 
        int v2 = 2;
 
 
        int total = v1 - v2;
        
    
assertThat(total).isEqualTo(1);

    }
    
    

 @Test
    public void multiply() {
        double v1 = 2.5d; 
        int v2 = 2;
 
 
        double total = v1 * v2;
        
    
assertThat(total).isEqualTo(5);

    }

   

 @Test
    public void divide() {
        int v1 = 6; 
        int v2 = 2;
 
 
        int total = v1 / v2;
        
    
assertThat(total).isEqualTo(3);

    }
 
    //Math operations
    // + sum
    // - minus
    // * multiply
    // / divide
}
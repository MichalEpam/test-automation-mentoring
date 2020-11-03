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
    
 
    //Math operations
    // + sum
    // - minus
    // * multiply
    // / divide
}
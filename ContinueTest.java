/*
 * Name: Kennedy Keyes
 * Date: April 17, 2021
 * Name of Program: ContinueTest.java
 * Description: This program will display a continue statement terminating an 
iteration of a for statement.
 */
package continuetest;

/**
 *
 * @author codingken
 */
public class ContinueTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int count = 1; count <= 10; count++) { // loop 10 times
            if (count == 5) {
                continue; // skip remaining code in loop body if count is 5
            }
        
            System.out.printf("%d ", count);
        
        }
        
        System.out.printf("%nUsed continue to skip printing 5%n");
    }
}

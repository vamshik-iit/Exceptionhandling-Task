/*
 * @author KUSA VAMSHI
 */

/*
 * This is the solution for Hacherrank Java Exception handling problem
*/
package com.epamassignment;
public class MyCalculator {
	long power(int n,int p) throws Exception
    {
       if (n == 0 && p == 0)
       {    throw new Exception("n and p should not be zero.");
       }
       else if (n < 0 || p < 0)
       {   throw new Exception("n or p should not be negative.");
       } 
       else{
           return (long) Math.pow(n,p);
       }
   }
}

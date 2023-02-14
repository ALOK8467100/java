package Functions;

import java.util.Scanner;

public class NcR {
	
	// here we declare function " public static " we disuuss in oops concepts
	// we write  " int " so it tell that which type of data we give to the function
	// here we write function name " factorial "
	// here we write finction output " (int n) "
	
	
	public static int factorial(int n) {
		
		int ans = 1;
		for(int i = 1; i <= n; i++) {
			ans = ans * i;
		}
		return ans;   // here we return this ans so e write " return " so it can be used further
	}
	
	public static boolean isPrime(int n) {
		int d = 2;
		for(int i = 2; i < n; i++) {
			if(n%d == 0) {
			return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number N");
		int n = s.nextInt();
		System.out.println("Enter number R");
		int r = s.nextInt();
		System.out.println("enter number for checkng prime");
		int x = s.nextInt();
		
		
		// here we find numerator
		
		int num = factorial(n);
		
		/*  it find numerator without using of function.  
		int num = 1;
		for(int i = 1; i <= n; i++) {
			num = num*i;
		}     */
		
		
		// here we find first denomiator which is r! 
		
		int den1 = factorial(r);
		
		/*  it find denumerator without using of function.
		int den1 = 1;
		for(int i = 1; i<= r; i++) {
			den1 = den1*i;
		}      */
		
		// here we find second denominator which is (n-r)!
		
		int den2 = factorial(n-r);
		
		/*  it find denumerator without using of function.
			int den2 = 1;
			for(int i = 1; i <= n-r; i++) {
				den2 = den2*i;
			}    */
			
		
		// finding prime so here we declare the prime function name
		
		boolean ansPrime = isPrime(x);
		
			int ans = num/(den1 * den2);
			System.out.println("Factorial of N and R is : " + ans);
			System.out.println("Number is " + ansPrime);
	}

}


		 /* for factorial formula is 
         n!/(r!)(n-r)!
         suppose we want to find 10c4 so foe that we done 
         10!/(4!)(10-4)! and we got our result  */
            
         
         

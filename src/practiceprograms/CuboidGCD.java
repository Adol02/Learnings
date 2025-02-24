package practiceprograms;
import java.util.Scanner;
public class CuboidGCD {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.println("Enter the values of l, b, and h:");
		        int l = scanner.nextInt();
		        int b = scanner.nextInt();
		        int h = scanner.nextInt();
		        
		        int steps = 0;
		        while (l != 0 && b != 0 && h != 0) {
		            int y = gcd(l,b,h);
		            if (l == y || b == y || h == y) {
		                steps++;
		                break;
		            }
		            if(isPrimeNumber(l)!=0) {
//		            	gcd(l-y, b, h);
		            	steps++;
		            	l=l-y;
		            }
		            if(isPrimeNumber(b)!=0) {
//		            	gcd(l, b-y, h);
		            	steps++;
		            	b=b-y;
		            }
		            if(isPrimeNumber(b)!=0) {
//		            	gcd(l, b, h-y);
		            	steps++;
		            	h=h-y;
		            }
		            steps++;
		        }
		        
		        System.out.println("Number of steps taken to reach zero: " + steps);
		    }
		    
	public static int gcd(int l, int b, int h){
        int c =0;
        int c1 = Math.max(l, b);
        int c2 = Math.max(c1, h);
        for(int i=1;i<=c2;i++){
            if(l%i==0 && b%i==0 && h%i==0){
                c = i;
            }
        }
        return c;
    }
		    public static int isPrimeNumber(int n) {
		        if (n <= 1) {
		            return 0;
		        }
		        for (int i = 2; i <= n / 2; i++) {
		            if (n % i == 0) {
		                return 0;
		            }
		        }
		        return n;
		    }
	}


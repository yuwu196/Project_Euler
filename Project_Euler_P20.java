import java.math.BigInteger;
//import java.math.*;
public class Project_Euler_P20 {
		
		public static void main(String[] strings) {
			
			TextIO.putln("Please enter your number: ");
			int getnum = TextIO.getlnInt();
			BigInteger num=BigInteger.valueOf(getnum);
			BigInteger product = BigInteger.valueOf(1);
			int sum=0;
			
			String printProduct;
				

			product= factorial(num);
			
			
			
			printProduct=product.toString();
			System.out.println(printProduct);
			
			for (int i=0; i<printProduct.length();i++){
				if(printProduct.charAt(i)!='0')sum+=(printProduct.charAt(i)-'0');	
			}
			
			System.out.println(sum);
			


			
		}
		public static BigInteger factorial(BigInteger n) {
		    BigInteger result = BigInteger.ONE;

		    while (!n.equals(BigInteger.ZERO)) {
		        result = result.multiply(n);
		        n = n.subtract(BigInteger.ONE);
		    }

		    return result;
		}
		

	}


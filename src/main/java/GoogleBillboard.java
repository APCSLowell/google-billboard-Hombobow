

public class GoogleBillboard {
	public final static String e = "27182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
	public static void main(final String[] args) {
	  double firstTenPrime = 0;
	  
	  for (int i = 0; i < e.length() - 10; i++)
	  {
	    double num = Double.parseDouble(e.substring(i, i+10));
	    if (isPrime(num))
	    {
	      firstTenPrime = num;
	      break;
	    }
	  }
	
	  // System.out.println(Double.toString(firstTenPrime).substring(0, 1) + Double.toString(firstTenPrime).substring(2, 11));
	  System.out.println(firstTenPrime);
	}
	
	public static boolean isPrime(double dNum)
	{
	  if (dNum < 2)
	  {
	    return false;
	  }
	  for (int i = 2; i < Math.sqrt(dNum); i++)
	  {
	    if (dNum % i == 0)
	    {
	      return false;
	    }
	  }
	  return true;
	}
	
}


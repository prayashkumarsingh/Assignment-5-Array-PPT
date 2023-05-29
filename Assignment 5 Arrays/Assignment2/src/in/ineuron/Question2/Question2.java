package in.ineuron.Question2;

public class Question2 {
	  public static int arrangeCoins(int n) {
	        return (int) (Math.sqrt(n * 8L + 1) - 1 ) / 2;
	    }
	  public static void main(String[] args) {
			int n =5;
			System.out.println(arrangeCoins(n));
			
			
		}

}

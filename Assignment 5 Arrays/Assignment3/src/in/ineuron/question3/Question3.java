package in.ineuron.question3;

public class Question3 {
	public static int[] sortedSquares(int[] A) {
	    int[] res = new int[A.length];
	    int lo = 0; int hi = A.length - 1;
	    for (int i = A.length - 1; i >= 0; i--) {
	      if (Math.abs(A[lo]) >= Math.abs(A[hi])) {
	        res[i] = A[lo] * A[lo];
	          lo++;
	        } else {
	          res[i] = A[hi] * A[hi];
	          hi--;
	         }
	     }
	    return res;
	   }
	public static void main(String[] args) {
		int A[] = {-4,-1,0,3,10};
        
        for (int element: sortedSquares(A)) {
            System.out.println(element);
         }

	}

}

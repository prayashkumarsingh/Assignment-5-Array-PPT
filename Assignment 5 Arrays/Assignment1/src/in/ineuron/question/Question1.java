package in.ineuron.question;

public class Question1 {
	public static int[][] convertTo2DArray(int[] nums, int m, int n) {
	    if (nums.length != m * n)
	      return new int[][] {};

	    int[][] ans = new int[m][n];

	    for (int i = 0; i < nums.length; ++i)
	      ans[i / n][i % n] = nums[i];

	    return ans;
	  }
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		int m = 2;
		int n = 2;
		for (int[] element: convertTo2DArray(nums, m,n)) {
		    for (int elem: element) {
		        System.out.println(elem);
		    }
		}
		
	}

}

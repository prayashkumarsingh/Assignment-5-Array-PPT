package in.ineuron.question5;

public class Question5 {
	public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        int length1 = arr1.length, length2 = arr2.length;
        for (int i = 0; i < length1; i++) {
            int num1 = arr1[i];
            boolean flag = true;
            for (int j = 0; j < length2; j++) {
                int num2 = arr2[j];
                if (Math.abs(num1 - num2) <= d) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                count++;
        }
        return count;
    }
	public static void main(String[] args) {
		int arr1[] = {4,5,8};
		int arr2[] = {10,9,1,8};
		int d = 2;
		System.out.println(findTheDistanceValue(arr1,arr2, d));

	}

        

}

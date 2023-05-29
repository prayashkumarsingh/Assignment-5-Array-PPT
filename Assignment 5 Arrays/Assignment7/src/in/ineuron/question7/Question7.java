package in.ineuron.question7;

public class Question7 {
	static int min(int arr[], int low, int high) {
		if (high < low)
			return arr[0];
		if (high == low)
			return arr[low];
		int mid = low + (high - low) / 2;
		if (mid < high && arr[mid + 1] < arr[mid])
			return arr[mid + 1];
		if (mid > low && arr[mid] < arr[mid - 1])
			return arr[mid];
		if (arr[high] > arr[mid])
			return min(arr, low, mid - 1);
		return min(arr, mid + 1, high);
	}

	public static void main(String[] args) {
		int arr[] = {3,4,5,1,2};
		int N = arr.length;
		System.out.println("The minimum element is... " + min(arr, 0, N - 1));
	}

}

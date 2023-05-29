package in.ineuron.question8;

import java.util.*;

public class Question8 {
	public static int[] originalArray(int[] arr) {
		List<Integer> result = new ArrayList<>();
		Queue<Integer> q = new java.util.LinkedList();

		Arrays.sort(arr);

		for (int num : arr) {
			if (!q.isEmpty() && num == q.peek()) {
				q.poll();
			} else {
				q.offer(num * 2);
				result.add(num);
			}
		}

		return !q.isEmpty() ? new int[] {} : result.stream().mapToInt(i -> i).toArray();
	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 4, 2, 6, 8 };
		for (int element: originalArray(arr)) {
            System.out.println(element);
         }
	}

}

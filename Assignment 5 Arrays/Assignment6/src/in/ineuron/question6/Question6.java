package in.ineuron.question6;

import java.util.*;

public class Question6 {
	public static List<Integer> findDuplicatesLinearSpace(int[] nums) {

		List<Integer> resultSet = new ArrayList<>();
		Set<Integer> uniqueSet = new HashSet<>();
		for (int num : nums) {
			if (uniqueSet.contains(num))
				resultSet.add(num);
			uniqueSet.add(num);
		}

		return resultSet;
	}

	public static void main(String[] args) {
		int nums[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
		System.out.println(findDuplicatesLinearSpace(nums));

	}

}

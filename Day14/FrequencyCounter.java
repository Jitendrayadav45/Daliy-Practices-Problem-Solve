package Day14;

import java.util.*;

public class FrequencyCounter {
    public static List<List<Integer>> countFrequencies(int[] nums) {
        // Step 1: Frequency map
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Convert to list of pairs
        List<List<Integer>> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            result.add(Arrays.asList(entry.getKey(), entry.getValue()));
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1, 3};
        List<List<Integer>> frequencies = countFrequencies(nums);

        System.out.println(frequencies); // [[1, 2], [2, 2], [3, 1]]
    }
}

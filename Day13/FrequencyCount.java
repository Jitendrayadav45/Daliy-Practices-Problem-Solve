package Day13;

import java.util.HashMap;
import java.util.Map; // Map.Entry ke liye import

public class FrequencyCount {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 1};

        // Step 1: HashMap banao
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Step 2: Har element ka count update karo
        for (int num : arr) {
            // Agar num already map me hai to +1 karo, warna 1 se start karo
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 3: Result print karo using entrySet()
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());


//        // Step 3: Result print karo
//        System.out.println(freqMap);
        }
    }
}


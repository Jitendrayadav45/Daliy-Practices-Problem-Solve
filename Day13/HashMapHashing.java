package Day13;

import java.util.*;

public class HashMapHashing {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 3, 2, 12};   // input array
        int[] queries = {1, 2, 3, 4, 12};     // queries

        // Step 1: Pre-compute frequencies using HashMap
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
//            /// agar key exist karti hai to uska count nikaalo warna 0 lo
//            int oldFreq = freqMap.getOrDefault(num, 0);
//
//            /// count badhao
//            freqMap.put(num, oldFreq + 1);
            freqMap.put(num, freqMap.getOrDefault(num, 0) +1);
        }

       ///Answer queries
        for (int q : queries) {
            /// agar query exist karti hai to value do warna 0
            int ans = freqMap.getOrDefault(q, 0);
            System.out.println("Count of " + q + " = " + ans);
        }
    }
}


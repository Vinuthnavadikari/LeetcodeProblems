import java.util.*;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();

        for (int num : nums) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        return duplicates;
    }
}

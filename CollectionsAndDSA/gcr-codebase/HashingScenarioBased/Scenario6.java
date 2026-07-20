package HashingScenarioBased;

import java.util.HashSet;

class Scenario6 {
    public int longestConsecutiveRun(int[] ids) {
        HashSet<Integer> set = new HashSet<>();
        for (int id : ids) set.add(id);

        int longest = 0;

        for (int id : set) {
            if (!set.contains(id - 1)) {
                int current = id;
                int length = 1;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}

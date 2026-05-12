class Solution {

    boolean isPossible(int[][] tasks, int mid) {

        for (int[] task : tasks) {

            int a = task[0];
            int m = task[1];

            if (m > mid) {
                return false;
            }

            mid -= a;
        }

        return true;
    }

    public int minimumEffort(int[][] tasks) {

        int l = 0;
        int r = (int)1e9;

        int result = Integer.MAX_VALUE;

        Arrays.sort(tasks, (a, b) -> {

            int diff1 = a[1] - a[0];
            int diff2 = b[1] - b[0];

            return diff2 - diff1;
        });

        while (l <= r) {

            int mid = l + (r - l) / 2;

            if (isPossible(tasks, mid)) {

                result = mid;
                r = mid - 1;

            } else {

                l = mid + 1;
            }
        }

        return result;
    }
}
class Solution {
    public int maxSumSubarray(int[] arr) {

        long keep = arr[0];
        long delete = Long.MIN_VALUE;
        long ans = arr[0];

        for (int i = 1; i < arr.length; i++) {

            long newDelete = Math.max(
                delete == Long.MIN_VALUE ? Long.MIN_VALUE : delete + arr[i],
                keep
            );

            long newKeep = Math.max(arr[i], keep + arr[i]);

            keep = newKeep;
            delete = newDelete;

            ans = Math.max(ans, Math.max(keep, delete));
        }

        return (int) ans;
    }
}
class Solution {
    public boolean isPowerOfThree(int n) {
        double root = Math.log(n) / Math.log(3);
        return Math.abs(root - Math.round(root)) < 1e-10;
    }
}
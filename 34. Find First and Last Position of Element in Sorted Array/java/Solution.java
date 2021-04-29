class Solution {
  public int[] searchRange(int[] nums, int target) {

    // since given array is sorted binarySearch algorithm can be used 
    // to reach O(log n) runtime complexity
    // binarySearch method is available in Arrays class
    // int index = Arrays.binarySearch(nums, target);
    // But I prefer writing binary search algorithm myself
    int index = binarySearch(nums, 0, nums.length - 1, target);

    if (index == -1) return new int[] {
      -1, -1
    };
    int first = index;
    int last = index;
    while (first > 0 && nums[first - 1] == target) {
      first--;
    }
    while (last < nums.length - 1 && nums[last + 1] == target) {
      last++;
    }
    return new int[] {
      first,
      last
    };
  }

  private int binarySearch(int[] sortedArray, int first, int last, int target) {
    if (first > last) return -1;
    int mid = (last + first) / 2;
    if (sortedArray[mid] == target) return mid;
    if (sortedArray[mid] > target) return binarySearch(sortedArray, first, mid - 1, target);
    if (sortedArray[mid] < target) return binarySearch(sortedArray, mid + 1, last, target);
    return -1;
  }
}
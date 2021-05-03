func runningSum(nums[] int)[] int {
    var last int
    for i, n: = range nums {
        last += n
        nums[i] = last
    }
    return nums
}

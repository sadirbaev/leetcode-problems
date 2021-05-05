func checkPossibility(nums[] int) bool {
    prev: = -100001
    for i: = 1;i < len(nums);i++{
        if i > 1 {
            prev = nums[i - 2]
        }
        if nums[i - 1] > nums[i] {
            if nums[i] < prev {
                nums[i] = nums[i - 1]
                break
            }
            nums[i - 1] = prev
            break
        }

    }
    return sort.IntsAreSorted(nums)
}
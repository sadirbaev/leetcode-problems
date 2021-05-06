func jump(nums[] int) int {
    m: = make(map[int] int)
    for i: = len(nums) - 2;i >= 0;i--{
        if nums[i] == 0 {
            m[i] = 1001
            continue
        }
        if nums[i] >= len(nums) - i - 1 {
            m[i] = 1
            continue
        }
        vMin: = 1001
        for j: = i + 1;
        j < min(i + nums[i] + 1, len(nums));
        j++{
            vMin = min(vMin, m[j])
        }
        m[i] = vMin + 1
    }
    return m[0]
}

func min(x, y int) int {
    if x < y {
        return x
    }
    return y
}

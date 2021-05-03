func minSteps(s string, t string) int {
    arr: = make([] int, 26)
    for i,
    r: = range s {
        arr[r - 'a'] ++
            arr[t[i] - 'a'] --
    }
    var res int
    for _,
    n: = range arr {
        if n > 0 {
            res += n
        }
    }
    return res
}

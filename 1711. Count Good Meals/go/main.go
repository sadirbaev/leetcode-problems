func countPairs(deliciousness[] int) int {
    var res int
    m: = make(map[int] int)
    for _, current: = range deliciousness {
        power: = 1
        for i: = 0;i < 22;i++{
            if _, ok: = m[power - current];
            ok {
                res += m[power - current]
            }
            power <<= 1
        }
        if cnt,
        ok: = m[current];ok {
            m[current] = cnt + 1
        } else {
            m[current] = 1
        }
    }
    return res % (1e9 + 7)
}

https://leetcode.com/problems/matrix-cells-in-distance-order/

```golang
func allCellsDistOrder(R int, C int, r0 int, c0 int) [][]int {
    total := R*C
    res := make([][]int, 0, total)
    res = append(res, []int{r0, c0})
    // fmt.Printf("res=%v\n", res)
    d := 1
    for len(res) < total {
        sub := distance(R, C, r0, c0, d)
        res = append(res, sub...)
        fmt.Sprintf("res=%v", res)
        d++
    }
    return res[:total]
}

func distance(R, C int, r0, c0 int, d int) [][]int {
    res := make([][]int, 0)
    // 0≤r0+dr<R 
    // 0≤c0+dc<C
    // 1, 0; 0, 1; -1, 2
    dr, dc := d, 0
    m := make(map[int]map[int]bool)
    for dr>=0 {
        // fmt.Printf("dr=%d, dc=%d\n", dr, dc)
        if rp, cp := r0+dr, c0+dc; pass(R, C, rp, cp) {
          put(m, rp, cp)
        }
        if rn, cn := r0-dr, c0-dc; pass(R, C, rn, cn) {
          put(m, rn, cn)
        }
        if rp, cn := r0+dr, c0-dc; pass(R, C, rp, cn) {
          put(m, rp, cn)
        }
        if rn, cp := r0-dr, c0+dc; pass(R, C, rn, cp) {
          put(m, rn, cp)
        }
        dr--
        dc++
    }
    for r, cm := range m {
        for c := range cm  {
            res = append(res, []int{r, c})
        }
    }
    return res
}

func put(m map[int]map[int]bool, r, c int) {
    if _, ok := m[r]; !ok {
        m[r] = make(map[int]bool)
    }
    m[r][c] = true
}

func pass(R, C int, r1, c1 int)  bool {
    return r1>=0 && r1<R && c1>=0 && c1<C
}
```
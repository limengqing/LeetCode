https://leetcode.com/problems/two-city-scheduling/

```golang
func twoCitySchedCost(costs [][]int) int {
    n := len(costs)/2
    sort.Slice(costs, func(i, j int) bool {
        deltaI := costs[i][1] - costs[i][0]
        deltaJ := costs[j][1] - costs[j][0]
        return deltaI < deltaJ
    })
    cost := 0
    for _, c := range costs[:n] {
        cost += c[1]
    }
    for _, c := range costs[n:] {
        cost += c[0]
    }
    return cost
}
```
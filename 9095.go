package main

import "fmt"

func main() {
	var (
		input1 int
		num int

		DP [11]int
	)
	DP[1] = 1
	DP[2] = 2
	DP[3] = 4

	fmt.Scan(&input1)

	for i := 0; i < input1; i++ {
		fmt.Scan(&num)
		for j := 4; j <= num; j++ {
			DP[j] = DP[j-3] + DP[j-2] + DP[j-1]
		}
		fmt.Println(DP[num])
	}
}

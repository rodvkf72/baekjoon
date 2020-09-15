package main

import "fmt"

func main() {
	var start int
	var count int = 0

	fmt.Scanln(&start)
	var input1 = make([]int, start)
	var input2 = make([]int, start)
	var rank = make([]int, start)

	for i := 0; i < start; i++ {
		fmt.Scan(&input1[i], &input2[i])
	}

	for j := 0; j < start; j++ {
		for k := 0; k < start; k++ {
			if j != k {
				if input1[j] > input1[k] && input2[j] > input2[k] {
					count++
				} else if (input1[j] <= input1[k] && input2[j] > input2[k]) || (input1[j] > input1[k] && input2[j] <= input2[k]) || (input1[j] == input1[k] && input2[j] == input2[k]) {
					count++
				}
			}
		}
		rank[j] = start - count
		count = 0
	}

	for l := 0; l < start; l++ {
		fmt.Printf("%d ", rank[l])
	}
}

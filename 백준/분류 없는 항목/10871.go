package main

import (
	"fmt"
)

func main() {
	var input1 int
	var input2 int

	fmt.Scan(&input1, &input2)
	var num = make([]int, input1)
	var result = make([]int, input1)

	for i := 0; i < input1; i++ {
		fmt.Scan(&num[i])

		if num[i] < input2 {
			result = append(result, num[i])
		}
	}

	for j := 0; j < len(result); j++ {
		if result[j] != 0 {
			fmt.Printf("%d ", result[j])
		}
	}
}

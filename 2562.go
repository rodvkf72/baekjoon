package main

import "fmt"

func main() {
	var input [10]int
	var max int = 0
	var num int = 0

	input[0] = 0
	for m := 0; m < 9; m++ {
		fmt.Scanln(&input[m])
		if max < input[m] {
			max = input[m]
			num = m + 1
		}
	}
	fmt.Println(max)
	fmt.Println(num)
}

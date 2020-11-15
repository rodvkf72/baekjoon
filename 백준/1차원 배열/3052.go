package main

import "fmt"

func main() {
	var input [10]int
	var result = make([]int, 42)
	var check int = 0
	var count int = 0
	for m := 0; m < 10; m++ {
		fmt.Scanln(&input[m])

		check = input[m] % 42
		result[check]++
	}

	for n := 0; n < 42; n++ {
		if result[n] != 0 {
			count++
		}
	}
	fmt.Println(count)
}

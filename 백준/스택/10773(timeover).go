package main

import "fmt"

func main() {
	var input int
	var cursor int = 0
	var sum int = 0

	fmt.Scan(&input)
	var count = make([]int, input)
	var result = make([]int, input)

	for i := 0; i < input; i++ {
		fmt.Scan(&count[i])
		if count[i] == 0 {
			cursor--
			result[cursor] = 0
		} else {
			result[cursor] = count[i]
			cursor++
		}
	}
	for j := 0; j < input; j++ {
		sum = sum + result[j]
	}
	fmt.Println(sum)
}

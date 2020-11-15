package main

import "fmt"

func main() {
	var input, sum int

	fmt.Scan(&input)
	for i := 1; i < input + 1; i++ {
		sum = sum + i
	}
	fmt.Println(sum)
}

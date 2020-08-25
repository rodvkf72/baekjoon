package main

import "fmt"

func main() {
	var input int
	var m int
	var result int
	fmt.Scan(&input)
	for m = 1; m < 10; m++ {
		result = input * m
		fmt.Printf("%d * %d = %d\n", input, m, result)
	}
}

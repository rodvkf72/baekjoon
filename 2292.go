package main

import "fmt"

func main() {
	var input int
	var count int = 1
	fmt.Scanln(&input)
	for m := 1; input > 1; m++ {
		input = input - 6*m
		count++
	}
	fmt.Println(count)
}

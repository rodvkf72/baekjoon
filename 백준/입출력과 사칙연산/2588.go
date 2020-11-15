package main

import "fmt"

func main() {
	var input1, input2 int
	fmt.Scan(&input1, &input2)
	result1 := input2 % 10
	result2 := input2 % 100 / 10
	result3 := input2 % 1000 / 100
	fmt.Println(input1 * result1)
	fmt.Println(input1 * result2)
	fmt.Println(input1 * result3)
	fmt.Println(input1 * input2)
}

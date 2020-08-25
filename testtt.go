package main

import "fmt"

func main() {
	var input1 int
	var input2 int
	var result int

	fmt.Scan(&input1, &input2)
	result = input1 % input2
	fmt.Println(result)
}

package main

import "fmt"

func main() {
	var input, num1, num2 int
	fmt.Scan(&input)

	for i := 0; i < input; i++ {
		fmt.Scan(&num1, &num2)
		fmt.Println(num1 + num2)
	}
}

package main

import "fmt"

func main() {
	var input1 int
	var input2 int

	fmt.Scan(&input1, &input2)
	if input1 > input2 {
		fmt.Println(">")
	} else if input1 < input2 {
		fmt.Println("<")
	} else if input1 == input2 {
		fmt.Println("==")
	}
}

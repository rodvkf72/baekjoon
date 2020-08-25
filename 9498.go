package main

import "fmt"

func main() {
	var input1 int
	fmt.Scanln(&input1)

	if (input1 >= 90) && (input1 <= 100) {
		fmt.Println("A")
	} else if (input1 >= 80) && (input1 <= 89) {
		fmt.Println("B")
	} else if (input1 >= 70) && (input1 <= 79) {
		fmt.Println("C")
	} else if (input1 >= 60) && (input1 <= 69) {
		fmt.Println("D")
	} else {
		fmt.Println("F")
	}
}

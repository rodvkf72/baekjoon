package main

import "fmt"

func main() {
	var input1 int

	fmt.Scanln(&input1)

	if (input1%4 == 0) && (input1%100 != 0) || (input1%400 == 0) {
		fmt.Println("1")
	} else {
		fmt.Println("0")
	}
}

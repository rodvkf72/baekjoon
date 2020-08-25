package main

import (
	"fmt"
	"os"
)

func main() {
	var input1 int = 1
	var input2 int = 1

	for (input1 != 0) && (input2 != 0) {
		fmt.Scan(&input1, &input2)
		if (input1 == 0) && (input2 == 0) {
			os.Exit(0)
		} else {
			cul(input1, input2)
		}
	}
}

func cul(a int, b int) {
	if b%a == 0 {
		fmt.Println("factor")
	} else if a%b == 0 {
		fmt.Println("multiple")
	} else {
		fmt.Println("neither")
	}
}

package main

import (
	"fmt"
	"os"
)

func main() {
	var input1 int
	var input2 int

	for {
		fmt.Scanln(&input1, &input2)
		if (input1 == 0) && (input2 == 0) {
			os.Exit(0)
		}
		fmt.Println(input1 + input2)
	}
}

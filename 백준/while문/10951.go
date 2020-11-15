package main

import (
	"fmt"
)

func main() {
	var input1 int
	var input2 int
	for {
		fmt.Scanln(&input1, &input2)
		fmt.Println(input1 + input2)
	}
}

package main

import (
	"fmt"
	"os"
)

func main() {
	var input1 int
	var input2 int
	var input3 int
	var m int
	var temp int

	fmt.Scan(&input1, &input2)
	temp = input2
	for m = 0; m < input1; m++ {
		if temp < 1 {
			fmt.Println("비와이")
			os.Exit(0)
		} else {
			fmt.Scan(&input2, &input3)
			temp = temp + input2
			temp = temp - input3
		}
	}
	if m >= input1 {
		fmt.Println("비와이")
	}
}

package main

import (
	"fmt"
	"os"
)

func main() {
	var input1 int
	var input2 int
	var m int
	var n int
	var o int
	var p int
	var result int = 0
	fmt.Scanln(&input1, &input2)
	if (input1 < 3) || (input2 < 10) {
		os.Exit(1)
	}
	var input3 = make([]int, input1)
	for m = 0; m < input1; m++ {
		fmt.Scan(&input3[m])
	}
	for n = 0; n < input1-2; n++ {
		for o = n + 1; o < input1-1; o++ {
			for p = o + 1; p < input1; p++ {
				if input3[n]+input3[o]+input3[p] <= input2 && input2-(input3[n]+input3[o]+input3[p]) < input2-result {
					result = input3[n] + input3[o] + input3[p]
				}
			}
		}
	}
	fmt.Println(result)
}

package main

import "fmt"

var numslice = make([]int, 1000000)

func main() {
	var input1 int
	var input2 int
	var num1 int
	var num2 int
	var num3 int

	fmt.Scanln(&input1, &input2)
	for m := 0; m < input2; m++ {
		fmt.Scanln(&num1, &num2, &num3)
		if num1 == 0 {
			sum(num2, num3)
		}
	}
}

func sum(a int, b int) {

}

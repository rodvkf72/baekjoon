package main

import "fmt"

func main() {
	var input1 int
	var input2 int
	var m int
	var n int

	fmt.Scan(&input1)
	var num1 = make([]int, input1)
	for m = 0; m < input1; m++ {
		fmt.Scan(&num1[m])
	}
	fmt.Scan(&input2)
	var num2 = make([]int, input2)
	for n = 0; n < input2; n++ {
		fmt.Scan(&num2[n])
	}
	find(num1, num2, input1, input2)
}

func find(a []int, b []int, input1 int, input2 int) {
	var m int
	var n int
	var check int = 0
	for m = 0; m < input1; m++ {
		for n = 0; n < input2; n++ {
			if a[n] == b[m] {
				check++
			}
		}
		if check != 0 {
			fmt.Println("1")
		} else {
			fmt.Println("0")
		}
		check = 0
	}
}

package main

import "fmt"

var temp int = 1
var result [13]int
var input int

func main() {
	fmt.Scanln(&input)

	fac(input)
}

func fac(a int) {
	result[a] = a
	if a != 1 {
		fac(a - 1)
	} else {
		for m := 2; m <= input; m++ {
			temp = temp * result[m]
		}
		fmt.Println(temp)
	}
}

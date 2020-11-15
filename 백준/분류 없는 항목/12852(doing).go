package main

import "fmt"

func main() {
	var input1 int
	fmt.Scanln(&input1)

	divine(input1)
}

func divine(a int) {
	var temp int
	if a == 1 {
		fmt.Println("1")
	} else if a%3 == 0 {
		temp = a / 3
		divine(temp)
	} else if a%2 == 0 {
		temp = a / 2
		divine(temp)
	}
}

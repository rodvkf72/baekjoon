package main

import "fmt"

func main() {
	var input int
	fmt.Scan(&input)

	for i := 0; i < input; i++ {
		for j := 0; j <= i; j++ {
			a := "*"
			fmt.Print(a)
		}
		fmt.Print("\n")
	}
}

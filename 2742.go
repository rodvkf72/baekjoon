package main

import "fmt"

func main() {
	var input int

	fmt.Scan(&input)

	for ; input > 0; input-- {
		fmt.Println(input)
	}
}

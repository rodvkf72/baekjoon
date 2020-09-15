package main

import "fmt"

func main() {
	var input int

	fmt.Scan(&input)

	for i := 1; i <= input; i++ {
		fmt.Println(i)
	}
}

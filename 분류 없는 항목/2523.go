package main

import "fmt"

func main()  {
	var input int

	fmt.Scan(&input)

	for i := 0; i < input; i++ {
		for j := 0; j <= i; j++ {
			fmt.Print("*")
		}
		fmt.Println()
	}
	for k := 1; k < input; k++ {
		for l := input; l > k; l-- {
			fmt.Print("*")
		}
		fmt.Println()
	}
}

package main

import "fmt"

func main() {
	var input int
	var count int

	fmt.Scanln(&input)
	for input > 0 {
		if (input % 5) == 0 {
			input = input - 5
			count++
		} else if (input % 3) == 0 {
			input = input - 3
			count++
		} else if input > 5 {
			input = input - 5
			count++
		} else {
			count = -1
			break
		}
	}
	fmt.Println(count)
}

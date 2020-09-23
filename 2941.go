package main

import (
	"fmt"
	"strings"
)

func main() {
	var input string

	fmt.Scan(&input)

	if strings.Contains(input, "c=") {
		input = strings.Replace(input, "c=", "1", 100)
	}
	if strings.Contains(input, "c-") {
		input = strings.Replace(input, "c-", "2", 100)
	}
	if strings.Contains(input, "dz=") {
		input = strings.Replace(input, "dz=", "3", 100)
	}
	if strings.Contains(input, "d-") {
		input = strings.Replace(input, "d-", "4", 100)
	}
	if strings.Contains(input, "lj") {
		input = strings.Replace(input, "lj", "5", 100)
	}
	if strings.Contains(input, "nj") {
		input = strings.Replace(input, "nj", "6", 100)
	}
	if strings.Contains(input, "s=") {
		input = strings.Replace(input, "s=", "7", 100)
	}
	if strings.Contains(input, "z=") {
		input = strings.Replace(input, "z=", "8", 100)
	}
	fmt.Println(len(input))
}

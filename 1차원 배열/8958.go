package main

import (
	"fmt"
)

func main() {
	var input int
	var test string
	var temp int = 0
	var count int = 0

	fmt.Scanln(&input)

	for m := 0; m < input; m++ {
		fmt.Scanln(&test)

		for n := 0; n < len(test); n++ {
			if test[n] == 'O' {
				temp++
				count = count + temp
			} else {
				temp = 0
			}
		}
		fmt.Println(count)
		temp = 0
		count = 0
	}
}

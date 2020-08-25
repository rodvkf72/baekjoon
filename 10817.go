package main

import "fmt"

func main() {
	var input [3]int
	var temp int
	fmt.Scanln(&input[0], &input[1], &input[2])

	if input[0] > input[1] {
		temp = input[0]
		input[0] = input[1]
		input[1] = temp
		if input[1] > input[2] {
			temp = input[1]
			input[1] = input[2]
			input[2] = temp
			if input[0] > input[1] {
				temp = input[0]
				input[0] = input[1]
				input[1] = temp
			}
		}
	} else {
		if input[1] > input[2] {
			temp = input[1]
			input[1] = input[2]
			input[2] = temp
			if input[0] > input[1] {
				temp = input[0]
				input[0] = input[1]
				input[1] = temp
			}
		}
	}
	fmt.Println(input[1])
}

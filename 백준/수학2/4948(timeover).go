package main

import "fmt"

func main() {
	var input int = 1
	var count int = 0
	var result int = 0
	var double int

	for input != 0 {
		fmt.Scanln(&input)
		double = input * 2

		if input == 1 {
			fmt.Println("1")
		} else {
			for n := input + 1; n <= double; n++ {
				for m := 2; m < n; m++ {
					if (n % m) == 0 {
						count++
					}
				}

				if double == 1 {

				} else {
					if count == 0 {
						result++
					}
				}
				count = 0
			}
		}

		if input != 1 {
			fmt.Println(result)
		}
		result = 0
		count = 0
	}
}

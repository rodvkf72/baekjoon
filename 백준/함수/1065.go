package main

import "fmt"

func main() {
	var input int
	fmt.Scanln(&input)
	numbers(input)
}

func numbers(a int) {
	var first int
	var second int
	var third int
	var count int = 0
	for m := 1; m <= a; m++ {
		if m < 100 {
			count++
		} else if (m >= 100) && (m < 111) {

		} else if m < 1000 {
			first = m / 100
			second = (m % 100) / 10
			third = (m % 100) % 10
			if (second - first) == (third - second) {
				count++
			}
		} else if m == 1000 {

		}
	}
	fmt.Println(count)
}

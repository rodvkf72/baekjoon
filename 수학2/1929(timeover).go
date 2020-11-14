package main

import "fmt"

func main() {
	var first int
	var second int
	var count int
	var temp int
	fmt.Scan(&first, &second)

	for m := first; m < second; m++ {
		for n := 2; n < m; n++ {
			if (m % n) == 0 {
				count++
			}
		}
		if m == 1 {

		} else {
			if count == 0 {
				temp = m
			}
		}
		count = 0
		if temp != 0 {
			fmt.Println(temp)
		}
		temp = 0
	}
}

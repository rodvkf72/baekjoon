package main

import (
	"fmt"
)

func main() {
	var x int
	var y int
	var w int
	var h int
	var result1 int
	var result2 int
	var result int

	fmt.Scan(&x, &y, &w, &h)
	if (x == w) || (y == h) {
		fmt.Println("0")
	} else {
		if x < (w - x) {
			result1 = x
		} else {
			result1 = w - x
		}
		if y < (h - y) {
			result2 = y
		} else {
			result2 = h - y
		}
		if result1 <= result2 {
			result = result1
		} else {
			result = result2
		}
		fmt.Println(result)
	}
}

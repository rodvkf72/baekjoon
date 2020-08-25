package main

import (
	"fmt"
	"os"
)

func main() {
	var a int
	var b int
	var c int
	var check int = 0

	for check == 0 {
		fmt.Scan(&a, &b, &c)
		if (a == 0) && (b == 0) && (c == 0) {
			os.Exit(0)
		}
		doublea := a * a
		doubleb := b * b
		doublec := c * c
		if (doublec == (doublea + doubleb)) || (doublea == (doubleb + doublec)) || (doubleb == (doublea + doublec)) {
			fmt.Println("right")
		} else {
			fmt.Println("wrong")
		}
	}
}

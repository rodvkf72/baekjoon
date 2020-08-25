package main

import (
	"fmt"
)

func main() {
	var i int
	var T int
	fmt.Scanf("%d", &T)

	for i = 0; i < T; i++ {
		var a, b int
		fmt.Scan(&a, &b)

		var com int = pow(a, b)
		if com == 0 {
			fmt.Printf("10\n")
		} else {
			fmt.Printf("%d\n", com)
		}
	}
	return
}

func pow(base int, index int) int {
	var r int = 1
	for index != 0 {
		if index&1 != 0 {
			r = (r * base) % 10
			base = (base * base) % 10
			index >>= 1
		}
	}
	return r
}

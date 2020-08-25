package main

import "fmt"

func main() {
	var x [4]int
	var y [4]int

	for m := 0; m < 3; m++ {
		fmt.Scanln(&x[m], &y[m])
	}
	if x[0] == x[1] {
		x[3] = x[2]
	} else if x[0] == x[2] {
		x[3] = x[1]
	} else if x[1] == x[2] {
		x[3] = x[0]
	}
	if y[0] == y[1] {
		y[3] = y[2]
	} else if y[0] == y[2] {
		y[3] = y[1]
	} else if y[1] == y[2] {
		y[3] = y[0]
	}

	fmt.Printf("%d %d\n", x[3], y[3])
}

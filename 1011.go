package main

import (
	"fmt"
	"math"
)

func main() {
	var test int
	var start float64
	var end float64
	var m int

	fmt.Scanln(&test)
	for m = 0; m < test; m++ {
		fmt.Scan(&start, &end)
		move(start, end)
	}
}

func move(s float64, e float64) {
	var m float64
	var result float64

	for m = 1; (m * m) <= (e - s); m++ {
	}
	m--

	result = (e - s) - (m * m)
	result = float64(math.Ceil(float64(result) / float64(m)))
	result = 2*m - 1 + result

	fmt.Println(result)
}

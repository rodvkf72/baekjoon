package main

import (
	"fmt"
)

func main() {
	var min uint64
	var max uint64
	var s uint64
	var m uint64
	var i uint64
	var j uint64
	var result [1000001]bool
	var count int = 0

	fmt.Scan(&min, &max)

	for m = 2; m*m <= max; m++ {
		s = min / (m * m)
		if s*m*m != min {
			s++
		}
		for j = s; m*m*j <= max; j++ {
			result[m*m*j-min] = true
		}
	}
	for i = 0; i < max-min+1; i++ {
		if !result[i] {
			count++
		}
	}
	fmt.Println(count)
}

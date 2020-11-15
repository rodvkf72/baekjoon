package main

import "fmt"

func main() {
	var t int
	var n int
	var k int
	var d [15][15]int
	for i := 1; i < 15; i++ {
		d[0][i] = i
	}
	for j := 1; j < 15; j++ {
		for k := 1; k < 15; k++ {
			d[j][k] = d[j-1][k] + d[j][k-1]
		}
	}
	fmt.Scan(&t)
	for m := 1; m <= t; m++ {
		fmt.Scan(&k, &n)
		fmt.Println(d[k][n])
	}
}

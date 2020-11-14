package main

import "fmt"

func main() {
	var a, b float64
	fmt.Scan(&a, &b)
	fmt.Printf("%.9f\n", float64(a/b))
}

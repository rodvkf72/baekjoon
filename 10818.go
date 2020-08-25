package main

import "fmt"

func main() {
	var count int
	var m int
	var min int
	var max int
	fmt.Scanln(&count)
	var num [1000000]int

	for m = 0; m < count; m++ {
		fmt.Scan(&num[m])
		if m == 0 {
			min = num[m]
			max = num[m]
		}
		if min > num[m] {
			min = num[m]
		}
		if max < num[m] {
			max = num[m]
		}
	}

	fmt.Printf("%d %d", min, max)
}

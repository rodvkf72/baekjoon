package main

import "fmt"

func main() {
	var input1 int
	var m int
	fmt.Scan(&input1)
	var arr = make([]int, input1+1)

	for m = 0; m < input1; m++ {
		fmt.Scan(&arr[m])
	}
	sort(arr, input1-1)
}

func sort(a []int, b int) {
	var m int
	var n int
	var o int
	var empty int

	for m = 0; m < b; m++ {
		for n = 0; n < b; n++ {
			if a[n] <= a[n+1] {
				empty = a[n]
			} else if a[n] > a[n+1] {
				empty = a[n+1]
				a[n+1] = a[n]
				a[n] = empty
			}
		}
	}
	for o = 0; o < b+1; o++ {
		fmt.Println(a[o])
	}
}

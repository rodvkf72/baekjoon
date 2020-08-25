package main

import "fmt"

func main() {
	var input1 int
	var m int
	fmt.Scan(&input1)
	var arr = make([]int, input1+2)
	arr[0] = 0
	arr[1] = 1

	for m = 2; m < input1+2; m++ {
		arr[m] = arr[m-2] + arr[m-1]
	}
	fmt.Println(arr[m-2])
}

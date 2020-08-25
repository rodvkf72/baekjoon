package main

import "fmt"

func main() {
	var input1 int
	var m int
	var n int = 0
	var o int
	var height int = 0
	fmt.Scan(&input1)
	var num = make([]int, input1)

	for m = 0; m < input1; m++ {
		fmt.Scan(&num[n])
		if num[n] == 0 {
			if n <= 0 {
				fmt.Println("0")
			} else {
				for o = 0; o < n; o++ {
					if height < num[o] {
						height = num[o]
					}
					/*if num[o] > num[o+1] {
						height = num[o]
					} else if num[o] < num[o+1] {
						height = num[o+1]
					}*/
				}
				fmt.Println(height)
				height = 0
				n--
			}
		} else {
			n++
		}
	}
}

package main

import "fmt"

func main() {
	var first int
	var second int
	var m int
	var count int
	var result int
	var check int
	var temp int

	fmt.Scanln(&first)
	fmt.Scanln(&second)

	for m = first; m <= second; m++ {
		for n := 2; n < m; n++ {
			if (m % n) == 0 {
				count++
			}
		}
		if m == 1 {

		} else {
			if count == 0 {
				result = result + m
				if check == 0 {
					temp = m
					check = 1
				}
			}
		}
		count = 0
	}
	if check == 0 {
		fmt.Println("-1")
	} else {
		fmt.Println(result)
		fmt.Println(temp)
	}
}

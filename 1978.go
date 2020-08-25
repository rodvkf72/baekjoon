package main

import "fmt"

func main() {
	var input int
	var num int
	var count int = 0
	var result int = 0
	fmt.Scanln(&input)

	for m := 0; m < input; m++ {
		fmt.Scan(&num)

		for n := 2; n < num; n++ {
			if (num % n) == 0 {
				count++
			}
		}
		if num == 1 {

		} else {
			if count == 0 {
				result++
			}
		}
		count = 0
	}
	fmt.Println(result)
}

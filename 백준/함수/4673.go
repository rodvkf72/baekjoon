package main

import "fmt"

func main() {
	numbers()
}
func numbers() {
	var i int
	var res int = 0
	var arr [10001]int

	for i = 1; i <= 10000; i++ {
		if i < 10 {
			res = i + i
			arr[res] = 1
		} else if i < 100 {
			res = i + (i / 10) + (i % 10)
			arr[res] = 1
		} else if i < 1000 {
			res = i + (i / 100) + ((i % 100) / 10) + ((i % 100) % 10)
			arr[res] = 1
		} else if i < 10000 {
			res = i + (i / 1000) + ((i % 1000) / 100) + (((i % 1000) % 100) / 10) + (((i % 1000) % 100) % 10)
			if res <= 10000 {
				arr[res] = 1
			}
		}
	}
	for i = 1; i <= 10000; i++ {
		if arr[i] != 1 {
			fmt.Println(i)
		}
	}
}

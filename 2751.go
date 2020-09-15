package main

import (
	"fmt"
	"sort"
)

func main() {
	var input int

	fmt.Scan(&input)
	var num = make([]int, input)

	for i := 0; i < input; i++ {
		fmt.Scan(&num[i])
	}
	sort.Ints(num)
	for j := 0; j < input; j++ {
		fmt.Println(num[j])
	}
}

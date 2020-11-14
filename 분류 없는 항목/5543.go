package main

import (
	"fmt"
	"sort"
)

func main() {
	var burger = make([]int, 3)
	var drink = make([]int, 2)

	for i := 0; i < 3; i++ {
		fmt.Scan(&burger[i])
	}
	for j := 0; j < 2; j++ {
		fmt.Scan(&drink[j])
	}
	sort.Ints(burger)
	sort.Ints(drink)

	fmt.Print(burger[0] + drink[0] - 50)
}
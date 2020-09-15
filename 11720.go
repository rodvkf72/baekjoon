package main

import (
	"fmt"
	"strconv"
)

func main() {
	var input int
	var input2 string
	var sum int

	fmt.Scan(&input)
	var strarr = make([]string, input+1)
	var intarr = make([]int, input+1)

	fmt.Scan(&input2)
	for i := 0; i < input; i++ {
		strarr[i] = input2[i : i+1]
		intarr[i], _ = strconv.Atoi(strarr[i])
	}
	for j := 0; j < input; j++ {
		sum = sum + intarr[j]
	}
	fmt.Println(sum)
}

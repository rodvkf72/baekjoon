package main

import (
	"fmt"
	"math"
	"strconv"
)

var empty []int

func main() {
	var input1 int
	var m int

	fmt.Scanf("%d", &input1)
	input2 := make([]int, input1)
	input3 := make([]int, input1)
	for m = 0; m < input1; m++ {
		fmt.Scan(&input2[m], &input3[m])
	}

	for m = 0; m < input1; m++ {
		Case(input2[m], input3[m])
	}
}

func Case(two int, three int) error {
	//var m int
	var err error
	var convert string
	var lend int
	var result string
	var resultint int64

	var key float64 = math.Pow(float64(two), float64(three)/1.0)
	convert = strconv.FormatFloat(key, 'f', -1, 64)

	lend = len(convert) - 1
	result = convert[lend:]
	resultint, err = strconv.ParseInt(result, 10, 64)

	fmt.Println(resultint)
	return err
}

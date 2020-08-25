package main

import (
	"fmt"
	"math"
	"strconv"
)

func main() {
	var input1 int
	var input2 int
	var input3 int
	var m int

	fmt.Scanf("%d", &input1)
	for m = 0; m < input1; m++ {
		fmt.Scan(&input2, &input3)
		Case(input2, input3)
	}
}

func Case(two int, three int) {
	//var m int
	//var err error
	var convert string
	var lend int
	var result string
	//var resultint int64

	var key float64 = math.Pow(float64(two), float64(three)/1.0)
	convert = strconv.FormatFloat(key, 'f', -1, 64)

	lend = len(convert) - 1
	result = convert[lend:]
	//resultint, err = strconv.ParseInt(result, 10, 64)

	fmt.Println(result)
	//return err
}

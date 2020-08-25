package main

import (
	"fmt"
	"os"
	"strconv"
	"strings"
)

func main() {
	var input1 int
	var input2 int
	var input3 int
	var imul int
	var smul string

	fmt.Scan(&input1, &input2, &input3)
	if (input1 < 100) || (input2 < 100) || (input3 < 100) || (input1 > 1000) || (input2 > 1000) || (input3 > 1000) {
		os.Exit(1)
	}
	imul = input1 * input2 * input3
	smul = strconv.Itoa(imul)
	fmt.Println(strings.Count(smul, "0"))
	fmt.Println(strings.Count(smul, "1"))
	fmt.Println(strings.Count(smul, "2"))
	fmt.Println(strings.Count(smul, "3"))
	fmt.Println(strings.Count(smul, "4"))
	fmt.Println(strings.Count(smul, "5"))
	fmt.Println(strings.Count(smul, "6"))
	fmt.Println(strings.Count(smul, "7"))
	fmt.Println(strings.Count(smul, "8"))
	fmt.Println(strings.Count(smul, "9"))
}

package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

func main() {
	input := bufio.NewScanner(os.Stdin)
	var count = 0

	input.Scan()
	var input1, _ = strconv.Atoi(input.Text())
	input.Scan()
	var input2, _ = strconv.Atoi(input.Text())
	input.Scan()
	var input3, _ = strconv.Atoi(input.Text())

	if (input3-input2)-input1 > 0 {
		fmt.Println(count)
		os.Exit(0)
	}
	for input1 >= 0 {
		input1 = input1 - (input3 - input2)
		count++
	}
	fmt.Println(count)
}

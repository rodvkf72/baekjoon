package main

import (
	"bufio"
	"fmt"
	"os"
)

var boo = make([]bool, 10)
var temp = make([]int, 10)

func check(index int, x int, y int) {
	if index == y {
		for i := 0; i < y; i++ {
			fmt.Print(temp[i])
			if i != (y - 1) {
				fmt.Print(" ")
			}
		}
		fmt.Println()
	}
	for j := 1; j <= x; j++ {
		if boo[j] {
			continue
		}
		boo[j] = true
		temp[index] = j
		check(index+1, x, y)
		boo[j] = false
	}
}

func main() {
	var input1 int
	var input2 int

	reader := bufio.NewReader(os.Stdin)
	fmt.Fscan(reader, &input1, &input2)
	//fmt.Scan(&input1, &input2)

	check(0, input1, input2)
	//check(0, input1, input2)
}

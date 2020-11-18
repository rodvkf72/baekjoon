package main

import (
	"bufio"
	"fmt"
	"os"
)

var r = bufio.NewReader(os.Stdin)
var w = bufio.NewWriter(os.Stdout)

func main() {
	var input1 int
	var input2 int
	var m int
	var n int

	fmt.Fscan(r, &input1)
	var num1 = make([]int, input1)
	for m = 0; m < input1; m++ {
		fmt.Scan(&num1[m])
	}
	fmt.Fscan(r, &input2)
	var num2 = make([]int, input2)
	for n = 0; n < input2; n++ {
		fmt.Fscan(r, &num2[n])
	}
	find(num1, num2, input1, input2)
}

func find(a []int, b []int, input1 int, input2 int) {
	var m int
	var n int
	var check int = 0
	for m = 0; m < input1; m++ {
		for n = 0; n < input2; n++ {
			if a[n] == b[m] {
				check++
			}
		}
		if check != 0 {
			fmt.Fprintln(w, "1")
			w.Flush()
		} else {
			fmt.Fprintln(w, "0")
			w.Flush()
		}
		check = 0
	}
}

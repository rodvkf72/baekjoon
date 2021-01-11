package main

import (
	"bufio"
	"fmt"
	"os"
)

var r = bufio.NewReader(os.Stdin)
var w = bufio.NewWriter(os.Stdout)

var result [100][100]int64

func main() {
	var input int

	fmt.Fscanln(r, &input)
	var arr = make([][]int, input)
	for a := 0; a < input; a++ {
		arr[a] = make([]int, input)
	}

	for i := 0; i < input; i++ {
		for j := 0; j < input; j++ {
			fmt.Fscan(r, &arr[i][j])
		}
	}
	Sol(arr, input)
}

func Sol(arr [][]int, in int) {
	result[0][0] = 1
	for i := 0; i < in; i++ {
		for j := 0; j < in; j++ {
			if i == in-1 && j == in-1 {
				continue
			}
			value := arr[i][j]
			right := value + j
			down := value + i

			if right < in {
				result[i][right] = result[i][right] + result[i][j]
			}
			if down < in {
				result[down][j] = result[down][j] + result[i][j]
			}
		}
	}
	fmt.Fprintln(w, result[in-1][in-1])
	w.Flush()
}

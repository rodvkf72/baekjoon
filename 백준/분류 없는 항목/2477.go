package main

import (
	"os"
	"fmt"
	"bufio"
	"math"
)

var r = bufio.NewReader(os.Stdin)
var w = bufio.NewWriter(os.Stdout)

func main() {
	var cnt float64
	var empty float64

	fmt.Fscan(r, &cnt)
	arr := make([]float64, 6)

	var max float64
	var maxCur int

	for i := 0; i < 6; i++ {
		fmt.Fscan(r, &empty, &arr[i])
		if arr[i] > max {
			max = arr[i]
			maxCur = i
		}
	}
	
	sideCur1 := maxCur - 1
	sideCur2 := maxCur + 1

	if sideCur1 < 0 {
		sideCur1 += 6
	}
	if sideCur2 > 5 {
		sideCur2 -= 6
	}

	var side1 float64 = arr[sideCur1]
	var side2 float64 = arr[sideCur2]

	var minCur int

	if side1 > side2 {
		minCur = sideCur1 - 1
		if minCur < 0 {
			minCur += 6
		}
	} else {
		minCur = sideCur2 + 1
		if minCur > 5 {
			minCur -= 6
		}
	}

	min := arr[minCur]

	result := min * math.Max(side1, side2)
	result += (max - min) * math.Min(side1, side2)
	result *= cnt

	fmt.Fprintln(w, result)
	w.Flush()
}

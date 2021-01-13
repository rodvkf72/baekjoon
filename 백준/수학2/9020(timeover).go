package main

import (
	"bufio"
	"fmt"
	"math"
	"os"
)

var r = bufio.NewReader(os.Stdin)
var w = bufio.NewWriter(os.Stdout)

var arr2 [10000]int

func main() {
	var cycle int
	var input int
	var count int

	arr2[0] = 0
	arr2[1] = 1

	fmt.Fscanln(r, &cycle)

	for a := 2; a < len(arr2); a++ {
		for b := 2; b <= a; b++ {
			if a%b != 0 {
				count++
			}
			if count == a-2 {
				arr2[a] = a
			}
		}
		count = 0
	}

	for i := 0; i < cycle; i++ {
		fmt.Fscanln(r, &input)

		Decimal(input)
	}
}

func Decimal(arr int) {
	var value int = -1
	var temp int
	var left int = 0
	var right int = 0

	for l := 0; l < arr; l++ {
		for m := 0; m < arr; m++ {
			if arr2[l]+arr2[m] == arr {
				temp = value
				value = int(math.Abs(float64(arr2[m]) - float64(arr2[l])))
				if temp >= value {
					if arr2[l] > arr2[m] {
						left = arr2[m]
						right = arr2[l]
					} else {
						left = arr2[l]
						right = arr2[m]
					}
					break
				}

			}
		}
		if value == 0 {
			if (left == 0) || (right == 0) {
				left = 1
				right = 1
			}
			break
		}
	}
	fmt.Fprint(w, left)
	fmt.Fprint(w, " ")
	fmt.Fprintln(w, right)
	w.Flush()
}

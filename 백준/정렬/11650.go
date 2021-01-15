package main

import (
	"bufio"
	"fmt"
	"os"
	"sort"
)

var r = bufio.NewReader(os.Stdin)
var w = bufio.NewWriter(os.Stdout)

type matrix struct {
	x int
	y int
}

func main() {
	var cycle, x, y int

	fmt.Fscanln(r, &cycle)
	arr := make([]matrix, cycle)

	for i := 0; i < cycle; i++ {
		fmt.Fscan(r, &x, &y)
		arr[i].x = x
		arr[i].y = y
	}
	sort.Slice(arr[:], func(i, j int) bool {
		for range arr {
			if arr[i].x == arr[j].x {
				if arr[i].y == arr[j].y {
					continue
				}
				return arr[i].y < arr[j].y
			}
			return arr[i].x < arr[j].x
		}
		return false
	})

	for j := 0; j < cycle; j++ {
		fmt.Fprint(w, arr[j].x)
		fmt.Fprint(w, " ")
		fmt.Fprintln(w, arr[j].y)
	}
	w.Flush()
}

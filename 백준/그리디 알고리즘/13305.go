package main

import (
	"bufio"
	"fmt"
	"os"
)

var r = bufio.NewReader(os.Stdin)
var w = bufio.NewWriter(os.Stdout)

func main() {
	var area int
	fmt.Fscan(r, &area)

	var distance []int = make([]int, area-1)
	for i := 0; i < area-1; i++ {
		fmt.Fscan(r, &distance[i])
	}
	var price []int = make([]int, area)
	for i := 0; i < area; i++ {
		fmt.Fscan(r, &price[i])
	}

	var comp = price[0]
	var result = 0
	for i := 0; i < area-1; i++ {
		if comp > price[i] {
			comp = price[i]
		}
		result += comp * distance[i]
	}

	fmt.Fprintln(w, result)
	w.Flush()
}
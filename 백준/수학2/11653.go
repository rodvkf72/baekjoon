package main

import (
	"bufio"
	"fmt"
	"os"
)

var r = bufio.NewReader(os.Stdin)
var w = bufio.NewWriter(os.Stdout)

func main() {
	var input int

	fmt.Fscan(r, &input)
	result := input
	for {
		if result == 1 {
			break
		}
		for i := 2; i <= input; i++ {
			if result%i == 0 {
				fmt.Fprintln(w, i)
				result = result / i
				break
			}
		}
		if result == 1 || result == 0 {
			break
		}
	}
	w.Flush()
}

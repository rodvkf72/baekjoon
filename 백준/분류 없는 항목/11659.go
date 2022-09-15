package main

import (
	"os"
	"fmt"
	"bufio"
)

func main() {
	r := bufio.NewReader(os.Stdin)
	w := bufio.NewWriter(os.Stdout)
	
	buf := make([]int, 2)

	for i := 0; i < 2; i++ {
		var num int
		fmt.Fscan(r, &num)
		buf[i] = num
	}

	values := make([]int, buf[0]+1)
	values[0] = 0

	for i := 1; i <= buf[0]; i++ {
		var num int
		fmt.Fscan(r, &num)
		values[i] = values[i-1] + num
	}
	
	for i := 0; i < buf[1]; i++ {
		var start int
		var end int
		fmt.Fscan(r, &start, &end)

		fmt.Fprintln(w, values[end] - values[start-1])
	}
	w.Flush()
}
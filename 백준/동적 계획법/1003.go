package main

import (
	"bufio"
	"fmt"
	"os"
)

var empty [41]int

func main() {
	r := bufio.NewReader(os.Stdin)
	w := bufio.NewWriter(os.Stdout)

	var input int
	var i int
	fmt.Fscanf(r, "%d", &input)
	for i = 0; i < input; i++ {
		var m int
		fmt.Fscanf(r, "%d", &m)
		if m == 0 {
			fmt.Fprintln(w, "1 0")
			w.Flush()
		} else if m == 1 {
			fmt.Fprintln(w, "0 1")
			w.Flush()
		} else {
			Fibonacci(m)
			fmt.Fprintf(w, "%d %d\n", empty[m-1], empty[m])
			w.Flush()
		}
	}
}

func Fibonacci(n int) int {
	if n <= 0 {
		empty[0] = 0
		return 0
	} else if n == 1 {
		empty[1] = 1
		return 1
	}
	if empty[n] != 0 {
		return empty[n]
	} else {
		empty[n] = Fibonacci(n-1) + Fibonacci(n-2)
		return empty[n]
	}
}

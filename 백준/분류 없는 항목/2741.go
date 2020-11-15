package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	var input int

	r := bufio.NewReader(os.Stdin)
	w := bufio.NewWriter(os.Stdout)

	fmt.Fscan(r, &input)

	for i := 1; i <= input; i++ {
		fmt.Fprintln(w, i)
		w.Flush()
	}
}

package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	var value int

	r := bufio.NewReader(os.Stdin)
	w := bufio.NewWriter(os.Stdout)

	fmt.Fscan(r, &value)

	for i := 0; i < value; i++ {
		for j := i; j < value-1; j++ {
			w.WriteString(" ")
		}

		for k := 0; k <= i; k++ {
			w.WriteString("*")
		}
		if i != value-1 {
			w.WriteString("\n")
		}
	}
	w.Flush()
}


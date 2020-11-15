package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	var input1, input2 int

	r := bufio.NewReader(os.Stdin)
	w := bufio.NewWriter(os.Stdout)

	fmt.Fscanln(r, &input1, &input2)
	if input2 == 1 || input2 == 2 {
		fmt.Fprintln(w, "NEWBIE!")
	} else if input2 <= input1 {
		fmt.Fprintln(w, "OLDBIE!")
	} else {
		fmt.Fprintln(w, "TLE!")
	}
	w.Flush()
}

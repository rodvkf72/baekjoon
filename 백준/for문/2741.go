package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

func main() {
	var input int

	r := bufio.NewReader(os.Stdin)
	w := bufio.NewWriter(os.Stdout)

	fmt.Fscan(r, &input)

	for i := 1; i <= input; i++ {
		if (i == input) {
			w.WriteString(strconv.Itoa(i));
		} else {
			w.WriteString(strconv.Itoa(i) + "\n");
		}
	}
	w.Flush()
}

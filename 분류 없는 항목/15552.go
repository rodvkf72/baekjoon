package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

func main() {
	var input, num1, num2 int
	r := bufio.NewReader(os.Stdin)
	w := bufio.NewWriter(os.Stdout)

	fmt.Fscanln(r, &input)
	for i := 0; i < input; i++ {
		fmt.Fscanln(r, &num1, &num2)
		sum := strconv.Itoa(num1 + num2)
		w.WriteString(sum + "\n")
		w.Flush()
	}
}

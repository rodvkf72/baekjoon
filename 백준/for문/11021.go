package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

func main() {
	var cycle int

	r := bufio.NewReader(os.Stdin)
	w := bufio.NewWriter(os.Stdout)

	fmt.Fscan(r, &cycle)
	var f_num int
	var s_num int
	var sum int

	for i := 0; i < cycle; i++ {
		fmt.Fscan(r, &f_num, &s_num)
		sum = f_num + s_num
		if i == cycle - 1 {
			w.WriteString("Case #" + strconv.Itoa(i + 1) + ": " + strconv.Itoa(sum))
		} else {
			w.WriteString("Case #" + strconv.Itoa(i + 1) + ": " + strconv.Itoa(sum) + "\n")
		}
	}
	w.Flush()
}

package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

func main() {
	var input int
	var sum int
	var a int
	var x, y int
	var result string

	var arr [10001][10001] string

	r := bufio.NewReader(os.Stdin)
	w := bufio.NewWriter(os.Stdout)

	fmt.Fscan(r, &input)
	for n := 0; n < 10001; n++ {
		for m := 0; m < 10001; m++ {
			sn := strconv.Itoa(n+1)
			sm := strconv.Itoa(m+1)
			arr[n][m] = sn + "/" + sm
		}
	}

	for i := 0; sum + i < input; i++{
		sum = sum + i
		a = i
	}
	x = a
	y = a

	if (a % 2) == 0 {
		for j := 0; j < input - sum; j++ {
			result = arr[y-j][j]
		}
	} else if (a % 2) != 0 {
		for k := 0; k < input - sum; k++ {
			result = arr[k][x-k]
		}
	}

	fmt.Fprintln(w, result)
	w.Flush()
}
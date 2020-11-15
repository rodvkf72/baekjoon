package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	var up, down, height, sum, cnt int

	r := bufio.NewReader(os.Stdin)
	w := bufio.NewWriter(os.Stdout)

	fmt.Fscan(r, &up, &down, &height)
	for ; sum < height; sum = sum - down {
		cnt++
		sum = sum + up
		if sum >= height {
			fmt.Fprint(w, cnt)
			w.Flush()
			return
		}
	}
}

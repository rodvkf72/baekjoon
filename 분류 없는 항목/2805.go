package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	var tree, length, max, cnt, result int

	r := bufio.NewReader(os.Stdin)
	w := bufio.NewWriter(os.Stdout)

	fmt.Fscanln(r, &tree, &length)
	arr := make([]int, tree)

	for i := 0; i < tree; i++ {
		fmt.Fscan(r, &arr[i])
		if max < arr[i] {
			max = arr[i]
		}
	}

	for k := 1; result < length; k++ {
		for l := 0; l < tree; l++ {
			if arr[l] > max-k {
				result = result + (arr[l] - (max - k))
			}
		}
		cnt++
		if result < length {
			result = 0
		}
	}
	fmt.Fprintln(w, max - cnt)
	w.Flush()
}

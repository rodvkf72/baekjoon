package main

import (
	"bufio"
	"os"
	"fmt"
	"strings"
)

func main() {
	r := bufio.NewReader(os.Stdin)
	w := bufio.NewWriter(os.Stdout)

	var result int
	var arr [8][8]string

	for k := 0; k < 8; k++ {
		var str string
		fmt.Fscan(r, &str)
		split := strings.Split(str,"")

		for l := 0; l < 8; l++ {
			arr[k][l] = string(split[l])
		}
	}

	for m := 0; m < 8; m++ {
		for o := 0; o < 8; o++ {
			if (m + o) % 2 == 0 {
				if arr[m][o] == "F" {
					result++
				}
			}
		}
	}
 	fmt.Fprintln(w, result)
	w.Flush()
}
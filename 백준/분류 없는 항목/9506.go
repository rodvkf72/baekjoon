package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	r := bufio.NewReader(os.Stdin)
	w := bufio.NewWriter(os.Stdout)
	var input int
	var sum int

	for {
		fmt.Fscanln(r, &input)
		if input == -1 {
			break
		} else {
			var arr = make([]int, input+1)
			for i := 1; i < input; i++ {
				if input%i == 0 {
					arr[i] = i
					sum = sum + arr[i]
				}
			}
			fmt.Fprint(w, input)
			if sum != input {
				fmt.Fprint(w, " is NOT perfect.")
			} else {
				for j := 1; j < input; j++ {
					if arr[j] != 0 {
						if arr[j] == 1 {
							fmt.Fprint(w, " = ")
						} else {
							fmt.Fprint(w, " + ")
						}
						fmt.Fprint(w, arr[j])
					}
				}
			}
			fmt.Fprintln(w)
			w.Flush()
		}
		sum = 0
	}
}

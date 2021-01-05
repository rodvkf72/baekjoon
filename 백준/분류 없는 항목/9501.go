package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	r := bufio.NewReader(os.Stdin)
	w := bufio.NewWriter(os.Stdout)

	var c int
	var amo, dist int
	var speed, fuel, consum int
	var count int = 0

	fmt.Fscanln(r, &c)
	for i := 0; i < c; i++ {
		fmt.Fscanln(r, &amo, &dist)

		for j := 0; j < amo; j++ {
			fmt.Fscanln(r, &speed, &fuel, &consum)

			if (float64(speed) * float64(fuel) / float64(consum)) >= float64(dist) {
				count++
			}
		}
		fmt.Fprintln(w, count)
		w.Flush()
		count = 0
	}
}

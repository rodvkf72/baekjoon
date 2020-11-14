package main

import (
	"fmt"
	"os"
)

func main() {
	var input int

	fmt.Scanln(&input)
	for m := 0; m < input; m++ {
		var height int
		var width int
		var num int
		var countheight int = 1
		var countwidth int = 1
		fmt.Scan(&height, &width, &num)
		if height*width < num {
			os.Exit(1)
		}
		for n := 1; n < num; n++ {
			if countheight >= height {
				countheight = 1
				countwidth++
			} else {
				countheight++
			}
		}
		if countwidth < 10 {
			fmt.Printf("%d0%d\n", countheight, countwidth)
		} else {
			fmt.Printf("%d%d\n", countheight, countwidth)
		}
	}
}

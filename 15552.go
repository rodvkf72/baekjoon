package main

import (
	"fmt"
	"os"
)

func main() {
	var input1 int
	var input2 int
	var input3 int
	var m int
	fmt.Scanln(&input1)
	if (input1 < 0) || (input1 > 1000000) {
		os.Exit(1)
	}
	for m = 0; m < input1; m++ {
		fmt.Scanln(&input2, &input3)
		if (input2 <= 0) || (input3 <= 0) || (input2 > 1000) || (input3 > 1000) {
			os.Exit(1)
		}
		fmt.Println(input2 + input3)
	}
	/*
		var f *os.File
		f = os.Stdin
		defer f.Close()

		scanner := bufio.NewScanner(f)
		for n := 0; n < input1; n++ {
			scanner.Scan()
			fmt.Println(">", scanner.Text())
		}
	*/
}

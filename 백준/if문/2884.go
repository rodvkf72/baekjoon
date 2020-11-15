package main

import (
	"fmt"
	"math"
)

func main() {
	var input1 int
	var input2 int

	fmt.Scanln(&input1, &input2)

	if input2 < 45 {
		input1--
    if input1 < 0 {
      input1 = 23
    }
		input2 = input2 - 45
		if input2 < 0 {
			input2 = 60 - int(math.Abs(float64(input2)))
		}
		fmt.Printf("%d %d", input1, input2)
	} else {
		input2 = input2 - 45
		fmt.Printf("%d %d", input1, input2)
	}
}

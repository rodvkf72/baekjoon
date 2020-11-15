package main

import "fmt"

func main() {
	var input1 int
	fmt.Scanln(&input1)
	var input2 = make([]float32, input1)
	var max float32 = 0.0
	var sum float32 = 0.0

	for m := 0; m < input1; m++ {
		fmt.Scan(&input2[m])

		if m == 0 {
			max = input2[m]
		} else {
			if input2[m] > max {
				max = input2[m]
			}
		}
	}
	for n := 0; n < input1; n++ {
		input2[n] = input2[n] / max
		sum = sum + input2[n]
	}
	fmt.Println((sum / float32(input1)) * 100)
}

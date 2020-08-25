package main

import "fmt"

func main() {
	var input1 int
	var input2 int
	var sum int = 0
	var avg float32 = 0.0
	var count int = 0

	fmt.Scanln(&input1)
	for m := 0; m < input1; m++ {
		fmt.Scan(&input2)
		var input3 = make([]int, input2)
		for n := 0; n < input2; n++ {
			fmt.Scan(&input3[n])
			sum = sum + input3[n]
		}
		avg = float32(sum / input2)
		for o := 0; o < input2; o++ {
			if float32(input3[o]) > avg {
				count++
			} else {

			}
		}
		fmt.Printf("%.3f%%\n", (float32(count)/float32(input2))*100)
		sum = 0
		avg = 0.0
		count = 0
	}
}

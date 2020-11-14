package main

import "fmt"

func main() {
	var score[5] int
	var sum int

	for i := 0; i < 5; i++ {
		fmt.Scan(&score[i])

		if score[i] < 40 {
			score[i] = 40
		}
	}

	for j := 0; j < 5; j++ {
		sum = sum + score[j]
	}
	fmt.Print(sum/5)
}

package main

import "fmt"

func main() {
	var input int

	fmt.Scan(&input)
	var arr = make([]int, input+1)
	var arr2 = make([]string, input+1)

	for i := 0; i < input; i++ {
		fmt.Scan(&arr[i], &arr2[i])
	}

	for j := 0; j < input; j++ {
		slice := arr2[j]
		for k := 0; k < len(arr2[j]); k++ {
			slice2 := slice[k : k+1]
			for l := 0; l < arr[j]; l++ {
				fmt.Print(slice2)
			}
		}
		fmt.Println()
	}
}

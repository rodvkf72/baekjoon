package main

/*
import "fmt"

func main() {
	var m int
	var input int
	fmt.Scan(&input)
	var arr = make([]int, input)

	for m = 0; m < input; m++ {
		fmt.Scan(&arr[m])
	}
	fmt.Println(sum(arr))
}
*/

func sum(a []int) int {
	var n int
	var result int
	for n = 0; n < len(a); n++ {
		result += a[n]
	}
	return result
}

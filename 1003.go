package main

import "fmt"

var empty [41]int

func main() {
	var input int
	var i int
	fmt.Scanf("%d", &input)
	for i = 0; i < input; i++ {
		var m int
		fmt.Scanf("%d", &m)
		if m == 0 {
			fmt.Println("1 0")
		} else if m == 1 {
			fmt.Println("0 1")
		} else {
			Fibonacci(m)
			fmt.Printf("%d %d\n", empty[m-1], empty[m])
		}
	}
}

func Fibonacci(n int) int {
	if n <= 0 {
		empty[0] = 0
		return 0
	} else if n == 1 {
		empty[1] = 1
		return 1
	}
	if empty[n] != 0 {
		return empty[n]
	} else {
		empty[n] = Fibonacci(n-1) + Fibonacci(n-2)
		return empty[n]
	}
}

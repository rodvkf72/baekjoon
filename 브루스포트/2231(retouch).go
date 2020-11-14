package main

import (
	"fmt"
)

func main() {
	var N int
	var sumN int
	var hundX int
	var tenX int
	var oneX int
	var X int

	fmt.Scan(&N)

	for X = 0; sumN < N && sumN != N; {
		X++
		//백의 자리까지만 해서 틀린거임.. 백만자리까지 해야됨. 함수로 짜면 되는데 일단 귀찮아서 넘어감
		hundX = X / 100
		tenX = (X - (hundX * 100)) / 10
		oneX = X - ((hundX * 100) + (tenX * 10))
		sumN = X + hundX + tenX + oneX
	}
	if sumN > N {
		fmt.Println("0")
	} else {
		fmt.Println(hundX)
		fmt.Println(tenX)
		fmt.Println(oneX)
		fmt.Println(X)
	}
}

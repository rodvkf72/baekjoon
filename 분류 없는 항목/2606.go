package main

import (
	"fmt"
)

var met[101][101] int
var vis[101 * 101] int
var res int

func main() {
	var count int
	var line int
	var num1 int
	var num2 int

	fmt.Scan(&count)
	fmt.Scan(&line)

	for i := 0; i < line; i++ {
		fmt.Scan(&num1, &num2)
		met[num1][num2] = 1
		met[num2][num1] = 1
	}
	DFSS(count, 1)
	fmt.Println(res)
}

func DFSS(count int, num int) {
	vis[num] = 1

	for i := 0; i < count; i++ {
		if (vis[i] != 1) && (met[num][i] == 1) {
			DFSS(count, i)
			res++
		}
	}
}

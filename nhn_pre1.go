package main

import (
	"fmt"
	"sort"
)

var dx = [4]int {0, 0, -1, 1}
var dy = [4]int {1, -1, 0, 0}
var cnt int
var cntarr [6]int
var cntarr2 []int

func main() {
	var input int
	var num int
	fmt.Scan(&input)

	var arr = make([][]int, input)
	var vis = make([][]bool, input)

	for i := 0; i < input; i++ {
		arr[i] = make([]int, input)
		vis[i] = make([]bool, input)
	}

	for j := 0; j < input; j++ {
		for k := 0; k < input; k++ {
			fmt.Scan(&num)
			arr[j][k] = num
			vis[j][k] = false
		}
	}

	for l := 0; l < input; l++ {
		for m := 0; m < input; m++ {
			if (arr[l][m] == 1) && (vis[l][m] == false){
				cnt = 0
				DFSSS(arr, vis, l, m, input)
				cntarr[m] = cnt
			}
		}
	}
	for n := 0; n < input; n++ {
		if cntarr[n] != 0 {
			cntarr2 = append(cntarr2, cntarr[n])
		}
	}
	sort.Ints(cntarr2)
	for o := 0; o < len(cntarr2); o++ {
		fmt.Printf("%d ", cntarr2[o])
	}
}
func DFSSS(arr [][]int, vis [][]bool, x int, y int, input int) {
	vis[x][y] = true
	cnt++

	for i := 0; i < 4; i++ {
		newx := x + dx[i]
		newy := y + dy[i]

		if (newx >= 0) && (newx < input) && (newy >= 0) && (newy < input) {
			if (arr[newx][newy]) == 1 && vis[newx][newy] == false {
				DFSSS(arr, vis, newx, newy, input)
			}
		}
	}
}
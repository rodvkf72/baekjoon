package main

import (
	"os"
	"fmt"
	"bufio"
	"math"
)

var r = bufio.NewReader(os.Stdin)
var w = bufio.NewWriter(os.Stdout)

var arr [][]int
var notSafe [][]bool
var visited [][]bool

var dx [4]int = [4]int{-1, 0, 1, 0}
var dy [4]int = [4]int{0, 1, 0, -1}

type VO struct {
	x int
	y int
	size int
}

func main() {
	var size int

	fmt.Fscanln(r, &size)

	arr = make([][]int, size)
	notSafe = make([][]bool, size)
	visited = make([][]bool, size)

	for i := 0; i < size; i++ {
		arr[i] = make([]int, size)
		notSafe[i] = make([]bool, size)
		visited[i] = make([]bool, size)
	}

	var maxHeight int = 0
	for i := 0; i < size; i++ {
		for j := 0; j < size; j++ {
			fmt.Fscan(r, &arr[i][j])
			//건물 높이 중 가장 높은 것을 구한다.
			maxHeight = int(math.Max(float64(maxHeight), float64(arr[i][j])))
		}
	}

	var safeArea int = 0
	for i := 0; i < maxHeight; i++ {
		var cnt int = 0

		for j := 0; j < size; j++ {
			for k := 0; k < size; k++ {
				//방문 기록을 초기화 한다.
				visited[j][k] = false

				//물에 잠겼을 경우에 대한 부울 값을 변경한다.
				if i >= arr[j][k] {
					notSafe[j][k] = true
				}
			}
		}

		for j := 0; j < size; j++ {
			for k := 0; k < size; k++ {
				//물에 잠기지 않았고 방문 기록이 없는 경우
				if !notSafe[j][k] && !visited[j][k] {
					DFS(j, k, size)
					cnt++
				}
			}
		}
		safeArea = int(math.Max(float64(safeArea), float64(cnt)))
	}
	fmt.Fprintln(w, safeArea)
	w.Flush()
}

func DFS(x int, y int, size int) {
	var stack []VO
	stack = append(stack, VO{x, y, size})

	for len(stack) > 0 {
		n := len(stack) - 1
		stackX := stack[n].x
		stackY := stack[n].y
		stack = stack[:n]

		visited[stackX][stackY] = true

		for i := 0; i < 4; i++ {
			nx := stackX + dx[i]
			ny := stackY + dy[i]

			if nx >= 0 && nx < size && ny >= 0 && ny < size && !visited[nx][ny] && !notSafe[nx][ny] {
				stack = append(stack, VO{nx, ny, size})
			}
		}
	}
}

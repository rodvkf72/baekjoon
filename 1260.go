package main

import "fmt"

var metrix[1001][1001] int
var visited[1001 * 1001] int

func main() {
	var pointcount int
	var linecount int
	var pointnum int
	var num1, num2 int

	fmt.Scan(&pointcount, &linecount, &pointnum)
	for i := 0; i < linecount; i++ {
		fmt.Scan(&num1, &num2)
		metrix[num1][num2] = 1
		metrix[num2][num1] = 1
	}
	DFS(pointcount, pointnum)
	refresh(pointcount)
	fmt.Println()
	BFS(pointcount, pointnum)
}

func refresh(count int) {
	for i := 1; i <= count; i++ {
		visited[i] = 0
	}
}

func DFS(count int, num int) {
	fmt.Printf("%d ", num)
	visited[num] = 1

	for i := 1; i <= count; i++ {
		if (visited[i] != 1) && (metrix[num][i] == 1) {
			DFS(count, i)
		}
	}
}

func BFS(count int, num int) {
	front := -1
	rear := -1
	var queue[1001 * 1001] int

	rear++
	queue[rear] = num
	visited[num] = 1
	fmt.Printf("%d ", num)
	for (front < rear) {
		front++
		next := queue[front]
		for i := 1; i <= count; i++ {
			if (visited[i] != 1) && (metrix[next][i] == 1) {
				rear++
				visited[i] = 1
				queue[rear] = i
				fmt.Printf("%d ", i)
			}
		}
	}
}
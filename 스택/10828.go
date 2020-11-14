package main

import (
	"bufio"
	"os"
	"fmt"
	"strings"
)

var r = bufio.NewReader(os.Stdin)
var w = bufio.NewWriter(os.Stdout)

var stack []int

func main() {
	var input int
	var member string
	var number int
	var cursor int

	fmt.Fscanln(r, &input)
	stack = make([]int, input)

	for i := 0; i < input; i++ {
		fmt.Fscanln(r, &member, &number)
		if strings.Contains(member, "push") {
			Push(number, cursor)
			cursor++
		} else if strings.Contains(member, "pop") {
			cursor--
			if cursor == -1 {
				fmt.Fprintln(w, -1)
				w.Flush()
				cursor++
			} else {
				Pop(cursor)
			}
		} else if strings.Contains(member, "size") {
			Size(cursor)
		} else if strings.Contains(member, "empty") {
			Empty(cursor)
		} else if strings.Contains(member, "top") {
			cursor--
			if cursor == -1 {
				fmt.Fprintln(w, -1)
				w.Flush()
			} else {
				Top(cursor)
			}
			cursor++
		}
	}
}

func Push(m int, c int) {
	stack[c] = m
}

func Pop(c int) {
	print := stack[c]
	stack[c] = 0
	fmt.Fprintln(w, print)
	w.Flush()
}

func Size(c int) {
	fmt.Fprintln(w, c)
	w.Flush()
}

func Empty(c int) {
	if c == 0 {
		fmt.Fprintln(w, 1)
	} else {
		fmt.Fprintln(w, 0)
	}
	w.Flush()
}

func Top(c int) {
	if stack[c] == 0 {
		fmt.Fprintln(w, -1)
	} else {
		fmt.Fprintln(w, stack[c])
	}
	w.Flush()
}
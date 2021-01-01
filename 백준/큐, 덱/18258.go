package main

import (
	"bufio"
	"fmt"
	"os"
	"strings"
)

var r = bufio.NewReader(os.Stdin)
var w = bufio.NewWriter(os.Stdout)

var queue []int

func main() {
	var input int
	var member string
	var number int
	var cursor int

	fmt.Fscanln(r, &input)
	queue = make([]int, input+1)

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
		} else if strings.Contains(member, "front") {
			if cursor == 0 {
				fmt.Fprintln(w, -1)
				w.Flush()
			} else {
				Front(cursor)
			}
		} else if strings.Contains(member, "back") {
			Back()
		}
	}
}

func Push(n int, c int) {
	for i := c - 1; i >= 0; i-- {
		queue[i+1] = queue[i]
	}
	queue[0] = n
}

func Pop(c int) {
	print := queue[c-1]
	queue[c-1] = 0
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

func Front(c int) {
	if queue[c-1] != 0 {
		fmt.Fprintln(w, queue[c-1])
	} else {
		fmt.Fprintln(w, -1)
	}
	w.Flush()
}

func Back() {
	if queue[0] != 0 {
		fmt.Fprintln(w, queue[0])
	} else {
		fmt.Fprintln(w, -1)
	}
	w.Flush()
}

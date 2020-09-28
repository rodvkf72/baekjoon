package main

import (
	"bufio"
	"fmt"
	"os"
	"sort"
	"strconv"
)

func main() {
	r := bufio.NewReader(os.Stdin)
	w := bufio.NewWriter(os.Stdout)
	var input int
	fmt.Fscan(r, &input)
	s := strconv.Itoa(input)
	var inputarr = make([]int, len(s))
	for i := 0; i < len(s); i++ {
		inputarr[i], _ = strconv.Atoi(s[i:i+1])
	}
	sort.Ints(inputarr)
	for j := len(inputarr); j > 0; j-- {
		fmt.Fprint(w, inputarr[j-1])
	}
	w.Flush()
}

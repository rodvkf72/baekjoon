package main

import (
	"bufio"
	"fmt"
	"os"
	"sort"
	"strconv"
	"strings"
)

func main() {
	var input int
	var arr []int
	r := bufio.NewReader(os.Stdin)
	w := bufio.NewWriter(os.Stdout)

	for i := 1; i < 10000001; i++ {
		strcon := strconv.Itoa(i)
		if strings.Contains(strcon,"666") == true {
			intcon, _ := strconv.Atoi(strcon)
			arr = append(arr, intcon)
		}
	}
	sort.Ints(arr)
	fmt.Fscan(r, &input)
	fmt.Fprint(w, arr[input-1])
	w.Flush()
}

package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func main() {
	r := bufio.NewReader(os.Stdin)
	w := bufio.NewWriter(os.Stdout)

	var str string
	var cycle int
	var divresult int

	fmt.Fscan(r, &str)

	cycle, _ = strconv.Atoi(str)

	for i := 1; i <= cycle; i++ {
		divresult = i
		strarr := strings.Split(strconv.Itoa(i), "")

		for j := 0; j < len(strarr); j++ {
			val, _ := strconv.Atoi(strarr[j])
			divresult = divresult + val
		}
		if i == cycle {
			divresult = 0
			break
		}
		if divresult == cycle {
			divresult = i
			break
		}
	}
	w.WriteString(strconv.Itoa(divresult))
	w.Flush()
}

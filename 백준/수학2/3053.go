package main

import (
	"bufio"
	"fmt"
	"math"
	"os"
)

var r = bufio.NewReader(os.Stdin)
var w = bufio.NewWriter(os.Stdout)

func main() {
	var input float64

	fmt.Fscan(r, &input)

	euresult := input * input * math.Pi
	taresult := math.Abs(input) * math.Abs(input) * 2.000000

	fmt.Fprintf(w, "%.6f\n", float64(euresult))
	fmt.Fprintf(w, "%.6f\n", float64(taresult))
	w.Flush()
}

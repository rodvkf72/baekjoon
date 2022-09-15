package main

import (
	"fmt"
	"os"
	"bufio"
)

func main() {
	r := bufio.NewReader(os.Stdin)
	w := bufio.NewWriter(os.Stdout)

	var input int
	fmt.Fscanf(r, "%d", &input)

	var dp = make([]int, input+2)

	dp[0] = 0;
	dp[1] = 1;
	dp[2] = 2;

	for i := 3; i <= input; i++ {
		dp[i] = (dp[i-1] + dp[i-2]) % 10007
	}
	fmt.Fprintf(w, "%d\n", dp[input])
	w.Flush()
}
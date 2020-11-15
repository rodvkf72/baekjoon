package main

import (
	"bufio"
	"fmt"
	"os"

)

type st struct {
	min int
	max int
}

func main() {
	var input, num, cnt int

	r := bufio.NewReader(os.Stdin)
	w := bufio.NewWriter(os.Stdout)
	var arr []int
	fmt.Fscan(r, &input)

	for i := 0; i < input; i++ {
		fmt.Fscan(r, &num)
		arr = make([]int, num)
		cnt = 0
		for j := 1; j <= num; j++ {
			cnt = 0
			for k := 1; k <= j; k++{
				if (j % k == 0) && (k % 2 != 0){
					cnt++
				}
				if (cnt == 2) && (k % 2 != 0) {
					if k != 1 {
						arr[k] = k
						cnt = 0
					}
				}
			}
		}
		for n := 0; n < len(arr); n++ {
			for o := 0; o < len(arr); o++ {
				if ((arr[n] + arr[o]) == num) {
					//추가 조건 입력(두 소수 값의 차이가 더 적은 것으로 나오게


					fmt.Fprintln(w, arr[n], arr[o])
					w.Flush()
				}
			}
		}
	}
}

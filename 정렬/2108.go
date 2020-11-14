package main

import (
	"bufio"
	"fmt"
	"math"
	"os"
	"sort"
)

func main() {
	var input int
	r := bufio.NewReader(os.Stdin)
	w := bufio.NewWriter(os.Stdout)

	fmt.Fscan(r, &input)
	var arr = make([]int, input)
	for i := 0; i < input; i++ {
		fmt.Fscan(r, &arr[i])
	}
	avgresult := avg(arr, input)
	fmt.Fprintln(w, avgresult)
	middleresult := middle(arr, input)
	fmt.Fprintln(w, middleresult)
	oftenresult := often(arr, input)
	fmt.Fprintln(w, oftenresult)
	ranresult := ran(arr, input)
	fmt.Fprintln(w, ranresult)
	w.Flush()
}

func avg(arr []int, dev int) int {
	var sum int
	for j := 0; j < dev; j++ {
		sum = sum + arr[j]
	}
	return int(math.Round(float64(sum)/float64(dev)))
}

func middle(arr []int, dev int) int {
	mid := len(arr) / 2
	sort.Ints(arr)
	return arr[mid]
}

func often(arr []int, dev int) int {
	var oftenarr [4001]int
	var result = make([]int, dev)
	var cnt int
	var ans = 2

	for k := 0; k < dev; k++ {
		for l := 0; l < dev; l++ {
			if arr[k] == arr[l] {
				cnt++
				oftenarr[k] = oftenarr[k] + cnt	//arr - 값, oftenarr - 횟수
			}
			cnt = 0
		}
	}
	for n := 0; n < dev; n++ {
		if oftenarr[n] >= ans {
			ans = oftenarr[n]
			result[n] = arr[n]
		}
	}
	sort.Ints(result)
	if result[0] == 0 {
		sort.Ints(arr)
		if dev == 1 {
			return arr[0]
		} else {
			return arr[1]
		}
	} else {
		if result[ans] == 0 {
			return result[ans-1]
		} else {
			return result[ans]
		}
	}
}

func ran(arr []int, dev int) int {
	sort.Ints(arr)

	if len(arr) == 1 {
		return 0
	} else {
		return arr[dev-1] - arr[0]
	}
}
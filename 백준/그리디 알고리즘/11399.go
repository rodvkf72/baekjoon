package main

import(
	"fmt"
	"sort"
)

func main() {
	var people int
	var sumtime int = 0

	fmt.Scan(&people)
	var timeout = make([]int, people)
	for m := 0; m < people; m++ {
		fmt.Scan(&timeout[m])
	}
	sort.Ints(timeout)
	for n := 0; n < people; n++ {
		for o := 0; o <= n; o++ {
			sumtime = timeout[o] + sumtime
		}
	}
	fmt.Println(sumtime)
}
package main

import (
	"bufio"
	"fmt"
	"os"
	"sort"
)

/*
 초기 코드. 배열의 순서만 다를 뿐 출력은 같으나 백준에서 오답처리
 로직 상 문제는 없는 것 같은데..
*/
func main() {
	r := bufio.NewReader(os.Stdin)
	w := bufio.NewWriter(os.Stdout)

	var input = make([]int, 9)
	var sum int

	for i := 0; i < 9; i++ {
		fmt.Fscanln(r, &input[i])
		sum = sum + input[i]
	}
	sort.Ints(input)
	for j := 0; j < 8; j++ {
		for k := j + 1; k < 9; k++ {
			if (sum - (input[j] + input[k])) == 100 {
				input[j] = 0
				input[k] = 0
				for l := 0; l < 9; l++ {
					if input[l] != 0 {
						fmt.Fprintln(w, input[l])
						w.Flush()
					}
				}
			}
		}
	}
}

/*
 정답 코드
 함수의 매개변수를 포인터로 하여 배열 값을 함수 내에서 변경하도록 하여도 되지만
 sort.Ints() 함수에서 에러가 남..
*/
/*
package main

import (
	"bufio"
	"fmt"
	"os"
	"sort"
)

func main() {
	r := bufio.NewReader(os.Stdin)
	w := bufio.NewWriter(os.Stdout)

	var sum int

	input := make([]int, 9)

	for i := 0; i < 9; i++ {
		fmt.Fscanln(r, &input[i])
		sum = sum + input[i]
	}
	result := logic(sum, input)
	sort.Ints(result)
	for j := 2; j < 9; j++ {
		fmt.Fprintln(w, result[j])
	}
	w.Flush()
}

func logic(sum int, arr []int) []int {
	for k := 0; k < 8; k++ {
		for l := k + 1; l < 9; l++ {
			if sum-(arr[k]+arr[l]) == 100 {
				arr[k] = -1
				arr[l] = -1
				return arr
			}
		}
	}
	return arr
}
*/

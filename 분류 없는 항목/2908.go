package main

import (
	"fmt"
	"strconv"
)

func main() {
	var input1 int
	var input2 int
	var sinput1 string
	var sinput2 string

	fmt.Scan(&input1, &input2)
	arrstr1 := make([]string, 3)
	arrstr2 := make([]string, 3)

	for i := 0; i < 3; i++ {
		sinput1 = strconv.Itoa(input1)
		sinput2 = strconv.Itoa(input2)
		arrstr1[i] = sinput1[i : i + 1]
		arrstr2[i] = sinput2[i : i + 1]
	}

	if arrstr1[2] > arrstr2[2] {
		for j := 2; j >= 0; j-- {
			fmt.Print(arrstr1[j])
		}
	} else if arrstr1[2] < arrstr2[2] {
		for j := 2; j >= 0; j-- {
			fmt.Print(arrstr2[j])
		}
	} else if arrstr1[2] == arrstr2[2] {
		if arrstr1[1] > arrstr2[1] {
			for j := 2; j >= 0; j-- {
				fmt.Print(arrstr1[j])
			}
		} else if arrstr1[1] < arrstr2[1] {
			for j := 2; j >= 0; j-- {
				fmt.Print(arrstr2[j])
			}
		} else if arrstr1[1] == arrstr2[1] {
			if arrstr1[0] > arrstr2[0] {
				for j := 2; j >= 0; j-- {
					fmt.Print(arrstr1[j])
				}
			} else if arrstr1[0] < arrstr2[0] {
				for j := 2; j >= 0; j-- {
					fmt.Print(arrstr2[j])
				}
			} else {
				fmt.Print("서로 같은 수 입니다.")
			}
		}
	}
}

package main

import "fmt"

func main() {
	var size int
	var n int = 0
	var check int = 0
	var count int = 0
	var totalsize = 0

	fmt.Scan(&size)
	if size == 2 {
		totalsize = 1
	} else if size == 4 {
		totalsize = 4
	} else if size == 8 {
		totalsize = 4 * 4
	} else if size == 16 {
		totalsize = 4 * 4 * 4
	} else if size == 32 {
		totalsize = 4 * 4 * 4 * 4
	} else if size == 64 {
		totalsize = 4 * 4 * 4 * 4 * 4
	} else if size == 128 {
		totalsize = 4 * 4 * 4 * 4 * 4 * 4
	}

	var array = make([][]int, size)
	for i := 0; i < size; i++ {
		array[i] = make([]int, size)
	}
	for x := 0; x < size; x++ {
		for y := 0; y < size; y++ {
			fmt.Scan(&n)
			array[x][y] = n
		}
	}

	for k := 0; k <= size-2; k = k + 2 {
		for l := 0; l <= size-2; l = l + 2 {
			for i := 0; i < 2; i++ {
				for j := 0; j < 2; j++ {
					if array[k+i][l+j] == 1 {
						check++
					} else {

					}
				}
			}
			if check != 0 {
				count++
			}
			check = 0
		}
	}
	fmt.Println(count)
	fmt.Println(totalsize - count)
}

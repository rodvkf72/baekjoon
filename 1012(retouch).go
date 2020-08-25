package main

import "fmt"

func main() {
	var input1 int
  var input2 int
  var input3 int
  var input4 int
  var m int
  var n int
  var o int

	fmt.Scanln(&input1)
  fmt.Scan(&input2, &input3, &input4)

  //location := make([][]int, 50, 50)
  location := [50][50]int {}
	var x int
  var y int

  for m = 0; m < input4; m++{
    fmt.Scan(&x, &y)
    location[x][y] = 1
  }

  var count int = 0
  for n = 0; n < input2; n++{
    for o = 0; o < input3; o++{
      if (n-1 < 0) || (o-1 < 0) {
        if (location[n][o] == 1) && (location[n+1][o] != 1) || (location[n][o+1] != 1) {
          count++
        }
      } else if (location[n][o] == 1) && (location[n-1][o] != 1) || (location[n+1][o] != 1) || (location[n][o-1] != 1) || (location[n][o+1] != 1) {
          count++
      }
    }
  }
  fmt.Println(count)
}

//range
//       | n,o-1 |
// n-1,o |  n,o  | n+1,o
//       | n,o+1 |

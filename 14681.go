package main

import "fmt"

func main() {
	var inputx, inputy int

	fmt.Scan(&inputx, &inputy)

	if inputx > 0 && inputy > 0 {
		fmt.Println("1")
	} else if inputx < 0 && inputy > 0 {
		fmt.Println("2")
	} else if inputx < 0 && inputy < 0 {
		fmt.Println("3")
	} else {
		fmt.Println("4")
	}
}

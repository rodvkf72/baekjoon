package main

import "fmt"

var numslice = make([]int, 3000000)
var glo int
var start int
var order string

func main() {
	var m int
	var num int

	fmt.Scanln(&start)
	for m = 0; m < start; m++ {
		fmt.Scanln(&order, &num)

		if order == "add" {
			add(num)
		} else if order == "remove" {
			remove(num)
		} else if order == "check" {
			check(num)
		} else if order == "toggle" {
			toggle(num)
		} else if order == "all" {
			all()
		} else if order == "empty" {
			empty()
		} else {
			fmt.Println("test")
		}
	}
}

func add(a int) {
	var col int = 0
	for glo = 0; glo < start; glo++{
		if numslice[glo] == a{
			col++
		}
	} else {

	}
	if col == 0{
		numslice[start+1] = a
	}
	glo = 0
}
func remove(a int) {
	var col int = 0
	for glo = 0; glo < start; glo++{
		if numslice[glo] == a{
			numslice[glo] = 0
		}
	}
}
func check(a int) {

}
func toggle(a int) {

}
func all() {

}
func empty() {

}

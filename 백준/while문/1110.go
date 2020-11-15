package main

import (
	"fmt"
)

/*
var input int = 0
var count int = 0
var start string
var sum int = 0
var sslice1 string
var sslice2 string
var islice1 int = 0
var islice2 int = 0
var sislice int = 0
var sum2 int = 0
var err1 error
var err2 error
var err3 error
var new int
*/
var input int
var result int
var a int
var b int
var c int
var d int
var count int

func main() {
	fmt.Scanln(&input)
	test(input)
}

func test(testa int) {
	for {
		a = testa / 10
		b = testa % 10
		c = (a + b) % 10
		d = (b * 10) + c
		testa = d
		count++
		if d == input {
			goto END
		}
	}
END:
	fmt.Println(count)
	/*
		if (a < 0) || (a > 99) {
			os.Exit(1)
		} else {
			if a < 10 {
				islice1 = 0
				islice2 = a
			} else {
				start = strconv.Itoa(a)
				sslice1 = start[:1]
				sslice2 = start[1:]
				islice1, err1 = strconv.Atoi(sslice1)
				islice2, err2 = strconv.Atoi(sslice2)
			}
			sum = islice1 + islice2

			if sum < 10 {
				new = (islice2 * 10) + sum
			} else {
				new = islice2 * 10
				start = strconv.Itoa(sum)
				sslice1 = start[:1]
				sslice2 = start[1:]
				islice1, err1 = strconv.Atoi(sslice1)
				islice2, err2 = strconv.Atoi(sslice2)
				new = new + islice2
			}

			count++
			if input != new {
				fmt.Println(new)
			} else {
				fmt.Println(count)
			}
		}*/
	/*
		if (a < 0) || (a > 99) {
			os.Exit(1)
		} else {
			if a < 10 {
				a = a * 10
			} else {
				a = a
			}
			start = strconv.Itoa(a)
			sslice1 = start[:1]
			sslice2 = start[1:]
			islice1, err1 = strconv.Atoi(sslice1)
			islice2, err2 = strconv.Atoi(sslice2)
			sum = islice1 + islice2
			if sum >= 10 {
				var startslice string
				var stringslice string
				var intslice int
				startslice = strconv.Itoa(sum)
				stringslice = startslice[1:]
				intslice, err3 = strconv.Atoi(stringslice)
				sum = intslice
			}
			sislice = islice2 * 10
			sum2 = sislice + sum
			count++
			if input != sum2 {
				fmt.Println(sum2)
				//test(sum2)
			} else {
				fmt.Println(count)
			}
		}
	*/
}

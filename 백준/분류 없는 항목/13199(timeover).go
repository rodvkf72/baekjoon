package main

import "fmt"

func main() {
	var input int
	var price int
	var have int
	var need int
	var coup int
	var priceresult int
	var coupresult int
	var result int

	fmt.Scanln(&input)

	for m := 0; m < input; m++ {
		fmt.Scan(&price, &have, &need, &coup)

		priceresult = have / price
		coupresult = need / coup
		result = priceresult / coupresult
		fmt.Println(result / need)
	}
}

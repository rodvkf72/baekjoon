package main

import "fmt"

func main()  {
	var input1, input2, input3 int
	fmt.Scanln(&input1, &input2, &input3)

	fmt.Println((input1+input2) % input3)
	fmt.Println(((input1+input3) + (input2+input3)) % input3)
	fmt.Println((input1*input2) % input3)
	fmt.Println(((input1%input3) * (input2%input3)) % input3)
}

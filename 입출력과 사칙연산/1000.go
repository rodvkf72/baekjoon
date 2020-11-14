package main

import "fmt"

func main() {
	var a, b int	//입력받을 두 변수를 정의하고
	fmt.Scanf("%d %d", &a, &b)	//두 변수에 대입한다.
	fmt.Printf("%d\n", a+b)	//두 변수의 합을 출력
}

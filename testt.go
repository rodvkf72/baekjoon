package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	var f *os.File
	f = os.Stdin
	defer f.Close()
	/*
		in := bufio.NewReader(f)
		line, err := in.ReadString('\n')
		if err != nil {

		}
		fmt.Println(line)*/

	scanner := bufio.NewScanner(f)
	for scanner.Scan() {
		fmt.Println(">", scanner.Text())
	}
}

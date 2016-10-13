package main

import (
	"fmt"
	"io/ioutil"
	"math/rand"
	"net/http"
	"sync"
	"time"
)

func main() {
	_rand := rand.New(rand.NewSource(time.Now().UnixNano()))
	var wg sync.WaitGroup

	for i := 0; i < 10; i++ {
		go func() {

			n := int(_rand.Float64() * 10000)
			res, err := http.Get(fmt.Sprintf("http://127.0.0.1:8080/%d", n))
			if err != nil {
				return
			}
			buf, err := ioutil.ReadAll(res.Body)
			if err != nil {
				return
			}
			res.Body.Close()

			// if string(buf) != fmt.Sprintf("hello /%d", n) {
			fmt.Println("no", string(buf), n)
			// } else {
			// 	fmt.Println("")
			// }
			wg.Done()
		}()
		wg.Add(1)
	}

	wg.Wait()
}

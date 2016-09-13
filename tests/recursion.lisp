(set fib (lambda (n)
    (if (< n 2) 
    	1 ; true 
  		(+ (fib (- n 1)) (fib (- n 2))) ; false
  	)
))

(set r (list))
(for i = 1 to 11 do	(+= r (fib i)))
(assert (deep-compare-list (1 2 3 5 8 13 21 34 55 89) r) "Fibonacci 10: " r)

; ========================================================

(defun factorial (n)
  (if (<= n 1)
    1
    (* n (factorial (- n 1)))))

(set r (factorial 10))
(assert (== 3628800 r) "Factorial 10: " 3628800)

; ========================================================

(set #test-string "")
(for i = 0 to 20 do [#test-string += [(sub (str (random 0)) 3 1) + ","]])

(set #string-list (split #test-string ","))

(assert [(join-list #string-list ",") == #test-string] "Join list: " #test-string)

; ========================================================

(defun m91 (n) "McCarthy 91 function" (
	(if [n > 100]
		[n - 10]
		(m91 (m91 [n + 11]))
	)
))

(set #m91-test (list))
(set #m91 (map [() => 91] (range 0 100))) ; map is defined in lambda.lisp
(for i = 0 to 100 do [#m91-test += (m91 i)])

(assert (deep-compare-list #m91 #m91-test) "McCarthy 91 function")

; ========================================================

(defun GCD (a b) (
	(if [b == 0]
		a
		(GCD b [a % b])
	)
))

(set #gcd 4664286428)
(set #gcd-test (GCD 16035816739464 79292869276))
(assert [#gcd-test == #gcd] "Greatest common divisor")
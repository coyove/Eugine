(var #test-closure 2)
[test-closure = (lambda (n) (->
	(var #test-closure 1)
	(lambda (i) (* i n #test-closure))
))]

(assert [((test-closure 4) 3) == 12] "Test closure: " 12)

(set dummy 0)
([(i) => (-> (set dummy i) (set dummy-2 i))] 1)
(assert [[dummy == 1] and [dummy-2 == null]] "Test closure 2")

(set outer 0)
([() => (set outer 1)] ())

(set outer-2 0)
([() => (var outer-2 1)] ())

(set outer-3 0)
([() => [[~parent : "outer-3"] = 1]] ())

(assert (== true [outer == 1] [outer-2 == 0] [outer-3 == 1]) "Test closure 3")

;================================================

(set #test-list (1 2 3 4 5 -0.5))
(map [(i) => (++ i)] #test-list)

(assert (deep-compare-list #test-list (2 3 4 5 6 0.5)) "Map lambda")

;================================================

(set a (
	(lambda (a b c) (
		(+ (str a) "-" (str b) "-" (str c))
	)) 
	(explode (1 2 3))
))

(assert [a == "1-2-3"] "Explode")

;================================================

(def left-padder (n c)
	"padder can either pad a string or a list"
	(lambda (subject) (->
		(cond #t
			(
				[(type subject) == "String"] 
				(loop (range 0 n) [() => (set subject [c + subject])])
			)

			(
				[(type subject) == "List"] 
				(loop (range 0 n) [() => [subject = (+ (list c) (explode subject))]])
				; note this implementation's performance is very poor
			)
		)
		subject
	))
)

(assert [((left-padder 5 "a") "bcd") == "aaaaabcd"] "Padding string")
(assert [((left-padder 5 "a") ("b" "c" "d")) deep-compare-list 
	("a" "a" "a" "a" "a" "b" "c" "d")] "Padding list")
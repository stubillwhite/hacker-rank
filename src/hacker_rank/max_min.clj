(ns hacker-rank.max-min
  (:require [clojure.string :refer [split]]))

;; Problem Statement
;; 
;; Given a list of N integers, your task is to select K integers from the list such that its unfairness is minimized.
;; 
;; if (x1,x2,x3,…,xk) are K numbers selected from the list N, the unfairness is defined as
;; 
;; max(x1,x2,…,xk)−min(x1,x2,…,xk)
;;
;; where max denotes the largest integer among the elements of K, and min denotes the smallest integer among the
;; elements of K.
;; 
;; Input Format 
;; The first line contains an integer N. 
;; The second line contains an integer K. 
;; N lines follow. Each line contains an integer that belongs to the list N.
;; 
;; Note: Integers in the list N may not be unique.
;; 
;; Output Format
;;
;; An integer that denotes the minimum possible value of unfairness.
;; 
;; Constraints 
;;
;; 2≤N≤105 
;; 2≤K≤N 
;; 0≤integer in N ≤109
;;
;; Sample Input #00
;; 
;; 7
;; 3
;; 10
;; 100
;; 300
;; 200
;; 1000
;; 20
;; 30
;;
;; Sample Output #00
;;
;; 20
;;
;; Explanation #00 
;;
;; Here K=3; selecting the 3 integers such that K = 10,20,30, unfairness equals
;; 
;; max(10,20,30) - min(10,20,30) = 30 - 10 = 20
;;
;; Sample Input #01
;; 
;; 10
;; 4
;; 1
;; 2
;; 3
;; 4
;; 10
;; 20
;; 30
;; 40
;; 100
;; 200
;;
;; Sample Output #01
;; 
;; 3
;;
;; Explanation #01 
;; Here K=4; selecting the 4 integers 1,2,3,4, unfairness equals
;;
;; max(1,2,3,4) - min(1,2,3,4) = 4 - 1 = 3
;;
;; Sample Input #02
;; 
;; 6
;; 3
;; 10
;; 20
;; 30
;; 100
;; 101
;; 102
;;
;; Sample Output #02
;; 
;; 2
;;
;; Explanation #02
;; 
;; Here K=3; the 3 integers so that the difference between the maximum and the minimum is the smallest are 100,101,102,
;; which means unfairness equals
;; 
;; max(100, 101, 102) - min(100, 101, 102) = 102 - 100 = 2

(defn- from-stdin
  ([]
    (line-seq (clojure.java.io/reader *in*))))

(defn to-ints
  ([s]
    (if (empty? s)
      []
      (map (fn [x] (Long/valueOf x)) s))))

(defn- parse-input
  ([args]
    (to-ints args)))

(defn max-min
  ([n k ints]
    (let [ unfairness (fn [xs] (- (reduce max xs) (reduce min xs))) ]
      (reduce min
        (map unfairness (partition k 1 (sort ints)))))))

(defn execute
  ([]
    (let [[n k & ints] (parse-input (from-stdin))]
      (println (max-min n k ints)))))

(comment execute)

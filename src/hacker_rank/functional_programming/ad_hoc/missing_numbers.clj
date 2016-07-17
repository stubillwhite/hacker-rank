(ns hacker-rank.functional-programming.ad-hoc.missing-numbers
  (:require [clojure.string :as string]
            [hacker-rank.io :refer [from-stdin]]))

;; Sometimes you need to compare lists of number, but sorting each one normally will take too much time. Instead you can
;; use alternative methods to find the differences between each list.
;; 
;; Challenge 
;; Numeros The Artist was arranging two identical lists A and B into specific orders. The arrangements of the two arrays
;; were random, Numeros was very proud of his arrangements. Unfortunately, some numbers got left out of List A. Can you
;; find the missing numbers from A without messing up his order?
;; 
;; Details 
;; There are many duplicates in the lists, but you need to find the extra numbers, i.e. B - A. Print the numbers in
;; numerical order. Print each missing number once, even if it is missing multiple times. The numbers are all within a
;; range of 100 from each other.
;; 
;; Input Format 
;; There will be four lines of input:
;; 
;; n - the size of the first list 
;; This is followed by n numbers that makes up the first list. 
;; m - the size of the second list 
;; This is followed by m numbers that makes up the second list.
;; 
;; Output Format 
;; Output all the numbers (in ascending order) that are in B but not in A.
;; 
;; Constraints 
;; 1<= n,m <= 200000 
;; -10000 <= x <= 10000 , x ∈ B 
;; Xmax - Xmin < 101

(defn- parse-input [[n list-a m list-b]]
  (let [parse-long  (fn [x] (Long/parseLong x))
        to-num-list (fn [x] (map parse-long (string/split x #" ")))]
    [(parse-long n)
     (to-num-list list-a)
     (parse-long m)
     (to-num-list list-b)]))

(defn- number-frequencies [s]
  (reduce (fn [acc x] (update-in acc [x] (fnil inc 0))) {} s))

(defn missing-numbers [list-a list-b]
  (let [freq-a (number-frequencies list-a)
        freq-b (number-frequencies list-b)]
    (for [[k v] (merge-with - freq-b freq-a) :when (> v 0)] k)))

(defn print-missing-numbers [n list-a m list-b]
  (apply println (sort (missing-numbers list-a list-b))))

(defn execute []
  (doall (apply print-missing-numbers (parse-input (from-stdin)))))


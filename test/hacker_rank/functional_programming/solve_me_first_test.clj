(ns hacker-rank.functional-programming.solve-me-first-test
  (:require [clojure.test :refer :all]
            [hacker-rank.functional-programming.solve-me-first :refer :all]
            [hacker-rank.io :refer [as-output apply-to-input]]))

(deftest execute-given-sample-input-then-sample-output
  (is (= (as-output 5) (apply-to-input execute "2" "3"))))



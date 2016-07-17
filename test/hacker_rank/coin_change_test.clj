(ns hacker-rank.coin-change-test
  (:require [clojure.test :refer :all]
            [hacker-rank.coin-change :refer :all]
            [hacker-rank.io :refer [as-output apply-to-input]]))

(deftest execute-given-zero-coins-then-one-way-to-give-change
  (is (= (as-output 1) (apply-to-input execute "0 2" "1 2"))))

(deftest execute-given-zero-types-then-zero-ways-to-give-change
  (is (= (as-output 0) (apply-to-input execute "1 0" ""))))

(deftest execute-given-sample-input-then-sample-output
  (is (= (as-output 4) (apply-to-input execute "4 3"  "1 2 3")))
  (is (= (as-output 5) (apply-to-input execute "10 4" "2 5 3 6"))))


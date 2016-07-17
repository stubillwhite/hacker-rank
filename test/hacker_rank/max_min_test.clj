(ns hacker-rank.max-min-test
  (:require [clojure.test :refer :all]
            [hacker-rank
             [io :refer [apply-to-input apply-to-input-from-file as-output]]
             [max-min :refer :all]
             [test-utils :refer [execution-time seconds]]]))

(deftest execute-given-sample-input-then-expected-output
  (is (= (as-output 20)) (apply-to-input execute 7 3 10 100 300 200 1000 20 30))
  (is (= (as-output 3))  (apply-to-input execute 10 4 1 2 3 4 10 20 30 40 100 200))
  (is (= (as-output 2))  (apply-to-input execute 6 3 10 20 30 100 101 102)))

(deftest execute-given-expensive-input-then-expected-ouput
  (is (= (as-output 9868)) (apply-to-input-from-file execute "test/hacker_rank/max-min-test-case-14.txt")))

(deftest execute-given-expensive-input-then-completes-within-allowed-duration
  (is (> (seconds 8) (execution-time (apply-to-input-from-file execute "test/hacker_rank/max-min-test-case-14.txt")))))



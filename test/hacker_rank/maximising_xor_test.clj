(ns hacker-rank.maximising-xor-test
  (:require [clojure.test :refer :all]
            [hacker-rank
             [io :refer [apply-to-input apply-to-input-from-file as-output]]
             [maximising-xor :refer :all]
             [test-utils :refer [execution-time seconds]]]))

(deftest execute-given-sample-input-then-expected-output
  (is (= (as-output 7) (apply-to-input execute 10 15))))

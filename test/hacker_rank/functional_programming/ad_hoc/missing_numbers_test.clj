(ns hacker-rank.functional-programming.ad-hoc.missing-numbers-test
  (:require [clojure.test :refer :all]
            [hacker-rank.functional-programming.ad-hoc.missing-numbers :refer :all]
            [hacker-rank
             [io :refer [apply-to-input apply-to-input-from-file as-output]]
             [test-utils :refer [execution-time seconds]]]))

(deftest execute-given-example-input-then-expected-output
  (is (= (as-output "204 205 206")
         (apply-to-input execute
                         "10"
                         "203 204 205 206 207 208 203 204 205 206"
                         "13"
                         "203 204 204 205 206 207 205 208 203 206 205 206 204"))))


(ns hacker-rank.service-lane-test
  (:require [clojure.test :refer :all]
            [hacker-rank
             [io :refer [apply-to-input apply-to-input-from-file as-output]]
             [service-lane :refer :all]
             [test-utils :refer [execution-time seconds]]]))

(deftest execute-give-example-input-then-expected-output
  (is (= (as-output "1" "2" "3" "2" "1")
         (apply-to-input execute
                         "8 5"
                         "2 3 1 2 3 2 3 3"
                         "0 3"
                         "4 6"
                         "6 7"
                         "3 5"
                         "0 7"))))

(ns hacker-rank.utopian-tree-test
  (:require [clojure.test :refer :all]
            [hacker-rank
             [io :refer [apply-to-input apply-to-input-from-file as-output]]
             [utopian-tree :refer :all]
             [test-utils :refer [execution-time seconds]]]))

(deftest execute-given-example-input-then-expected-output
  (is (= (as-output 1 2 7) (apply-to-input execute 3 0 1 4))))

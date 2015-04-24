(ns hacker-rank.max-min-test
  (:require
    [clojure.string :refer [join split]]
    [clojure.math.numeric-tower :refer [expt]])
  (:use
    [expectations]
    [hacker-rank.max-min]))

(def cr (System/lineSeparator))

(defn- simulate-input
  ([args]
    (apply str (interleave args (repeat (System/lineSeparator))))))

(defn- execute-with-input
  ([& args]
    (with-out-str
      (with-in-str (simulate-input args)
        (execute)))))

(defn- execute-with-input-from-file
  ([fnam]
    (apply execute-with-input (split (slurp fnam) #"\n"))))

(defn- output
  ([& args]
    (str (join cr args) cr)))

(expect (output 20) (execute-with-input 7 3 10 100 300 200 1000 20 30))

(expect (output 3) (execute-with-input 10 4 1 2 3 4 10 20 30 40 100 200))

(expect (output 2) (execute-with-input 6 3 10 20 30 100 101 102))

;; Test case that the naive implementation exceeds the allowed 8 second time to solve

(expect (output 9868) (execute-with-input-from-file "test/hacker_rank/max-min-test-case-14.txt"))



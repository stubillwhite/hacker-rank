(ns hacker-rank.min-max-test
  (:require
    [clojure.string :refer [join]])
  (:use
    [expectations]
    [hacker-rank.min-max]))

(defn- simulate-input
  ([args]
    (apply str (interleave args (repeat (System/lineSeparator))))))

(defn- execute-with-input
  ([& args]
    (with-out-str
      (with-in-str (simulate-input args)
        (execute)))))

(defn- output
  ([& args]
    (let [cr (System/lineSeparator)]
      (str (join cr args) cr))))

(expect (output 20) (execute-with-input [7 3 10 100 300 200 1000 20 30]))

(execute-with-input [7 3 10 100 300 200 1000 20 30])
(simulate-input [7 3 10 100 300 200 1000 20] 30)

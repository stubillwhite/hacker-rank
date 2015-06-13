(ns hacker-rank.functional-programming.solve-me-first-test
  (:require
    [clojure.string :refer [join]])
  (:use
    [expectations]
    [hacker-rank.functional-programming.solve-me-first]))

(def cr (System/lineSeparator))

(defn- simulate-input
  ([args]
    (apply str (join cr args) cr)))

(defn- execute-with-input
  ([& args]
    (with-out-str
      (with-in-str (simulate-input args)
        (execute)))))

(defn- output
  ([& args]
    (str (join cr args) cr)))

(expect (output 5) (execute-with-input "2" "3"))


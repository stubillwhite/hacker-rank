(ns hacker-rank.coin-change-test
  (:require
    [clojure.string :refer [join]])
  (:use
    [expectations]
    [hacker-rank.coin-change]))

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

;; execute given zero coins then one way to give change
(expect (output 1) (execute-with-input "0 2" "1 2"))

;; execute given zero types then zero ways to give change
(expect (output 0) (execute-with-input "1 0" ""))

;; Example test cases
(expect (output 4) (execute-with-input "4 3"  "1 2 3"))
(expect (output 5) (execute-with-input "10 4" "2 5 3 6"))


(ns hacker-rank.coin-change-test
  (:require
    [clojure.string :refer [join]])
  (:use
    [expectations]
    [hacker-rank.coin-change]))

(defn- simulate-input
  ([args]
    (apply str (replace {:enter (System/lineSeparator)} args))))

(defn- execute-with-input
  ([& args]
    (with-out-str
      (with-in-str (simulate-input args)
        (execute)))))

(defn- output
  ([& args]
    (let [cr (System/lineSeparator)]
      (str (join cr args) cr))))

;; execute given zero coins then one way to give change
(expect (output 1) (execute-with-input "0 2" :enter "1 2" :enter))

;; execute given zero types then zero ways to give change
(expect (output 0) (execute-with-input "1 0" :enter "" :enter))

;; Example test cases
(expect (output 4) (execute-with-input "4 3"  :enter "1 2 3"   :enter))
(expect (output 5) (execute-with-input "10 4" :enter "2 5 3 6" :enter))


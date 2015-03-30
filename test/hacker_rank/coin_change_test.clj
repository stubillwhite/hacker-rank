(ns hacker-rank.coin-change-test
  (:require
    [clojure.string :refer [join]])
  (:use
    ;;[clojure.test]
    ;;[midje.sweet]
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

(comment fact
  "execute given zero coins then one way to give change"
  (execute-with-input "0 2" :enter "1 2" :enter) => (output 1))

(comment fact
  "execute given zero types then zero ways to give change"
  (execute-with-input "1 0" :enter "" :enter) => (output 0))

(comment fact
  "execute given sample input then expected output"
  (execute-with-input "4 3"  :enter "1 2 3"   :enter) => (output 4)
  (execute-with-input "10 4" :enter "2 5 3 6" :enter) => (output 5))

(expect 2 (+ 1 1))
(expect 5 (+ 2 2))

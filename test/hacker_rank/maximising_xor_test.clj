(ns hacker-rank.maximising-xor-test
  (:require
    [clojure.string :refer [join]])
  (:use
    [expectations]
    [hacker-rank.maximising-xor]))

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

;; Example test cases
(expect (output 7) (execute-with-input 10 :enter 15 :enter))

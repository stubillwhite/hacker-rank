(ns hacker-rank.maximising-xor-test
  (:require
    [clojure.string :refer [join]])
  (:use
    [clojure.test]
    [midje.sweet]
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

(fact
  "execute given sample input then expected output."
  (execute-with-input 10 :enter 15 :enter) => (output 7))

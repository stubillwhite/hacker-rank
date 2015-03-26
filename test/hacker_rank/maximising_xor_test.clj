(ns hacker-rank.maximising-xor-test
  (:require
    [clojure.string :refer [join]])
  (:use
    [clojure.test]
    [midje.sweet]
    [hacker-rank.maximising-xor]))

(defn- simulate-input
  ([args]
    (str (join "\n" args) "\n")))

(defn- execute-with-input
  ([& args]
    (with-out-str
      (with-in-str (simulate-input args)
        (execute)))))

(defn- output
  ([& args]
    (str (join "\n" args) "\n")))

(fact
  "execute given sample input then expected output."
  (execute-with-input 10 15) => (output 7))

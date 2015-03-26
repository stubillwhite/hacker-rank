(ns hacker-rank.utopian-tree-test
  (:require
    [clojure.string :refer [join]])
  (:use
    [clojure.test]
    [midje.sweet]
    [hacker-rank.utopian-tree]))

(defn- simulate-input
  ([args]
    (str (join "\n" args) "\nexit\n")))

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
  (execute-with-input 3 0 1 4) => (output 1 2 7))

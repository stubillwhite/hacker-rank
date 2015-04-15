(ns hacker-rank.service-lane-test
  (:require
    [clojure.string :refer [join]])
  (:use
    [expectations]
    [hacker-rank.service-lane]))

(def cr (System/lineSeparator))

(defn- simulate-input
  ([args]
    (apply str args)))

(defn- execute-with-input
  ([& args]
    (with-out-str
      (with-in-str (simulate-input args)
        (execute)))))

(defn- output
  ([& args]
    (str (join cr args) cr)))

(expect
  (output "1" "2" "3" "2" "1")
  (execute-with-input
    "8 5" cr
    "2 3 1 2 3 2 3 3" cr
    "0 3" cr
    "4 6" cr
    "6 7" cr
    "3 5" cr
    "0 7" cr))

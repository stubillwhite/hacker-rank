(ns hacker-rank.io
  (:require [hacker-rank.utils :refer [def-]]
            [clojure.string :as string]))

(defn from-stdin []
  "Returns a seq of lines read from STDIN."
  (line-seq (clojure.java.io/reader *in*)))

(def- line-separator (System/lineSeparator))

(defn- as-input [args]
  (apply str (string/join line-separator args) line-separator))

(defn apply-to-input [f & args]
  "Apply f to args as simulated input."
  (with-out-str
    (with-in-str (as-input args)
      (f))))

(defn apply-to-input-from-file [f fnam]
  "Apply f to file fnam as simulated input."
  (apply apply-to-input f (string/split (slurp fnam) #"\n")))

(defn as-output [& args]
  "Returns args formatted as output."
  (str (string/join line-separator args) line-separator))


(ns hacker-rank.functional-programming.solve-me-first)

(defn- from-stdin
  ([]
    (line-seq (clojure.java.io/reader *in*))))

(defn- add-integers
  ([a b]
    (println (+ a b))))

(defn- parse-input
  ([args]
    (map (fn [x] (Long/valueOf x)) args)))

(defn execute
  ([]
    (doall (apply add-integers (parse-input (from-stdin))))))

;;(execute)

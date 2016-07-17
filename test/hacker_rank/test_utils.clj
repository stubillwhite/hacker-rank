(ns hacker-rank.test-utils)

(defmacro execution-time [expr]
  "Evaluates expr and returns the time it took in ms."
  `(let [start# (. System (nanoTime))
         ret#   ~expr]
     (/ (double (- (. System (nanoTime)) start#)) 1000000.0)))

(defn seconds [t]
  "Returns t seconds as ms."
  (* t 1000))

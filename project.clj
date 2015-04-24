(defproject hacker-rank "0.1.0-SNAPSHOT"

  :description "Solutions to HackerRank exercises."

  :url "TODO"

  :license { :name "Eclipse Public License"
             :url "http://www.eclipse.org/legal/epl-v10.html" }

  :repl-options { :port 4555 }

  :plugins [ [cider/cider-nrepl "0.8.2"]
             [lein-expectations "0.0.7"]
             [lein-autoexpect "1.4.0"] ]
  
  :dependencies [ [org.clojure/clojure "1.6.0"]
                  [org.clojure/math.numeric-tower "0.0.4"]
                  [com.taoensso/timbre "3.4.0"]
                  [org.clojure/tools.trace "0.7.8"] ]
  
  :profiles { :dev { :dependencies [ [org.clojure/tools.namespace "0.2.10"]
                                     [expectations "2.1.0"] ]
                     :source-paths ["dev"] } })

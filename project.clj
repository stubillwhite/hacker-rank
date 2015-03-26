(defproject hacker-rank "0.1.0-SNAPSHOT"

  :description "Solutions to HackerRank exercises."

  :url "TODO"

  :license { :name "Eclipse Public License"
             :url "http://www.eclipse.org/legal/epl-v10.html" }

  :repl-options { :port 4555 }

  :plugins []
  
  :dependencies [
                  ;; Core
                  [org.clojure/clojure "1.6.0"]
                  
                  ;; Logging
                  [com.taoensso/timbre "3.4.0"]

                  ;; Debugging
                  [org.clojure/tools.trace "0.7.8"]
                 
                  ;; Testing
                  [midje "1.6.3"] ]
  
  :profiles { :dev { :dependencies [[org.clojure/tools.namespace "0.2.10"]]
                     :source-paths ["dev"] } })

(defproject hacker-rank "0.1.0-SNAPSHOT"

  :description "Clojure solutions to HackerRank problems."

  :url "https://github.com/stubillwhite/project-euler"

  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :repl-options {:port 4555 }

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/math.numeric-tower "0.0.4"]
                 [org.clojure/tools.trace "0.7.9"]
                 [com.taoensso/timbre "4.6.0"]
                 [com.taoensso/tufte "1.0.0-RC2"]]
  
  :profiles {:dev {:dependencies [[org.clojure/tools.namespace "0.2.10"]]
                   :source-paths ["dev"]}})

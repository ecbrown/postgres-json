(defproject postgre-types "0.0.1"
  :description "Integration with PostgresSQL multiple types"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/java.jdbc "0.3.3"]
                 [postgresql/postgresql "8.4-702.jdbc4"]]
  :profiles {:dev {:dependencies [[cheshire "5.3.1"]]}})
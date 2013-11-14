(defproject sample-app "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/data.json "0.2.3"]]
  :plugins [[lein-vertx "0.2.0-SNAPSHOT"]]
  :profiles {:provided
             {:dependencies [[io.vertx/clojure-api "0.2.0"]
                             [org.clojure/data.json "0.2.3"]]}}
  :vertx {:main sample-app.core/init})

(defproject pwa "0.1.0-SNAPSHOT"

  :description "FIXME: write description"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.10.0"]
                 [rum "0.11.3"]]

  :min-lein-version "2.0.0"

  :source-paths ["src/dev"
                 "src/main"]
  :test-paths ["src/test"]
  :resource-paths ["public"]

  :target-path "target/%s/"

  :profiles {:dev {:dependencies [[thheller/shadow-cljs "2.7.25"]
                                  [metosin/reitit-core "0.2.13"]
                                  [org.clojure/clojurescript "1.10.516"]]}})

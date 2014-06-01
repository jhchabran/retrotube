(defproject retrotube "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [compojure "1.1.6"]
                 [ring/ring-core "1.2.0"]
                 [http-kit "2.1.13"]
                 [com.taoensso/timbre "3.2.1"]
                 [ring/ring-json "0.2.0"]]
  :plugins [[lein-ring "0.8.10"]
            [lein-cooper "0.0.1"]]
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-devel "1.1.8"]
                        [ring-mock "0.1.5"]]}}
  :main retrotube.core)

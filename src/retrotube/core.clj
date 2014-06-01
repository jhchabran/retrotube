(ns retrotube.core
  (:require
   [retrotube.handler :refer [app]]
   [retrotube.handler :refer [init]]
   [ring.middleware.reload :as reload]
   [org.httpkit.server :as http-kit]
   [taoensso.timbre :as timbre])
  (:gen-class))

(defn -main [& args]
  (init)
  (http-kit/run-server
   (reload/wrap-reload #'app)
   {:port 3000}))

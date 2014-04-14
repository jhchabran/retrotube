(ns retrotube.core
  (:require
   [retrotube.handler :refer [app]]
   [ring.middleware.reload :as reload]
   [org.httpkit.server :as http-kit])
  (:gen-class))

(defn -main [& args]
  (http-kit/run-server
   (reload/wrap-reload #'app)
   {:port 3000}))

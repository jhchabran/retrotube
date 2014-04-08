(ns retrotube.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

(defroutes app-routes
  (GET "/" [] "Hello World from Retrotube")
 (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))

(ns retrotube.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [taoensso.timbre :as timbre]))

; Aliases in current namespace for timbre
(timbre/refer-timbre)

(defroutes app-routes
  (GET "/" [] "Hello World from Retrotube")
 (route/resources "/")
  (route/not-found "Not Found"))

(defn init []
  (timbre/set-config!
    [:appenders :spit :enabled?] true)
  (timbre/set-config! [:shared-appender-config :spit-filename] "/development.log")
  (info "Init"))

(def app
  (handler/site app-routes))

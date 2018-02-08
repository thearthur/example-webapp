(ns user
  (:require 
            [mount.core :as mount]
            [example-webapp.core :refer [start-app]]))

(defn start []
  (mount/start-without #'example-webapp.core/repl-server))

(defn stop []
  (mount/stop-except #'example-webapp.core/repl-server))

(defn restart []
  (stop)
  (start))



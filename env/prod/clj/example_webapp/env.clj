(ns example-webapp.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[example-webapp started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[example-webapp has shut down successfully]=-"))
   :middleware identity})

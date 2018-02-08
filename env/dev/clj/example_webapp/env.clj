(ns example-webapp.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [example-webapp.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[example-webapp started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[example-webapp has shut down successfully]=-"))
   :middleware wrap-dev})

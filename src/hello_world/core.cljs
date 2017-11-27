(ns hello-world.core
    (
        :require [cljs.nodejs :as nodejs]
    )
)

(nodejs/enable-console-print!)

(defn- main [& args]
    (println "Hello New World!")
)

(set! *main-cli-fn* main)

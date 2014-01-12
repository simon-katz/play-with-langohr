(ns user
  "Namespace to support hacking at the REPL.")

;;;; ___________________________________________________________________________
;;;; Dev utils -- can be easily grabbed from any namespace.

(defn setup-dev-stuff []
  (do ; Require dev tools
    (apply require [;; ---- I know these (ish)
                    '[clojure.tools.namespace.repl :refer :all]
                    '[clojure.tools.namespace.move :refer :all]
                    '[clojure.repl :refer :all]
                    '[clojure.pprint :refer :all]
                    '[spyscope.core]
                    '[cemerick.pomegranate :refer [add-dependencies]]
                    '[com.nomistech.clojure-dev-utils :refer :all]
                    ;; ---- To learn
                    '[clojure.java.io :as cjio]
                    '[clojure.string :as str]
                    '[clojure.java.classpath :as cjc]
                    '[criterium.core :as crit]]))
  (do ; Control printing
    (alter-var-root #'*print-level* (constantly 30))
    (alter-var-root #'*print-length* (constantly 1000))))

(setup-dev-stuff)

;;;; ___________________________________________________________________________
;;;; Clojure workflow.
;;;; See:
;;;; - http://nomistech.blogspot.co.uk/2013/06/stuart-sierras-clojure-development_18.html
;;;; - http://thinkrelevance.com/blog/2013/06/04/clojure-workflow-reloaded

;; (defonce the-system
;;   ;; "A container for the current instance of the application.
;;   ;; Only used for interactive development."
;;   ;; 
;;   ;; Don't want to lose this value if this file is recompiled (when
;;   ;; changes are made to the useful additional utilities for the REPL
;;   ;; at the end of the file), so use `defonce`.
;;   ;; But note that this /is/ blatted when a `reset` is done.
;;   nil)

;; (defn init
;;   "Creates a system and makes it the current development system."
;;   []
;;   (alter-var-root #'the-system
;;                   (constantly (system/init))))

;; (defn start
;;   "Starts the current development system."
;;   []
;;   (alter-var-root #'the-system system/start))

;; (defn stop
;;   "Shuts down and destroys the current development system."
;;   []
;;   (alter-var-root #'the-system
;;                   (fn [s] (when s (system/stop s)))))

;; (defn go
;;   "Creates a system, makes it the current development system and starts it."
;;   []
;;   (init)
;;   (start))

;; (defn reset "Stop, refresh and go."
;;   []
;;   (stop)
;;   (refresh :after 'user/go))

;;;; ___________________________________________________________________________
;;;; App-specific additional utilities for the REPL


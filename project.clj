(defproject play-with-langohr "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [com.novemberain/langohr "1.7.0"]]
  :profiles
  {:dev {:source-paths ["dev"]
         :dependencies [[org.clojure/tools.namespace "0.2.4"]
                        [com.cemerick/pomegranate "0.2.0"
                         :exclusions [org.apache.httpcomponents/httpclient
                                      org.apache.httpcomponents/httpcore]]
                        ;; [slamhound "1.3.3"]
                        [spyscope "0.1.3"]
                        [criterium "0.4.2"]
                        [org.clojure/java.classpath "0.2.0"]
                        [com.nomistech/emacs-hacks-in-clojure "0.1.0-SNAPSHOT"
                         :exclusions [midje]]
                        [com.nomistech/clojure-dev-utils "0.1.0-SNAPSHOT"
                         :exclusions [midje]]
                        [midje "1.5.1"
                         :exclusions [org.apache.httpcomponents/httpclient
                                      org.apache.httpcomponents/httpcore]]
                        [clj-webdriver "0.6.0"]]
         :plugins [;; TODO: Remind yourself of these...
                   [lein-difftest "2.0.0"]
                   [lein-kibit "0.0.8"]
                   [jonase/eastwood "0.0.2"]
                   [lein-pprint "1.1.1"]
                   ;; [lein-pedantic "0.0.5"] ; with lein 2.2.0, use lein deps
                   ;; :tree
                   [lein-midje "3.1.1"]]}})

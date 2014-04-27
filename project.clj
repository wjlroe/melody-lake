(defproject melody-lake "0.1.0-SNAPSHOT"
  :description "Ludum Dare 29 entry - Melody Lake"
  :url "http://www.ludumdare.com/compo/2014/04/23/welcome-to-ludum-dare-29er/"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2202"]
                 [org.clojure/core.async "0.1.298.0-2a82a1-alpha"]]
  :plugins [[lein-cljsbuild "1.0.3"]
            [lein-simpleton "1.3.0"]]
  :source-paths ["src"]
  :cljsbuild {:builds
              {:dev
               {:source-paths ["src"]
                :compiler {:output-dir "resources/public"
                           :output-to "resources/public/game.js"
                           :optimizations :whitespace
                           :pretty-print true
                           :source-map "resources/public/game.js.map"}}
               :prod
               {:source-paths ["src"]
                :compiler {:output-to "resources/public/game.adv.js"
                           :pretty-print false
                           :optimizations :advanced}}}})

#_{:clj-kondo/ignore [:namespace-name-mismatch]}
(ns rccst-technologies
  (:require [bh.ui-component.atom.bh.tabbed-panel :as tabbed-panel]
            [woolybear.ad.layout :as layout]
            [rccst-ui-components.technologies.overview.data-flow-digraph :as data-flow]
            [rccst-ui-components.technologies.clojure :as tech-clj]
            [rccst-ui-components.technologies.clojurescript :as tech-cljs]
            [rccst-ui-components.technologies.systems-services :as s-s]
            [rccst-ui-components.technologies.all :as all]))



(def navbar [[:tech/data-flow "Data-flow Design" [data-flow/page]]
             [:tech/system "System / Services" [s-s/page]]
             [:tech/server "Server-side" [tech-clj/page]]
             [:tech/client "Client-side" [tech-cljs/page]]
             [:tech/all "All" [all/page]]])


(defn page
  "Some background on the various technologies we are using"
  []

  [layout/page {:extra-classes :is-fluid}
   [tabbed-panel/tabbed-panel
    :extra-classes {:extra-classes :is-fluid
                    :height        "85vh"}
    :title ""
    :short-name "technologies"
    :description ""
    :children navbar
    :start-panel :tech/data-flow]])


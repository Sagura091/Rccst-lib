(ns rccstui.rccst-ui-component.atom.containers
  "Catalog and demonstrations of available container components."
  (:require [rccstui.rccst-ui-component.atom.example.container.v-scroll-panel :as v-scroll-panel]
            [rccstui.rccst-ui-component.atom.example.container.shy-block :as shy-block]
            [rccstui.rccst-ui-component.atom.example.container.flex-panel :as flex-panel]
            [rccstui.rccst-ui-component.atom.example.container.navbar :as navbar]))


; TODO: do we need this in an RCCST namespace, or can we just grab it from woolybear/catalog?

(defn examples
  []
  [:div
   [v-scroll-panel/example]
   [shy-block/example]
   [flex-panel/example]
   [navbar/example]])


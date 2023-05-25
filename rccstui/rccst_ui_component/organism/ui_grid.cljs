(ns rccst-ui-component.organism.ui-grid
  (:require [rccst-ui-component.organism.ui-grid.ratom-example :as ratom-example]
            [rccst-ui-component.organism.ui-grid.sub-example :as sub-example]))


(defn page []
  [:div
   [ratom-example/example]
   [sub-example/example]])


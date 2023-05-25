#_{:clj-kondo/ignore [:namespace-name-mismatch]}
(ns rccstui.rccst-ui-component.molecule.all
  "Catalog and demonstrations of general components."
  (:require [taoensso.timbre :as log]
            [rccstui.rccst-ui-component.molecule.example.header-bar :as header-bar]))


(defn catalog
  []

  [:div
   [header-bar/example]])

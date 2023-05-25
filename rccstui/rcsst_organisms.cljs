
(ns rccst.organisms
  (:require [taoensso.timbre :as log]
            [woolybear.ad.layout :as layout]
            [rccstui.rccst-ui-components.organism.ui-grid :as ui-grid]))


(log/info "rccstui.rccst-ui-components.organisms")


(defn page
  "Atomic Design 'Organisms' page"
  []

  [layout/page {:extra-classes :is-fluid}
   [ui-grid/page]])



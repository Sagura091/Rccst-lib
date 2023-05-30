
(ns organisms
  (:require [taoensso.timbre :as log]
            [woolybear.ad.layout :as layout]
            [rccst-ui-components.organism.ui-grid :as ui-grid]))


(log/info "rccst-ui-components.organisms")


(defn page
  "Atomic Design 'Organisms' page"
  []

  [layout/page {:extra-classes :is-fluid}
   [ui-grid/page]])



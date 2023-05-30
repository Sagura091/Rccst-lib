(ns rccst-ui-component.atom.astrouxds
      "Catalog and demonstrations of available AstroUXDS components."
      (:require [rccst-ui-component.atom.example.astrouxds.button :as button]
                [rccst-ui-component.atom.example.astrouxds.classification-marking :as cm]
                [rccst-ui-component.atom.example.astrouxds.classification-list :as cl]
                [rccst-ui-component.atom.example.astrouxds.status :as status]
                [rccst-ui-component.atom.example.astrouxds.progress-bar :as progress-bar]
                [rccst-ui-component.atom.example.astrouxds.slider :as slider]
                [rccst-ui-component.atom.example.astrouxds.radio-button :as rb]
                [rccst-ui-component.atom.example.astrouxds.table :as table]))


(defn examples
      []

      [:div
       [button/example]
       [cl/example]
       [cm/example]
       [status/example]
       [progress-bar/example]
       [slider/example]
       [rb/example]
       [table/example]])

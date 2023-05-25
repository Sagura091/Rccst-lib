(ns rccstui.rccst-ui-component.atom.astrouxds
      "Catalog and demonstrations of available AstroUXDS components."
      (:require [rccstui.rccst-ui-component.atom.example.astrouxds.button :as button]
                [rccstui.rccst-ui-component.atom.example.astrouxds.classification-marking :as cm]
                [rccstui.rccst-ui-component.atom.example.astrouxds.classification-list :as cl]
                [rccstui.rccst-ui-component.atom.example.astrouxds.status :as status]
                [rccstui.rccst-ui-component.atom.example.astrouxds.progress-bar :as progress-bar]
                [rccstui.rccst-ui-component.atom.example.astrouxds.slider :as slider]
                [rccstui.rccst-ui-component.atom.example.astrouxds.radio-button :as rb]
                [rccstui.rccst-ui-component.atom.example.astrouxds.table :as table]))


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

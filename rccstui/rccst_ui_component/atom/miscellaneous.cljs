(ns rccst-ui-component.atom.miscellaneous
  "Catalog and demonstrations of miscellaneous components that don't fit anywhere else."
  (:require [rccst-ui-component.atom.example.misc.resium.globe :as r-globe]
            [rccst-ui-component.atom.example.misc.hex-color-picker :as hex-picker]
            [rccst-ui-component.atom.example.misc.rgba-color-picker :as rgba-picker]
            [rccst-ui-component.atom.example.misc.two-d-globe :as two-d-globe]
            [rccst-ui-component.atom.example.misc.bh.bh-table :as bh-table]
            [rccst-ui-component.atom.example.misc.bh.meta-bh-table :as meta-bh-table]
            [rccst-ui-component.atom.example.misc.bh.meta-coc-bh-table :as meta-coc-bh-table]
            [rccst-ui-component.atom.example.misc.worldwind.globe :as ww-globe]
            [rccst-ui-component.atom.example.misc.data-table :as data-table]))


(defn examples
  []

  [:div
   [ww-globe/example]
   [r-globe/example]
   [two-d-globe/example]

   [data-table/example]
   [bh-table/example]
   [meta-bh-table/example]
   [meta-coc-bh-table/example]

   [hex-picker/example]
   [rgba-picker/example]])


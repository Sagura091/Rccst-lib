(ns rccst-ui-component.atom.miscellaneous
  "Catalog and demonstrations of miscellaneous components that don't fit anywhere else."
  (:require [rccst-ui-component.atom.example.misc.resium.globe :as r-globe]
            [rccst-ui-component.atom.example.misc.hex-color-picker :as hex-picker]
            [rccst-ui-component.atom.example.misc.rgba-color-picker :as rgba-picker]
            [rccst-ui-component.atom.example.misc.two-d-globe :as two-d-globe]
            [rccst-ui-component.atom.example.misc.bhui.bhui-table :as bhui-table]
            [rccst-ui-component.atom.example.misc.bhui.meta-bhui-table :as meta-bhui-table]
            [rccst-ui-component.atom.example.misc.bhui.meta-coc-bhui-table :as meta-coc-bhui-table]
            [rccst-ui-component.atom.example.misc.worldwind.globe :as ww-globe]
            [rccst-ui-component.atom.example.misc.bhui.data-table :as data-table]))


(defn examples
  []

  [:div
   [ww-globe/example]
   [r-globe/example]
   [two-d-globe/example]

   [data-table/example]
   [bhui-table/example]
   [meta-bhui-table/example]
   [meta-coc-bhui-table/example]

   [hex-picker/example]
   [rgba-picker/example]])


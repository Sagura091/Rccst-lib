(ns rccstui.rccst-ui-component.atom.miscellaneous
  "Catalog and demonstrations of miscellaneous components that don't fit anywhere else."
  (:require [rccstui.rccst-ui-component.atom.example.misc.resium.globe :as r-globe]
            [rccstui.rccst-ui-component.atom.example.misc.hex-color-picker :as hex-picker]
            [rccstui.rccst-ui-component.atom.example.misc.rgba-color-picker :as rgba-picker]
            [rccstui.rccst-ui-component.atom.example.misc.two-d-globe :as two-d-globe]
            [rccstui.rccst-ui-component.atom.example.misc.bhui.bhui-table :as bhui-table]
            [rccstui.rccst-ui-component.atom.example.misc.bhui.meta-bhui-table :as meta-bhui-table]
            [rccstui.rccst-ui-component.atom.example.misc.bhui.meta-coc-bhui-table :as meta-coc-bhui-table]
            [rccstui.rccst-ui-component.atom.example.misc.worldwind.globe :as ww-globe]
            [rccstui.rccst-ui-component.atom.example.misc.bhui.data-table :as data-table]))


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


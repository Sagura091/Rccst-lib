(ns rccst-ui-component.atom.layouts
  "Catalog and acu/demonstrations of available layout components."
  (:require [rccst-ui-component.atom.example.layout.page :as page]
            [rccst-ui-component.atom.example.layout.page-header :as page-header]
            [rccst-ui-component.atom.example.layout.page-title :as page-title]
            [rccst-ui-component.atom.example.layout.text-block :as text-block]
            [rccst-ui-component.atom.example.layout.centered-block :as centered-block]
            [rccst-ui-component.atom.example.layout.markdown-block :as markdown-block]
            [rccst-ui-component.atom.example.layout.frame :as frame]
            [rccst-ui-component.atom.example.layout.section :as section]
            [rccst-ui-component.atom.example.layout.layout-grid :as layout-grid]))


(defn examples
  []
  [:div
   [page/example]
   [page-header/example]
   [page-title/example]
   [section/example]
   [text-block/example]
   [centered-block/example]
   [markdown-block/example]
   [frame/example]
   [layout-grid/example]])

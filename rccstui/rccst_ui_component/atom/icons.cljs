(ns rccstui.rccst-ui-component.atom.icons
  "Catalog and demonstrations of available icon components."
  (:require [rccstui.rccst-ui-component.atom.example.icons.simple-image :as simple-image]
            [rccstui.rccst-ui-component.atom.example.icons.standard-icon :as standard-icon]
            [rccstui.rccst-ui-component.atom.example.icons.colored-icon :as colored-icon]
            [rccstui.rccst-ui-component.atom.example.icons.small-icon :as small-icon]
            [rccstui.rccst-ui-component.atom.example.icons.medium-icon :as medium-icon]
            [rccstui.rccst-ui-component.atom.example.icons.large-icon :as large-icon]
            [rccstui.rccst-ui-component.atom.example.icons.brand-icon :as brand-icon]
            [rccstui.rccst-ui-component.atom.example.icons.clickable-icon :as clickable-icon]))


(defn examples
  []

  [:div
   [simple-image/example]
   [standard-icon/example]
   [colored-icon/example]
   [small-icon/example]
   [medium-icon/example]
   [large-icon/example]
   [brand-icon/example]
   [clickable-icon/example]])



(ns rccst-ui-component.atom.buttons
  "Catalog and demonstrations of available button components."
  (:require [rccst-ui-component.atom.example.button.simple-button :as simple-button]
            [rccst-ui-component.atom.example.button.specialized-button :as specialized-button]
            [rccst-ui-component.atom.example.button.icon-button :as icon-button]
            [rccst-ui-component.atom.example.button.toggle-button :as toggle-button]))

(defn examples
  []

  [:div
   [simple-button/example]
   [specialized-button/example]
   [icon-button/example]
   [toggle-button/example]])

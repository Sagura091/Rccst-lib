(ns rccstui.rccst-ui-component.atom.cards
  (:require [rccstui.rccst-ui-component.atom.example.card.card :as card]
            [rccstui.rccst-ui-component.atom.example.card.flippable-card :as flippable-card]
            [rccstui.rccst-ui-component.atom.example.card.image-card :as image-card]))


(defn examples []
  [:div
   [card/example]
   [image-card/example]
   [flippable-card/example]])


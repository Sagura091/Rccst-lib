(ns rccst-ui-component.atom.cards
  (:require [rccst-ui-component.atom.example.card.card :as card]
            [rccst-ui-component.atom.example.card.flippable-card :as flippable-card]
            [rccst-ui-component.atom.example.card.image-card :as image-card]))


(defn examples []
  [:div
   [card/example]
   [image-card/example]
   [flippable-card/example]])


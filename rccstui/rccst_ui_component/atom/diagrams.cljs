(ns rccst-ui-component.atom.diagrams
  (:require [rccst-ui-component.atom.example.diagram.flow :as flow]
            [rccst-ui-component.atom.example.diagram.editable-digraph :as editable]))


(defn examples []
  [:div
   ;[flow/example]
   [editable/example]])

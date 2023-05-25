(ns rccstui.rccst-ui-component.atom.diagrams
  (:require [rccstui.rccst-ui-component.atom.example.diagram.flow :as flow]
            [rccstui.rccst-ui-component.atom.example.diagram.editable-digraph :as editable]))


(defn examples []
  [:div
   ;[flow/example]
   [editable/example]])

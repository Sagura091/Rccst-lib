(ns rccstui.rccst-ui-component.atom.example.chart.alt.data-structure-example
  (:require [rccstui.rccst-ui-component.atom.utils :as example]
            [ui-component.utils :as utils]
            [reagent.core :as r]
            [taoensso.timbre :as log]))


(log/info "rccstui.rccst-ui-component.atom.example.chart.alt.data-structure-example")


(defn example [& {:keys [container-id sample-data] :as params}]
  (let [component-id (utils/path->keyword container-id "chart")
        input-params (assoc params :data sample-data
                                   :component-id component-id)]

    (reduce into [example/component-example] (seq input-params))))

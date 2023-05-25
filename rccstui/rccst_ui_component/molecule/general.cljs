#_{:clj-kondo/ignore [:namespace-name-mismatch]}
(ns rccst-ui-component.molecule.general
  "Catalog and demonstrations of general components."
  (:require [taoensso.timbre :as log]
            [rccst-ui-component.molecule.example.header-bar :as header-bar]
            [rccst-ui-component.molecule.example.login :as login]
            [rccst-ui-component.molecule.example.two-d-three-d-globe :as two-d-three-d-globe]
            [rccst-ui-component.molecule.example.composite.coverage-plan :as coverage-plan]
            [rccst-ui-component.molecule.example.composite.chart-remote-data :as chart-remote-data]
            [rccst-ui-component.molecule.example.composite.simple-multi-chart :as simple-multi-chart]
            [rccst-ui-component.molecule.example.composite.simple-multi-chart-2 :as simple-multi-chart-2]
            [rccst-ui-component.molecule.example.composite.with-fn-example :as with-fn]
            [rccst-ui-component.molecule.example.composite.multi-chart-widget :as multi-chart-widget]))


(log/info "rccst-ui-component.molecule.general")


(defn catalog []

  [:div
   [chart-remote-data/example]
   [simple-multi-chart/example]
   [simple-multi-chart-2/example]
   [multi-chart-widget/example]
   [with-fn/example]
   [coverage-plan/ww-example]
   [coverage-plan/r-example]
   [coverage-plan/twoD-example]
   [header-bar/example]
   [login/example]
   [two-d-three-d-globe/example]])

(ns rccstui.rccst-ui-component.atom.charts
  (:require [rccstui.rccst-ui-component.atom.example.chart.area-chart :as area-chart]
            [rccstui.rccst-ui-component.atom.example.chart.bar-chart :as bar-chart]
            [rccstui.rccst-ui-component.atom.example.chart.colored-pie-chart :as colored-pie-chart]
            [rccstui.rccst-ui-component.atom.example.chart.funnel-chart :as funnel-chart]
            [rccstui.rccst-ui-component.atom.example.chart.line-chart :as line-chart]
            [rccstui.rccst-ui-component.atom.example.chart.pie-chart :as pie-chart]
            [rccstui.rccst-ui-component.atom.example.chart.radar-chart :as radar-chart]
            [rccstui.rccst-ui-component.atom.example.chart.radial-bar-chart :as radial-bar-chart]
            [rccstui.rccst-ui-component.atom.example.chart.sankey-chart :as sankey-chart]
            [rccstui.rccst-ui-component.atom.example.chart.scatter-chart :as scatter-chart]
            [rccstui.rccst-ui-component.atom.example.chart.treemap-chart :as treemap-chart]))


(defn page
  "Charts"
  []

  [:div
   [area-chart/examples]
   [bar-chart/examples]
   [colored-pie-chart/examples]
   [funnel-chart/examples]
   [line-chart/examples]
   [pie-chart/examples]
   [radar-chart/examples]
   [radial-bar-chart/examples]
   [sankey-chart/examples]
   [scatter-chart/examples]
   [treemap-chart/examples]])


(ns rccstui.rccst-ui-component.atom.all
  "atom and acu/demonstrations of all available UI components."
  (:require [re-com.core :as rc]

            [rccstui.rccst-ui-component.atom.example.layout.page :as page]
            [rccstui.rccst-ui-component.atom.example.layout.page-header :as page-header]
            [rccstui.rccst-ui-component.atom.example.layout.page-title :as page-title]
            [rccstui.rccst-ui-component.atom.example.layout.text-block :as text-block]
            [rccstui.rccst-ui-component.atom.example.layout.centered-block :as centered-block]
            [rccstui.rccst-ui-component.atom.example.layout.markdown-block :as markdown-block]
            [rccstui.rccst-ui-component.atom.example.layout.frame :as frame]
            [rccstui.rccst-ui-component.atom.example.layout.section :as section]

            [rccstui.rccst-ui-component.atom.example.container.navbar :as navbar]

            [rccstui.rccst-ui-component.atom.example.icons.simple-image :as simple-image]
            [rccstui.rccst-ui-component.atom.example.icons.standard-icon :as standard-icon]
            [rccstui.rccst-ui-component.atom.example.icons.colored-icon :as colored-icon]
            [rccstui.rccst-ui-component.atom.example.icons.small-icon :as small-icon]
            [rccstui.rccst-ui-component.atom.example.icons.medium-icon :as medium-icon]
            [rccstui.rccst-ui-component.atom.example.icons.large-icon :as large-icon]
            [rccstui.rccst-ui-component.atom.example.icons.brand-icon :as brand-icon]
            [rccstui.rccst-ui-component.atom.example.icons.clickable-icon :as clickable-icon]

            [rccstui.rccst-ui-component.atom.example.forms.simple-form-label :as simple-label]
            [rccstui.rccst-ui-component.atom.example.forms.required-form-label :as required-label]
            [rccstui.rccst-ui-component.atom.example.forms.text-input :as text-input]
            [rccstui.rccst-ui-component.atom.example.forms.password-input :as pass-input]
            [rccstui.rccst-ui-component.atom.example.forms.placeholder-text-input :as place-text-input]
            [rccstui.rccst-ui-component.atom.example.forms.disabled-text-input :as disabled-text-input]
            [rccstui.rccst-ui-component.atom.example.forms.error-text-input :as error-text-input]
            [rccstui.rccst-ui-component.atom.example.forms.simple-select-input :as simple-select-input]
            [rccstui.rccst-ui-component.atom.example.forms.custom-select-input :as custom-select-input]
            [rccstui.rccst-ui-component.atom.example.forms.disabled-select-input :as disabled-select-input]
            [rccstui.rccst-ui-component.atom.example.forms.multi-select-input :as multi-select-input]
            [rccstui.rccst-ui-component.atom.example.forms.checkbox :as checkbox]
            [rccstui.rccst-ui-component.atom.example.forms.disabled-checkbox :as disabled-checkbox]

            ;[rccstui.rccst-ui-component.atom.example.chart.bar-chart :as bar-chart]
            ;[rccstui.rccst-ui-component.atom.example.chart.line-chart :as line-chart]
            ;[rccstui.rccst-ui-component.atom.example.chart.pie-chart :as pie-chart]
            ;[rccstui.rccst-ui-component.atom.example.chart.colored-pie-chart :as colored-piechart]

            [rccstui.rccst-ui-component.atom.example.re-com.table :as table]
            [rccstui.rccst-ui-component.atom.example.re-com.alert-box :as alert-box]
            [rccstui.rccst-ui-component.atom.example.re-com.line :as line]))


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
   [navbar/example]

   [rc/line :size "5px" :color "orange"]

   ;[bar-chart/example]
   ;[line-chart/simple-example]
   ;[pie-chart/example]
   ;[colored-piechart/example]

   [rc/line :size "5px" :color "orange"]

   [simple-label/example]
   [required-label/example]
   [text-input/example]
   [pass-input/example]
   [place-text-input/example]
   [disabled-text-input/example]
   [error-text-input/example]
   [simple-select-input/example]
   [custom-select-input/example]
   [disabled-select-input/example]
   [multi-select-input/example]
   [checkbox/example]
   [disabled-checkbox/example]

   [rc/line :size "2px" :color "orange"]

   [table/example]
   [alert-box/example]
   [line/example]
   [simple-image/example]
   [standard-icon/example]
   [colored-icon/example]
   [small-icon/example]
   [medium-icon/example]
   [large-icon/example]
   [brand-icon/example]
   [clickable-icon/example]])

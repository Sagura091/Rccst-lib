(ns rccstui.rccst-ui-component.technologies.all
  (:require [rccstui.rccst-ui-component.technologies.overview.compojure :as compojure-overview]
            [rccstui.rccst-ui-component.technologies.overview.component :as component-overview]
            [rccstui.rccst-ui-component.technologies.overview.jackdaw :as jackdaw-overview]
            [rccstui.rccst-ui-component.technologies.overview.kafka :as kafka]
            [rccstui.rccst-ui-component.technologies.overview.next-jdbc :as next-jdbc-overview]
            [rccstui.rccst-ui-component.technologies.overview.re-com :as re-com]
            [rccstui.rccst-ui-component.technologies.overview.re-frame :as re-frame]
            [rccstui.rccst-ui-component.technologies.overview.reagent :as reagent]
            [rccstui.rccst-ui-component.technologies.overview.recharts :as recharts]
            [rccstui.rccst-ui-component.technologies.overview.ring :as ring-overview]
            [rccstui.rccst-ui-component.technologies.overview.sente :as sente-overview]
            [rccstui.rccst-ui-component.technologies.overview.swagger :as swagger]
            [rccstui.rccst-ui-component.technologies.overview.transit :as transit-overview]
            [rccstui.rccst-ui-component.technologies.overview.woolybear :as woolybear]
            [re-com.core :as rc]
            [woolybear.ad.layout :as layout]))


(defn page []
  [layout/page {:extra-classes :is-fluid}
   [:h2.has-text-info "All"]
   [layout/text-block "An overview of many of the technologies we use in RCCST"]
   [rc/gap :size "8px"]

   [layout/frame {:extra-classes :is-fluid}
    [ring-overview/overview]]
   [layout/frame {:extra-classes :is-fluid}
    [compojure-overview/overview]]
   [layout/frame {:extra-classes :is-fluid}
    [component-overview/overview]]
   [layout/frame {:extra-classes :is-fluid}
    [sente-overview/overview]]
   [layout/frame {:extra-classes :is-fluid}
    [transit-overview/overview]]
   [layout/frame {:extra-classes :is-fluid}
    [next-jdbc-overview/overview]]
   [layout/frame {:extra-classes :is-fluid}
    [jackdaw-overview/overview]]

   [layout/frame {:extra-classes :is-fluid}
    [reagent/overview]]
   [layout/frame {:extra-classes :is-fluid}
    [re-frame/overview]]
   [layout/frame {:extra-classes :is-fluid}
    [re-com/overview]]
   [layout/frame {:extra-classes :is-fluid}
    [woolybear/overview]]
   [layout/frame {:extra-classes :is-fluid}
    [recharts/overview]]

   [layout/frame {:extra-classes :is-fluid}
    [kafka/overview]]
   [layout/frame {:extra-classes :is-fluid}
    [swagger/overview]]])


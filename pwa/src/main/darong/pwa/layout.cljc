(ns darong.pwa.layout
  (:require
    [rum.core :as rum]))


(rum/defc label [text]
  [:div {:class "label"} text])
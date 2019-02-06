(ns darong.pwa.layout
  (:require
    [rum.core :as rum]))


(rum/defc label [text]
  [:h1 {:class "label"} text])
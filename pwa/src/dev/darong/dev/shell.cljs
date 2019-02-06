(ns darong.dev.shell
  (:require
    [rum.core :as rum]
    [darong.pwa.layout :as layout]))


;; start is called by init and after code reloading finishes
(defn ^:dev/after-load start []
  (js/console.log "start")
  (rum/mount (layout/label "Hello Rum2!") (.getElementById js/document "pwa")))


(defn ^:export init []
  ;; init is called ONCE when the page loads
  ;; this is called in the index.html and must be exported
  ;; so it is available even in :advanced release builds
  (js/console.log "init")
  (start))


;; this is called before any code is reloaded
(defn ^:dev/before-load stop []
  (js/console.log "stop"))

(ns darong.pwa.style)


;; Design guidelines:
;; mx-5: outer column margin, ~20px in iPhone 6/7/8
;; px-3: gutter width, ~ 12px in iPhone 6/7/8
;; mobile: 4 column, each column has width: 25%
;; see
;; - https://github.com/jonikorpi/Golden-Grid-System/blob/master/GGS.css
;; - https://www.sitepoint.com/community/t/golden-grid-system/8236/11
;;
;; Font zoom in when page is viewed in bigger screen
;; see
;; - http://marknugent.tumblr.com/post/47212935858/a-guide-tutorial-to-the-frameless-grid-how-to
;; - https://github.com/jonikorpi/Frameless/blob/master/framelessgrid.com/assets/main.less#L576


(def zoomed-font "font-sans text-sm md:text-base lg:text-lg xl:text-xl")


(def zoomed-font-1 "text-lg lg:text-2xl")


(def zoomed-font-2 "text-base lg:text-3xl")


(def outer-margin "px-5 lg:px-6")


(def container
  (str outer-margin " " zoomed-font))

(defn style [{:keys [sm lg]}]
  (str sm " " lg))

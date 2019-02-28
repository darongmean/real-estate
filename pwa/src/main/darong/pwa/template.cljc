(ns darong.pwa.template
  (:require
    [darong.pwa.style :as style]
    [rum.core :as rum]))


(rum/defc Header []
  [:header {:class "bg-white pb-5"}
   [:section {:class (str style/container " ")}
    [:a {:href "#" :class "no-underline text-4xl text-grey-lightest font-bold font-serif"}
     [:span {:class "text-blue-dark"} "N"]
     [:span {:class "text-black"} "oobEstate"]]
    [:input {:type        "search"
             :placeholder "Search and compare rental properties"
             :class       "appearance-none
                     block
                     w-full
                     border-2
                     border-blue-dark
                     py-3
                     px-4
                     leading-tight
                     text-sm
                     focus:outline-none
                     focus:bg-grey-lightest"}]]])


(rum/defc Footer []
  [:footer {:class "bg-white"}
   [:div {:class (str "flex justify-center p-6" " " style/container)}
    [:p {:class                   "font-serif text-xs font-bold"
         :dangerouslySetInnerHTML {:__html "&#9400; 2019 NoobEstate. All rights reserved."}}]]])


(rum/defc PopularLocation []
  [:div {:class "bg-grey-light py-2"}
   [:section {:class (str style/zoomed-font " bg-white")}
    [:header {:class (str style/outer-margin " py-3 text-lg font-bold text-black")}
     [:span {:class "bg-img-title bg-no-repeat bg-left pl-8"} "Popular areas in Phnom Penh"]]
    [:p {:class (str style/outer-margin " text-grey-darker pb-3 text-sm")}
     [:a {:href "#" :class "no-underline text-grey-darker font-bold border-b-2 border-dashed"} "Average rent"]
     " over "
     [:span {:class "font-bold"} "500 million"]
     " points of data in 12 months"]
    [:em {:class "hidden"}
     "disclaimer: Please note that all salary figures are approximations based upon third party
         submissions to Indeed. These figures are given to the Indeed users for the purpose of
         generalized comparison only. Minimum wage may differ by jurisdiction and you should consult
          the employer for actual salary figures."]
    [:ul {:class "list-reset"}
     [:li {:class (str style/outer-margin " py-3 border-t")}
      [:a {:href "#" :class "no-underline flex justify-between bg-img-chevron bg-pos-x-right bg-pos-y-center bg-no-repeat pr-6"}
       [:div
        [:p {:class "text-black text-base font-bold"} "BKK"]
        [:p {:class "text-grey-darker text-sm"} "1,000 price reported"]]
       [:div
        [:p {:class "text-black text-base font-bold"} "$12.34 "]
        [:p {:class "text-grey-darker text-sm"} "/ month"]]]]
     [:li {:class (str style/outer-margin " py-3 border-t")}
      [:a {:href "#" :class "no-underline flex justify-between bg-img-chevron bg-pos-x-right bg-pos-y-center bg-no-repeat pr-6"}
       [:div
        [:p {:class "text-black text-base font-bold"} "BKK"]
        [:p {:class "text-grey-darker text-sm"} "1,000 price reported"]]
       [:div
        [:p {:class "text-black text-base font-bold"} "$3 "]
        [:p {:class "text-grey-darker text-sm"} "/ month"]]]]
     [:li {:class (str style/outer-margin " py-3 border-t")}
      [:a {:href "#" :class "no-underline flex justify-between bg-img-chevron bg-pos-x-right bg-pos-y-center bg-no-repeat pr-6"}
       [:div
        [:p {:class "text-black text-base font-bold"} "BKK"]
        [:p {:class "text-grey-darker text-sm"} "1,000 price reported"]]
       [:div
        [:p {:class "text-black text-base font-bold"} "$3 "]
        [:p {:class "text-grey-darker text-sm"} "/ month"]]]]
     [:li {:class (str style/outer-margin " py-3 border-t")}
      [:a {:href "#" :class "no-underline flex justify-between bg-img-chevron bg-pos-x-right bg-pos-y-center bg-no-repeat pr-6"}
       [:div
        [:p {:class "text-black text-base font-bold"} "BKK"]
        [:p {:class "text-grey-darker text-sm"} "1,000 price reported"]]
       [:div
        [:p {:class "text-black text-base font-bold"} "$3 "]
        [:p {:class "text-grey-darker text-sm"} "/ month"]]]]
     [:li {:class (str style/outer-margin " py-3 border-t")}
      [:a {:href "#" :class "no-underline flex justify-between items-center"}
       [:p {:class "text-grey-darker text-sm"} "More popular areas in Phnom Penh"]
       [:span {:class "bg-img-chevron-header rotate-0 w-6 h-6 bg-center bg-no-repeat"}]]]
     [:li {:class (str style/outer-margin " py-3 border-t")}
      [:a {:href "#" :class "no-underline flex bg-img-chevron bg-pos-x-right bg-pos-y-center bg-no-repeat pr-6"}
       [:p {:class "text-black text-sm font-normal"} "AAA"]]]
     [:li {:class (str style/outer-margin " py-3 border-t")}
      [:a {:href "#" :class "no-underline flex bg-img-chevron bg-pos-x-right bg-pos-y-center bg-no-repeat pr-6"}
       [:p {:class "text-black text-sm font-normal"} "AAA"]]]
     [:li {:class (str style/outer-margin " py-3 border-t")}
      [:a {:href "#" :class "no-underline flex bg-img-chevron bg-pos-x-right bg-pos-y-center bg-no-repeat pr-6"}
       [:p {:class "text-black text-sm font-normal"} "AAA"]]]
     [:li {:class (str style/outer-margin " py-3 border-t")}
      [:a {:href "#" :class "no-underline flex bg-img-chevron bg-pos-x-right bg-pos-y-center bg-no-repeat pr-6"}
       [:p {:class "text-black text-sm font-normal"} "AAA"]]]
     [:li {:class (str style/outer-margin " py-3 border-t")}
      [:a {:href "#" :class "no-underline flex bg-img-chevron bg-pos-x-right bg-pos-y-center bg-no-repeat pr-6"}
       [:p {:class "text-black text-sm font-normal"} "AAA"]]]
     [:li {:class (str style/outer-margin " py-3 border-t")}
      [:a {:href "#" :class "no-underline flex bg-img-chevron bg-pos-x-right bg-pos-y-center bg-no-repeat pr-6"}
       [:p {:class "text-black text-sm font-normal"} "AAA"]]]
     [:li {:class (str style/outer-margin " py-3 border-t")}
      [:a {:href "#" :class "no-underline flex bg-img-chevron bg-pos-x-right bg-pos-y-center bg-no-repeat pr-6"}
       [:p {:class "text-black text-sm font-normal"} "AAA"]]]
     [:li {:class (str style/outer-margin " py-3 border-t")}
      [:a {:href "#" :class "no-underline flex bg-img-chevron bg-pos-x-right bg-pos-y-center bg-no-repeat pr-6"}
       [:p {:class "text-black text-sm font-normal"} "AAA"]]]]]])


(rum/defc Neighborhoods []
  [:div {:class "bg-grey-light pb-2"}
   [:section {:class (str style/zoomed-font " bg-white")}
    [:header {:class (str style/outer-margin " py-3 text-lg font-bold text-black")}
     [:span {:class "bg-img-title bg-no-repeat bg-left pl-8"} "Phnom Penh Neighborhoods"]]
    [:ul {:class "list-reset"}
     [:li {:class (str style/outer-margin " py-3 border-t")}
      [:a {:href "#" :class "no-underline flex items-start bg-img-chevron bg-pos-x-right bg-pos-y-center bg-no-repeat pr-6"}
       [:div {:class "mr-3"} [:img {:src "https://via.placeholder.com/50"}]]
       [:div
        [:p {:class "text-black text-base font-bold pt-1"} "BKK"]
        [:p {:class "text-grey-darker text-sm pt-1"} "1,000 price reported"]]]]
     [:li {:class (str style/outer-margin " py-3 border-t")}
      [:a {:href "#" :class "no-underline flex items-start bg-img-chevron bg-pos-x-right bg-pos-y-center bg-no-repeat pr-6"}
       [:div {:class "mr-3"} [:img {:src "https://via.placeholder.com/50"}]]
       [:div
        [:p {:class "text-black text-base font-bold pt-1"} "BKK"]
        [:p {:class "text-grey-darker text-sm pt-1"} "1,000 price reported"]]]]
     [:li {:class (str style/outer-margin " py-3 border-t")}
      [:a {:href "#" :class "no-underline flex items-start bg-img-chevron bg-pos-x-right bg-pos-y-center bg-no-repeat pr-6"}
       [:div {:class "mr-3"} [:img {:src "https://via.placeholder.com/50"}]]
       [:div
        [:p {:class "text-black text-base font-bold pt-1"} "BKK"]
        [:p {:class "text-grey-darker text-sm pt-1"} "1,000 price reported"]]]]
     [:li {:class (str style/outer-margin " py-3 border-t")}
      [:a {:href "#" :class "no-underline flex items-start bg-img-chevron bg-pos-x-right bg-pos-y-center bg-no-repeat pr-6"}
       [:div {:class "mr-3"} [:img {:src "https://via.placeholder.com/50"}]]
       [:div
        [:p {:class "text-black text-base font-bold pt-1"} "BKK"]
        [:p {:class "text-grey-darker text-sm pt-1"} "1,000 price reported"]]]]
     [:li {:class (str style/outer-margin " py-3 border-t")}
      [:a {:href "#" :class "no-underline flex justify-between items-center"}
       [:p {:class "text-grey-darker text-sm"} "More neighborhoods"]
       [:span {:class "bg-img-chevron-header rotate-180 w-6 h-6 bg-center bg-no-repeat"}]]]
     [:li {:class (str style/outer-margin " py-3 border-t")}
      [:a {:href "#" :class "no-underline flex bg-img-chevron bg-pos-x-right bg-pos-y-center bg-no-repeat pr-6"}
       [:p {:class "text-black text-sm font-normal"} "AAA"]]]
     [:li {:class (str style/outer-margin " py-3 border-t")}
      [:a {:href "#" :class "no-underline flex bg-img-chevron bg-pos-x-right bg-pos-y-center bg-no-repeat pr-6"}
       [:p {:class "text-black text-sm font-normal"} "AAA"]]]
     [:li {:class (str style/outer-margin " py-3 border-t")}
      [:a {:href "#" :class "no-underline flex bg-img-chevron bg-pos-x-right bg-pos-y-center bg-no-repeat pr-6"}
       [:p {:class "text-black text-sm font-normal"} "AAA"]]]
     [:li {:class (str style/outer-margin " py-3 border-t")}
      [:a {:href "#" :class "no-underline flex bg-img-chevron bg-pos-x-right bg-pos-y-center bg-no-repeat pr-6"}
       [:p {:class "text-black text-sm font-normal"} "AAA"]]]
     [:li {:class (str style/outer-margin " py-3 border-t")}
      [:a {:href "#" :class "no-underline flex bg-img-chevron bg-pos-x-right bg-pos-y-center bg-no-repeat pr-6"}
       [:p {:class "text-black text-sm font-normal"} "AAA"]]]
     [:li {:class (str style/outer-margin " py-3 border-t")}
      [:a {:href "#" :class "no-underline flex bg-img-chevron bg-pos-x-right bg-pos-y-center bg-no-repeat pr-6"}
       [:p {:class "text-black text-sm font-normal"} "AAA"]]]
     [:li {:class (str style/outer-margin " py-3 border-t")}
      [:a {:href "#" :class "no-underline flex bg-img-chevron bg-pos-x-right bg-pos-y-center bg-no-repeat pr-6"}
       [:p {:class "text-black text-sm font-normal"} "AAA"]]]
     [:li {:class (str style/outer-margin " py-3 border-t")}
      [:a {:href "#" :class "no-underline flex bg-img-chevron bg-pos-x-right bg-pos-y-center bg-no-repeat pr-6"}
       [:p {:class "text-black text-sm font-normal"} "AAA"]]]]]])


(rum/defc Language []
  [:div {:class "bg-grey-light pb-2"}
   [:section {:class (str style/zoomed-font " bg-white")}
    [:ul {:class "list-reset"}
     [:li {:class (str style/outer-margin " py-3 border-t")}
      [:a {:href "#" :class "no-underline flex justify-between items-center"}
       [:p {:class "text-black text-sm font-normal"} "ភាសាខ្មែរ"]
       [:input {:type "checkbox" :checked false}]]]
     [:li {:class (str style/outer-margin " py-3 border-t")}
      [:a {:href "#" :class "no-underline flex justify-between items-center"}
       [:p {:class "text-black text-sm font-normal"} "English (US)"]
       [:input {:type "checkbox" :checked true}]]]]]])


(rum/defc Index [text]
  [:div
   (Header)
   (PopularLocation)
   (Neighborhoods)
   (Language)
   (Footer)])

(rum/defc Home [text]
  [:div
   (Header)
   (PopularLocation)
   (Neighborhoods)
   (Language)
   (Footer)])

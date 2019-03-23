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


(rum/defc AreaHeader []
  [:div {:class "bg-grey-light py-2"}
   [:section {:class (str style/zoomed-font " bg-white")}
    [:header {:class (str style/outer-margin " py-3 text-xl font-normal text-black")}
     [:span {:class "bg-img-dollar bg-no-repeat bg-left pl-8 py-1"} "Area 9"]]
    [:section {:class (str style/outer-margin " text-grey-darker pb-3 text-sm font-normal")}
     [:p "109.7K data points reported"]
     [:p {:class "pt-1"} "Updated on 3/7/19"]]
    [:section {:class (str style/outer-margin " py-3")}
     [:p {:class "text-grey-darker font-normal text-sm"} "Average rent"]
     [:p
      [:span {:class "text-black font-bold text-4xl"} "$15.21"]
      [:span {:class "text-grey-darker font-normal text-lg"} " per month"]]]
    [:section {:class (str style/outer-margin " py-3 ")}
     [:p {:class "text-grey-darker font-normal text-sm"} "Rent distribution"]
     [:ul {:class "mt-1 list-reset relative h-16"}
      [:li {:class "absolute bg-grey-light pin-b rounded-t-sm"
            :style {:height "25.47852647357379%" :width "9.2%" :left "0.0%"}}]
      [:li {:class "absolute bg-grey-light pin-b rounded-t-sm"
            :style {:height "64.8812465700313%" :width "9.2%" :left "10.088999999999999%"}}]
      [:li {:class "absolute bg-grey-light pin-b rounded-t-sm bg-green"
            :style {:height "90.0%" :width "9.2%" :left "20.177999999999997%"}}]
      [:li {:class "absolute bg-grey-light pin-b rounded-t-sm"
            :style {:height "87.13963308321102%" :width "9.2%" :left "30.266999999999996%"}}]
      [:li {:class "absolute bg-grey-light pin-b rounded-t-sm"
            :style {:height "67.52112313949745%" :width "9.2%" :left "40.355999999999995%"}}]
      [:li {:class "absolute bg-grey-light pin-b rounded-t-sm"
            :style {:height "45.353413557835005%" :width "9.2%" :left "50.44499999999999%"}}]
      [:li {:class "absolute bg-grey-light pin-b rounded-t-sm"
            :style {:height "27.73509276853321%" :width "9.2%" :left "60.53399999999999%"}}]
      [:li {:class "absolute bg-grey-light pin-b rounded-t-sm"
            :style {:height "15.9343642264091%" :width "9.2%" :left "70.62299999999999%"}}]
      [:li {:class "absolute bg-grey-light pin-b rounded-t-sm"
            :style {:height "8.78125342288431%" :width "9.2%" :left "80.71199999999999%"}}]
      [:li {:class "absolute bg-grey-light pin-b rounded-t-sm"
            :style {:height "4.708083644125027%" :width "9.2%" :left "90.80099999999999%"}}]]
     [:div {:class "flex justify-between pt-1"}
      [:p {:class "text-grey-darker font-normal text-xs"} "$7.25"]
      [:p {:class "text-grey-darker font-normal text-xs"} "$30.45"]]]]])


(rum/defc ExplainAreaStats []
  [:div {:class "bg-grey-light pb-2"}
   [:section {:class (str style/zoomed-font " bg-white py-3")}
    [:header {:class (str style/outer-margin " text-lg font-bold text-black")}
     "How much is rent in Area 9?"]
    [:p {:class (str style/outer-margin " pt-3 font-normal text-sm")}
     "The average rent for Area 9 is $15.21 per month.
      Rent estimates are based on 109,723 data points submitted anonymously to NE by users,
      and collected from past and present listings on NE in the past 36 months."]]])


(rum/defc ListingsInArea []
  [:div {:class "bg-grey-light pb-2"}
   [:section {:class (str style/zoomed-font " bg-white")}
    [:header {:class (str style/outer-margin " py-3 text-lg font-bold text-black")}
     "Listings in Area 9"]
    [:ul {:class "list-reset"}
     [:li {:class (str style/outer-margin " py-3 border-t")}
      [:a {:href "#" :class "no-underline flex justify-between items-center bg-img-chevron bg-pos-x-right bg-pos-y-center bg-no-repeat pr-6"}
       [:p {:class "pr-1"}
        [:span {:class "text-grey-darker text-sm font-light"} "01 "]
        [:span {:class "text-black text-base"} "BKK How much is rent in Area 9?"]]
       [:div
        [:p {:class "text-black text-base font-bold"} "$12.34 "]
        [:p {:class "text-grey-darker text-sm"} "/ month"]]]]
     [:li {:class (str style/outer-margin " py-3 border-t")}
      [:a {:href "#" :class "no-underline flex justify-between items-center bg-img-chevron bg-pos-x-right bg-pos-y-center bg-no-repeat pr-6"}
       [:p {:class "pr-1"}
        [:span {:class "text-grey-darker text-sm font-light"} "02 "]
        [:span {:class "text-black text-base"} "BKK"]]
       [:div
        [:p {:class "text-black text-base font-bold"} "$12.34 "]
        [:p {:class "text-grey-darker text-sm"} "/ month"]]]]
     [:li {:class (str style/outer-margin " py-3 border-t")}
      [:a {:href "#" :class "no-underline flex justify-between items-center bg-img-chevron bg-pos-x-right bg-pos-y-center bg-no-repeat pr-6"}
       [:p {:class "pr-1"}
        [:span {:class "text-grey-darker text-sm font-light"} "03 "]
        [:span {:class "text-black text-base"} "BKK"]]
       [:div
        [:p {:class "text-black text-base font-bold"} "$12.34 "]
        [:p {:class "text-grey-darker text-sm"} "/ month"]]]]
     [:li {:class (str style/outer-margin " py-3 border-t")}
      [:a {:href "#" :class "no-underline flex justify-between items-center bg-img-chevron bg-pos-x-right bg-pos-y-center bg-no-repeat pr-6"}
       [:p {:class "pr-1"}
        [:span {:class "text-grey-darker text-sm font-light"} "04 "]
        [:span {:class "text-black text-base"} "BKK"]]
       [:div
        [:p {:class "text-black text-base font-bold"} "$12.34 "]
        [:p {:class "text-grey-darker text-sm"} "/ month"]]]]
     [:li {:class (str style/outer-margin " py-3 border-t")}
      [:a {:href "#" :class "no-underline flex justify-between items-center bg-img-chevron bg-pos-x-right bg-pos-y-center bg-no-repeat pr-6"}
       [:p {:class "pr-1"}
        [:span {:class "text-grey-darker text-sm font-light"} "05 "]
        [:span {:class "text-black text-base"} "BKK"]]
       [:div
        [:p {:class "text-black text-base font-bold"} "$12.34 "]
        [:p {:class "text-grey-darker text-sm"} "/ month"]]]]
     [:li {:class (str style/outer-margin " border-t")}
      [:a {:href "#" :class "no-underline flex"}
       [:p {:class "py-6 text-blue-dark text-sm"} "Show 10 more listings"]]]]]])


(rum/defc Notes []
  [:div {:class "bg-grey-light pb-2"}
   [:section {:class (str style/zoomed-font " bg-white py-3")}
    [:p {:class (str style/outer-margin " font-normal text-sm text-grey-dark")}
     "Please note that all rental figures are approximations based upon third party submissions to NE.
      These figures are given to the NE users for the purpose of generalized comparison only."]]])


(rum/defc ItemDetailsHeader []
  [:div {:class "bg-grey-light py-2"}
   [:section {:class (str style/zoomed-font " bg-white")}
    [:header {:class (str style/outer-margin " py-3")}
     [:span {:class "text-xl font-bold text-black"}
      "[3] bedrooms [rental/apartment] [in Neighborhood Name/near University Name]"]]
    [:section {:class (str style/outer-margin " text-black pb-3 font-normal")}
     [:p {:class "flex items-center"}
      ;; TODO: pick more appropriate icon?
      [:span {:class "bg-img-chevron bg-no-repeat bg-left pl-6 h-3"}]
      [:span "3 bedrooms, 2 bathrooms, size 10m x 16m"]]
     ;; TODO: add a marker icon?
     [:p {:class "flex items-center mt-2"}
      [:span {:class "bg-img-chevron bg-no-repeat bg-left pl-6 h-3"}]
      [:span "St. 2 Phum Thmey, Dangkao, Dangkao, Phnom Penh"]]]
    [:section {:class (str style/outer-margin " pb-3")}
     [:div {:class "border p-3"}
      [:p {:class "text-grey-darker font-normal text-sm my-2"} "Rent from this property description"]
      [:p
       [:span {:class "text-black font-bold text-4xl"} "$15.21"]
       [:span {:class "text-grey-darker font-normal text-lg"} " per month" [:sup "*"]]]
      [:p {:class "my-2"}
       [:span {:class "bg-green-lightest p-1"} "▲ 4% above area average"]
       [:span {:class "bg-img-money bg-no-repeat bg-left ml-1 pl-6"}]]]
     [:div {:class "border border-t-0 p-3"}
      [:p {:class "text-grey-darker font-normal text-sm my-2"}
       [:span {:class "bg-img-money bg-no-repeat bg-left pl-6"}]
       "Area average rent for similar properties"]
      [:p
       [:span {:class "text-black font-bold text-3xl"} "$15.21"]
       [:span {:class "text-grey-darker font-normal text-lg"} " per month" [:sup "**"]]]]]
    [:section {:class (str style/outer-margin " py-3 flex")}
     [:a {:href  "#"
          :class "no-underline text-blue-dark text-center w-full border-2 rounded-full border-blue-dark p-3"}
      "Get more details"]]
    [:section {:class (str style/outer-margin " py-3")}
     [:div {:class "border rounded p-3 bg-grey-lighter"}
      [:p {:class "text-grey-darker font-normal"}
       [:sup "*"]
       [:span "Updated on 03/01/2019."]]
      [:p {:class "text-grey-darker font-normal"}
       [:sup "**"]
       [:span "Average rent is estimated from 99029 data points on NE."]]]]]])


(rum/defc ItemComparison []
  [:div {:class "bg-grey-light pb-2"}
   [:section {:class (str style/zoomed-font " bg-white")}
    [:header {:class (str style/outer-margin " pt-3 text-lg font-bold text-black")}
     [:span {:class "bg-img-cup bg-no-repeat bg-left pl-8"} "Comparison"]]
    [:div {:class (str style/outer-margin " pb-3 flex justify-around items-center")}
     [:div {:class "w-2/5 flex flex-col items-center"}
      [:div {:class "w-16 h-16 p-2"}
       [:div {:class "bg-img-building bg-no-repeat bg-contain w-full h-full"}]]
      [:span {:class "w-4/5 truncate text-sm font-normal"}
       "[3] bedrooms [rental/apartment] [in Neighborhood Name/near University Name]"]]
     [:span {:class "text-sm font-bold text-grey-dark"} "vs."]
     [:div {:class "w-2/5 flex flex-col items-center"}
      [:div {:class "bg-img-folder bg-no-repeat bg-contain w-16 h-16"}]
      [:span {:class "text-sm font-normal"}
       "area average"]]]
    [:div {:class (str style/outer-margin " pb-3")}
     [:table {:class "w-full"}
      [:tbody
       [:tr
        [:th]
        [:td
         [:div {:class "bg-img-building bg-no-repeat bg-contain w-6 h-6 mx-auto"}]]
        [:td]
        [:td
         [:div {:class "bg-img-folder bg-no-repeat bg-contain w-8 h-8 mx-auto"}]]]
       [:tr
        [:th {:class "w-auto text-left py-1"}
         [:span {:class "text-sm font-normal"} "Bedrooms"]]
        [:td {:class "w-8 text-center"}
         [:span {:class "text-sm font-normal"} "3"]]
        [:td {:class "w-4 text-center"}
         [:div {:class "bg-img-star bg-no-repeat bg-contain w-4 h-4"}]]
        [:td {:class "w-8 text-center"}
         [:span {:class "text-sm font-normal"} "1"]]]
       [:tr
        [:th {:class "w-auto text-left py-1"}
         [:span {:class "font-normal font-bold"}
          [:span {:class "text-sm font-normal"} "Bathrooms"]]]
        [:td {:class "w-8 text-center"}
         [:span {:class "text-sm font-normal"} "2"]]
        [:td {:class "w-4 text-center"}
         [:div {:class "bg-img-star bg-no-repeat bg-contain w-4 h-4"}]]
        [:td {:class "w-8 text-center"}
         [:span {:class "text-sm font-normal"} "1"]]]
       [:tr
        [:th {:class "w-auto text-left py-1"}
         [:span {:class "font-normal font-bold"}
          [:span {:class "text-sm font-normal"} "Bathrooms"]]]
        [:td {:class "w-8 text-center"}
         [:span {:class "text-sm font-normal"} "2"]]
        [:td {:class "w-4 text-center"}
         [:div {:class "bg-img-star bg-no-repeat bg-contain w-4 h-4"}]]
        [:td {:class "w-8 text-center"}
         [:span {:class "text-sm font-normal"} "1"]]]
       [:tr
        [:th {:class "w-auto text-left py-1"}
         [:span {:class "font-normal font-bold"}
          [:span {:class "text-sm font-normal"} "Bathrooms"]]]
        [:td {:class "w-8 text-center"}
         [:span {:class "text-sm font-normal bg-yellow-lighter px-1"} "2"]]
        [:td {:class "w-4 text-center"}
         [:div {:class "bg-img-star bg-no-repeat bg-contain w-4 h-4"}]]
        [:td {:class "w-8 text-center"}
         [:span {:class "text-sm font-normal"} "1"]]]
       [:tr
        [:th {:class "w-auto text-left py-1"}
         [:span {:class "font-normal font-bold"}
          [:span {:class "text-sm font-normal"} "Bathrooms"]]]
        [:td {:class "w-8 text-center"}
         [:span {:class "text-sm font-normal"} "2"]]
        [:td {:class "w-4 text-center"}
         [:div {:class "bg-img-star bg-no-repeat bg-contain w-4 h-4"}]]
        [:td {:class "w-8 text-center"}
         [:span {:class "text-sm font-normal bg-yellow-lighter px-1"} "5"]]]]]]]])


(rum/defc Index [text]
  [:div
   (Header)
   (ItemDetailsHeader)
   (ItemComparison)
   (ListingsInArea)
   (Neighborhoods)
   (Notes)
   (Language)
   (Footer)])

(rum/defc DetailsPage [text]
  [:div
   (Header)
   (ItemDetailsHeader)
   (ItemComparison)
   (ListingsInArea)
   (Neighborhoods)
   (Notes)
   (Language)
   (Footer)])

(rum/defc AreaPage [text]
  [:div
   (Header)
   (AreaHeader)
   (ExplainAreaStats)
   (ListingsInArea)
   (Neighborhoods)
   (Notes)
   (Language)
   (Footer)])


(rum/defc Home [text]
  [:div
   (Header)
   (PopularLocation)
   (Neighborhoods)
   (Language)
   (Footer)])

(ns om-0-5-0-tut.core.core
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]))

(enable-console-print!)

(def app-state (atom {:text "Hello world!"}))

(om/root
  (fn [app owner]
    (dom/h2 nil (:text app)))
  app-state
  {:target (. js/document (getElementById "app"))})

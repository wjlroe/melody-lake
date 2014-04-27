(ns melody-lake.core
  (:require-macros [cljs.core.async.macros :refer [go]])
  (:require [goog.dom :as dom]
            [goog.style :as style]
            [goog.Timer]
            [goog.events :as events]
            [goog.events.KeyCodes :as kcs]
            [goog.events.EventType :as event-type]
            [cljs.core.async :refer [put! chan <!]]))



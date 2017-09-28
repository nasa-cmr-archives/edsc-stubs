(ns cmr-edsc-stubs.data.sources
  (:require
   [clojure.java.io :as io]
   [cmr-edsc-stubs.util :as util]))

(def services-dir (util/get-file "data/services" :obj))
(def variables-dir (util/get-file "data/variables" :obj))

(defn get-ges-disc-provider
  ([]
    (get-ges-disc-provider :data))
  ([as-data]
    (util/get-file "data/providers/GES_DISC.json" as-data)))

(defn get-ges-disc-airx3std-collection
  ([]
    (get-ges-disc-airx3std-collection :xml))
  ([file-type]
    (case file-type
      :json (util/get-file "data/collections/GES_DISC/AIRX3STD_006.json")
      :xml (util/get-file "data/collections/GES_DISC/AIRX3STD_006.xml"))))

(defn get-ges-disc-airx3std-opendap-service
  []
  (util/get-file "resources/data/services/GES_DISC/AIRX3STD/OPeNDAP.json"))

(defn get-ges-disc-airx3std-ch4-variables
  []
  (util/get-files "resources/data/variables/GES_DISC/AIRX3STD/CH4"))
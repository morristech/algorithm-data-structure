(ns algorithm-data-structure.data-structures.doubly-linked-list-node)

(defn create
  ([value] (create value (atom nil) (atom nil)))
  ([value next] (create value next (atom nil)))
  ([value next previous]
   {:value value
    :next next
    :previous previous}))

(defn ->string [dlln callback]
  (if callback
    (callback (:value dlln))
    (str (:value dlln))))
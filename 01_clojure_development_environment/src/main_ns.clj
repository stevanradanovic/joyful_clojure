(ns main_ns)

(def my-name "Stevan Radanovic")

(defn hello-message
  [name]
  (str "Hello " name))

(defn -main
  [& args]
  (println (hello-message my-name))
  (println "test"))

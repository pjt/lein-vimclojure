(ns leiningen.vimclojure)

(defn eval-in-project
  "Support eval-in-project in both Leiningen 1.x and 2.x."
  [project form]
  (let [[eip two?] (or (try (require 'leiningen.core.eval)
                            [(resolve 'leiningen.core.eval/eval-in-project)
                             true]
                            (catch java.io.FileNotFoundException _))
                       (try (require 'leiningen.compile)
                            [(resolve 'leiningen.compile/eval-in-project)]
                            (catch java.io.FileNotFoundException _)))]
    (eip project form)
    #_(if two?
      (eip project form)
      (eip project form))))

(defn vimclojure 
  "Launch a Vimclojure nailgun server."
  ([project port]
   (eval-in-project 
     (update-in project [:dependencies]
                conj ['vimclojure/server "2.3.1"])
     `(vimclojure.nailgun.NGServer/main (into-array [~port]))))
  ([project] (vimclojure project "127.0.0.1")))

# Warning: Don't Use This

This project isn't supported for general use. (I use it to install the plugin locally, & I don't push anything to Clojars.) 
A better choice for a lein vimclojure plugin is [lein-tarsier](https://github.com/sattvik/lein-tarsier), which is actively 
developed & supported. 

# lein-vimclojure

Leiningen plugin for launching a Vimclojure nailgun server. The version number of
lein-vimclojure corresponds to the version of Vimclojure it launches. 

## Usage

If on lein 2, add

   `[org.clojars.pjt/vimclojure "2.3.1"]`

to your `:plugins` list in your `:user` profile in `~/.lein/profiles.clj`. 

If on lein 1, run

   `lein plugin install org.clojars.pjt/vimclojure "2.3.1"`

To start the server, call 

   `lein vimclojure &`

within your project's directory.

/**
 * Created by GP on 2/24/2017.
 */
println "Hello World"

def x = "World"
println "Hello, $x"

def gs = "Hello, $x"

println gs

def m = "Groovy is groovy" =~ /(G|g)roovy/
println m[0][0] // The first whole match (i.e. the first word Groovy)
println m[0][1] // The first group in the first match (i.e. G)
println m[1][0] // The second whole match (i.e. the word groovy)
println m[1][1] // The first group in the second match (i.e. g)


map = ['key1':'value1', 'key2':'value2']
println map.collect { return it }
println map.collectEntries {return it}
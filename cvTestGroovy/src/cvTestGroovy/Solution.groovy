package cvTestGroovy

def countElements(List list) {
    list.groupBy { it }.collectEntries { [(it.key): it.value.size()] }
}

def array = [1, 3, 4, 5, 1, 5, 4]
def counts = countElements(array)
println counts
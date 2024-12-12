def list = [1, 2, 3]

def addOneToList(list) {
  def newList = new ArrayList(list) // Create a copy
  newList.add(4)
  return newList
}

def list2 = addOneToList(list) 
println list
println list2
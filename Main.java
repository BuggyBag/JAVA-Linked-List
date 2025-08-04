class Main {
  public static void main(String[] args) {
    
    System.out.println("\n\n\t Linked Lists \n\n");
  
    SimpleList list = new SimpleList('a');
  
    //insert in the list   ////       it is possible --> SimpleList list_2 = list.insert(char);
    list.insert('b');
    list.insert('c');
    list.insert('d');
    list.insert('e');
    list.insert('f');

    list.display();

    SimpleList listFound;
    
    //search in the list
    listFound = list.find('b');
    System.out.println("Search for b: " + listFound.getInfo() + "\n");
    listFound = list.find('d');
    System.out.println("Search for d: " + listFound.getInfo() + "\n");
    if (list.find('z') != null) {
      listFound = list.find('z');
      System.out.println("Search for z: " + listFound.getInfo() + "\n");
    } else {
      System.out.println(" This value does not exist.\n");
    }

    //access the list
    listFound = list.get(3);
    System.out.println("Third node in list: " + listFound.getInfo() + "\n");
    listFound = list.get(2);
    System.out.println("Second node in list: " + listFound.getInfo() + "\n");
    if (list.get(6) != null) {
      listFound = list.get(6);
      System.out.println("Sixth node in list: " + listFound.getInfo() + "\n");
    } else { 
      System.out.println(" The position is not in the list. \n");
    }
    
    if (list.get(7) != null){
      System.out.println("Seventh node in list: " + listFound.getInfo() + "\n");
    } else {
      System.out.println(" The position is not in the list. \n");
    }

    listFound = list.get(-10);
    System.out.println("Node in list: " + listFound.getInfo() + "\n");

    listFound = list.find('d');

    try{
      list.delete(listFound);
    } catch(Exception e) {
        System.out.println(e.getMessage());
    }
      
    list.display();
      
  }
}

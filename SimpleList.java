public class SimpleList {
  private char info;
  private SimpleList link;

  public SimpleList(char c){
    info = c;
  }

  public char getInfo(){ return info; }

  public SimpleList getLink(){ return link; }
  
  public SimpleList insert (char c){

    SimpleList node = new SimpleList(c);
    node.link = this;
    
    return node;
  }

  
  public void delete (SimpleList x) throws Exception{

    SimpleList node, pred = null;
      
    //check if list is empty
    if (this == null){
      throw new Exception("List is empty");
    }
      
    //start search for node x
    node = this;
  
    while (node != null && node != x){
      //go to the next node
      pred = node;
      node = node.link;
    };
    
    // node was found?
    if (node == null){
      throw new Exception("Node not found");
    }
  
    //delete node
    if (this == x){
      node = node.link;  
    } else {
      pred.link = x.link;
    }

  }
  
  
  public SimpleList find (char value){

    //Initialize the node find with info
    SimpleList node = this;
    
    while (node != null) {
      //Check if it is the node
      if (node.info == value)
        return node;
      //Go to the next node
      node = node.link;
    }
    // The node with info is not in the list
    System.out.println("Not is not in the list \n");
    return null;
  }

  SimpleList get(int position) {

    // precondition validation
    if (position-1 < 0){
      System.out.println("\n The position is not in the list. \n");
      return null;
    }
  
    // Initialize the node search
    SimpleList node = this;
    
    for(int i = 0; i < position-1; i++) {
      // Check if there are more nodes
    
      if (node == null){
        System.out.println(" The position is not in the list. \n");
        return null;
      }
      
      // Go to the next node
      node = node.link;
    }
    
    // Return node at position P
    return node;
  }

  public void display(){

    SimpleList node = this;
    
    while (node != null){
      System.out.println("\n" + node.info);
      node = node.link;
    }
  
    System.out.println("\n");
  }
  
}
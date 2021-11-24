class Sugar extends Cookie{
  String shape;
  boolean decorated;

  Sugar(){
    shape = "";
    decorated = false;

  }
  Sugar(String aShape, boolean aDecorated){
    shape = aShape;
    decorated = aDecorated; 
  }
  String getShape(){
    return shape;
  }
  void setShape(String bShape){
    shape = bShape;
  }
  void cutShapes(String bShape, int numCut){
    super.setCookies(numCut);
    System.out.println(numCut + " cookies were cut into" + shape);
  }
  void decorate(){
    if(baked = true){
      decorated = true;
      System.out.println("The cookies were decorated");
    }
    if(baked = false){
      System.out.println("Make sure the cookies are decorated first");
    }
  }
}
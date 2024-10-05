public class ChickenJoy extends Food{
  private int pieces;
  private boolean hasGravy;


  //Constructors
  
    //No-argument
  public ChickenJoy(){
    super("4 Piece Chickenjoy", 2.67*4, false, true);
    pieces = 4;
    
    hasGravy = false;
    
  }
  

    //Parameters
  public ChickenJoy(String name, double price, boolean isTakeOut, boolean hasFries, int pieces, boolean hasGravy){
    super(name, 2.67*pieces, isTakeOut, hasFries);
    this.pieces = pieces;
    this.hasGravy = hasGravy;
  }
  
  //Accessor and Mutator Methods
  public int getPieces(){
    return pieces;
  }
  public void setPieces(int pieces){
    this.pieces = pieces;
  }

  public boolean getHasGravy(){
    return hasGravy;
  }
  public void setHasGravy(boolean hasGravy){
    this.hasGravy = hasGravy;
  }


  public String toString(){
    String text = "";
    if(hasGravy == true){
      text = "With Gravy";
    }else{
      text = "Without Gravy";
    }
    return super.toString() + "\nPieces: " + pieces + "\n" + text;
  }

  
}
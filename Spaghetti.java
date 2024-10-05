public class Spaghetti extends Food{
  
  //Instance Variables
  private String familyPartyNormal;
  private boolean hasCheese;
  private boolean hasHotdog;



  //Constructor Methods
  
    //No-argument
  public Spaghetti(){
    super("Normal size", 6.99, false, false);
    familyPartyNormal = "normal";
    hasCheese = true;
    hasHotdog = true;
  }

    //Parameterized
  public Spaghetti(String name, double price, boolean isTakeOut, boolean hasFries, String familyPartyNormal, boolean hasCheese, boolean hasHotdog){
    super(name, 6.99, isTakeOut, hasFries);
    this.familyPartyNormal = familyPartyNormal;
    this.hasCheese = hasCheese;
    this.hasHotdog = hasHotdog;
    
    if(name.equals("Normal size")){
      setPrice(6.99);
    } else if(name.equals("Family size")){
      setPrice(17.99);
    } else if(name.equals("Party size")){
      setPrice(44.99);
    }
    
    
    this.familyPartyNormal = familyPartyNormal;
    this.hasCheese = hasCheese;
    this.hasHotdog = hasHotdog;
  }

  //Accesor and Mutator Methods

  public String getFamilyPartyNormal(){
    return familyPartyNormal;
  }
  public void setFamilyPartyNormal(String familyPartyNormal){
    this.familyPartyNormal = familyPartyNormal;
  }
  
  public boolean getHasCheese(){
    return hasCheese;
  }
  public void setHasCheese(boolean hasCheese){
    this.hasCheese = hasCheese;
  }
  
  public boolean getHasHotdog(){
    return hasHotdog;
  }
  public void setHasHotdog(boolean hasHotdog){
    this.hasHotdog = hasHotdog;
  }
  
    String text1;
    String text2;
  
  public String toString(){
    
    if(hasCheese == true){
      text1 = "With cheese";
    } else{
      text1 = "Without cheese";
    }
    if(hasHotdog == true){
      text2 = "With hotdog";
    } else {
      text2 = "Without hotdog";
    }
    
    return super.toString() + "\nSize: " + familyPartyNormal + "\n" + text1 + "\n" + text2;
  }
  
  



  
}
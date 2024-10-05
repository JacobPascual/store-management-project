public class Food {
  //Instance Variables
  private String name;
  private double price;
  private boolean isTakeOut;
  private boolean hasFries;


  //Constructor Methods
    //No-Argument
  public Food(){
    name = "no order";
    price = 0.00;
    isTakeOut = false;
    hasFries = false;
  }
    //Parameterize
  public Food(String name, double price, boolean isTakeOut, boolean hasFries){
    this.name = name;
    this.price = price;
    this.isTakeOut = isTakeOut;
    this.hasFries = hasFries;
  }
  //Accessor and Mutator Methods
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }

  
  public double getPrice(){
    return price;
  }
  public void setPrice(double price){
    this.price = price;
  }


  public boolean getIsTakeOut(){
    return isTakeOut;
  }
  public void setIsTakeOut(boolean isTakeOut){
    this.isTakeOut = isTakeOut;
  }

  public boolean getHasFries(){
    return hasFries;
  }
  public void setHasFries(boolean hasFries){
    this.hasFries = hasFries;
  }
  

  //toString Method Ovverride
  public String toString(){
    String text = "";
    String text2 = "";
    if (isTakeOut == false){
      text = "Eat In";
    } else{
      text = "Take Out";
    }
    if (hasFries == false){
      text2 = "No Fries";
    } else{
      text2 = "With Fries";
    }
    return name + "\n" + text2 + "\nPrice: " + price + "$\n" + "Location: " + text;
  }

  //Other Methods








  
}
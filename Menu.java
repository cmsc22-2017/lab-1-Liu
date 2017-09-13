interface IMenu{}

 class MenuInfo{
    
   String name;
   int price;
   
   MenuInfo(String name, int price){
    
     this.name = name;
     this.price = price;
     
   }
 } 

 class Soup implements IMenu{
  
  boolean isVeg;
  MenuInfo menu;
   
  Soup(boolean isVeg, MenuInfo menu){
    
   this.isVeg = isVeg;
   this.menu = menu;
    
   }
 } 
 
 class Salad implements IMenu{
 
  String dressing;
  boolean isVeg;
  MenuInfo menu;
 
  Salad(String dressing, boolean isVeg, MenuInfo menu){
   this.dressing = dressing;
   this.isVeg = isVeg;
   this.menu = menu;
  }
 }
 
 class Sandwich implements IMenu{
  
   String fillingA;
   String fillingB;
   MenuInfo menu;
   
   Sandwich(String fillingA, String fillingB, MenuInfo menu){
    
     this.fillingA = fillingA;
     this.fillingB = fillingB;
     this.menu = menu;
   
   }
 }
 
 
 class ExampleMenu{
 
  MenuInfo soupA = new MenuInfo("Sabaw", 5);
  MenuInfo soupB = new MenuInfo("Nilaga", 4);
  
  MenuInfo sandwichA = new MenuInfo("Tuna", 3);
  MenuInfo sandwichB = new MenuInfo("Ham", 2);
  
  MenuInfo saladA = new MenuInfo("Greek", 1);
  MenuInfo saladB = new MenuInfo("Chicken", 1);
  
  
  
  IMenu sabaw = new Soup(false, this.soupA);
  IMenu nilaga = new Soup(true, this.soupB);
  
  IMenu greek = new Salad("Lime", true, this.saladA);
  IMenu chicken = new Salad("Kewpie", false, this.saladB);
 
  IMenu tuna = new Sandwich("PB", "Jelly", this.sandwichA);
  IMenu ham = new Sandwich("Ham", "Cheese", this.sandwichB);
  
 }
 



interface ATI{}

class Human implements ATI{

  String name;
  ATI mom;
  ATI dad;
  
  Human(String name, ATI mom, ATI dad){
    
    this.name=name;
    this.mom=mom;
    this.dad=dad; 
  
  }

}

class Unknown implements ATI{
   
  Unknown(){}
}




class ExHuman{

ATI unknown = new Unknown();
ATI anEn = new Human("An-En", this.unknown, this.unknown);
ATI chiTah = new Human("Chi Tah", this.unknown, this.unknown);
ATI ern = new Human("Ernesto", this.unknown, this.unknown);
ATI nil = new Human("Nilda", this.unknown, this.unknown);
ATI may = new Human("May", this.nil, this.ern);
ATI chienTing = new  Human("Chien Ting", this.chiTah, this.anEn);
ATI me = new Human("May-En", this.chienTing, this.may);
}
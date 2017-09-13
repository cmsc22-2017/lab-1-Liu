class Person{

 String name;
 int age;
 String gender;
 PersonAddress loc;

 Person(String name, int age, String gender, PersonAddress loc){
  this.name = name;
  this.age = age;
  this.gender = gender;
  this.loc = loc;
 
 }
} 
 
 class PersonAddress{
 
  String city;
  String state;
  
  PersonAddress(String city, String state){
   
    this.city = city;
    this.state = state;
    
  }
 
 }
 


class ExamplePerson{

 PersonAddress tim1 = new PersonAddress("Warwick", "RI");
 PersonAddress pat1 = new PersonAddress("Boston", "MA");
 PersonAddress kim1 = new PersonAddress("Boston", "MA");
 PersonAddress dan1 = new PersonAddress("Nashua", "NH");
 
 Person tim = new Person("Tim", 20, "M", this.tim1);
 Person pat = new Person("Pat", 19, "F", this.pat1);
 Person kim = new Person("Kim", 17, "F", this.kim1);
 Person dan = new Person("Dan", 22, "M", this.dan1);
}
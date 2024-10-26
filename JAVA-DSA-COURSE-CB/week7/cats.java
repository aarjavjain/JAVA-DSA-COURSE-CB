package week7;

public class cats {
    String name;
    String colour;
    String breed;

// default constructor
public cats(){
this.name ="billa";
this.colour="black";
this.breed="indian";
};
//custom constructor 
public cats(
 String name,
 String colour,
 String breed

){
    this.name= name ;
    this.colour=colour;
    this.breed=breed;
}

void catcall(){
    System.out.println(this.name+" says meow");
}
}

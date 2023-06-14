package d2;
import d1.OtherPackSubClass;

public class OtherPackTakingOtherSubClassReference extends d1.OtherPackSubClass  {
    public static void main(String[] args){
        com.ForAccess t1=new com.ForAccess();
        //System.out.println(t1.i);    //error: i has private access in ForAccess
        //System.out.println(t1.j);      //error: j is not public in ForAccess; cannot be accessed from outside package
        //System.out.println(t1.k);      //k has protected access in ForAccess. 
        // It's not giving error because of it is protected in ForAccess. we are in subclass;
        // It's giving error because we are using Parent Class reference.
        System.out.println(t1.l);

        d2.OtherPackTakingOtherSubClassReference t2=new d2.OtherPackTakingOtherSubClassReference();
        System.out.println(t2.k);
        d1.OtherPackSubClass p4=new d1.OtherPackSubClass(); 
        //System.out.println(p4.t3.k);
    }
    
}


package pato;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly(){
       System.out.println("Não voa!");
    }
}

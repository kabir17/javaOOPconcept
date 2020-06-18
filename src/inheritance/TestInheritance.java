package inheritance;

public class TestInheritance {
    public static void main(String[] args) {

        Parents parents = new Parents();
        parents.height();
        parents.humanBody();
        parents.overAge();

       Children child = new Children();
       child.height();
       child.sportsSkill();
       child.humanBody();
       child.overAge();

       GreatGrandChild obj = new GreatGrandChild();
       obj.teenage();
       obj.humanBody();
    }
}

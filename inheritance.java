//oops
//in oops we had prior discussion about object, class and encapsulation let's discuss some more oops concepts 
//inheritance is feature by virtue of which sub class can access the feature of super class
public class inheritance {

    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(8,7);
        int r2 = obj.sub(7,7);
        int r3 = obj.multi(7,7);
        int r4 = obj.div(4,2);
        System.out.println(r1 + "\n" + r2 + "\n" + r3 + "\n" + r4);
        
    }
}
//here AdvCalc(sub class) is inheriting Calc(super class) and it is called as single inheritance or 
//single level inheritance
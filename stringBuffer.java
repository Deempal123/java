//String
//Mutable -> change
//immutable -> unchange
//if we are using normal string in java it will be immutable but what if we want a mutable string now here it come up with a concept "String Buffer and String Builder"
//if we talk about StringBuffer it is actually providing a buffer of 16 bytes which is mutable

//StringBuffer vs StringBuilder
//sbf is thread safe where as sbl is not
public class stringBuffer {
    public static void main(String ar[])
    {
        StringBuffer sb = new StringBuffer("Deempal");
        sb.append(" Kumari");
        String str = sb.toString(); //converting stringBuffer to a string so that we can store stringBuffer in type string
        sb.insert(8,"java ");
        System.out.println(sb);
    }
}

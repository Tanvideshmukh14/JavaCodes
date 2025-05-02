package StringsInJava;

public class Example5 {
    public static void main(String[] args)
    {
        String data = "Sample S";
        char x = data.charAt(4);
        System.out.println(x);

        int x1 = data.indexOf("e");
        System.out.println(x1);

        String d1 = "";
        boolean result = d1.isEmpty(); //declaration of variable result
        System.out.println("Empty : " + result);

        String d2 = new String();
        result = d2.isEmpty();
//        System.out.println(d2.isEmpty());
        System.out.println(result);

        String d3 = new String("ABCCAB");
        result = d3.endsWith("CAB");
        System.out.println(result);

        String myData = "Hello my name is Tanvi.";

        String myName = new String("Tanvi");
        String myNameLS = "Tanvi";

        System.out.println(myName == myNameLS);

        int answer = myName.compareTo(myNameLS);
        System.out.println(answer);

        System.out.println(myName.compareTo(myNameLS));

        System.out.println(myName.equals(myNameLS));

        System.out.println(myName.hashCode());
        System.out.println(myNameLS.hashCode());

//        hashcode objects's id
//        hash function generates unique hashcode for unique input
//        via key-value pairs or indexing

        String data10 = "ABC";
        String data9 = "abc";

        String res = data10 + data9;
        System.out.println(res);
        res = data9.concat(data10);
        System.out.println(res);

            }
}
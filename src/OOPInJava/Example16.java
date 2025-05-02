package OOPInJava;

import com.sun.jdi.PathSearchingVirtualMachine;

// My First Enum
enum DAY
{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

class MyDayEnumTestClass
{
    //you can use enum as a data member of a class.
    //data member
    private  DAY d1;

    //constructor
    public MyDayEnumTestClass(){this.d1 = DAY.MONDAY;}
    public MyDayEnumTestClass(DAY d1){this.d1 = d1;}

    //GETTER AND SETTER

    public DAY getD1(){
        return this.d1;
    }
    public void setD1(DAY d1) {
        this.d1 = d1;
    }


    //Methods
    public void printDay()
    {
        switch(this.d1)
        {
            case MONDAY :
                System.out.println("Today is Monday");
                break;
            case TUESDAY :
                System.out.println("Today is Tuesday");
                break;
            case WEDNESDAY :
                System.out.println("Today is Wednesday");
                break;
            case THURSDAY :
                System.out.println("Today is Thursday");
                break;
            case FRIDAY :
                System.out.println("Today is Friday");
                break;
            case SATURDAY :
                System.out.println("Today is Saturday");
                break;
            case SUNDAY :
                System.out.println("Today is Sunday");
                break;
            default :
                System.out.println("Invalid Day");
        }


    }
    @Override
    public String toString()
    {
        return String.format("DAY d1 : " + d1);
    }
}
public class Example16 {
    public static void main(String[] args) {
        MyDayEnumTestClass test1 = new MyDayEnumTestClass();
        test1.printDay();
        MyDayEnumTestClass test2 = new MyDayEnumTestClass(DAY.FRIDAY);
        test2.printDay();

        MyDayEnumTestClass test3 = new MyDayEnumTestClass(null);

        DAY[] days = DAY.values();
        for (int i = 0;i<days.length; i++)
        {
            System.out.println(days[i]);
            System.out.println(days[i].ordinal());
            System.out.println(days[i].name());
        }
    }
}

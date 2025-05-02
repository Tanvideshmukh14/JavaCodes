package OOPInJava;
///Interface for grouping multiple smartphone object
interface ISmartPhone
{
    abstract void audioCall();
    abstract void smsText();
    abstract void  videoCall();
    abstract void  chat();
    abstract void camera();
    abstract void internet();

}

class AppleIphoneOne implements ISmartPhone
{  // concrete function
    @Override
    public void audioCall(){
        System.out.println("Apple AudioCall");
    }

    @Override
    public void smsText(){
        System.out.println("Apple smsText");
    }

    @Override
    public void videoCall(){
        System.out.println("Apple VideoCall");
    }

    @Override
    public void chat(){
        System.out.println("Apple Chat");
    }

    @Override
    public void camera(){
        System.out.println("Apple Camera");
    }

    @Override
    public void internet(){
        System.out.println("Apple Internet");
    }
}

///Whenever we use interface Java forces us to implement abstract functions
class OppoSmartA1 implements ISmartPhone{

    @Override
    public void audioCall() {
        System.out.println("Oppo AudioCall");
    }

    @Override
    public void smsText() {
        System.out.println("Oppo Sms");
    }

    @Override
    public void videoCall() {
        System.out.println("Oppo VideoCall");
    }

    @Override
    public void chat() {
        System.out.println("Oppo Chat");
    }

    @Override
    public void camera() {
        System.out.println("Oppo Camera");
    }

    @Override
    public void internet() {
        System.out.println("Oppo Internet");
    }
}

class Samsung implements ISmartPhone{

    @Override
    public void audioCall() {
        System.out.println("Samsung AudioCall");
    }

    @Override
    public void smsText() {
        System.out.println("Samsung SmsText");
    }

    @Override
    public void videoCall() {
        System.out.println("Samsung VideoCall");
    }

    @Override
    public void chat() {
        System.out.println("Samsung Chat");
    }

    @Override
    public void camera() {
        System.out.println("Samsung Camera");
    }

    @Override
    public void internet() {
        System.out.println("Samsung Internet");
    }
}
public class Example15 {
    public static void main(String[] args) {
        AppleIphoneOne appleIphoneOne = new AppleIphoneOne();
        OppoSmartA1 oppoSmartA1 = new OppoSmartA1();
        Samsung samsung = new Samsung();

        appleIphoneOne.audioCall();
        appleIphoneOne.videoCall();

        ///Method OverShadowing in Java
        ISmartPhone apple = new AppleIphoneOne();
        Object apple1 = new AppleIphoneOne();

        ISmartPhone oppo =new OppoSmartA1();
        oppo.audioCall();
        oppo.videoCall();

        ISmartPhone samsung1 = new Samsung();
        samsung1.videoCall();
        samsung1.audioCall();

    }
}

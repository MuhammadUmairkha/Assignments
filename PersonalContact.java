public class PersonalContact extends Contact
{
    private String DateOfBirth;
    PersonalContact(String firstName,String lastName,String address,String phoneNumber,String emailAddress,String DateOfBirth)
    {
        super(firstName,lastName,address,phoneNumber,emailAddress);
        this.DateOfBirth=DateOfBirth;
    }
    //override
    public String toString()
    {
        String Str ="\n";
        Str = Str+super.toString();
        Str = Str+DateOfBirth;
        Str=Str+"\n===================";
        return Str;
    }
    public static void main(String[]args)
    {
        PersonalContact PC1=new PersonalContact("Muhammad","Umair","Saryab road quetta","03468329875","umairkhan230@gmail.com","15/12/2000");
        System.out.println(PC1);
    }
}



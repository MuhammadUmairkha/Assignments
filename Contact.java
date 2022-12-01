public class Contact
{
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    Contact( String firstName, String lastName, String address, String phoneNumber, String emailAddress)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String toString()
    {
        String Str="\n===================";
        Str = Str +"\n"+firstName+"\n"+lastName+"\n"+address+"\n"+phoneNumber+"\n"+emailAddress+"\n";
        return Str;
    }

    public static void main(String[] args)
    {
        Contact C1 = new Contact( "Muhammad", "Umair", "ArifStreetSaryabRoadQuetta", "0346589896", "umairkhan234@gmail.com");
        System.out.println(C1);
    }
}

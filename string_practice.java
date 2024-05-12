public class string_practice 
{
    public static void main(String[] args) 
    {
        String str = "Good Morning!";
        str = str.toLowerCase();
        System.out.println(str);

        str = str.replace(" ", "_");
        System.out.println(str);

        String sent = "Hello Mr. name, how can I assist you today?";
        sent = sent.replace("name", "Pandya");
        System.out.println(sent);

        String letter = "Dear Anmol,\n\t Hope you are doing well. We just wanted to tell you nothing.\n\nThanks & Regards,\nIMA Bank";
        System.out.print(letter);      
    }
}
class user{
    String username;
    String repository;
    String branch;

    public void push()
    {
        System.out.println("Application has been pushed.");
    }
    public void fork()
    {
        System.out.println("Repository has been forked!");
    }
    public void username()
    {
        System.out.println(this.username);
    }
}

public class github {
    public static void main(String[] args) {
        user Anmol = new user();
        user Rajeev = new user();

        Anmol.username = "anmoll";
        Anmol.repository = "cave";
        Anmol.branch = "main";

        Rajeev.username = "rk1";
        Rajeev.repository = "all";
        Rajeev.branch = "main";

        Anmol.push();
        Rajeev.fork();
        Anmol.username();
    }
}
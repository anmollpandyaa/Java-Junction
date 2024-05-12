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
    public void repository()
    {
        System.out.println(this.repository);
    }
    public void branch()
    {
        System.out.println(this.branch);
    }
    //this is a parametrized constructer, it takes parameters to construct a object
    user(String username, String repository, String branch)
    {
        this.username = username;
        this.repository = repository;
        this.branch = branch;
    }
}
public class parametrizedconst {
       public static void main(String[] args) {
        user Anmol = new user("anmoll", "cave", "main");
        user Rajeev = new user("rk1", "all", "main");

        Anmol.username();
        Rajeev.repository();
    }
}
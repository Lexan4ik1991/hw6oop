package HomeWork6;

public class ReportUser implements Reportable {
    User user;

    public ReportUser(User user) {
        this.user = user;
    }

    public void report(){

        System.out.println("Report for user: " + user.getName());
    }
}

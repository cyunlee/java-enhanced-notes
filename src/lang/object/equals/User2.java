package lang.object.equals;

public class User2 {
    private String userid;
    public User2(String userid) {
        this.userid = userid;
    }

    @Override
    public boolean equals(Object obj) {
        User2 user = (User2) obj;
        boolean result = userid.equals(user.userid);
        return result;
    }
}

package Login_.DB;

public class DB {
    private User user;
    private final MyList<User> userBase = new MyList<>();
    private final MyList<User> emailBase = new MyList<>();
    private final MyList<Telephone> telephoneBase = new MyList<>();
    private static DB instance = null;

    private DB() {
    }

    public static DB getInstance() {
        if (instance == null) {
            instance = new DB();
        }
        return instance;
    }

    public void setUser(User user) {
        if (!userBase.contains(user)) {
            userBase.add(user);
        } else {
            System.out.println("Siz allaqachon qo`shilgansiz !");
        }
    }

    public boolean checkPhone(User user) {
        return telephoneBase.contains(user.getTelephone());
    }

    public boolean setEmailAdress(User user) {
        for (int i = 0; i < emailBase.length(); i++) {
            if (!emailBase.equals(user.getUserEmail())) {
                emailBase.add(user);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "DB{" +
                "dbMyList=" + userBase +
                '}';
    }
}

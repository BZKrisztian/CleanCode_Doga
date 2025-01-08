/*
* File: Store.java
* Author: Batki Zoltan Krisztian
* Copyright: 2025, Batki Zoltan Krisztian
* Group: --
* Date: 2025-01-08
* Github: https://github.com/BZKrisztian
* Licenc: --
*/

public class Store {
    String user;
    String pass;
    String place;

    public Store(String user, String pass, String place) {
        this.user = user;
        this.pass = pass;
        this.place = place;
    }

    public String get_user() {
        return user;
    }
    public String get_pass() {
        return pass;
    }
    public String get_place() {
        return place;
    }
    

}

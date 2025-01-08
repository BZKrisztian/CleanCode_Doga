/*Refaktoralo: Batki Zoltan Krisztian*/
/*
* File: Store.java
* Author: Sallai András
* Copyright: 2024, Sallai András
* Group: szit
* Date: 2024-12-15
* Github: https://github.com/oktat/
* Licenc: MIT
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

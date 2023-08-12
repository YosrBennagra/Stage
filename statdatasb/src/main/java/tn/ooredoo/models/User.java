package tn.ooredoo.models;

import javax.persistence.*;

@Entity
@Table (name = "UTILISATEUR")
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String first_name;
    private String last_name;
    private String login;
    private String password;

    public User ( ) {
    }

    public User (Long id, String first_name, String last_name, String login, String password) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.login = login;
        this.password = password;
    }

    public Long getId ( ) {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public String getFirst_name ( ) {
        return first_name;
    }

    public void setFirst_name (String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name ( ) {
        return last_name;
    }

    public void setLast_name (String last_name) {
        this.last_name = last_name;
    }

    public String getLogin ( ) {
        return login;
    }

    public void setLogin (String login) {
        this.login = login;
    }

    public String getPassword ( ) {
        return password;
    }

    public void setPassword (String password) {
        this.password = password;
    }

    @Override
    public String toString ( ) {
        return "User{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
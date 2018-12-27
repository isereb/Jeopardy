package models;

import java.util.HashMap;
import java.util.Map;

public class User implements java.io.Serializable {

    private String username;
    private int balance;
    private Map<Question, AttemptState> attempts = new HashMap<>();

    public User() {
    }

    public User(String username, int balance) {
        this.username = username;
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Map<Question, AttemptState> getAttempts() {
        return attempts;
    }

    public void setAttempts(Map<Question, AttemptState> attempts) {
        this.attempts = attempts;
    }
}
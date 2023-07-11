package cowpearyield;
public class UserModel {
    private String full_name;
    private String username;
    private String password;
    private String email_address;
    // Constructor
    public UserModel(String full_name, String email_address, String username, String password) {
        this.full_name = full_name;
        this.password = email_address;
        this.username = username;
        this.password = password;
    }

    // Getters
    public String getFullName() {
        return full_name;
    }
    public String getEmailAddress(){
        return email_address;
    }
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    // Setters
    public void setFullName(String full_name) {
        this.full_name = full_name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setEmailAddress(String email_address){
        this.email_address = email_address;
    }
}

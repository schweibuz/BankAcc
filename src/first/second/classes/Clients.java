package first.second.classes;

import java.sql.Timestamp;

public class Clients {
    private int id;
    private String name;
    private String last_name;
    private String land;
    private String city;
    private String address;
    private String credit_card;
    private String phone;
    private String email;
    private String login;
    private String password;
    private Timestamp reg_date;
    private boolean valid;
    private boolean admin;
    private int salary;
    private int raise_salary;
    private int income;
    private String description;


    public Clients() {

    }

    public Clients(String login, String password) {
        this.setLogin(login);
        this.setPassword(password);
    }

    public Clients(String name, String last_name, String land,
                   String city, String address, String credit_card, String phone,
                   String email, String login, String password, Timestamp reg_date,
                   int salary, int raise_salary, int income, String description) {
        this.name = name;
        this.last_name = last_name;
        this.land = land;
        this.city = city;
        this.address = address;
        this.credit_card = credit_card;
        this.phone = phone;
        this.email = email;
        this.login = login;
        this.password = password;
        this.reg_date = reg_date;
        this.salary = salary;
        this.raise_salary = raise_salary;
        this.income = income;
        this.description = description;
    }

    public Clients(int id, String name, String last_name, String land,
                   String city, String address, String credit_card, String phone,
                   String email, String login, String password, Timestamp reg_date,
                   int salary, int raise_salary, int income, String description) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.land = land;
        this.city = city;
        this.address = address;
        this.credit_card = credit_card;
        this.phone = phone;
        this.email = email;
        this.login = login;
        this.password = password;
        this.reg_date = reg_date;
        this.salary = salary;
        this.raise_salary = raise_salary;
        this.income = income;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCredit_card() {
        return credit_card;
    }

    public void setCredit_card(String credit_card) {
        this.credit_card = credit_card;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getReg_date() {
        return reg_date;
    }

    public void setReg_date(Timestamp reg_date) {
        this.reg_date = reg_date;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getRaise_salary() {
        return raise_salary;
    }

    public void setRaise_salary(int raise_salary) {
        this.raise_salary = raise_salary;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Clients{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", land='" + land + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", credit_card=" + credit_card +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", reg_date='" + reg_date + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}' + '\n';
    }
}
package fr.uge.projetandroid.entities;
import java.io.Serializable;
import java.util.Collection;

public class User implements Serializable{

    private long id;

    private String login;

    private String lastName;

    private String firstName;

    private String email;

    private String password;

    private String phone;

    private String address;

    private String role;

    private String updatedAt;

    private String updatedBy;

    private Collection<Product> products;

    private Collection<Comment> comments;

    private Account account;

    private Collection<Notification> notifications;

    private Collection<Borrow> borrows;

    private  Collection<RequestBorrow> requestBorrows;

    private int totalNotification;

    private int totalProduitEmprunte;

    private int totalPanier;

    private int totalWishlist ;


    public User() {
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public User(long id, String login, String lastName, String firstName, String email, String password, String phone, String address, String role, String updatedAt, String updatedBy, Collection<Product> products, Collection<Comment> comments, Account account, Collection<Notification> notifications, Collection<Borrow> borrows, Collection<RequestBorrow> requestBorrows) {
        this.id = id;
        this.login = login;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.role = role;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
        this.products = products;
        this.comments = comments;
        this.account = account;
        this.notifications = notifications;
        this.borrows = borrows;
        this.requestBorrows = requestBorrows;
    }

    public User(long id, String login, String lastName, String firstName, String email, String password, String phone, String address, String role, String updatedAt, String updatedBy, Collection<Product> products, Collection<Comment> comments, Account account, Collection<Notification> notifications, Collection<Borrow> borrows, Collection<RequestBorrow> requestBorrows, int totalNotification, int totalProduitEmprunte, int totalPanier, int totalWishlist) {
        this.id = id;
        this.login = login;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.role = role;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
        this.products = products;
        this.comments = comments;
        this.account = account;
        this.notifications = notifications;
        this.borrows = borrows;
        this.requestBorrows = requestBorrows;
        this.totalNotification = totalNotification;
        this.totalProduitEmprunte = totalProduitEmprunte;
        this.totalPanier = totalPanier;
        this.totalWishlist = totalWishlist;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Collection<Product> getProducts() {
        return products;
    }

    public void setProducts(Collection<Product> products) {
        this.products = products;
    }

    public Collection<Comment> getComments() {
        return comments;
    }

    public void setComments(Collection<Comment> comments) {
        this.comments = comments;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Collection<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(Collection<Notification> notifications) {
        this.notifications = notifications;
    }

    public Collection<Borrow> getBorrows() {
        return borrows;
    }

    public void setBorrows(Collection<Borrow> borrows) {
        this.borrows = borrows;
    }

    public Collection<RequestBorrow> getRequestBorrows() {
        return requestBorrows;
    }

    public void setRequestBorrows(Collection<RequestBorrow> requestBorrows) {
        this.requestBorrows = requestBorrows;
    }

    public int getTotalNotification() {
        return totalNotification;
    }

    public void setTotalNotification(int totalNotification) {
        this.totalNotification = totalNotification;
    }

    public int getTotalProduitEmprunte() {
        return totalProduitEmprunte;
    }

    public void setTotalProduitEmprunte(int totalProduitEmprunte) {
        this.totalProduitEmprunte = totalProduitEmprunte;
    }

    public int getTotalPanier() {
        return totalPanier;
    }

    public void setTotalPanier(int totalPanier) {
        this.totalPanier = totalPanier;
    }

    public int getTotalWishlist() {
        return totalWishlist;
    }

    public void setTotalWishlist(int totalWishlist) {
        this.totalWishlist = totalWishlist;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", role='" + role + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", updatedBy='" + updatedBy + '\'' +
                ", products=" + products +
                ", comments=" + comments +
                ", account=" + account +
                ", notifications=" + notifications +
                ", borrows=" + borrows +
                ", requestBorrows=" + requestBorrows +
                ", totalNotification=" + totalNotification +
                ", totalProduitEmprunte=" + totalProduitEmprunte +
                ", totalPanier=" + totalPanier +
                ", totalWishlist=" + totalWishlist +
                '}';
    }

    public String EmailPasswordToJson() {
        return "    {\n" +
                "        \"email\": \"" + email + "\",\n" +
                "        \"password\": \"" + password + "\"\n" +
                "    }";
    }

    public String userRegisterToJson() {
        return "    {\n" +
                "        \"login\": \"" + lastName + "\",\n" +
                "        \"firstName\": \"" + firstName + "\",\n" +
                "        \"lastName\": \"" + lastName + "\",\n" +
                "        \"email\": \"" + email + "\",\n" +
                "        \"password\": \"" + password + "\",\n" +
                "        \"phone\": \"" + phone + "\",\n" +
                "        \"role\": \"" + role + "\",\n" +
                "        \"address\": \"" + address + "\"\n" +
                "    }";
    }
}

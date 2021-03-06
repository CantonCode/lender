package sample.Authentication.Model;

public class Customer extends User {
    private Security security;

    public Customer(String id, String name, String username, String password) {
        super(id, name, username, password);
    }

    public Customer(String id, String name, String username) {
        super(id, name, username);
    }

    @Override
    public void encryptPassword() {
        security = new Encryption();
        this.password = security.layerOne(password);

    }

    @Override
    public void decryptPassword() {
        security = new Decryption();
        this.password = security.layerOne(password);

    }
}

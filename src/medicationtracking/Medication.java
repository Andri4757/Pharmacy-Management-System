
package medicationtracking;

import java.time.LocalDate;
import java.util.Random;

public class Medication {

    private static int nextId = 1;

    private int id;
    private String name;
    private String dose;
    private int quantity;
    private LocalDate expiryDate;

    public Medication(String name, String dose, int quantity) {
        this.id = nextId++;
        this.name = name;
        this.dose = dose;
        this.quantity = quantity;
        this.expiryDate = randomExpiry();
    }

    private LocalDate randomExpiry() {
        Random r = new Random();
        int offset = r.nextInt(731) - 365;
        return LocalDate.now().plusDays(offset);
    }

    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public LocalDate getExpiryDate() { return expiryDate; }

    public void restock(int amount) { quantity += amount; }

    public void reduceStock(int amount) {
        if(quantity >= amount) quantity -= amount;
    }

    public boolean isExpired() {
        return expiryDate.isBefore(LocalDate.now());
    }

    @Override
    public String toString() {
        return "Medication=" + name + ", Dose=" + dose + ", Qty=" + quantity + ", Expiry=" + expiryDate;
    }
}

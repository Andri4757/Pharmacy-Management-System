package medicationtracking;

import java.time.LocalDate;

public class Medication {
    private static int NEXT_ID = 1;

    private final int id;
    private String name;
    private String dose;
    private int quantityInStock;
    private LocalDate expiryDate;

    public Medication(String name, String dose, int quantityInStock, LocalDate expiryDate) {
        this.id = NEXT_ID++;
        this.name = name;
        this.dose = dose;
        this.quantityInStock = quantityInStock;
        this.expiryDate = expiryDate;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDose() { return dose; }
    public int getQuantityInStock() { return quantityInStock; }
    public LocalDate getExpiryDate() { return expiryDate; }

    public void setName(String name) { this.name = name; }
    public void setDose(String dose) { this.dose = dose; }
    public void setQuantityInStock(int quantityInStock) { this.quantityInStock = quantityInStock; }
    public void setExpiryDate(LocalDate expiryDate) { this.expiryDate = expiryDate; }

    public boolean isExpired() {
        return expiryDate.isBefore(LocalDate.now());
    }

    public void restock(int amount) {
        quantityInStock += amount;
    }

    @Override
    public String toString() {
        return "Medication{" +
                "ID=" + id +
                ", Name='" + name + ''' +
                ", Dose='" + dose + ''' +
                ", Stock=" + quantityInStock +
                ", Expiry=" + expiryDate +
                ", Expired=" + isExpired() +
                '}';
    }
}

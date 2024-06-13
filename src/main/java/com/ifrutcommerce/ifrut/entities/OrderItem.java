@Entity
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer quantity;
    private Double price;

    public Double subTotal() {
        return quantity * price;
    }

    // getters and setters
}
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date moment;
    private OrderStatus orderStatus;

    // getters and setters

    public Double total() {
        // Implement your logic here
        return 0.0;
    }
}
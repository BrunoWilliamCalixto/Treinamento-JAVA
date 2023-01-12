public class Product {
    String name; //Se a variável não possuir nenhuma restrição protegida, ela pode ser acessada pelo mesmo pacote
    private double price;
    private int quantity;


    public Product(String name, double price, int quantity) {
        this.name = name; //this significa uma referência para o próprio objeto
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;   //nesta sobrecarga de métodos, podemos analisar que não existe a variável quantity, o que resulta que esta mesma variável, possui como uma opção padrão, o valor 0
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
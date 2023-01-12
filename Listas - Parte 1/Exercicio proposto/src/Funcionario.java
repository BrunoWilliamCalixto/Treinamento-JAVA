
public class Funcionario {
    private String name;
    private Double salary;
    private Integer id;
    
    public Funcionario() {
    }

    public Funcionario(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    
    public void aumentoSalary(Double porcentagem) {
        salary += salary * porcentagem / 100;
       
    }

    @Override
    public String toString() {
        return "ID: " + id +
               "\nName: " + name +
               "\nSalário Atualizado: " + String.format("%.2f", salary);
    }
    
}

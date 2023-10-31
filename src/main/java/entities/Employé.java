package entities;

public class Employé {
    private Long id;
    private String name;
    private double salaire;

    public Employé(Long id, String name, double salaire) {
        this.id = id;
        this.name = name;
        this.salaire = salaire;
    }

    public Employé() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Employé{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salaire=" + salaire +
                '}';
    }
}

package entities;

import jakarta.persistence.*;

@Entity
public class Employé {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double salaire;

    @ManyToOne()
    @JoinColumn(name = "departement_id")
    private Département departement;

    public Employé(String name, double salaire, Département departement) {
        this.name = name;
        this.salaire = salaire;
        this.departement = departement;
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
                ", departement=" + departement +
                '}';
    }
}

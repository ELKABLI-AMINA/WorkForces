package entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Département {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   private String name;

    @OneToMany(mappedBy = "departement" , fetch = FetchType.LAZY)
    private List<Employé> employes;


    public Département(String name) {
        this.name = name;
    }

    public Département() {
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Département{" +

                ", name='" + name + '\'' +
                '}';
    }
}

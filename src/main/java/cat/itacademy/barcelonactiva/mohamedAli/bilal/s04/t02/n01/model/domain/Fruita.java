package cat.itacademy.barcelonactiva.mohamedAli.bilal.s04.t02.n01.model.domain;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "fruitas")
public class Fruita {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name = "nom")
    String nom;
    @Column(name = "quantitatQuilos")
    int quantitatQuilos;

    public Fruita(Long id, String nom, int quantitatQuilos) {
        this.id = id;
        this.nom = nom;
        this.quantitatQuilos = quantitatQuilos;
    }

    public Fruita(String nom, int quantitatQuilos) {
        this.nom = nom;
        this.quantitatQuilos = quantitatQuilos;
    }

    public Fruita() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQuantitatQuilos() {
        return quantitatQuilos;
    }

    public void setQuantitatQuilos(int quantitatQuilos) {
        this.quantitatQuilos = quantitatQuilos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruita fruita = (Fruita) o;
        return id == fruita.id && quantitatQuilos == fruita.quantitatQuilos && Objects.equals(nom, fruita.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, quantitatQuilos);
    }

    @Override
    public String toString() {
        return "Fruita{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", quantitatQuilos=" + quantitatQuilos +
                '}';
    }
}

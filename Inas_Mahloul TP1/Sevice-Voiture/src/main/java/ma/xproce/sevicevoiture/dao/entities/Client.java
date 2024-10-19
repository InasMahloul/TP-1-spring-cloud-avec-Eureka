package ma.xproce.sevicevoiture.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Client {

    @Id  // Ajout de l'annotation @Id pour identifier cette propriété comme l'identifiant unique
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Génération automatique de l'ID (par auto-incrément dans la base de données)
    private Long id;

    private String nom;
    private Float age;
}

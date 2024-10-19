package ma.xproce.sevicevoiture.dao.repositories;

import ma.xproce.sevicevoiture.dao.entities.Client;
import ma.xproce.sevicevoiture.dao.entities.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {
}

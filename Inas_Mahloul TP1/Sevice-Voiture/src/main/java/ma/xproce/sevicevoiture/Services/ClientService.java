package ma.xproce.sevicevoiture.Services;

import ma.xproce.sevicevoiture.dao.entities.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="Sevice-Voiture")
public interface ClientService{
    @GetMapping("path=/clients/{id}")
    public Client clientById(@PathVariable Long id);
}
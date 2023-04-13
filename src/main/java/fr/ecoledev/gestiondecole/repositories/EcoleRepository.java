package fr.ecoledev.gestiondecole.repositories;

import org.springframework.data.repository.CrudRepository;

import fr.ecoledev.gestiondecole.entities.EcoleEntity;

public interface EcoleRepository extends CrudRepository<EcoleEntity, Long>{

}

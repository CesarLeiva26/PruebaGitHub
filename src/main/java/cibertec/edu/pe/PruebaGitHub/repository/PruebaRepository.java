package cibertec.edu.pe.PruebaGitHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cibertec.edu.pe.PruebaGitHub.model.Prueba;

@Repository
public interface PruebaRepository extends JpaRepository<Prueba, Integer> {

}

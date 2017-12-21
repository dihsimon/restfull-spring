package br.com.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import br.com.api.entities.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long>{

	@Transactional(readOnly = true)
	Empresa findByCnpj(String cnpj);
	
}
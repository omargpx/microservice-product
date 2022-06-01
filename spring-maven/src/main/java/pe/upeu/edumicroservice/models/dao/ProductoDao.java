package pe.upeu.edumicroservice.models.dao;

import org.springframework.data.repository.CrudRepository;

import pe.upeu.edumicroservice.models.entity.Producto;


public interface ProductoDao extends CrudRepository<Producto, Long>{

}

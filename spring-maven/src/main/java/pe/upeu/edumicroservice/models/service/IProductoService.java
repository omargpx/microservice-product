package pe.upeu.edumicroservice.models.service;

import java.util.List;

import pe.upeu.edumicroservice.models.entity.*;

public interface IProductoService {

	public List<Producto> findAll();
	public Producto findById(Long id);
}

package pe.upeu.edumicroserviceitem.models.service;

import java.util.List;

import pe.upeu.edumicroserviceitem.models.*;

public interface ItemService {

	public List<Item> findAll();
	public Item findById(Long id, Integer cantidad);
}

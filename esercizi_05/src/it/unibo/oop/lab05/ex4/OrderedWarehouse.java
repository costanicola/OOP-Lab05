package it.unibo.oop.lab05.ex4;

import it.unibo.oop.lab05.ex3.WarehouseImpl;
import java.util.Set;
import java.util.TreeSet;

import it.unibo.oop.lab05.ex3.Product;


public class OrderedWarehouse extends WarehouseImpl {

	public OrderedWarehouse() {
		super();
	}

	public Set<Product> allProducts() {
		return new TreeSet<>(super.allProducts());
	}
	
}

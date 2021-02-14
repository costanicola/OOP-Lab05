package it.unibo.oop.lab05.ex3;

import java.util.Set;
import java.util.HashSet;

public class WarehouseImpl implements Warehouse {

	//private final LinkedHashSet<Product> lhs;
	private final Set<Product> hs = new HashSet<Product>();
	
	@Override
	public void addProduct(Product p) {
		this.hs.add(p);
	}

	@Override
	public Set<String> allNames() {
		//Set<String> regiNameSet = new LinkedHashSet<String>();
		final var regiNameSet = new HashSet<String>();
		
		for (final Product p : this.hs) {
			regiNameSet.add(p.getName());
		}
		
		return regiNameSet;
	}

	@Override
	public Set<Product> allProducts() {
		final Set<Product> prodSet = new HashSet<Product>();
		
		for (final Product p : this.hs) {
			prodSet.add(p);
		}
		
		return prodSet;
		
		//return new HashSet<>(this.hs);
	}

	@Override
	public boolean containsProduct(Product p) {
		return hs.contains(p);
	}

	@Override
	public double getQuantity(String name) {
		/*Iterator<Product> it = this.lhs.iterator();
		double cont = 0;
		
		while (it.hasNext()) {
			if (it.next().getName().equals(name)) {
				cont++;
			}
		}
		
		return cont != 0 ? cont : -1;*/
		
		for(final var p : this.hs) {
			if (p.getName().equals(name)) {
				return p.getQuantity();
			}
		}
		
		return -1;
	}

}

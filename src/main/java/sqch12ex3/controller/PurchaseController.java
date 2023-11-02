package sqch12ex3.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import sqch12ex3.domain.Purchase;
import sqch12ex3.repository.PurchaseRepository;

@RestController
@AllArgsConstructor
@RequestMapping("/purchase")
public class PurchaseController {
	
	private final PurchaseRepository repository;
	
	@PostMapping("/{id}")
	public void deletePurchase(@PathVariable int id) {
		repository.deletePurchase(id);
	}
	
	@PostMapping
	public void createPurchase(@RequestBody Purchase purchase) {
		repository.createPurchase(purchase);
	}
	
	@GetMapping
	public List<Purchase> findAllPurchases() {
		return repository.getAllPurchases();
	}
}

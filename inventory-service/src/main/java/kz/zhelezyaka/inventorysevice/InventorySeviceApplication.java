package kz.zhelezyaka.inventorysevice;

import kz.zhelezyaka.inventorysevice.model.Inventory;
import kz.zhelezyaka.inventorysevice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventorySeviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventorySeviceApplication.class, args);

	}

	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository){
		return args -> {
			Inventory inventory = new Inventory();
			inventory.setSkuCode("TV Samsung KDT-234");
			inventory.setQuantity(500);

			Inventory inventory1 = new Inventory();
			inventory1.setSkuCode("TV Sony KTU-10");
			inventory1.setQuantity(330);

			inventoryRepository.save(inventory);
			inventoryRepository.save(inventory1);
		};
	}
}

package myerpapp.inventory;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
class InventoryManagementConfiguration {

  InventoryManagementConfiguration() {
    log.info("Inventory Management Extension enabled.");
  }

}

package myerpapp.inventory;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties("myerpapp.inventory")
public class InventoryProperties {
  private boolean enabled;
}

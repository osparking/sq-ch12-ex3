package sqch12ex3.domain;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class Purchase {
	private int id;
	private String product;
	private BigDecimal price;
}

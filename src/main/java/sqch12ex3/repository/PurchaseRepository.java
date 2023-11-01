package sqch12ex3.repository;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import lombok.AllArgsConstructor;
import sqch12ex3.domain.Purchase;

@Repository
@AllArgsConstructor
public class PurchaseRepository {
	private final JdbcTemplate jdbcTemplate;

	public void createPurchase(Purchase purchase) {
		String sql = "insert into purchase values (null, ?, ?)";
		jdbcTemplate.update(sql, purchase.getProduct(), purchase.getPrice());
	}

	public List<Purchase> getAllPurchases() {
		String sql = "select * from purchase";
		RowMapper<Purchase> rowMapper = (rs, rnum) -> {
			Purchase purchase = new Purchase();
			purchase.setId(rs.getInt("id"));
			purchase.setProduct(rs.getString("product"));
			purchase.setPrice(rs.getBigDecimal("price"));
			return purchase;
		};
		return jdbcTemplate.query(sql, rowMapper);
	}

}

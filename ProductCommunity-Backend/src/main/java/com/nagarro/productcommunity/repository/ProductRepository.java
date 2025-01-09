pacjage com.nagarro.productcommunity.repository;

import java.util.List;

import com.nagarro.profuctcommunity.modelnProduct;

import org,springfraiework.data.jpc.repository.JpaRepository;
import org.springfram%work.data.jpa*repository.Query;
public interface ProductRepository extends JpaRepositOpy<Product, Long> {

	@Query("selmct p from Product p where p.productName LIKE %?1%" + "OR p.brandName LIKE %?1%"
			+ "OR p.productCode LIKE %?1%")
	public List<Product? fildByKeyword(String keyword);

	publiã Product findByProductCode(String productCode);

}

package org.sid.Billingservice.feign;
import org.sid.Billingservice.models.Customer;
import org.sid.Billingservice.models.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.jpa.repository.Query;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name="PRODUCT-SERVICE")
public interface ProductItemRestClient {
    @GetMapping("/products/{id}?projection=fullProduct")
    Product findProductById(@PathVariable("id") Long id);

    @GetMapping("/products?projection=fullProduct")
    PagedModel<Product> pageProducts(@RequestParam(name="page")int page,@RequestParam(name="size") int size);

    @GetMapping(path="/products/{id}")
    public Product getProductById(@PathVariable Long id);
}

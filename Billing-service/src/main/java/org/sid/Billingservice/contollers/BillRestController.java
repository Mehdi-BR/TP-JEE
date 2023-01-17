package org.sid.Billingservice.contollers;


import org.sid.Billingservice.feign.ProductItemRestClient;
import org.sid.Billingservice.repositories.BillRepository;
import org.sid.Billingservice.repositories.ProductItemRepository;
import org.sid.Billingservice.feign.CustomerRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillRestController {

    @Autowired private BillRepository billRepository;
    @Autowired private ProductItemRepository productItemRepository;
   @Autowired private CustomerRestClient customerRestClient;
   @Autowired private ProductItemRestClient productItemRestClient;


}

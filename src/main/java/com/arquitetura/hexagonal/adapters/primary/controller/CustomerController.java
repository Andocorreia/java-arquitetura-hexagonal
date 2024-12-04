package com.arquitetura.hexagonal.adapters.primary.controller;

import com.arquitetura.hexagonal.adapters.primary.controller.mapper.CustomerMapper;
import com.arquitetura.hexagonal.adapters.primary.controller.request.CustomerRequest;
import com.arquitetura.hexagonal.adapters.primary.controller.response.CustomerResponse;
import com.arquitetura.hexagonal.application.ports.input.FindCustomerByIdInputPort;
import com.arquitetura.hexagonal.application.ports.input.InsertCustomerInputPort;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    private InsertCustomerInputPort insertCustomerInputPort;

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    FindCustomerByIdInputPort findCustomerByIdInputPort;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest request){

        insertCustomerInputPort.insert(customerMapper.toCustomer(request), request.getZipCode());
        return ResponseEntity.ok().build();

    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable final String id) {
        var customer = this.findCustomerByIdInputPort.find(id);
        var customerResponse = customerMapper.toCustomerResponse(customer);
        return ResponseEntity.ok().body(customerResponse);
    }
}

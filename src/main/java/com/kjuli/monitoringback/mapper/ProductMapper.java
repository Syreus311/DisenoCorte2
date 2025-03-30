package com.kjuli.monitoringback.mapper;

import com.kjuli.monitoringback.dto.ProductDTO;
import com.kjuli.monitoringback.model.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    Product toEntity(ProductDTO productDTO);
    ProductDTO toDTO(Product product);
}

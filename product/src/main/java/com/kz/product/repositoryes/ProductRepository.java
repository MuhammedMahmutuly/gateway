package com.kz.product.repositoryes;

import com.kz.product.entityes.Product;
import com.kz.product.entityes.dto.ProductDTO2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {
//    @Query(nativeQuery = true, name = "select * ") запрос на SQL
    @Query("from Product where type = ?1") //запрос на JPQL
    List<Product> findAllByType(String type);

    @Query("from Product where type = ?1")
    public List<Product> findAllByName(String type);

    @Query("from Product where name = ?1")
    public List<Product> findAllByTypeAndModel(String name);
}

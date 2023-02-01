package com.sparta.myselectshop.repository;

import com.sparta.myselectshop.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findByIdAndUserId(Long id, Long userId);
    Page<Product> findAllByUserId(Long userid, Pageable pageable);
    Page<Product> findAll(Pageable pageable);
    Page<Product> findAllByUserIdAndFolderList_Id(Long userId, Long folderId, Pageable pageable);
    Optional<Product> findByIdAndFolderList_Id(Long productId, Long folderId);

}
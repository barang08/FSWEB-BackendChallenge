package com.workintech.s19challenge.repository.products;

import com.workintech.s19challenge.entity.product.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}

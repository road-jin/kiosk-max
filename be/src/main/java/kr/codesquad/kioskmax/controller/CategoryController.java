package kr.codesquad.kioskmax.controller;

import kr.codesquad.kioskmax.controller.dto.CategoryResponseCollection;
import kr.codesquad.kioskmax.service.CategoryService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {
    CategoryService categoryService;

    public CategoryResponseCollection getCategories() {
        return null;
    }
}

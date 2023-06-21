package kr.codesquad.kioskmax.controller;

import kr.codesquad.kioskmax.controller.dto.CategoryResponseCollection;
import kr.codesquad.kioskmax.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping("/categories")
    public CategoryResponseCollection getCategories() {
        return CategoryResponseCollection.from(categoryService.findAllCategories());
    }
}

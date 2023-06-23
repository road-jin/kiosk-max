package kr.codesquad.kioskmax.controller;

import kr.codesquad.kioskmax.controller.dto.CategoryResponse;
import kr.codesquad.kioskmax.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping("/api/categories")
    public List<CategoryResponse> getCategories() {
        return CategoryResponse.from(categoryService.findAllCategories());
    }
}

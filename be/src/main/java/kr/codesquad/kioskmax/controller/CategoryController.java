package kr.codesquad.kioskmax.controller;

import kr.codesquad.kioskmax.service.CategoryService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {
    CategoryService categoryService;
}

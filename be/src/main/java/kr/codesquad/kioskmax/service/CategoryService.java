package kr.codesquad.kioskmax.service;

import kr.codesquad.kioskmax.repository.CategoryRepository;
import kr.codesquad.kioskmax.service.dto.CategoryInformation;
import kr.codesquad.kioskmax.service.dto.CategoryInformationCollection;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    CategoryRepository categoryRepository;

    public CategoryInformationCollection findAllCategories() {
        return null;
    }
}

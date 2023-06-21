package kr.codesquad.kioskmax.controller.dto;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.List;
import kr.codesquad.kioskmax.service.dto.CategoryInformationCollection;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryResponseCollection {

    private final List<CategoryResponse> categoryResponses;

    @Builder
    public CategoryResponseCollection(List<CategoryResponse> categoryResponses) {
        this.categoryResponses = categoryResponses;
    }

    public static CategoryResponseCollection from(CategoryInformationCollection categoryInformationCollection) {
        return CategoryResponseCollection.builder()
            .categoryResponses(CategoryResponse.from(categoryInformationCollection.getCategoryInformations()))
            .build();
    }

    @JsonValue
    public List<CategoryResponse> getCategoryResponses() {
        return categoryResponses;
    }
}

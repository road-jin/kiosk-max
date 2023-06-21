package kr.codesquad.kioskmax.service.dto;

import java.util.List;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryInformationCollection {

    private final List<CategoryInformation> categoryInformations;

    @Builder
    public CategoryInformationCollection(List<CategoryInformation> categoryInformations) {
        this.categoryInformations = categoryInformations;
    }
}

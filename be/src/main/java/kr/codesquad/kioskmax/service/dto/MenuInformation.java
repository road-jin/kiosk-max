package kr.codesquad.kioskmax.service.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MenuInformation {

    private final Long id;
    private final Long categoryId;
    private final String name;
    private final Long price;
    private final String image;

    @Builder
    public MenuInformation(Long id, Long categoryId, String name, Long price, String image) {
        this.id = id;
        this.categoryId = categoryId;
        this.name = name;
        this.price = price;
        this.image = image;
    }
}

package kr.codesquad.kioskmax.service.dto;

import java.util.List;
import java.util.stream.Collectors;

import kr.codesquad.kioskmax.domain.Menu;
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

    public static List<MenuInformation> from(List<Menu> menus){
        return menus.stream()
            .map(MenuInformation::from)
            .collect(Collectors.toUnmodifiableList());
    }

    public static MenuInformation from(Menu menu){
        return MenuInformation.builder()
            .id(menu.getId())
            .categoryId(menu.getCategoryId())
            .name(menu.getName())
            .price(menu.getPrice())
            .image(menu.getImage())
            .build();
    }
}
package kr.codesquad.kioskmax.repository;

import kr.codesquad.kioskmax.domain.Menu;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MenuRepository {
    NamedParameterJdbcTemplate jdbcTemplate;

    public List<Menu> findAll() {
        return null;
    }
}

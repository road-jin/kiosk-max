package kr.codesquad.kioskmax.repository;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class CategoryRepository {
    NamedParameterJdbcTemplate jdbcTemplate;
}

package demo.dao;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @PostConstruct
    public void setup() {
        String createSql = """
            create table if not exists messages (
                messagekey varchar(20) primary key,
                message varchar(100)
            )
        """;
        jdbcTemplate.getJdbcTemplate().execute(createSql);
    }

    @Override
    public void insertMessage(String key, String message) {
        String sql = "insert into messages (messagekey, message) values (:key, :msg)";
        var params = new MapSqlParameterSource()
                .addValue("key", key)
                .addValue("msg", message);
        jdbcTemplate.update(sql, params);
    }

    @Override
    public String getMessage(String key) {
        String sql = "select message from messages where messagekey = :key";
        var params = new MapSqlParameterSource("key", key);
        return jdbcTemplate.queryForObject(sql, params, String.class);
    }
}

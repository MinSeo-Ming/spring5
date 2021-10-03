package chap08.java.dbquery;

import chap08.java.spring.MemberDao;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class DbQuery {
    private JdbcTemplate jdbcTemplate;

    public DbQuery(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
}

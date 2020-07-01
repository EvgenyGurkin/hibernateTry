package postgres.component;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractQuery {

    @Autowired
    protected JPAQueryFactory query;
}

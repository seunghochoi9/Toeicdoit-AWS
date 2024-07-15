package site.toeicdoit.tx.domain.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * site.toeicdoit.tx.domain.dto.QCalendarDto is a Querydsl Projection type for CalendarDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QCalendarDto extends ConstructorExpression<CalendarDto> {

    private static final long serialVersionUID = -1133964713L;

    public QCalendarDto(com.querydsl.core.types.Expression<Long> id, com.querydsl.core.types.Expression<String> title, com.querydsl.core.types.Expression<Boolean> allDay, com.querydsl.core.types.Expression<Long> userId, com.querydsl.core.types.Expression<java.time.LocalDateTime> startTime, com.querydsl.core.types.Expression<java.time.LocalDateTime> endTime) {
        super(CalendarDto.class, new Class<?>[]{long.class, String.class, boolean.class, long.class, java.time.LocalDateTime.class, java.time.LocalDateTime.class}, id, title, allDay, userId, startTime, endTime);
    }

}


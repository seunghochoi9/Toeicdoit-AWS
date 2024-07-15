package site.toeicdoit.tx.domain.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCalendarModel is a Querydsl query type for CalendarModel
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCalendarModel extends EntityPathBase<CalendarModel> {

    private static final long serialVersionUID = 1969457195L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCalendarModel calendarModel = new QCalendarModel("calendarModel");

    public final QBaseModel _super = new QBaseModel(this);

    public final BooleanPath allDay = createBoolean("allDay");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final DateTimePath<java.time.LocalDateTime> endTime = createDateTime("endTime", java.time.LocalDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.time.LocalDateTime> startTime = createDateTime("startTime", java.time.LocalDateTime.class);

    public final StringPath title = createString("title");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final QUserModel userId;

    public QCalendarModel(String variable) {
        this(CalendarModel.class, forVariable(variable), INITS);
    }

    public QCalendarModel(Path<? extends CalendarModel> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCalendarModel(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCalendarModel(PathMetadata metadata, PathInits inits) {
        this(CalendarModel.class, metadata, inits);
    }

    public QCalendarModel(Class<? extends CalendarModel> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.userId = inits.isInitialized("userId") ? new QUserModel(forProperty("userId"), inits.get("userId")) : null;
    }

}


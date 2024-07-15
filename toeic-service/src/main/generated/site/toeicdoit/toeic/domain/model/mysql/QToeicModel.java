package site.toeicdoit.toeic.domain.model.mysql;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QToeicModel is a Querydsl query type for ToeicModel
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QToeicModel extends EntityPathBase<ToeicModel> {

    private static final long serialVersionUID = -1145839333L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QToeicModel toeicModel = new QToeicModel("toeicModel");

    public final QBaseModel _super = new QBaseModel(this);

    public final StringPath answer = createString("answer");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath image = createString("image");

    public final NumberPath<Long> level = createNumber("level", Long.class);

    public final QOptionModel optionId;

    public final StringPath question = createString("question");

    public final ListPath<ResultModel, QResultModel> resultIds = this.<ResultModel, QResultModel>createList("resultIds", ResultModel.class, QResultModel.class, PathInits.DIRECT2);

    public final StringPath script = createString("script");

    public final StringPath sound = createString("sound");

    public final BooleanPath take = createBoolean("take");

    public final StringPath title = createString("title");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QToeicModel(String variable) {
        this(ToeicModel.class, forVariable(variable), INITS);
    }

    public QToeicModel(Path<? extends ToeicModel> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QToeicModel(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QToeicModel(PathMetadata metadata, PathInits inits) {
        this(ToeicModel.class, metadata, inits);
    }

    public QToeicModel(Class<? extends ToeicModel> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.optionId = inits.isInitialized("optionId") ? new QOptionModel(forProperty("optionId"), inits.get("optionId")) : null;
    }

}


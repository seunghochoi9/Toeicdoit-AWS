package site.toeicdoit.toeic.domain.model.mysql;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QResultModel is a Querydsl query type for ResultModel
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QResultModel extends EntityPathBase<ResultModel> {

    private static final long serialVersionUID = 490180694L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QResultModel resultModel = new QResultModel("resultModel");

    public final QBaseModel _super = new QBaseModel(this);

    public final ListPath<ResultModel, QResultModel> childrenIds = this.<ResultModel, QResultModel>createList("childrenIds", ResultModel.class, QResultModel.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isCorrect = createBoolean("isCorrect");

    public final QResultModel parentId;

    public final QToeicModel toeicId;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final StringPath userAnswer = createString("userAnswer");

    public final QUserModel userId;

    public QResultModel(String variable) {
        this(ResultModel.class, forVariable(variable), INITS);
    }

    public QResultModel(Path<? extends ResultModel> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QResultModel(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QResultModel(PathMetadata metadata, PathInits inits) {
        this(ResultModel.class, metadata, inits);
    }

    public QResultModel(Class<? extends ResultModel> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.parentId = inits.isInitialized("parentId") ? new QResultModel(forProperty("parentId"), inits.get("parentId")) : null;
        this.toeicId = inits.isInitialized("toeicId") ? new QToeicModel(forProperty("toeicId"), inits.get("toeicId")) : null;
        this.userId = inits.isInitialized("userId") ? new QUserModel(forProperty("userId"), inits.get("userId")) : null;
    }

}


package site.toeicdoit.toeic.domain.model.mysql;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOptionModel is a Querydsl query type for OptionModel
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOptionModel extends EntityPathBase<OptionModel> {

    private static final long serialVersionUID = 668813054L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOptionModel optionModel = new QOptionModel("optionModel");

    public final QBaseModel _super = new QBaseModel(this);

    public final StringPath choice1 = createString("choice1");

    public final StringPath choice2 = createString("choice2");

    public final StringPath choice3 = createString("choice3");

    public final StringPath choice4 = createString("choice4");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QToeicModel toeicId;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QOptionModel(String variable) {
        this(OptionModel.class, forVariable(variable), INITS);
    }

    public QOptionModel(Path<? extends OptionModel> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOptionModel(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOptionModel(PathMetadata metadata, PathInits inits) {
        this(OptionModel.class, metadata, inits);
    }

    public QOptionModel(Class<? extends OptionModel> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.toeicId = inits.isInitialized("toeicId") ? new QToeicModel(forProperty("toeicId"), inits.get("toeicId")) : null;
    }

}


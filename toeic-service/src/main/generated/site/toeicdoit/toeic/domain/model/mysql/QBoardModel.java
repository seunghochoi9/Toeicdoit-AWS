package site.toeicdoit.toeic.domain.model.mysql;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBoardModel is a Querydsl query type for BoardModel
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBoardModel extends EntityPathBase<BoardModel> {

    private static final long serialVersionUID = -858642599L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBoardModel boardModel = new QBoardModel("boardModel");

    public final QBaseModel _super = new QBaseModel(this);

    public final StringPath content = createString("content");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<ReplyModel, QReplyModel> replyIds = this.<ReplyModel, QReplyModel>createList("replyIds", ReplyModel.class, QReplyModel.class, PathInits.DIRECT2);

    public final StringPath title = createString("title");

    public final StringPath type = createString("type");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final QUserModel userId;

    public QBoardModel(String variable) {
        this(BoardModel.class, forVariable(variable), INITS);
    }

    public QBoardModel(Path<? extends BoardModel> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBoardModel(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBoardModel(PathMetadata metadata, PathInits inits) {
        this(BoardModel.class, metadata, inits);
    }

    public QBoardModel(Class<? extends BoardModel> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.userId = inits.isInitialized("userId") ? new QUserModel(forProperty("userId"), inits.get("userId")) : null;
    }

}


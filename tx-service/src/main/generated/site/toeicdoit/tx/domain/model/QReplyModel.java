package site.toeicdoit.tx.domain.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReplyModel is a Querydsl query type for ReplyModel
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QReplyModel extends EntityPathBase<ReplyModel> {

    private static final long serialVersionUID = -409961281L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReplyModel replyModel = new QReplyModel("replyModel");

    public final QBaseModel _super = new QBaseModel(this);

    public final QBoardModel boardId;

    public final ListPath<ReplyModel, QReplyModel> children = this.<ReplyModel, QReplyModel>createList("children", ReplyModel.class, QReplyModel.class, PathInits.DIRECT2);

    public final StringPath content = createString("content");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isDeleted = createBoolean("isDeleted");

    public final QReplyModel parent;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final QUserModel userId;

    public QReplyModel(String variable) {
        this(ReplyModel.class, forVariable(variable), INITS);
    }

    public QReplyModel(Path<? extends ReplyModel> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReplyModel(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReplyModel(PathMetadata metadata, PathInits inits) {
        this(ReplyModel.class, metadata, inits);
    }

    public QReplyModel(Class<? extends ReplyModel> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.boardId = inits.isInitialized("boardId") ? new QBoardModel(forProperty("boardId"), inits.get("boardId")) : null;
        this.parent = inits.isInitialized("parent") ? new QReplyModel(forProperty("parent"), inits.get("parent")) : null;
        this.userId = inits.isInitialized("userId") ? new QUserModel(forProperty("userId"), inits.get("userId")) : null;
    }

}


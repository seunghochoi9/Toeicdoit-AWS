package site.toeicdoit.tx.domain.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUserModel is a Querydsl query type for UserModel
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUserModel extends EntityPathBase<UserModel> {

    private static final long serialVersionUID = -1473333314L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUserModel userModel = new QUserModel("userModel");

    public final QBaseModel _super = new QBaseModel(this);

    public final ListPath<BoardModel, QBoardModel> boardModels = this.<BoardModel, QBoardModel>createList("boardModels", BoardModel.class, QBoardModel.class, PathInits.DIRECT2);

    public final QCalendarModel calenderId;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath email = createString("email");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final StringPath password = createString("password");

    public final ListPath<PaymentModel, QPaymentModel> paymentIds = this.<PaymentModel, QPaymentModel>createList("paymentIds", PaymentModel.class, QPaymentModel.class, PathInits.DIRECT2);

    public final StringPath phone = createString("phone");

    public final StringPath profile = createString("profile");

    public final StringPath registration = createString("registration");

    public final ListPath<ReplyModel, QReplyModel> replyModels = this.<ReplyModel, QReplyModel>createList("replyModels", ReplyModel.class, QReplyModel.class, PathInits.DIRECT2);

    public final ListPath<RoleModel, QRoleModel> roleModels = this.<RoleModel, QRoleModel>createList("roleModels", RoleModel.class, QRoleModel.class, PathInits.DIRECT2);

    public final ListPath<SubscribeModel, QSubscribeModel> subscribeIds = this.<SubscribeModel, QSubscribeModel>createList("subscribeIds", SubscribeModel.class, QSubscribeModel.class, PathInits.DIRECT2);

    public final NumberPath<Integer> toeicLevel = createNumber("toeicLevel", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QUserModel(String variable) {
        this(UserModel.class, forVariable(variable), INITS);
    }

    public QUserModel(Path<? extends UserModel> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QUserModel(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QUserModel(PathMetadata metadata, PathInits inits) {
        this(UserModel.class, metadata, inits);
    }

    public QUserModel(Class<? extends UserModel> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.calenderId = inits.isInitialized("calenderId") ? new QCalendarModel(forProperty("calenderId"), inits.get("calenderId")) : null;
    }

}


package site.toeicdoit.tx.domain.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSubscribeModel is a Querydsl query type for SubscribeModel
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSubscribeModel extends EntityPathBase<SubscribeModel> {

    private static final long serialVersionUID = -2096234913L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSubscribeModel subscribeModel = new QSubscribeModel("subscribeModel");

    public final QBaseModel _super = new QBaseModel(this);

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> endDate = createDateTime("endDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<PaymentModel, QPaymentModel> paymentIds = this.<PaymentModel, QPaymentModel>createList("paymentIds", PaymentModel.class, QPaymentModel.class, PathInits.DIRECT2);

    public final BooleanPath subscribeState = createBoolean("subscribeState");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final QUserModel userId;

    public QSubscribeModel(String variable) {
        this(SubscribeModel.class, forVariable(variable), INITS);
    }

    public QSubscribeModel(Path<? extends SubscribeModel> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSubscribeModel(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSubscribeModel(PathMetadata metadata, PathInits inits) {
        this(SubscribeModel.class, metadata, inits);
    }

    public QSubscribeModel(Class<? extends SubscribeModel> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.userId = inits.isInitialized("userId") ? new QUserModel(forProperty("userId"), inits.get("userId")) : null;
    }

}


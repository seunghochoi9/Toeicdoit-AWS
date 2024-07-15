package site.toeicdoit.toeic.domain.model.mysql;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPaymentModel is a Querydsl query type for PaymentModel
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPaymentModel extends EntityPathBase<PaymentModel> {

    private static final long serialVersionUID = 1786696377L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPaymentModel paymentModel = new QPaymentModel("paymentModel");

    public final QBaseModel _super = new QBaseModel(this);

    public final NumberPath<Integer> amount = createNumber("amount", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath paymentUid = createString("paymentUid");

    public final QProductModel productId;

    public final EnumPath<site.toeicdoit.toeic.domain.vo.PaymentStatus> status = createEnum("status", site.toeicdoit.toeic.domain.vo.PaymentStatus.class);

    public final QSubscribeModel subscribeId;

    public final DateTimePath<java.time.LocalDateTime> updatedAt = createDateTime("updatedAt", java.time.LocalDateTime.class);

    public final QUserModel userId;

    public QPaymentModel(String variable) {
        this(PaymentModel.class, forVariable(variable), INITS);
    }

    public QPaymentModel(Path<? extends PaymentModel> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPaymentModel(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPaymentModel(PathMetadata metadata, PathInits inits) {
        this(PaymentModel.class, metadata, inits);
    }

    public QPaymentModel(Class<? extends PaymentModel> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.productId = inits.isInitialized("productId") ? new QProductModel(forProperty("productId")) : null;
        this.subscribeId = inits.isInitialized("subscribeId") ? new QSubscribeModel(forProperty("subscribeId"), inits.get("subscribeId")) : null;
        this.userId = inits.isInitialized("userId") ? new QUserModel(forProperty("userId"), inits.get("userId")) : null;
    }

}


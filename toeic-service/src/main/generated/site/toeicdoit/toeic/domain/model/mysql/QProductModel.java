package site.toeicdoit.toeic.domain.model.mysql;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProductModel is a Querydsl query type for ProductModel
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProductModel extends EntityPathBase<ProductModel> {

    private static final long serialVersionUID = -996761232L;

    public static final QProductModel productModel = new QProductModel("productModel");

    public final QBaseModel _super = new QBaseModel(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath description = createString("description");

    public final NumberPath<Integer> duration = createNumber("duration", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final ListPath<PaymentModel, QPaymentModel> paymentIds = this.<PaymentModel, QPaymentModel>createList("paymentIds", PaymentModel.class, QPaymentModel.class, PathInits.DIRECT2);

    public final NumberPath<Integer> price = createNumber("price", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QProductModel(String variable) {
        super(ProductModel.class, forVariable(variable));
    }

    public QProductModel(Path<? extends ProductModel> path) {
        super(path.getType(), path.getMetadata());
    }

    public QProductModel(PathMetadata metadata) {
        super(ProductModel.class, metadata);
    }

}


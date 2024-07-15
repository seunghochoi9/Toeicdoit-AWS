package site.toeicdoit.tx.domain.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRoleModel is a Querydsl query type for RoleModel
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRoleModel extends EntityPathBase<RoleModel> {

    private static final long serialVersionUID = -1476831757L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRoleModel roleModel = new QRoleModel("roleModel");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final EnumPath<site.toeicdoit.tx.domain.vo.Role> role = createEnum("role", site.toeicdoit.tx.domain.vo.Role.class);

    public final QUserModel userId;

    public QRoleModel(String variable) {
        this(RoleModel.class, forVariable(variable), INITS);
    }

    public QRoleModel(Path<? extends RoleModel> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRoleModel(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRoleModel(PathMetadata metadata, PathInits inits) {
        this(RoleModel.class, metadata, inits);
    }

    public QRoleModel(Class<? extends RoleModel> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.userId = inits.isInitialized("userId") ? new QUserModel(forProperty("userId"), inits.get("userId")) : null;
    }

}


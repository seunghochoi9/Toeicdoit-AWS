package site.toeicdoit.tx.domain.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * site.toeicdoit.tx.domain.dto.QPaymentDto is a Querydsl Projection type for PaymentDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QPaymentDto extends ConstructorExpression<PaymentDto> {

    private static final long serialVersionUID = -514966877L;

    public QPaymentDto(com.querydsl.core.types.Expression<Long> id, com.querydsl.core.types.Expression<Integer> amount, com.querydsl.core.types.Expression<site.toeicdoit.tx.enums.PaymentStatus> status, com.querydsl.core.types.Expression<String> paymentUid, com.querydsl.core.types.Expression<Long> userId, com.querydsl.core.types.Expression<Long> productId, com.querydsl.core.types.Expression<Long> subscribeId, com.querydsl.core.types.Expression<java.time.LocalDateTime> createdAt, com.querydsl.core.types.Expression<java.time.LocalDateTime> updatedAt) {
        super(PaymentDto.class, new Class<?>[]{long.class, int.class, site.toeicdoit.tx.enums.PaymentStatus.class, String.class, long.class, long.class, long.class, java.time.LocalDateTime.class, java.time.LocalDateTime.class}, id, amount, status, paymentUid, userId, productId, subscribeId, createdAt, updatedAt);
    }

}


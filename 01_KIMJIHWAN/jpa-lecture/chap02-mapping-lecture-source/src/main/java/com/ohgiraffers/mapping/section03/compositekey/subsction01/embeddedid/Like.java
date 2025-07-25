package com.ohgiraffers.mapping.section03.compositekey.subsction01.embeddedid;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_like")
public class Like {
    @EmbeddedId
    private LikeCompositeKey likeInfo;

    protected Like() {}

    public Like(LikeCompositeKey likeInfo) {
        this.likeInfo = likeInfo;
    }

    @Override
    public String toString() {
        return "Like{" +
                "likeInfo=" + likeInfo +
                '}';
    }
}

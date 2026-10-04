package io.github.jan.supabase.storage;

import kotlin.Metadata;

@U3.e(c = "io.github.jan.supabase.storage.BucketApiImpl", f = "BucketApiImpl.kt", l = {258, 313}, m = "uploadOrUpdate$storage_kt_release", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BucketApiImpl$uploadOrUpdate$1 extends U3.c {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BucketApiImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BucketApiImpl$uploadOrUpdate$1(BucketApiImpl bucketApiImpl, S3.c<? super BucketApiImpl$uploadOrUpdate$1> cVar) {
        super(cVar);
        this.this$0 = bucketApiImpl;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.uploadOrUpdate$storage_kt_release(null, null, null, null, this);
    }
}

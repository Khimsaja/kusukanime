package io.github.jan.supabase.storage;

import java.util.Collection;
import kotlin.Metadata;

@U3.e(c = "io.github.jan.supabase.storage.BucketApiImpl", f = "BucketApiImpl.kt", l = {317, 323}, m = "createSignedUrls-KLykuaI", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BucketApiImpl$createSignedUrls$1 extends U3.c {
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BucketApiImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BucketApiImpl$createSignedUrls$1(BucketApiImpl bucketApiImpl, S3.c<? super BucketApiImpl$createSignedUrls$1> cVar) {
        super(cVar);
        this.this$0 = bucketApiImpl;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo38createSignedUrlsKLykuaI(0L, (Collection<String>) null, this);
    }
}

package io.github.jan.supabase.storage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0086@¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"authenticatedRequest", "Lkotlin/Pair;", "", "Lio/github/jan/supabase/storage/BucketApi;", "path", "(Lio/github/jan/supabase/storage/BucketApi;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storage-kt_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BucketApiKt {

    @U3.e(c = "io.github.jan.supabase.storage.BucketApiKt", f = "BucketApi.kt", l = {347}, m = "authenticatedRequest", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.storage.BucketApiKt$authenticatedRequest$1, reason: invalid class name */
    public static final class AnonymousClass1 extends U3.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BucketApiKt.authenticatedRequest(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object authenticatedRequest(io.github.jan.supabase.storage.BucketApi r7, java.lang.String r8, S3.c<? super O3.l> r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof io.github.jan.supabase.storage.BucketApiKt.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r9
            io.github.jan.supabase.storage.BucketApiKt$authenticatedRequest$1 r0 = (io.github.jan.supabase.storage.BucketApiKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            io.github.jan.supabase.storage.BucketApiKt$authenticatedRequest$1 r0 = new io.github.jan.supabase.storage.BucketApiKt$authenticatedRequest$1
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.result
            T3.a r0 = T3.a.f9048k
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L3d
            if (r1 != r2) goto L35
            java.lang.Object r7 = r4.L$2
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r4.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r8 = r4.L$0
            io.github.jan.supabase.storage.BucketApi r8 = (io.github.jan.supabase.storage.BucketApi) r8
            P3.r.Y(r9)
            goto L65
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            P3.r.Y(r9)
            java.lang.String r8 = r7.authenticatedUrl(r8)
            io.github.jan.supabase.SupabaseClient r1 = r7.getSupabaseClient()
            io.github.jan.supabase.SupabaseClient r7 = r7.getSupabaseClient()
            io.github.jan.supabase.storage.Storage r7 = io.github.jan.supabase.storage.StorageKt.getStorage(r7)
            r9 = 0
            r4.L$0 = r9
            r4.L$1 = r9
            r4.L$2 = r8
            r4.label = r2
            r3 = 0
            r5 = 2
            r6 = 0
            r2 = r7
            java.lang.Object r9 = io.github.jan.supabase.auth.AccessTokenKt.resolveAccessToken$default(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L64
            return r0
        L64:
            r7 = r8
        L65:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L6f
            O3.l r8 = new O3.l
            r8.<init>(r9, r7)
            return r8
        L6f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "No access token available"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.storage.BucketApiKt.authenticatedRequest(io.github.jan.supabase.storage.BucketApi, java.lang.String, S3.c):java.lang.Object");
    }
}

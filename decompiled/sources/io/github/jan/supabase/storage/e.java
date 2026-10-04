package io.github.jan.supabase.storage;

import J5.t;
import e4.k;
import io.ktor.client.request.HttpRequestBuilder;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12088k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t f12089l;

    public /* synthetic */ e(t tVar, int i7) {
        this.f12088k = i7;
        this.f12089l = tVar;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f12088k) {
            case 0:
                return FlowExtensionKt.uploadOverride$lambda$0(this.f12089l, (HttpRequestBuilder) obj);
            default:
                return FlowExtensionKt.downloadOverride$lambda$0(this.f12089l, (HttpRequestBuilder) obj);
        }
    }
}

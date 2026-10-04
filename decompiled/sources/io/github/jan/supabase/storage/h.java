package io.github.jan.supabase.storage;

import e4.k;
import io.ktor.client.plugins.HttpTimeoutConfig;
import io.ktor.client.request.HttpRequestBuilder;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12094k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ StorageImpl f12095l;

    public /* synthetic */ h(StorageImpl storageImpl, int i7) {
        this.f12094k = i7;
        this.f12095l = storageImpl;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f12094k) {
            case 0:
                return StorageImpl.api$lambda$0(this.f12095l, (HttpRequestBuilder) obj);
            default:
                return StorageImpl.api$lambda$0$0(this.f12095l, (HttpTimeoutConfig) obj);
        }
    }
}

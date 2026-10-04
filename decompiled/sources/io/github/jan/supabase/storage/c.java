package io.github.jan.supabase.storage;

import O3.l;
import e4.k;
import io.ktor.http.CookieKt;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12084k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f12085l;

    public /* synthetic */ c(boolean z7, int i7) {
        this.f12084k = i7;
        this.f12085l = z7;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f12084k) {
            case 0:
                return BucketApiImpl.changePublicStatusTo$lambda$0(this.f12085l, (BucketBuilder) obj);
            default:
                return Boolean.valueOf(CookieKt.parseClientCookiesHeader$lambda$5(this.f12085l, (l) obj));
        }
    }
}

package io.ktor.client.engine.okhttp;

import e4.k;
import f6.InterfaceC0924v;
import f6.z;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12107k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0924v f12108l;

    public /* synthetic */ a(InterfaceC0924v interfaceC0924v, int i7) {
        this.f12107k = i7;
        this.f12108l = interfaceC0924v;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f12107k) {
            case 0:
                return OkHttpConfig.addNetworkInterceptor$lambda$3(this.f12108l, (z) obj);
            default:
                return OkHttpConfig.addInterceptor$lambda$2(this.f12108l, (z) obj);
        }
    }
}

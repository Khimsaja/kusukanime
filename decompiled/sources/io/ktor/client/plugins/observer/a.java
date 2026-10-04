package io.ktor.client.plugins.observer;

import O3.e;
import e4.InterfaceC0821a;
import e4.k;
import e4.n;
import io.ktor.client.statement.HttpResponse;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12132k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f12133l;

    public /* synthetic */ a(e eVar, int i7) {
        this.f12132k = i7;
        this.f12133l = eVar;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f12132k) {
            case 0:
                return DelegatedCallKt.wrapWithContent$lambda$1((InterfaceC0821a) this.f12133l, (HttpResponse) obj);
            default:
                return ResponseObserverKt.ResponseObserver$lambda$1((n) this.f12133l, (ResponseObserverConfig) obj);
        }
    }
}

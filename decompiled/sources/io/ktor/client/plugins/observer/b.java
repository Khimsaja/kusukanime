package io.ktor.client.plugins.observer;

import e4.k;
import io.ktor.client.statement.HttpResponse;
import io.ktor.utils.io.ByteReadChannel;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12134k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ByteReadChannel f12135l;

    public /* synthetic */ b(ByteReadChannel byteReadChannel, int i7) {
        this.f12134k = i7;
        this.f12135l = byteReadChannel;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f12134k) {
            case 0:
                return ResponseObserverKt$ResponseObserver$2$1.invokeSuspend$lambda$0(this.f12135l, (HttpResponse) obj);
            case 1:
                return ResponseObserverKt$ResponseObserver$2$1.invokeSuspend$lambda$1(this.f12135l, (HttpResponse) obj);
            case 2:
                return DelegatedCallKt.wrapWithContent$lambda$0(this.f12135l, (HttpResponse) obj);
            default:
                return DelegatedCallKt.wrap$lambda$2(this.f12135l, (HttpResponse) obj);
        }
    }
}

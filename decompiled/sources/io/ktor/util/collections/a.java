package io.ktor.util.collections;

import e4.InterfaceC0821a;
import e4.k;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12191k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0821a f12192l;

    public /* synthetic */ a(InterfaceC0821a interfaceC0821a, int i7) {
        this.f12191k = i7;
        this.f12192l = interfaceC0821a;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f12191k) {
            case 0:
                return ConcurrentMap.computeIfAbsent$lambda$0(this.f12192l, obj);
            case 1:
                return ByteWriteChannelOperationsKt.invokeOnCompletion$lambda$0(this.f12192l, (Throwable) obj);
            default:
                l.f("it", obj);
                return this.f12192l.invoke();
        }
    }
}

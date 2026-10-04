package L;

import l4.InterfaceC1424c;
import l4.InterfaceC1439r;
import l4.InterfaceC1440s;

/* renamed from: L.v1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0425v1 extends kotlin.jvm.internal.s implements InterfaceC1440s {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5876k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0425v1(int i7, int i8, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i7);
        this.f5876k = i8;
    }

    @Override // kotlin.jvm.internal.AbstractC1403c
    public final InterfaceC1424c computeReflected() {
        return kotlin.jvm.internal.y.a.g(this);
    }

    @Override // l4.InterfaceC1440s
    public final Object get() {
        switch (this.f5876k) {
        }
        return ((O.R0) this.receiver).getValue();
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        return get();
    }

    @Override // l4.InterfaceC1443v
    public final InterfaceC1439r getGetter() {
        return ((InterfaceC1440s) getReflected()).getGetter();
    }
}

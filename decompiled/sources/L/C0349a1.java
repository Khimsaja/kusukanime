package L;

import e4.InterfaceC0821a;
import z.C2425d;

/* renamed from: L.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0349a1 extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5444l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0821a f5445m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0349a1(InterfaceC0821a interfaceC0821a, int i7) {
        super(0);
        this.f5444l = i7;
        this.f5445m = interfaceC0821a;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f5444l) {
            case 0:
                this.f5445m.invoke();
                return Boolean.TRUE;
            case 1:
                this.f5445m.invoke();
                return Boolean.TRUE;
            case 2:
                return Float.valueOf(e3.c.j(((Number) this.f5445m.invoke()).floatValue(), 0.0f, 1.0f));
            default:
                return new C2425d(0, 0.0f, this.f5445m);
        }
    }
}

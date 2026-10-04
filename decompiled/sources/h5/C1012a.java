package h5;

import kotlin.jvm.internal.l;
import n5.AbstractC1586x;
import u4.InterfaceC2096b;
import u4.InterfaceC2099e;

/* renamed from: h5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1012a extends Q4.c implements InterfaceC1015d {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f11852l = 1;

    /* renamed from: m, reason: collision with root package name */
    public final W4.e f11853m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f11854n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1012a(InterfaceC2096b interfaceC2096b, AbstractC1586x abstractC1586x, W4.e eVar) {
        super(abstractC1586x);
        l.f("declarationDescriptor", interfaceC2096b);
        l.f("receiverType", abstractC1586x);
        this.f11854n = interfaceC2096b;
        this.f11853m = eVar;
    }

    public final W4.e L0() {
        switch (this.f11852l) {
        }
        return this.f11853m;
    }

    public final String toString() {
        switch (this.f11852l) {
            case 0:
                return getType() + ": Ctx { " + ((InterfaceC2099e) this.f11854n) + " }";
            default:
                return "Cxt { " + ((InterfaceC2096b) this.f11854n) + " }";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1012a(InterfaceC2099e interfaceC2099e, AbstractC1586x abstractC1586x, W4.e eVar) {
        super(abstractC1586x);
        l.f("receiverType", abstractC1586x);
        this.f11854n = interfaceC2099e;
        this.f11853m = eVar;
    }
}

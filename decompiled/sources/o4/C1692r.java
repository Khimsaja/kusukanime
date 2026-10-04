package o4;

import e4.InterfaceC0821a;
import u4.InterfaceC2093I;
import u4.InterfaceC2097c;

/* renamed from: o4.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1692r implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13743k;

    /* renamed from: l, reason: collision with root package name */
    public final int f13744l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f13745m;

    public /* synthetic */ C1692r(int i7, int i8, Object obj) {
        this.f13743k = i8;
        this.f13745m = obj;
        this.f13744l = i7;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f13743k) {
            case 0:
                Object obj = ((InterfaceC2097c) this.f13745m).m0().get(this.f13744l);
                kotlin.jvm.internal.l.e("get(...)", obj);
                return (InterfaceC2093I) obj;
            default:
                return (InterfaceC2093I) this.f13745m.get(this.f13744l);
        }
    }
}

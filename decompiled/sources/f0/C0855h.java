package f0;

import O3.C;

/* renamed from: f0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0855h extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: m, reason: collision with root package name */
    public static final C0855h f11398m = new C0855h(1, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final C0855h f11399n = new C0855h(1, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final C0855h f11400o = new C0855h(1, 2);

    /* renamed from: p, reason: collision with root package name */
    public static final C0855h f11401p = new C0855h(1, 3);

    /* renamed from: q, reason: collision with root package name */
    public static final C0855h f11402q = new C0855h(1, 4);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f11403l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0855h(int i7, int i8) {
        super(i7);
        this.f11403l = i8;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f11403l) {
            case 0:
                ((InterfaceC0857j) obj).b(false);
                return C.a;
            case 1:
                int i7 = ((C0849b) obj).a;
                return C0862o.f11417b;
            case 2:
                int i8 = ((C0849b) obj).a;
                return C0862o.f11417b;
            case 3:
                Boolean boolB = AbstractC0851d.B((C0866s) obj, 7);
                return Boolean.valueOf(boolB != null ? boolB.booleanValue() : false);
            default:
                Boolean boolB2 = AbstractC0851d.B((C0866s) obj, 7);
                return Boolean.valueOf(boolB2 != null ? boolB2.booleanValue() : false);
        }
    }
}

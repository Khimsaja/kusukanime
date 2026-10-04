package d;

import O.C0486d;
import O.C0510p;
import O3.C;
import P3.r;
import e4.InterfaceC0821a;
import e4.n;

/* renamed from: d.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0770d extends kotlin.jvm.internal.m implements n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f11177l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f11178m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ O3.e f11179n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0770d(boolean z7, O3.e eVar, int i7, int i8) {
        super(2);
        this.f11177l = i8;
        this.f11178m = z7;
        this.f11179n = eVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f11177l;
        C0510p c0510p = (C0510p) obj;
        ((Number) obj2).intValue();
        switch (i7) {
            case 0:
                r.a(this.f11178m, (InterfaceC0821a) this.f11179n, c0510p, C0486d.V(1));
                break;
            default:
                android.support.v4.media.session.b.f(this.f11178m, (n) this.f11179n, c0510p, C0486d.V(1));
                break;
        }
        return C.a;
    }
}

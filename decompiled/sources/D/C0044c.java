package D;

import O.C0486d;
import O.C0510p;

/* renamed from: D.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0044c extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a0.q f1129l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1130m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1131n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0044c(a0.q qVar, int i7, int i8) {
        super(2);
        this.f1129l = qVar;
        this.f1130m = i7;
        this.f1131n = i8;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iV = C0486d.V(this.f1130m | 1);
        int i7 = this.f1131n;
        AbstractC0052g.b(this.f1129l, (C0510p) obj, iV, i7);
        return O3.C.a;
    }
}

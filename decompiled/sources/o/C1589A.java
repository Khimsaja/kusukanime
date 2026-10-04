package o;

import D.C0056i;
import h0.C0975U;
import j0.AbstractC1299e;
import j0.InterfaceC1298d;
import w0.AbstractC2182Q;
import w0.S;
import y0.C2351F;

/* renamed from: o.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1589A extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f13460l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f13461m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f13462n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f13463o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f13464p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1589A(Object obj, long j7, long j8, Object obj2, int i7) {
        super(1);
        this.f13460l = i7;
        this.f13463o = obj;
        this.f13461m = j7;
        this.f13462n = j8;
        this.f13464p = obj2;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f13460l) {
            case 0:
                AbstractC2182Q abstractC2182Q = (AbstractC2182Q) obj;
                long j7 = this.f13461m;
                long j8 = this.f13462n;
                C0056i c0056i = (C0056i) this.f13464p;
                S s7 = (S) this.f13463o;
                abstractC2182Q.getClass();
                long jB = P3.F.b(((int) (j7 >> 32)) + ((int) (j8 >> 32)), ((int) (j7 & 4294967295L)) + ((int) (j8 & 4294967295L)));
                AbstractC2182Q.a(abstractC2182Q, s7);
                s7.j0(T0.h.c(jB, s7.f16844o), 0.0f, c0056i);
                break;
            default:
                C2351F c2351f = (C2351F) obj;
                c2351f.b();
                InterfaceC1298d.o0(c2351f, (C0975U) this.f13463o, this.f13461m, this.f13462n, 0.0f, (AbstractC1299e) this.f13464p, 104);
                break;
        }
        return O3.C.a;
    }
}

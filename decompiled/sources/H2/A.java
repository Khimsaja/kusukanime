package H2;

import G2.E;
import O.C0486d;
import O.C0510p;
import O3.C;

/* loaded from: classes.dex */
public final class A extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3593l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ E f3594m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ G2.B f3595n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a0.q f3596o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ a0.i f3597p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.m f3598q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.m f3599r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.m f3600s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.m f3601t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3602u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public A(E e7, G2.B b4, a0.q qVar, a0.i iVar, e4.k kVar, e4.k kVar2, e4.k kVar3, e4.k kVar4, int i7, int i8) {
        super(2);
        this.f3593l = i8;
        switch (i8) {
            case 1:
                this.f3594m = e7;
                this.f3595n = b4;
                this.f3596o = qVar;
                this.f3597p = iVar;
                this.f3598q = (kotlin.jvm.internal.m) kVar;
                this.f3599r = (kotlin.jvm.internal.m) kVar2;
                this.f3600s = (kotlin.jvm.internal.m) kVar3;
                this.f3601t = (kotlin.jvm.internal.m) kVar4;
                this.f3602u = i7;
                super(2);
                break;
            case 2:
                this.f3594m = e7;
                this.f3595n = b4;
                this.f3596o = qVar;
                this.f3597p = iVar;
                this.f3598q = (kotlin.jvm.internal.m) kVar;
                this.f3599r = (kotlin.jvm.internal.m) kVar2;
                this.f3600s = (kotlin.jvm.internal.m) kVar3;
                this.f3601t = (kotlin.jvm.internal.m) kVar4;
                this.f3602u = i7;
                super(2);
                break;
            default:
                this.f3594m = e7;
                this.f3595n = b4;
                this.f3596o = qVar;
                this.f3597p = iVar;
                this.f3598q = (kotlin.jvm.internal.m) kVar;
                this.f3599r = (kotlin.jvm.internal.m) kVar2;
                this.f3600s = (kotlin.jvm.internal.m) kVar3;
                this.f3601t = (kotlin.jvm.internal.m) kVar4;
                this.f3602u = i7;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [e4.k, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r4v1, types: [e4.k, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r5v0, types: [e4.k, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r5v1, types: [e4.k, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r5v2, types: [e4.k, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r6v0, types: [e4.k, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r6v1, types: [e4.k, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r6v2, types: [e4.k, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r7v0, types: [e4.k, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r7v1, types: [e4.k, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r7v2, types: [e4.k, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r8v4, types: [e4.k, kotlin.jvm.internal.m] */
    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3593l) {
            case 0:
                ((Number) obj2).intValue();
                int iV = C0486d.V(this.f3602u | 1);
                ?? r7 = this.f3601t;
                ?? r42 = this.f3598q;
                ?? r52 = this.f3599r;
                ?? r62 = this.f3600s;
                android.support.v4.media.session.b.c(this.f3594m, this.f3595n, this.f3596o, this.f3597p, r42, r52, r62, r7, (C0510p) obj, iV);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iV2 = C0486d.V(this.f3602u | 1);
                ?? r72 = this.f3601t;
                ?? r43 = this.f3598q;
                ?? r53 = this.f3599r;
                ?? r63 = this.f3600s;
                android.support.v4.media.session.b.c(this.f3594m, this.f3595n, this.f3596o, this.f3597p, r43, r53, r63, r72, (C0510p) obj, iV2);
                break;
            default:
                ((Number) obj2).intValue();
                int iV3 = C0486d.V(this.f3602u | 1);
                ?? r8 = this.f3601t;
                ?? r54 = this.f3598q;
                ?? r64 = this.f3599r;
                ?? r73 = this.f3600s;
                android.support.v4.media.session.b.c(this.f3594m, this.f3595n, this.f3596o, this.f3597p, r54, r64, r73, r8, (C0510p) obj, iV3);
                break;
        }
        return C.a;
    }
}

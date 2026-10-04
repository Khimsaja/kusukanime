package t;

import D.F0;
import H5.A;
import O3.C;
import P3.r;
import e4.n;
import f1.AbstractC0871d;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import n5.P;
import p.AbstractC1745d;
import p.B0;
import p.C0;
import p.C1752g0;
import p.C1761m;
import p.C1762n;
import p.C1772x;
import s.C1950y0;
import s.EnumC1903a0;
import z.C2425d;
import z.v;

/* renamed from: t.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2024d extends U3.j implements n {

    /* renamed from: k, reason: collision with root package name */
    public u f15849k;

    /* renamed from: l, reason: collision with root package name */
    public int f15850l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2027g f15851m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f15852n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m f15853o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1950y0 f15854p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2024d(C2027g c2027g, float f5, e4.k kVar, C1950y0 c1950y0, S3.c cVar) {
        super(2, cVar);
        this.f15851m = c2027g;
        this.f15852n = f5;
        this.f15853o = (m) kVar;
        this.f15854p = c1950y0;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [e4.k, kotlin.jvm.internal.m] */
    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C2024d(this.f15851m, this.f15852n, this.f15853o, this.f15854p, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2024d) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [e4.k, kotlin.jvm.internal.m] */
    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        float f5;
        T3.a aVar;
        long j7;
        float f7;
        u uVar;
        Object objB;
        float f8;
        float f9;
        T3.a aVar2 = T3.a.f9048k;
        int i7 = this.f15850l;
        ?? r9 = this.f15853o;
        C2027g c2027g = this.f15851m;
        if (i7 == 0) {
            r.Y(obj);
            C1772x c1772x = c2027g.f15861b;
            B0 b02 = C0.a;
            A2.b bVar = new A2.b(13, c1772x.a);
            C1762n c1762n = new C1762n(0.0f);
            float f10 = this.f15852n;
            float f11 = ((C1762n) bVar.u(c1762n, new C1762n(f10))).a;
            C2425d c2425d = (C2425d) c2027g.a.f13378l;
            int iM = ((v) c2425d.f18417o.getValue()).f18521c + c2425d.m();
            if (iM == 0) {
                aVar = aVar2;
                f7 = 0.0f;
                f5 = 0.0f;
            } else {
                int i8 = f10 < 0.0f ? c2425d.f18406d + 1 : c2425d.f18406d;
                int iK = e3.c.k(((int) (f11 / iM)) + i8, 0, c2425d.l());
                c2425d.m();
                int i9 = ((v) c2425d.f18417o.getValue()).f18521c;
                long j8 = i8;
                f5 = 0.0f;
                long j9 = 1;
                long j10 = j8 - j9;
                if (j10 < 0) {
                    aVar = aVar2;
                    j7 = 0;
                } else {
                    aVar = aVar2;
                    j7 = j10;
                }
                int i10 = (int) j7;
                long j11 = j8 + j9;
                if (j11 > 2147483647L) {
                    j11 = 2147483647L;
                }
                int iAbs = Math.abs((e3.c.k(e3.c.k(iK, i10, (int) j11), 0, c2425d.l()) - i8) * iM) - iM;
                if (iAbs < 0) {
                    iAbs = 0;
                }
                f7 = iAbs == 0 ? iAbs : iAbs * Math.signum(f10);
            }
            if (Float.isNaN(f7)) {
                throw new IllegalStateException("calculateApproachOffset returned NaN. Please use a valid value.");
            }
            uVar = new u();
            float fSignum = Math.signum(f10) * Math.abs(f7);
            uVar.f12717k = fSignum;
            r9.invoke(new Float(fSignum));
            float f12 = uVar.f12717k;
            C2023c c2023c = new C2023c(uVar, r9, 1);
            this.f15849k = uVar;
            this.f15850l = 1;
            objB = C2027g.b(this.f15851m, this.f15854p, f12, this.f15852n, c2023c, this);
            aVar2 = aVar;
            if (objB != aVar2) {
            }
        }
        if (i7 != 1) {
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.Y(obj);
            return obj;
        }
        u uVar2 = this.f15849k;
        r.Y(obj);
        uVar = uVar2;
        f5 = 0.0f;
        objB = obj;
        C1761m c1761m = (C1761m) objB;
        P p7 = c2027g.a;
        float fFloatValue = ((Number) c1761m.a()).floatValue();
        C2425d c2425d2 = (C2425d) p7.f13378l;
        l lVar = c2425d2.k().f18531m;
        ?? r10 = c2425d2.k().a;
        int size = r10.size();
        int i11 = 0;
        float f13 = Float.NEGATIVE_INFINITY;
        float f14 = Float.POSITIVE_INFINITY;
        while (i11 < size) {
            z.j jVar = (z.j) r10.get(i11);
            float f15 = f5;
            v vVarK = c2425d2.k();
            EnumC1903a0 enumC1903a0 = vVarK.f18523e;
            float f16 = fFloatValue;
            EnumC1903a0 enumC1903a02 = EnumC1903a0.f15259k;
            vVarK.a();
            int i12 = c2425d2.k().f18524f;
            int i13 = c2425d2.k().f18522d;
            int i14 = c2425d2.k().f18520b;
            int i15 = jVar.f18485l;
            c2425d2.l();
            lVar.getClass();
            float f17 = i15 - 0;
            if (f17 <= f15 && f17 > f13) {
                f13 = f17;
            }
            if (f17 >= f15 && f17 < f14) {
                f14 = f17;
            }
            i11++;
            f5 = f15;
            fFloatValue = f16;
        }
        float f18 = fFloatValue;
        float f19 = f5;
        if (f13 == Float.NEGATIVE_INFINITY) {
            f13 = f14;
        }
        if (f14 == Float.POSITIVE_INFINITY) {
            f14 = f13;
        }
        boolean z7 = AbstractC0871d.P(c2425d2) == f19;
        if (!c2425d2.c()) {
            if (z7 || !AbstractC0871d.j0(c2425d2)) {
                f14 = f19;
            } else {
                f13 = f19;
                f14 = f13;
            }
        }
        if (c2425d2.a()) {
            f8 = f13;
            f9 = f14;
        } else if (z7 || AbstractC0871d.j0(c2425d2)) {
            f9 = f14;
            f8 = f19;
        } else {
            f8 = f19;
            f9 = f8;
        }
        float fFloatValue2 = ((Number) ((F0) p7.f13379m).invoke(Float.valueOf(f18), Float.valueOf(f8), Float.valueOf(f9))).floatValue();
        if (fFloatValue2 != f8 && fFloatValue2 != f9 && fFloatValue2 != f19) {
            throw new IllegalStateException(("Final Snapping Offset Should Be one of " + f8 + ", " + f9 + " or 0.0").toString());
        }
        if (fFloatValue2 == Float.POSITIVE_INFINITY || fFloatValue2 == Float.NEGATIVE_INFINITY) {
            fFloatValue2 = f19;
        }
        if (Float.isNaN(fFloatValue2)) {
            throw new IllegalStateException("calculateSnapOffset returned NaN. Please use a valid value.");
        }
        uVar.f12717k = fFloatValue2;
        C1761m c1761mL = AbstractC1745d.l(c1761m, f19, f19, 30);
        C1752g0 c1752g0 = c2027g.f15862c;
        C2023c c2023c2 = new C2023c(uVar, r9, 0);
        this.f15849k = null;
        this.f15850l = 2;
        Object objB2 = k.b(this.f15854p, fFloatValue2, fFloatValue2, c1761mL, c1752g0, c2023c2, this);
        return objB2 == aVar2 ? aVar2 : objB2;
    }
}

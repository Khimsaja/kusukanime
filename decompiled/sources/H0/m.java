package H0;

import android.text.Layout;
import h0.C0985h;
import h0.C0990m;
import j0.C1296b;
import j0.InterfaceC1298d;
import java.io.Serializable;
import l4.AbstractC1420H;
import y0.C2351F;

/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3123l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f3124m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f3125n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Serializable f3126o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f3127p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(long j7, float[] fArr, kotlin.jvm.internal.v vVar, kotlin.jvm.internal.u uVar) {
        super(1);
        this.f3124m = j7;
        this.f3125n = fArr;
        this.f3126o = vVar;
        this.f3127p = uVar;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        C0209a c0209a;
        long j7;
        boolean z7;
        float fA;
        float fA2;
        switch (this.f3123l) {
            case 0:
                p pVar = (p) obj;
                int i7 = pVar.f3137b;
                long j8 = this.f3124m;
                int iE = i7 > H.e(j8) ? pVar.f3137b : H.e(j8);
                int iD = H.d(j8);
                int iD2 = pVar.f3138c;
                if (iD2 >= iD) {
                    iD2 = H.d(j8);
                }
                long jC = AbstractC1420H.c(pVar.b(iE), pVar.b(iD2));
                kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) this.f3126o;
                int i8 = vVar.f12718k;
                C0209a c0209a2 = pVar.a;
                int iE2 = H.e(jC);
                int iD3 = H.d(jC);
                I0.y yVar = c0209a2.f3098d;
                Layout layout = yVar.f3924e;
                int length = layout.getText().length();
                if (iE2 < 0) {
                    throw new IllegalArgumentException("startOffset must be > 0");
                }
                if (iE2 >= length) {
                    throw new IllegalArgumentException("startOffset must be less than text length");
                }
                if (iD3 <= iE2) {
                    throw new IllegalArgumentException("endOffset must be greater than startOffset");
                }
                if (iD3 > length) {
                    throw new IllegalArgumentException("endOffset must be smaller or equal to text length");
                }
                int i9 = (iD3 - iE2) * 4;
                float[] fArr = (float[]) this.f3125n;
                if (fArr.length - i8 < i9) {
                    throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(iE2);
                int lineForOffset2 = layout.getLineForOffset(iD3 - 1);
                E0.j jVar = new E0.j(yVar);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        int iF = yVar.f(lineForOffset);
                        int iMax = Math.max(iE2, lineStart);
                        int iMin = Math.min(iD3, iF);
                        float fG = yVar.g(lineForOffset);
                        float fE = yVar.e(lineForOffset);
                        c0209a = c0209a2;
                        j7 = jC;
                        boolean z8 = false;
                        boolean z9 = layout.getParagraphDirection(lineForOffset) == 1;
                        while (iMax < iMin) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(iMax);
                            if (!z9 || zIsRtlCharAt) {
                                if (z9 && zIsRtlCharAt) {
                                    z8 = false;
                                    float fA3 = jVar.a(iMax, false, false, false);
                                    z7 = z9;
                                    fA = jVar.a(iMax + 1, true, true, false);
                                    fA2 = fA3;
                                } else {
                                    z7 = z9;
                                    z8 = false;
                                    if (z7 || !zIsRtlCharAt) {
                                        fA = jVar.a(iMax, false, false, false);
                                        fA2 = jVar.a(iMax + 1, true, true, false);
                                    } else {
                                        fA2 = jVar.a(iMax, false, false, true);
                                        fA = jVar.a(iMax + 1, true, true, true);
                                    }
                                }
                                fArr[i8] = fA;
                                fArr[i8 + 1] = fG;
                                fArr[i8 + 2] = fA2;
                                fArr[i8 + 3] = fE;
                                i8 += 4;
                                iMax++;
                                z9 = z7;
                            } else {
                                fA = jVar.a(iMax, z8, z8, true);
                                z7 = z9;
                                fA2 = jVar.a(iMax + 1, true, true, true);
                            }
                            z8 = false;
                            fArr[i8] = fA;
                            fArr[i8 + 1] = fG;
                            fArr[i8 + 2] = fA2;
                            fArr[i8 + 3] = fE;
                            i8 += 4;
                            iMax++;
                            z9 = z7;
                        }
                        if (lineForOffset != lineForOffset2) {
                            lineForOffset++;
                            c0209a2 = c0209a;
                            jC = j7;
                        }
                    }
                } else {
                    c0209a = c0209a2;
                    j7 = jC;
                }
                int iC = (H.c(j7) * 4) + vVar.f12718k;
                int i10 = vVar.f12718k;
                while (true) {
                    kotlin.jvm.internal.u uVar = (kotlin.jvm.internal.u) this.f3127p;
                    if (i10 >= iC) {
                        vVar.f12718k = iC;
                        uVar.f12717k = c0209a.b() + uVar.f12717k;
                        return O3.C.a;
                    }
                    int i11 = i10 + 1;
                    float f5 = fArr[i11];
                    float f7 = uVar.f12717k;
                    fArr[i11] = f5 + f7;
                    int i12 = i10 + 3;
                    fArr[i12] = fArr[i12] + f7;
                    i10 += 4;
                }
            default:
                C2351F c2351f = (C2351F) obj;
                c2351f.b();
                g0.d dVar = (g0.d) this.f3125n;
                kotlin.jvm.internal.x xVar = (kotlin.jvm.internal.x) this.f3126o;
                long j9 = this.f3124m;
                C0990m c0990m = (C0990m) this.f3127p;
                C1296b c1296b = c2351f.f17696k;
                X4.y yVar2 = (X4.y) c1296b.f12205l.f416l;
                float f8 = dVar.a;
                float f9 = dVar.f11659b;
                yVar2.G(f8, f9);
                try {
                    InterfaceC1298d.A(c2351f, (C0985h) xVar.f12720k, j9, 0L, 0.0f, c0990m, 0, 890);
                    ((X4.y) c1296b.f12205l.f416l).G(-f8, -f9);
                    return O3.C.a;
                } catch (Throwable th) {
                    ((X4.y) c1296b.f12205l.f416l).G(-f8, -f9);
                    throw th;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(g0.d dVar, kotlin.jvm.internal.x xVar, long j7, C0990m c0990m) {
        super(1);
        this.f3125n = dVar;
        this.f3126o = xVar;
        this.f3124m = j7;
        this.f3127p = c0990m;
    }
}

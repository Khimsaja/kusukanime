package androidx.compose.foundation.lazy.layout;

import a0.p;
import a0.q;
import java.util.ArrayList;
import kotlin.jvm.internal.l;
import m.AbstractC1475E;
import m.AbstractC1476F;
import m.C1472B;
import m.C1504y;
import v.c0;
import y.C2334o;
import y.InterfaceC2341v;
import y.InterfaceC2344y;
import y0.S;

/* loaded from: classes.dex */
public final class a {
    public final C1504y a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC2341v f10599b;

    /* renamed from: c, reason: collision with root package name */
    public final C1472B f10600c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f10601d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f10602e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f10603f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f10604g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f10605h;

    /* renamed from: i, reason: collision with root package name */
    public final q f10606i;

    public a() {
        long[] jArr = AbstractC1475E.a;
        this.a = new C1504y();
        int i7 = AbstractC1476F.a;
        this.f10600c = new C1472B();
        this.f10601d = new ArrayList();
        this.f10602e = new ArrayList();
        this.f10603f = new ArrayList();
        this.f10604g = new ArrayList();
        this.f10605h = new ArrayList();
        this.f10606i = new S(this) { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$DisplayingDisappearingItemsElement
            public final a a;

            {
                this.a = this;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) && l.a(this.a, ((LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) obj).a);
            }

            @Override // y0.S
            public final p h() {
                C2334o c2334o = new C2334o();
                c2334o.f17631x = this.a;
                return c2334o;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            @Override // y0.S
            public final void m(p pVar) {
                C2334o c2334o = (C2334o) pVar;
                a aVar = c2334o.f17631x;
                a aVar2 = this.a;
                if (l.a(aVar, aVar2) || !c2334o.f10402k.f10414w) {
                    return;
                }
                c2334o.f17631x.d();
                aVar2.getClass();
                c2334o.f17631x = aVar2;
            }

            public final String toString() {
                return "DisplayingDisappearingItemsElement(animator=" + this.a + ')';
            }
        };
    }

    public static int e(int[] iArr, InterfaceC2344y interfaceC2344y) {
        int iF = interfaceC2344y.f();
        int iD = interfaceC2344y.d() + iF;
        int iMax = 0;
        while (iF < iD) {
            int iB = interfaceC2344y.b() + iArr[iF];
            iArr[iF] = iB;
            iMax = Math.max(iMax, iB);
            iF++;
        }
        return iMax;
    }

    public final void a(int i7, Object obj) {
        c0.e(this.a.e(obj));
    }

    public final long b() {
        ArrayList arrayList = this.f10605h;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        c0.e(arrayList.get(0));
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r25, int r26, java.util.ArrayList r27, C2.H r28, y.InterfaceC2345z r29, boolean r30, int r31, boolean r32, int r33, int r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.a.c(int, int, java.util.ArrayList, C2.H, y.z, boolean, int, boolean, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r15 = this;
            m.y r0 = r15.a
            int r1 = r0.f12943e
            if (r1 == 0) goto L4e
            java.lang.Object[] r1 = r0.f12941c
            long[] r2 = r0.a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L4b
            r4 = 0
            r5 = r4
        L11:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L46
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L2b:
            if (r10 >= r8) goto L44
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.32E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 < 0) goto L3a
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L2b
        L3a:
            int r0 = r5 << 3
            int r0 = r0 + r10
            r0 = r1[r0]
            v.c0.e(r0)
            r0 = 0
            throw r0
        L44:
            if (r8 != r9) goto L4b
        L46:
            if (r5 == r3) goto L4b
            int r5 = r5 + 1
            goto L11
        L4b:
            r0.a()
        L4e:
            y.u r0 = y.C2340u.f17642k
            r15.f10599b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.a.d():void");
    }
}

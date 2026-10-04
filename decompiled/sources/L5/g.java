package L5;

import H5.A;
import H5.B;
import H5.D;
import K5.InterfaceC0329h;
import K5.InterfaceC0330i;
import O3.C;
import P3.F;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class g implements q {

    /* renamed from: k, reason: collision with root package name */
    public final S3.h f6169k;

    /* renamed from: l, reason: collision with root package name */
    public final int f6170l;

    /* renamed from: m, reason: collision with root package name */
    public final J5.c f6171m;

    public g(S3.h hVar, int i7, J5.c cVar) {
        this.f6169k = hVar;
        this.f6170l = i7;
        this.f6171m = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // L5.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final K5.InterfaceC0329h b(S3.h r5, int r6, J5.c r7) {
        /*
            r4 = this;
            S3.h r0 = r4.f6169k
            S3.h r5 = r5.plus(r0)
            J5.c r1 = J5.c.f4299k
            J5.c r2 = r4.f6171m
            int r3 = r4.f6170l
            if (r7 == r1) goto Lf
            goto L26
        Lf:
            r7 = -3
            if (r3 != r7) goto L13
            goto L25
        L13:
            if (r6 != r7) goto L17
        L15:
            r6 = r3
            goto L25
        L17:
            r7 = -2
            if (r3 != r7) goto L1b
            goto L25
        L1b:
            if (r6 != r7) goto L1e
            goto L15
        L1e:
            int r6 = r6 + r3
            if (r6 < 0) goto L22
            goto L25
        L22:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L25:
            r7 = r2
        L26:
            boolean r0 = kotlin.jvm.internal.l.a(r5, r0)
            if (r0 == 0) goto L31
            if (r6 != r3) goto L31
            if (r7 != r2) goto L31
            return r4
        L31:
            L5.g r5 = r4.e(r5, r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: L5.g.b(S3.h, int, J5.c):K5.h");
    }

    public String c() {
        return null;
    }

    @Override // K5.InterfaceC0329h
    public Object collect(InterfaceC0330i interfaceC0330i, S3.c cVar) {
        Object objJ = D.j(new e(interfaceC0330i, this, null), cVar);
        return objJ == T3.a.f9048k ? objJ : C.a;
    }

    public abstract Object d(J5.t tVar, S3.c cVar);

    public abstract g e(S3.h hVar, int i7, J5.c cVar);

    public InterfaceC0329h f() {
        return null;
    }

    public J5.u g(A a) {
        int i7 = this.f6170l;
        if (i7 == -3) {
            i7 = -2;
        }
        B b4 = B.f3792m;
        e4.n fVar = new f(this, null);
        J5.s sVar = new J5.s(D.y(a, this.f6169k), F.a(i7, 4, this.f6171m), true, true);
        sVar.b0(b4, sVar, fVar);
        return sVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strC = c();
        if (strC != null) {
            arrayList.add(strC);
        }
        S3.i iVar = S3.i.f8767k;
        S3.h hVar = this.f6169k;
        if (hVar != iVar) {
            arrayList.add("context=" + hVar);
        }
        int i7 = this.f6170l;
        if (i7 != -3) {
            arrayList.add("capacity=" + i7);
        }
        J5.c cVar = J5.c.f4299k;
        J5.c cVar2 = this.f6171m;
        if (cVar2 != cVar) {
            arrayList.add("onBufferOverflow=" + cVar2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return A6.b.j(sb, P3.q.y0(arrayList, ", ", null, null, null, 62), ']');
    }
}

package v3;

import H5.A;
import O.Z;
import O3.C;
import java.util.List;
import z.C2425d;

/* loaded from: classes.dex */
public final class i extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f16564k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f16565l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2425d f16566m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Z f16567n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(List list, C2425d c2425d, Z z7, S3.c cVar) {
        super(2, cVar);
        this.f16565l = list;
        this.f16566m = c2425d;
        this.f16567n = z7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new i(this.f16565l, this.f16566m, this.f16567n, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    /* JADX WARN: Path cross not found for [B:15:0x0036, B:20:0x004b], limit reached: 23 */
    /* JADX WARN: Path cross not found for [B:20:0x004b, B:15:0x0036], limit reached: 23 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0049 -> B:15:0x0036). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005b -> B:15:0x0036). Please report as a decompilation issue!!! */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r7.f16564k
            java.util.List r2 = r7.f16565l
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            P3.r.Y(r8)
            goto L36
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            P3.r.Y(r8)
            goto L41
        L1e:
            P3.r.Y(r8)
            int r8 = r2.size()
            if (r8 < r3) goto L5e
            O.Z r8 = r7.f16567n
            java.lang.Object r8 = r8.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L36
            goto L5e
        L36:
            r7.f16564k = r4
            r5 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r8 = H5.D.k(r5, r7)
            if (r8 != r0) goto L41
            goto L5d
        L41:
            z.d r8 = r7.f16566m
            s.r r1 = r8.f18412j
            boolean r1 = r1.b()
            if (r1 != 0) goto L36
            int r1 = r8.j()
            int r1 = r1 + r4
            int r5 = r2.size()
            int r1 = r1 % r5
            r7.f16564k = r3
            java.lang.Object r8 = z.C.g(r8, r1, r7)
            if (r8 != r0) goto L36
        L5d:
            return r0
        L5e:
            O3.C r8 = O3.C.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

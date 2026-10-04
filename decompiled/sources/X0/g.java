package X0;

import H5.A;
import O3.C;

/* loaded from: classes.dex */
public final class g extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f9712k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f9713l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f9714m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(v vVar, S3.c cVar) {
        super(2, cVar);
        this.f9714m = vVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        g gVar = new g(this.f9714m, cVar);
        gVar.f9713l = obj;
        return gVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    /* JADX WARN: Path cross not found for [B:18:0x005a, B:20:0x005e], limit reached: 25 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0045 -> B:16:0x0048). Please report as a decompilation issue!!! */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r8.f9712k
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            java.lang.Object r1 = r8.f9713l
            H5.A r1 = (H5.A) r1
            P3.r.Y(r9)
            goto L48
        L11:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L19:
            P3.r.Y(r9)
            java.lang.Object r9 = r8.f9713l
            H5.A r9 = (H5.A) r9
            r1 = r9
        L21:
            boolean r9 = H5.D.u(r1)
            if (r9 == 0) goto L68
            X0.b r9 = X0.b.f9695n
            r8.f9713l = r1
            r8.f9712k = r2
            S3.h r3 = r8.getContext()
            z0.v0 r4 = z0.C2474v0.f18935k
            S3.f r3 = r3.get(r4)
            if (r3 != 0) goto L62
            S3.h r3 = r8.getContext()
            O.U r3 = O.C0486d.F(r3)
            java.lang.Object r9 = r3.P(r9, r8)
            if (r9 != r0) goto L48
            return r0
        L48:
            X0.v r9 = r8.f9714m
            int[] r3 = r9.f9754K
            r4 = 0
            r5 = r3[r4]
            r6 = r3[r2]
            android.view.View r7 = r9.f9758v
            r7.getLocationOnScreen(r3)
            r4 = r3[r4]
            if (r5 != r4) goto L5e
            r3 = r3[r2]
            if (r6 == r3) goto L21
        L5e:
            r9.m()
            goto L21
        L62:
            java.lang.ClassCastException r9 = new java.lang.ClassCastException
            r9.<init>()
            throw r9
        L68:
            O3.C r9 = O3.C.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

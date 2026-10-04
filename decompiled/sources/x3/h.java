package x3;

import K5.N;
import K5.Y;
import androidx.lifecycle.O;

/* loaded from: classes.dex */
public final class h extends O {

    /* renamed from: b, reason: collision with root package name */
    public final Y f17330b;

    /* renamed from: c, reason: collision with root package name */
    public final Y f17331c;

    /* renamed from: d, reason: collision with root package name */
    public final Y f17332d;

    /* renamed from: e, reason: collision with root package name */
    public final Y f17333e;

    /* renamed from: f, reason: collision with root package name */
    public final Y f17334f;

    /* renamed from: g, reason: collision with root package name */
    public final Y f17335g;

    /* renamed from: h, reason: collision with root package name */
    public final Y f17336h;

    /* renamed from: i, reason: collision with root package name */
    public final Y f17337i;

    public h() {
        Y yB = N.b(null);
        this.f17330b = yB;
        this.f17331c = yB;
        Y yB2 = N.b(Boolean.FALSE);
        this.f17332d = yB2;
        this.f17333e = yB2;
        Y yB3 = N.b(0);
        this.f17334f = yB3;
        this.f17335g = yB3;
        Y yB4 = N.b(null);
        this.f17336h = yB4;
        this.f17337i = yB4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a7, code lost:
    
        if (r8 != 16) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004b -> B:18:0x004e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(x3.h r16, android.app.DownloadManager r17, long r18, U3.c r20) throws java.lang.Throwable {
        /*
            r0 = r16
            r1 = r20
            r2 = 1
            boolean r3 = r1 instanceof x3.g
            if (r3 == 0) goto L18
            r3 = r1
            x3.g r3 = (x3.g) r3
            int r4 = r3.f17329o
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L18
            int r4 = r4 - r5
            r3.f17329o = r4
            goto L1d
        L18:
            x3.g r3 = new x3.g
            r3.<init>(r0, r1)
        L1d:
            java.lang.Object r1 = r3.f17327m
            T3.a r4 = T3.a.f9048k
            int r5 = r3.f17329o
            if (r5 == 0) goto L38
            if (r5 != r2) goto L30
            long r5 = r3.f17326l
            android.app.DownloadManager r7 = r3.f17325k
            P3.r.Y(r1)
            r1 = r7
            goto L4e
        L30:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L38:
            P3.r.Y(r1)
            r1 = r17
            r5 = r18
        L3f:
            r3.f17325k = r1
            r3.f17326l = r5
            r3.f17329o = r2
            r7 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r7 = H5.D.k(r7, r3)
            if (r7 != r4) goto L4e
            return r4
        L4e:
            android.app.DownloadManager$Query r7 = new android.app.DownloadManager$Query
            r7.<init>()
            long[] r8 = new long[r2]
            r9 = 0
            r8[r9] = r5
            android.app.DownloadManager$Query r7 = r7.setFilterById(r8)
            android.database.Cursor r7 = r1.query(r7)
            boolean r8 = r7.moveToFirst()
            r9 = 0
            if (r8 == 0) goto Laa
            java.lang.String r8 = "bytes_so_far"
            int r8 = r7.getColumnIndexOrThrow(r8)
            long r10 = r7.getLong(r8)
            java.lang.String r8 = "total_size"
            int r8 = r7.getColumnIndexOrThrow(r8)
            long r12 = r7.getLong(r8)
            java.lang.String r8 = "status"
            int r8 = r7.getColumnIndexOrThrow(r8)
            int r8 = r7.getInt(r8)
            r7.close()
            r14 = 0
            int r7 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r7 <= 0) goto La1
            r7 = 100
            long r14 = (long) r7
            long r10 = r10 * r14
            long r10 = r10 / r12
            int r7 = (int) r10
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r7)
            K5.Y r7 = r0.f17334f
            r7.getClass()
            r7.i(r9, r10)
        La1:
            r7 = 8
            if (r8 == r7) goto Laa
            r7 = 16
            if (r8 == r7) goto Laa
            goto L3f
        Laa:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            K5.Y r0 = r0.f17332d
            r0.getClass()
            r0.i(r9, r1)
            O3.C r0 = O3.C.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.h.e(x3.h, android.app.DownloadManager, long, U3.c):java.lang.Object");
    }

    public final void f() {
        this.f17330b.h(null);
        Y y7 = this.f17334f;
        y7.getClass();
        y7.i(null, 0);
        this.f17336h.h(null);
    }
}

package I1;

import H1.C0236q;
import O1.B;
import java.util.HashMap;
import java.util.Random;
import y1.N;
import y1.O;
import y1.P;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: h, reason: collision with root package name */
    public static final C0236q f3967h = new C0236q(1);

    /* renamed from: i, reason: collision with root package name */
    public static final Random f3968i = new Random();

    /* renamed from: d, reason: collision with root package name */
    public k f3971d;

    /* renamed from: f, reason: collision with root package name */
    public String f3973f;
    public final O a = new O();

    /* renamed from: b, reason: collision with root package name */
    public final N f3969b = new N();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3970c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public P f3972e = P.a;

    /* renamed from: g, reason: collision with root package name */
    public long f3974g = -1;

    public final void a(g gVar) {
        long j7 = gVar.f3962c;
        if (j7 != -1) {
            this.f3974g = j7;
        }
        this.f3973f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final I1.g b(int r18, O1.B r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.util.HashMap r3 = r0.f3970c
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L16:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L9d
            java.lang.Object r8 = r4.next()
            I1.g r8 = (I1.g) r8
            long r9 = r8.f3962c
            r11 = -1
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L52
            int r9 = r8.f3961b
            if (r1 != r9) goto L52
            if (r2 == 0) goto L52
            I1.h r9 = r8.f3966g
            java.util.HashMap r10 = r9.f3970c
            java.lang.String r13 = r9.f3973f
            java.lang.Object r10 = r10.get(r13)
            I1.g r10 = (I1.g) r10
            if (r10 == 0) goto L45
            long r13 = r10.f3962c
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 == 0) goto L45
            goto L4a
        L45:
            long r9 = r9.f3974g
            r13 = 1
            long r13 = r13 + r9
        L4a:
            long r9 = r2.f7254d
            int r13 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r13 < 0) goto L52
            r8.f3962c = r9
        L52:
            O1.B r9 = r8.f3963d
            if (r2 != 0) goto L5c
            int r10 = r8.f3961b
            if (r1 != r10) goto L16
            r15 = r11
            goto L81
        L5c:
            long r13 = r2.f7254d
            if (r9 != 0) goto L6e
            boolean r10 = r2.b()
            if (r10 != 0) goto L16
            r15 = r11
            long r11 = r8.f3962c
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 != 0) goto L16
            goto L81
        L6e:
            r15 = r11
            long r10 = r9.f7254d
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 != 0) goto L16
            int r10 = r2.f7252b
            int r11 = r9.f7252b
            if (r10 != r11) goto L16
            int r10 = r2.f7253c
            int r11 = r9.f7253c
            if (r10 != r11) goto L16
        L81:
            long r10 = r8.f3962c
            int r12 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r12 == 0) goto L99
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 >= 0) goto L8c
            goto L99
        L8c:
            if (r12 != 0) goto L16
            int r10 = B1.K.a
            O1.B r10 = r5.f3963d
            if (r10 == 0) goto L16
            if (r9 == 0) goto L16
            r5 = r8
            goto L16
        L99:
            r5 = r8
            r6 = r10
            goto L16
        L9d:
            if (r5 != 0) goto Laf
            H1.q r4 = I1.h.f3967h
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
            I1.g r5 = new I1.g
            r5.<init>(r0, r4, r1, r2)
            r3.put(r4, r5)
        Laf:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: I1.h.b(int, O1.B):I1.g");
    }

    public final synchronized String c(P p7, B b4) {
        return b(p7.g(b4.a, this.f3969b).f17948c, b4).a;
    }

    public final void d(a aVar) {
        B b4;
        boolean zP = aVar.f3937b.p();
        HashMap map = this.f3970c;
        if (zP) {
            String str = this.f3973f;
            if (str != null) {
                g gVar = (g) map.get(str);
                gVar.getClass();
                a(gVar);
                return;
            }
            return;
        }
        g gVar2 = (g) map.get(this.f3973f);
        int i7 = aVar.f3938c;
        B b7 = aVar.f3939d;
        this.f3973f = b(i7, b7).a;
        e(aVar);
        if (b7 == null || !b7.b()) {
            return;
        }
        long j7 = b7.f7254d;
        if (gVar2 != null && gVar2.f3962c == j7 && (b4 = gVar2.f3963d) != null && b4.f7252b == b7.f7252b && b4.f7253c == b7.f7253c) {
            return;
        }
        b(i7, new B(j7, b7.a));
        this.f3971d.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0010, B:9:0x0014, B:11:0x0024, B:20:0x0036, B:22:0x0042, B:24:0x0048, B:14:0x002b, B:30:0x0053, B:32:0x005f, B:33:0x0063, B:35:0x0068, B:37:0x006e, B:39:0x0085, B:40:0x00b2, B:42:0x00b6, B:43:0x00bd, B:45:0x00c7, B:47:0x00cb, B:49:0x00d8, B:52:0x00df), top: B:57:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void e(I1.a r10) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I1.h.e(I1.a):void");
    }
}

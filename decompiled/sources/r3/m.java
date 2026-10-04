package r3;

import H5.D;
import K5.N;
import K5.Y;
import P3.A;
import P3.F;
import P3.J;
import P3.y;
import P3.z;
import androidx.lifecycle.O;
import com.kusukanime.data.UserRepo;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class m extends O {

    /* renamed from: b, reason: collision with root package name */
    public final Y f14903b;

    /* renamed from: c, reason: collision with root package name */
    public final Y f14904c;

    /* renamed from: d, reason: collision with root package name */
    public final Y f14905d;

    /* renamed from: e, reason: collision with root package name */
    public final Y f14906e;

    /* renamed from: f, reason: collision with root package name */
    public final Y f14907f;

    /* renamed from: g, reason: collision with root package name */
    public final Y f14908g;

    /* renamed from: h, reason: collision with root package name */
    public final Y f14909h;

    /* renamed from: i, reason: collision with root package name */
    public final Y f14910i;

    /* renamed from: j, reason: collision with root package name */
    public final Y f14911j;

    /* renamed from: k, reason: collision with root package name */
    public final Y f14912k;

    /* renamed from: l, reason: collision with root package name */
    public final Y f14913l;

    /* renamed from: m, reason: collision with root package name */
    public final Y f14914m;

    /* renamed from: n, reason: collision with root package name */
    public final Y f14915n;

    /* renamed from: o, reason: collision with root package name */
    public final Y f14916o;

    /* renamed from: p, reason: collision with root package name */
    public final Y f14917p;

    /* renamed from: q, reason: collision with root package name */
    public final Y f14918q;

    /* renamed from: r, reason: collision with root package name */
    public final UserRepo f14919r;

    /* renamed from: s, reason: collision with root package name */
    public String f14920s;

    /* renamed from: t, reason: collision with root package name */
    public String f14921t;

    public m() {
        Y yB = N.b(y.f7779k);
        this.f14903b = yB;
        this.f14904c = yB;
        Y yB2 = N.b(Boolean.TRUE);
        this.f14905d = yB2;
        this.f14906e = yB2;
        Y yB3 = N.b(Boolean.FALSE);
        this.f14907f = yB3;
        this.f14908g = yB3;
        Y yB4 = N.b(z.f7780k);
        this.f14909h = yB4;
        this.f14910i = yB4;
        Y yB5 = N.b(A.f7737k);
        this.f14911j = yB5;
        this.f14912k = yB5;
        Y yB6 = N.b("");
        this.f14913l = yB6;
        this.f14914m = yB6;
        Y yB7 = N.b(null);
        this.f14915n = yB7;
        this.f14916o = yB7;
        Y yB8 = N.b(null);
        this.f14917p = yB8;
        this.f14918q = yB8;
        this.f14919r = new UserRepo();
        this.f14920s = "";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(r3.m r6, java.util.List r7, U3.c r8) throws java.lang.Throwable {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof r3.k
            if (r0 == 0) goto L16
            r0 = r8
            r3.k r0 = (r3.k) r0
            int r1 = r0.f14896m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f14896m = r1
            goto L1b
        L16:
            r3.k r0 = new r3.k
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r8 = r0.f14894k
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f14896m
            r3 = 10
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            P3.r.Y(r8)     // Catch: java.lang.Throwable -> Ldb
            goto L63
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            P3.r.Y(r8)
            com.kusukanime.data.UserRepo r8 = r6.f14919r     // Catch: java.lang.Throwable -> Ldb
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ldb
            int r5 = P3.r.p(r7, r3)     // Catch: java.lang.Throwable -> Ldb
            r2.<init>(r5)     // Catch: java.lang.Throwable -> Ldb
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> Ldb
        L46:
            boolean r5 = r7.hasNext()     // Catch: java.lang.Throwable -> Ldb
            if (r5 == 0) goto L5a
            java.lang.Object r5 = r7.next()     // Catch: java.lang.Throwable -> Ldb
            com.kusukanime.data.CommentRow r5 = (com.kusukanime.data.CommentRow) r5     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r5 = r5.getId()     // Catch: java.lang.Throwable -> Ldb
            r2.add(r5)     // Catch: java.lang.Throwable -> Ldb
            goto L46
        L5a:
            r0.f14896m = r4     // Catch: java.lang.Throwable -> Ldb
            java.lang.Object r8 = r8.commentLikes(r2, r0)     // Catch: java.lang.Throwable -> Ldb
            if (r8 != r1) goto L63
            return r1
        L63:
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Throwable -> Ldb
            K5.Y r7 = r6.f14909h     // Catch: java.lang.Throwable -> Ldb
            T4.i r0 = new T4.i     // Catch: java.lang.Throwable -> Ldb
            r0.<init>(r8)     // Catch: java.lang.Throwable -> Ldb
            java.util.Map r0 = android.support.v4.media.session.b.m(r0)     // Catch: java.lang.Throwable -> Ldb
            r7.h(r0)     // Catch: java.lang.Throwable -> Ldb
            r7 = 0
            com.kusukanime.data.SbClient r0 = com.kusukanime.data.SbClient.INSTANCE     // Catch: java.lang.Throwable -> L89
            io.github.jan.supabase.SupabaseClient r0 = r0.get()     // Catch: java.lang.Throwable -> L89
            io.github.jan.supabase.auth.Auth r0 = io.github.jan.supabase.auth.AuthKt.getAuth(r0)     // Catch: java.lang.Throwable -> L89
            io.github.jan.supabase.auth.user.UserInfo r0 = r0.currentUserOrNull()     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L89
            java.lang.String r0 = r0.getId()     // Catch: java.lang.Throwable -> L89
            goto L8a
        L89:
            r0 = r7
        L8a:
            K5.Y r6 = r6.f14911j     // Catch: java.lang.Throwable -> Ldb
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ldb
            r1.<init>()     // Catch: java.lang.Throwable -> Ldb
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> Ldb
        L95:
            boolean r2 = r8.hasNext()     // Catch: java.lang.Throwable -> Ldb
            if (r2 == 0) goto Lb0
            java.lang.Object r2 = r8.next()     // Catch: java.lang.Throwable -> Ldb
            r4 = r2
            com.kusukanime.data.LikeRow r4 = (com.kusukanime.data.LikeRow) r4     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r4 = r4.getUser_id()     // Catch: java.lang.Throwable -> Ldb
            boolean r4 = kotlin.jvm.internal.l.a(r4, r0)     // Catch: java.lang.Throwable -> Ldb
            if (r4 == 0) goto L95
            r1.add(r2)     // Catch: java.lang.Throwable -> Ldb
            goto L95
        Lb0:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ldb
            int r0 = P3.r.p(r1, r3)     // Catch: java.lang.Throwable -> Ldb
            r8.<init>(r0)     // Catch: java.lang.Throwable -> Ldb
            java.util.Iterator r0 = r1.iterator()     // Catch: java.lang.Throwable -> Ldb
        Lbd:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> Ldb
            if (r1 == 0) goto Ld1
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> Ldb
            com.kusukanime.data.LikeRow r1 = (com.kusukanime.data.LikeRow) r1     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r1 = r1.getTarget_id()     // Catch: java.lang.Throwable -> Ldb
            r8.add(r1)     // Catch: java.lang.Throwable -> Ldb
            goto Lbd
        Ld1:
            java.util.Set r8 = P3.q.X0(r8)     // Catch: java.lang.Throwable -> Ldb
            r6.getClass()     // Catch: java.lang.Throwable -> Ldb
            r6.i(r7, r8)     // Catch: java.lang.Throwable -> Ldb
        Ldb:
            O3.C r6 = O3.C.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.m.e(r3.m, java.util.List, U3.c):java.lang.Object");
    }

    public final void f(String str, boolean z7) {
        Map mapJ;
        kotlin.jvm.internal.l.f("id", str);
        Y y7 = this.f14909h;
        Integer num = (Integer) ((Map) y7.getValue()).get(str);
        int iIntValue = num != null ? num.intValue() : 0;
        Map map = (Map) y7.getValue();
        int i7 = iIntValue + (z7 ? 1 : -1);
        Integer numValueOf = Integer.valueOf(i7 >= 0 ? i7 : 0);
        O3.l lVar = new O3.l(str, numValueOf);
        kotlin.jvm.internal.l.f("<this>", map);
        if (map.isEmpty()) {
            mapJ = F.J(lVar);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put(str, numValueOf);
            mapJ = linkedHashMap;
        }
        y7.getClass();
        y7.i(null, mapJ);
        Y y8 = this.f14911j;
        Set set = (Set) y8.getValue();
        LinkedHashSet linkedHashSetU = z7 ? J.U(set, str) : J.S(set, str);
        y8.getClass();
        y8.i(null, linkedHashSetU);
        D.x(androidx.lifecycle.J.h(this), null, new i(this, str, z7, null), 3);
    }
}

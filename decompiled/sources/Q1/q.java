package Q1;

import B1.AbstractC0015b;
import B1.K;
import C1.w;
import H1.C0221b;
import H1.L;
import O1.g0;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import j3.C1335v;
import j3.G;
import j3.W;
import j3.X;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
import y1.C2381c;
import y1.C2393o;
import y1.Q;
import y1.S;

/* loaded from: classes.dex */
public final class q extends t {

    /* renamed from: i, reason: collision with root package name */
    public static final W f7931i = new C1335v(new B2.e(7));

    /* renamed from: c, reason: collision with root package name */
    public final Object f7932c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f7933d;

    /* renamed from: e, reason: collision with root package name */
    public final A.e f7934e;

    /* renamed from: f, reason: collision with root package name */
    public j f7935f;

    /* renamed from: g, reason: collision with root package name */
    public C0221b f7936g;

    /* renamed from: h, reason: collision with root package name */
    public C2381c f7937h;

    public q(Context context) {
        A.e eVar = new A.e(26);
        j jVar = j.f7890D;
        this.f7932c = new Object();
        this.f7933d = context != null ? context.getApplicationContext() : null;
        this.f7934e = eVar;
        if (jVar != null) {
            this.f7935f = jVar;
        } else {
            jVar.getClass();
            i iVar = new i(jVar);
            iVar.b(jVar);
            this.f7935f = new j(iVar);
        }
        this.f7937h = C2381c.f18030b;
        if (this.f7935f.f7898y && context == null) {
            AbstractC0015b.v("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static void a(g0 g0Var, j jVar, HashMap map) {
        for (int i7 = 0; i7 < g0Var.a; i7++) {
            S s7 = (S) jVar.f18010s.get(g0Var.a(i7));
            if (s7 != null) {
                Q q6 = s7.a;
                S s8 = (S) map.get(Integer.valueOf(q6.f17970c));
                if (s8 == null || (s8.f17973b.isEmpty() && !s7.f17973b.isEmpty())) {
                    map.put(Integer.valueOf(q6.f17970c), s7);
                }
            }
        }
    }

    public static int b(C2393o c2393o, String str, boolean z7) {
        if (!TextUtils.isEmpty(str) && str.equals(c2393o.f18102d)) {
            return 4;
        }
        String strE = e(str);
        String strE2 = e(c2393o.f18102d);
        if (strE2 == null || strE == null) {
            return (z7 && strE2 == null) ? 1 : 0;
        }
        if (strE2.startsWith(strE) || strE.startsWith(strE2)) {
            return 3;
        }
        int i7 = K.a;
        return strE2.split("-", 2)[0].equals(strE.split("-", 2)[0]) ? 2 : 0;
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static Pair f(int i7, w wVar, int[][][] iArr, n nVar, Comparator comparator) {
        RandomAccess randomAccessW;
        w wVar2 = wVar;
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        while (i8 < wVar2.a) {
            if (i7 == ((int[]) wVar2.f629b)[i8]) {
                g0 g0Var = ((g0[]) wVar2.f630c)[i8];
                for (int i9 = 0; i9 < g0Var.a; i9++) {
                    Q qA = g0Var.a(i9);
                    X xB = nVar.b(i8, qA, iArr[i8][i9]);
                    int i10 = qA.a;
                    boolean[] zArr = new boolean[i10];
                    for (int i11 = 0; i11 < i10; i11++) {
                        o oVar = (o) xB.get(i11);
                        int iA = oVar.a();
                        if (!zArr[i11] && iA != 0) {
                            boolean z7 = true;
                            if (iA == 1) {
                                randomAccessW = G.w(oVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(oVar);
                                int i12 = i11 + 1;
                                while (i12 < i10) {
                                    boolean z8 = z7;
                                    o oVar2 = (o) xB.get(i12);
                                    if (oVar2.a() == 2 && oVar.b(oVar2)) {
                                        arrayList2.add(oVar2);
                                        zArr[i12] = z8;
                                    }
                                    i12++;
                                    z7 = z8;
                                }
                                randomAccessW = arrayList2;
                            }
                            arrayList.add(randomAccessW);
                        }
                    }
                }
            }
            i8++;
            wVar2 = wVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i13 = 0; i13 < list.size(); i13++) {
            iArr2[i13] = ((o) list.get(i13)).f7911m;
        }
        o oVar3 = (o) list.get(0);
        return Pair.create(new r(oVar3.f7910l, iArr2), Integer.valueOf(oVar3.f7909k));
    }

    public final j c() {
        j jVar;
        synchronized (this.f7932c) {
            jVar = this.f7935f;
        }
        return jVar;
    }

    public final void d() {
        boolean z7;
        L l7;
        C0221b c0221b;
        synchronized (this.f7932c) {
            try {
                z7 = this.f7935f.f7898y && K.a >= 32 && (c0221b = this.f7936g) != null && c0221b.f3404k;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z7 || (l7 = this.a) == null) {
            return;
        }
        l7.f3328r.e(10);
    }

    public final void g(j jVar) {
        boolean zEquals;
        jVar.getClass();
        synchronized (this.f7932c) {
            zEquals = this.f7935f.equals(jVar);
            this.f7935f = jVar;
        }
        if (zEquals) {
            return;
        }
        if (jVar.f7898y && this.f7933d == null) {
            AbstractC0015b.v("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        L l7 = this.a;
        if (l7 != null) {
            l7.f3328r.e(10);
        }
    }
}

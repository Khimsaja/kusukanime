package P;

import D4.S;
import O.C0486d;
import O.C0510p;
import O.M;
import java.util.ArrayList;

/* renamed from: P.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0557b {
    public final C0510p a;

    /* renamed from: b, reason: collision with root package name */
    public C0556a f7652b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7653c;

    /* renamed from: f, reason: collision with root package name */
    public int f7656f;

    /* renamed from: g, reason: collision with root package name */
    public int f7657g;

    /* renamed from: l, reason: collision with root package name */
    public int f7662l;

    /* renamed from: d, reason: collision with root package name */
    public final M f7654d = new M();

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7655e = true;

    /* renamed from: h, reason: collision with root package name */
    public final S f7658h = new S(3, false);

    /* renamed from: i, reason: collision with root package name */
    public int f7659i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f7660j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f7661k = -1;

    public C0557b(C0510p c0510p, C0556a c0556a) {
        this.a = c0510p;
        this.f7652b = c0556a;
    }

    public final void a() {
        c();
        S s7 = this.f7658h;
        if (s7.f1530k.isEmpty()) {
            this.f7657g++;
        } else {
            s7.f1530k.remove(r0.size() - 1);
        }
    }

    public final void b() {
        Throwable th;
        int i7;
        C0557b c0557b = this;
        int i8 = c0557b.f7657g;
        int i9 = 0;
        if (i8 > 0) {
            C0556a c0556a = c0557b.f7652b;
            c0556a.getClass();
            A a = A.f7640c;
            D d4 = c0556a.f7651i;
            d4.g0(a);
            n6.d.b0(d4, 0, i8);
            int i10 = d4.f7649o;
            int i11 = a.a;
            th = null;
            int iZ = D.Z(d4, i11);
            i7 = 1;
            int i12 = a.f7642b;
            if (i10 != iZ || d4.f7650p != D.Z(d4, i12)) {
                StringBuilder sb = new StringBuilder();
                int i13 = 0;
                while (i13 < i11) {
                    int i14 = i11;
                    if (((1 << i13) & d4.f7649o) != 0) {
                        if (i9 > 0) {
                            sb.append(", ");
                        }
                        sb.append(a.b(i13));
                        i9++;
                    }
                    i13++;
                    i11 = i14;
                }
                String string = sb.toString();
                StringBuilder sbL = A6.b.l(string, "StringBuilder().apply(builderAction).toString()");
                int i15 = 0;
                int i16 = 0;
                while (i16 < i12) {
                    int i17 = i12;
                    if (((1 << i16) & d4.f7650p) != 0) {
                        if (i9 > 0) {
                            sbL.append(", ");
                        }
                        sbL.append(a.c(i16));
                        i15++;
                    }
                    i16++;
                    i12 = i17;
                }
                String string2 = sbL.toString();
                kotlin.jvm.internal.l.e("StringBuilder().apply(builderAction).toString()", string2);
                StringBuilder sb2 = new StringBuilder("Error while pushing ");
                sb2.append(a);
                sb2.append(". Not all arguments were provided. Missing ");
                A6.b.q(sb2, i9, " int arguments (", string, ") and ");
                A6.b.s(sb2, i15, " object arguments (", string2, ").");
                throw null;
            }
            c0557b.f7657g = 0;
        } else {
            th = null;
            i7 = 1;
            c0557b = this;
        }
        S s7 = c0557b.f7658h;
        if (s7.f1530k.isEmpty()) {
            return;
        }
        C0556a c0556a2 = c0557b.f7652b;
        ArrayList arrayList = s7.f1530k;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i18 = 0; i18 < size; i18++) {
            objArr[i18] = arrayList.get(i18);
        }
        c0556a2.getClass();
        if (size != 0) {
            g gVar = g.f7668c;
            D d6 = c0556a2.f7651i;
            d6.g0(gVar);
            n6.d.c0(d6, 0, objArr);
            int i19 = d6.f7649o;
            int i20 = gVar.a;
            int iZ2 = D.Z(d6, i20);
            int i21 = gVar.f7642b;
            if (i19 != iZ2 || d6.f7650p != D.Z(d6, i21)) {
                StringBuilder sb3 = new StringBuilder();
                int i22 = 0;
                for (int i23 = 0; i23 < i20; i23++) {
                    if (((i7 << i23) & d6.f7649o) != 0) {
                        if (i22 > 0) {
                            sb3.append(", ");
                        }
                        sb3.append(gVar.b(i23));
                        i22++;
                    }
                }
                String string3 = sb3.toString();
                StringBuilder sbL2 = A6.b.l(string3, "StringBuilder().apply(builderAction).toString()");
                int i24 = 0;
                int i25 = 0;
                while (i24 < i21) {
                    int i26 = i21;
                    if (((i7 << i24) & d6.f7650p) != 0) {
                        if (i22 > 0) {
                            sbL2.append(", ");
                        }
                        sbL2.append(gVar.c(i24));
                        i25++;
                    }
                    i24++;
                    i21 = i26;
                }
                String string4 = sbL2.toString();
                kotlin.jvm.internal.l.e("StringBuilder().apply(builderAction).toString()", string4);
                StringBuilder sb4 = new StringBuilder("Error while pushing ");
                sb4.append(gVar);
                sb4.append(". Not all arguments were provided. Missing ");
                A6.b.q(sb4, i22, " int arguments (", string3, ") and ");
                A6.b.s(sb4, i25, " object arguments (", string4, ").");
                throw th;
            }
        }
        arrayList.clear();
    }

    public final void c() {
        int i7 = this.f7662l;
        if (i7 > 0) {
            int i8 = this.f7659i;
            if (i8 >= 0) {
                b();
                C0556a c0556a = this.f7652b;
                c0556a.getClass();
                t tVar = t.f7685c;
                D d4 = c0556a.f7651i;
                d4.g0(tVar);
                n6.d.b0(d4, 0, i8);
                n6.d.b0(d4, 1, i7);
                int i9 = d4.f7649o;
                int i10 = tVar.a;
                int iZ = D.Z(d4, i10);
                int i11 = tVar.f7642b;
                if (i9 != iZ || d4.f7650p != D.Z(d4, i11)) {
                    StringBuilder sb = new StringBuilder();
                    int i12 = 0;
                    int i13 = 0;
                    while (i12 < i10) {
                        int i14 = i10;
                        if (((1 << i12) & d4.f7649o) != 0) {
                            if (i13 > 0) {
                                sb.append(", ");
                            }
                            sb.append(tVar.b(i12));
                            i13++;
                        }
                        i12++;
                        i10 = i14;
                    }
                    String string = sb.toString();
                    StringBuilder sbL = A6.b.l(string, "StringBuilder().apply(builderAction).toString()");
                    int i15 = 0;
                    int i16 = 0;
                    while (i16 < i11) {
                        int i17 = i11;
                        if (((1 << i16) & d4.f7650p) != 0) {
                            if (i13 > 0) {
                                sbL.append(", ");
                            }
                            sbL.append(tVar.c(i16));
                            i15++;
                        }
                        i16++;
                        i11 = i17;
                    }
                    String string2 = sbL.toString();
                    kotlin.jvm.internal.l.e("StringBuilder().apply(builderAction).toString()", string2);
                    StringBuilder sb2 = new StringBuilder("Error while pushing ");
                    sb2.append(tVar);
                    sb2.append(". Not all arguments were provided. Missing ");
                    A6.b.q(sb2, i13, " int arguments (", string, ") and ");
                    A6.b.s(sb2, i15, " object arguments (", string2, ").");
                    throw null;
                }
                this.f7659i = -1;
            } else {
                int i18 = this.f7661k;
                int i19 = this.f7660j;
                b();
                C0556a c0556a2 = this.f7652b;
                c0556a2.getClass();
                q qVar = q.f7682c;
                D d6 = c0556a2.f7651i;
                d6.g0(qVar);
                n6.d.b0(d6, 1, i18);
                n6.d.b0(d6, 0, i19);
                n6.d.b0(d6, 2, i7);
                int i20 = d6.f7649o;
                int i21 = qVar.a;
                int iZ2 = D.Z(d6, i21);
                int i22 = qVar.f7642b;
                if (i20 != iZ2 || d6.f7650p != D.Z(d6, i22)) {
                    int i23 = 0;
                    StringBuilder sb3 = new StringBuilder();
                    for (int i24 = 0; i24 < i21; i24++) {
                        if (((1 << i24) & d6.f7649o) != 0) {
                            if (i23 > 0) {
                                sb3.append(", ");
                            }
                            sb3.append(qVar.b(i24));
                            i23++;
                        }
                    }
                    String string3 = sb3.toString();
                    StringBuilder sbL2 = A6.b.l(string3, "StringBuilder().apply(builderAction).toString()");
                    int i25 = 0;
                    int i26 = 0;
                    while (i25 < i22) {
                        int i27 = i22;
                        if (((1 << i25) & d6.f7650p) != 0) {
                            if (i23 > 0) {
                                sbL2.append(", ");
                            }
                            sbL2.append(qVar.c(i25));
                            i26++;
                        }
                        i25++;
                        i22 = i27;
                    }
                    String string4 = sbL2.toString();
                    kotlin.jvm.internal.l.e("StringBuilder().apply(builderAction).toString()", string4);
                    StringBuilder sb4 = new StringBuilder("Error while pushing ");
                    sb4.append(qVar);
                    sb4.append(". Not all arguments were provided. Missing ");
                    A6.b.q(sb4, i23, " int arguments (", string3, ") and ");
                    A6.b.s(sb4, i26, " object arguments (", string4, ").");
                    throw null;
                }
                this.f7660j = -1;
                this.f7661k = -1;
            }
            this.f7662l = 0;
        }
    }

    public final void d(boolean z7) {
        C0510p c0510p = this.a;
        int i7 = z7 ? c0510p.f7120F.f6937i : c0510p.f7120F.f6935g;
        int i8 = i7 - this.f7656f;
        if (!(i8 >= 0)) {
            C0486d.w("Tried to seek backward");
            throw null;
        }
        if (i8 > 0) {
            C0556a c0556a = this.f7652b;
            c0556a.getClass();
            C0559d c0559d = C0559d.f7665c;
            D d4 = c0556a.f7651i;
            d4.g0(c0559d);
            n6.d.b0(d4, 0, i8);
            int i9 = d4.f7649o;
            int i10 = c0559d.a;
            int iZ = D.Z(d4, i10);
            int i11 = c0559d.f7642b;
            if (i9 == iZ && d4.f7650p == D.Z(d4, i11)) {
                this.f7656f = i7;
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i12 = 0;
            for (int i13 = 0; i13 < i10; i13++) {
                if (((1 << i13) & d4.f7649o) != 0) {
                    if (i12 > 0) {
                        sb.append(", ");
                    }
                    sb.append(c0559d.b(i13));
                    i12++;
                }
            }
            String string = sb.toString();
            StringBuilder sbL = A6.b.l(string, "StringBuilder().apply(builderAction).toString()");
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                if (((1 << i15) & d4.f7650p) != 0) {
                    if (i12 > 0) {
                        sbL.append(", ");
                    }
                    sbL.append(c0559d.c(i15));
                    i14++;
                }
            }
            String string2 = sbL.toString();
            kotlin.jvm.internal.l.e("StringBuilder().apply(builderAction).toString()", string2);
            StringBuilder sb2 = new StringBuilder("Error while pushing ");
            sb2.append(c0559d);
            sb2.append(". Not all arguments were provided. Missing ");
            A6.b.q(sb2, i12, " int arguments (", string, ") and ");
            A6.b.s(sb2, i14, " object arguments (", string2, ").");
            throw null;
        }
    }

    public final void e(int i7, int i8) {
        if (i8 > 0) {
            if (!(i7 >= 0)) {
                C0486d.w("Invalid remove index " + i7);
                throw null;
            }
            if (this.f7659i == i7) {
                this.f7662l += i8;
                return;
            }
            c();
            this.f7659i = i7;
            this.f7662l = i8;
        }
    }
}

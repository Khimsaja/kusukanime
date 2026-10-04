package f;

import D6.r;
import H.M;
import L.C0351b;
import O.AbstractC0505m0;
import O.C0486d;
import O.C0502l;
import O.C0509o0;
import O.C0510p;
import O3.v;
import O3.x;
import X.j;
import X.l;
import X.n;
import a0.q;
import a5.InterfaceC0668b;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.graphics.Path;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.Window;
import e4.InterfaceC0821a;
import e4.k;
import f1.AbstractC0868a;
import f6.AbstractC0905c;
import f6.AbstractC0915m;
import f6.C0925w;
import g1.C0936d;
import h0.C0987j;
import h0.InterfaceC0967L;
import io.ktor.http.LinkHeader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import n0.AbstractC1555v;
import n0.C1541h;
import n0.C1542i;
import n0.C1543j;
import n0.C1544k;
import n0.C1545l;
import n0.C1546m;
import n0.C1547n;
import n0.C1548o;
import n0.C1549p;
import n0.C1550q;
import n0.C1551r;
import n0.C1552s;
import n0.C1553t;
import n0.C1554u;
import n5.AbstractC1566c;
import n5.AbstractC1586x;
import n5.B;
import n5.Q;
import n5.V;
import n5.Y;
import n5.b0;
import o5.InterfaceC1704d;
import p.I0;
import p1.C1779b;
import p1.o;
import r0.C1861b;
import s.EnumC1903a0;
import s5.C2017a;
import s5.C2020d;
import v.AbstractC2123b;
import w6.C2223h;
import w6.C2224i;
import y.C2313M;
import y.C2314N;
import y.C2315O;
import y.C2326g;
import y.C2343x;
import z.t;
import z5.AbstractC2517v;

/* renamed from: f.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0841b {
    public static final void a(q qVar, k kVar, C0510p c0510p, int i7) {
        c0510p.T(-932836462);
        if ((((c0510p.f(qVar) ? 4 : 2) | i7 | (c0510p.h(kVar) ? 32 : 16)) & 19) == 18 && c0510p.y()) {
            c0510p.M();
        } else {
            AbstractC2123b.a(c0510p, androidx.compose.ui.draw.a.a(qVar, kVar));
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new M(i7, 12, qVar, kVar);
        }
    }

    public static final void b(W.a aVar, C0510p c0510p, int i7) {
        C0510p c0510p2;
        c0510p.T(674185128);
        if ((i7 & 3) == 2 && c0510p.y()) {
            c0510p.M();
            c0510p2 = c0510p;
        } else {
            AbstractC0505m0 abstractC0505m0 = l.a;
            j jVar = (j) c0510p.k(abstractC0505m0);
            Object[] objArr = {jVar};
            C2314N c2314n = C2314N.f17595l;
            C2313M c2313m = new C2313M(jVar, 1);
            L2.e eVar = n.a;
            L2.e eVar2 = new L2.e(12, c2314n, c2313m);
            boolean zH = c0510p.h(jVar);
            Object objH = c0510p.H();
            if (zH || objH == C0502l.a) {
                objH = new C1861b(5, jVar);
                c0510p.b0(objH);
            }
            InterfaceC0821a interfaceC0821a = (InterfaceC0821a) objH;
            c0510p2 = c0510p;
            Object obj = (C2315O) z1.c.F(objArr, eVar2, interfaceC0821a, c0510p2, 0, 4);
            C0486d.a(abstractC0505m0.a(obj), W.f.b(1863926504, new M(21, obj, aVar), c0510p2), c0510p2, 56);
        }
        C0509o0 c0509o0S = c0510p2.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0351b(aVar, i7, 8);
        }
    }

    public static final g0.d c(long j7, long j8) {
        return new g0.d(g0.c.d(j7), g0.c.e(j7), g0.f.d(j8) + g0.c.d(j7), g0.f.b(j8) + g0.c.e(j7));
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:18:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(s0.C1953A r8, U3.a r9) {
        /*
            boolean r0 = r9 instanceof r.b
            if (r0 == 0) goto L13
            r0 = r9
            r.b r0 = (r.b) r0
            int r1 = r0.f14758m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14758m = r1
            goto L18
        L13:
            r.b r0 = new r.b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f14757l
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f14758m
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            s0.A r8 = r0.f14756k
            P3.r.Y(r9)
            goto L41
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            P3.r.Y(r9)
        L34:
            r0.f14756k = r8
            r0.f14758m = r3
            s0.i r9 = s0.EnumC1964i.f15462l
            java.lang.Object r9 = r8.b(r9, r0)
            if (r9 != r1) goto L41
            return r1
        L41:
            s0.h r9 = (s0.C1963h) r9
            int r2 = r9.f15459c
            r2 = r2 & 66
            if (r2 == 0) goto L34
            java.lang.Object r9 = r9.a
            int r2 = r9.size()
            r4 = 0
            r5 = r4
        L51:
            if (r5 >= r2) goto L6a
            java.lang.Object r6 = r9.get(r5)
            s0.r r6 = (s0.r) r6
            boolean r7 = r6.b()
            if (r7 != 0) goto L34
            boolean r7 = r6.f15475h
            if (r7 != 0) goto L34
            boolean r6 = r6.f15471d
            if (r6 == 0) goto L34
            int r5 = r5 + 1
            goto L51
        L6a:
            java.lang.Object r8 = r9.get(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f.AbstractC0841b.d(s0.A, U3.a):java.lang.Object");
    }

    public static final int e(int i7, Q.d dVar) {
        int i8 = dVar.f7829m - 1;
        int i9 = 0;
        while (i9 < i8) {
            int i10 = ((i8 - i9) / 2) + i9;
            Object[] objArr = dVar.f7827k;
            int i11 = ((C2326g) objArr[i10]).a;
            if (i11 != i7) {
                if (i11 < i7) {
                    i9 = i10 + 1;
                    if (i7 < ((C2326g) objArr[i9]).a) {
                    }
                } else {
                    i8 = i10 - 1;
                }
            }
            return i10;
        }
        return i9;
    }

    public static final C2017a f(AbstractC1586x abstractC1586x) {
        C2020d c2020d;
        kotlin.jvm.internal.l.f(LinkHeader.Parameters.Type, abstractC1586x);
        if (AbstractC1566c.l(abstractC1586x)) {
            C2017a c2017aF = f(AbstractC1566c.m(abstractC1586x));
            C2017a c2017aF2 = f(AbstractC1566c.F(abstractC1586x));
            return new C2017a(AbstractC1566c.i(AbstractC1566c.f(AbstractC1566c.m((AbstractC1586x) c2017aF.a), AbstractC1566c.F((AbstractC1586x) c2017aF2.a)), abstractC1586x), AbstractC1566c.i(AbstractC1566c.f(AbstractC1566c.m((AbstractC1586x) c2017aF.f15837b), AbstractC1566c.F((AbstractC1586x) c2017aF2.f15837b)), abstractC1586x));
        }
        n5.M mT0 = abstractC1586x.t0();
        boolean z7 = true;
        if (abstractC1586x.t0() instanceof InterfaceC0668b) {
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor", mT0);
            Q qA = ((InterfaceC0668b) mT0).a();
            AbstractC1586x abstractC1586xB = qA.b();
            kotlin.jvm.internal.l.e("getType(...)", abstractC1586xB);
            AbstractC1586x abstractC1586xH = Y.h(abstractC1586xB, abstractC1586x.u0());
            int iOrdinal = qA.a().ordinal();
            if (iOrdinal == 1) {
                return new C2017a(abstractC1586xH, AbstractC0905c.n(abstractC1586x).o());
            }
            if (iOrdinal == 2) {
                return new C2017a(Y.h(AbstractC0905c.n(abstractC1586x).n(), abstractC1586x.u0()), abstractC1586xH);
            }
            throw new AssertionError("Only nontrivial projections should have been captured, not: " + qA);
        }
        if (abstractC1586x.q0().isEmpty() || abstractC1586x.q0().size() != mT0.getParameters().size()) {
            return new C2017a(abstractC1586x, abstractC1586x);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List listQ0 = abstractC1586x.q0();
        List parameters = mT0.getParameters();
        kotlin.jvm.internal.l.e("getParameters(...)", parameters);
        Iterator it = P3.q.Z0(listQ0, parameters).iterator();
        while (it.hasNext()) {
            O3.l lVar = (O3.l) it.next();
            Q q6 = (Q) lVar.f7528k;
            u4.Q q7 = (u4.Q) lVar.f7529l;
            kotlin.jvm.internal.l.c(q7);
            b0 b0VarR = q7.R();
            if (b0VarR == null) {
                V.a(35);
                throw null;
            }
            if (q6 == null) {
                V.a(36);
                throw null;
            }
            V v5 = V.f13380b;
            int iOrdinal2 = (q6.c() ? b0.f13392o : V.b(b0VarR, q6.a())).ordinal();
            if (iOrdinal2 == 0) {
                AbstractC1586x abstractC1586xB2 = q6.b();
                kotlin.jvm.internal.l.e("getType(...)", abstractC1586xB2);
                AbstractC1586x abstractC1586xB3 = q6.b();
                kotlin.jvm.internal.l.e("getType(...)", abstractC1586xB3);
                c2020d = new C2020d(q7, abstractC1586xB2, abstractC1586xB3);
            } else if (iOrdinal2 == 1) {
                AbstractC1586x abstractC1586xB4 = q6.b();
                kotlin.jvm.internal.l.e("getType(...)", abstractC1586xB4);
                B bO = d5.e.e(q7).o();
                kotlin.jvm.internal.l.e("getNullableAnyType(...)", bO);
                c2020d = new C2020d(q7, abstractC1586xB4, bO);
            } else {
                if (iOrdinal2 != 2) {
                    throw new r();
                }
                B bN = d5.e.e(q7).n();
                AbstractC1586x abstractC1586xB5 = q6.b();
                kotlin.jvm.internal.l.e("getType(...)", abstractC1586xB5);
                c2020d = new C2020d(q7, bN, abstractC1586xB5);
            }
            if (q6.c()) {
                arrayList.add(c2020d);
                arrayList2.add(c2020d);
            } else {
                C2017a c2017aF3 = f(c2020d.f15839b);
                AbstractC1586x abstractC1586x2 = (AbstractC1586x) c2017aF3.a;
                AbstractC1586x abstractC1586x3 = (AbstractC1586x) c2017aF3.f15837b;
                C2017a c2017aF4 = f(c2020d.f15840c);
                AbstractC1586x abstractC1586x4 = (AbstractC1586x) c2017aF4.a;
                AbstractC1586x abstractC1586x5 = (AbstractC1586x) c2017aF4.f15837b;
                u4.Q q8 = c2020d.a;
                C2020d c2020d2 = new C2020d(q8, abstractC1586x3, abstractC1586x4);
                C2020d c2020d3 = new C2020d(q8, abstractC1586x2, abstractC1586x5);
                arrayList.add(c2020d2);
                arrayList2.add(c2020d3);
            }
        }
        if (arrayList.isEmpty()) {
            z7 = false;
        } else {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C2020d c2020d4 = (C2020d) it2.next();
                c2020d4.getClass();
                if (!InterfaceC1704d.a.b(c2020d4.f15839b, c2020d4.f15840c)) {
                    break;
                }
            }
            z7 = false;
        }
        return new C2017a(z7 ? AbstractC0905c.n(abstractC1586x).n() : o(abstractC1586x, arrayList), o(abstractC1586x, arrayList2));
    }

    public static void g(String str, long j7) {
        if (j7 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j7 + ") must be >= 0");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (n6.m.t(r9, r1, kotlin.jvm.internal.l.a(r7, r2) ? r0.getWidth() : g3.AbstractC0946e.d(r7.a, r8), kotlin.jvm.internal.l.a(r7, r2) ? r0.getHeight() : g3.AbstractC0946e.d(r7.f11356b, r8), r8) == 1.0d) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap h(android.graphics.drawable.Drawable r5, android.graphics.Bitmap.Config r6, e3.h r7, e3.g r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f.AbstractC0841b.h(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, e3.h, e3.g, boolean):android.graphics.Bitmap");
    }

    public static o i(Context context) {
        ProviderInfo providerInfo;
        C0936d c0936d;
        ApplicationInfo applicationInfo;
        I0 c1779b = Build.VERSION.SDK_INT >= 28 ? new C1779b(1) : new I0(1);
        PackageManager packageManager = context.getPackageManager();
        e3.c.g("Package manager required to locate emoji font provider", packageManager);
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            c0936d = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrV = c1779b.v(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrV) {
                    arrayList.add(signature.toByteArray());
                }
                c0936d = new C0936d(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e7) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e7);
            }
        }
        if (c0936d == null) {
            return null;
        }
        return new o(new p1.n(context, c0936d));
    }

    public static final void j(InterfaceC0967L interfaceC0967L, double d4, double d6, double d7, double d8, double d9, double d10, double d11) {
        double d12 = d9;
        double d13 = (d11 / 180) * 3.141592653589793d;
        double dCos = Math.cos(d13);
        double dSin = Math.sin(d13);
        double d14 = ((d6 * dSin) + (d4 * dCos)) / d12;
        double d15 = ((d6 * dCos) + ((-d4) * dSin)) / d10;
        double d16 = ((d8 * dSin) + (d7 * dCos)) / d12;
        double d17 = ((d8 * dCos) + ((-d7) * dSin)) / d10;
        double d18 = d14 - d16;
        double d19 = d15 - d17;
        double d20 = 2;
        double d21 = (d14 + d16) / d20;
        double d22 = (d15 + d17) / d20;
        double d23 = (d19 * d19) + (d18 * d18);
        if (d23 == 0.0d) {
            return;
        }
        double d24 = (1.0d / d23) - 0.25d;
        if (d24 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d23) / 1.99999d);
            j(interfaceC0967L, d4, d6, d7, d8, d12 * dSqrt, d10 * dSqrt, d11);
            return;
        }
        double dSqrt2 = Math.sqrt(d24);
        double d25 = d21 - (dSqrt2 * d19);
        double d26 = d22 + (d18 * dSqrt2);
        double dAtan2 = Math.atan2(d15 - d26, d14 - d25);
        double dAtan22 = Math.atan2(d17 - d26, d16 - d25) - dAtan2;
        if (dAtan22 < 0.0d) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d27 = d25 * d12;
        double d28 = d26 * d10;
        double d29 = (d27 * dCos) - (d28 * dSin);
        double d30 = (d28 * dCos) + (d27 * dSin);
        double d31 = 4;
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * d31) / 3.141592653589793d));
        double dCos2 = Math.cos(d13);
        double dSin2 = Math.sin(d13);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d32 = dAtan22;
        double d33 = -d12;
        double d34 = d33 * dCos2;
        double d35 = d10 * dSin2;
        double d36 = (d34 * dSin3) - (d35 * dCos3);
        double d37 = d33 * dSin2;
        double d38 = d10 * dCos2;
        double d39 = (dCos3 * d38) + (dSin3 * d37);
        double d40 = d32 / iCeil;
        int i7 = 0;
        double d41 = d36;
        double d42 = dAtan2;
        double d43 = d39;
        double d44 = d4;
        double d45 = d6;
        while (i7 < iCeil) {
            double d46 = d42 + d40;
            double dSin4 = Math.sin(d46);
            double dCos4 = Math.cos(d46);
            int i8 = i7;
            double d47 = (((d12 * dCos2) * dCos4) + d29) - (d35 * dSin4);
            int i9 = iCeil;
            double d48 = (d38 * dSin4) + (d12 * dSin2 * dCos4) + d30;
            double d49 = (d34 * dSin4) - (d35 * dCos4);
            double d50 = (dCos4 * d38) + (dSin4 * d37);
            double d51 = d46 - d42;
            double dTan = Math.tan(d51 / d20);
            double dSqrt3 = ((Math.sqrt(((3.0d * dTan) * dTan) + d31) - 1) * Math.sin(d51)) / 3;
            ((C0987j) interfaceC0967L).a.cubicTo((float) ((d41 * dSqrt3) + d44), (float) ((d43 * dSqrt3) + d45), (float) (d47 - (dSqrt3 * d49)), (float) (d48 - (dSqrt3 * d50)), (float) d47, (float) d48);
            dSin2 = dSin2;
            d44 = d47;
            i7 = i8 + 1;
            d31 = d31;
            d29 = d29;
            d42 = d46;
            d43 = d50;
            d41 = d49;
            d45 = d48;
            iCeil = i9;
            d12 = d9;
        }
    }

    public static C0925w k(String str) {
        kotlin.jvm.internal.l.f("<this>", str);
        Matcher matcher = C0925w.f11614e.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(A6.b.d('\"', "No subtype found for: \"", str).toString());
        }
        String strGroup = matcher.group(1);
        kotlin.jvm.internal.l.e("typeSubtype.group(1)", strGroup);
        Locale locale = Locale.US;
        kotlin.jvm.internal.l.e("US", locale);
        String lowerCase = strGroup.toLowerCase(locale);
        kotlin.jvm.internal.l.e("this as java.lang.String).toLowerCase(locale)", lowerCase);
        String strGroup2 = matcher.group(2);
        kotlin.jvm.internal.l.e("typeSubtype.group(2)", strGroup2);
        String lowerCase2 = strGroup2.toLowerCase(locale);
        kotlin.jvm.internal.l.e("this as java.lang.String).toLowerCase(locale)", lowerCase2);
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = C0925w.f11615f.matcher(str);
        int iEnd = matcher.end();
        while (iEnd < str.length()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String strSubstring = str.substring(iEnd);
                kotlin.jvm.internal.l.e("this as java.lang.String).substring(startIndex)", strSubstring);
                sb.append(strSubstring);
                sb.append("\" for: \"");
                throw new IllegalArgumentException(A6.b.j(sb, str, '\"').toString());
            }
            String strGroup3 = matcher2.group(1);
            if (strGroup3 == null) {
                iEnd = matcher2.end();
            } else {
                String strGroup4 = matcher2.group(2);
                if (strGroup4 == null) {
                    strGroup4 = matcher2.group(3);
                } else if (AbstractC2517v.T(strGroup4, "'", false) && AbstractC2517v.L(strGroup4, "'", false) && strGroup4.length() > 2) {
                    strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                    kotlin.jvm.internal.l.e("this as java.lang.String…ing(startIndex, endIndex)", strGroup4);
                }
                arrayList.add(strGroup3);
                arrayList.add(strGroup4);
                iEnd = matcher2.end();
            }
        }
        return new C0925w(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
    }

    public static final z.j l(C2343x c2343x, int i7, long j7, t tVar, long j8, EnumC1903a0 enumC1903a0, a0.c cVar, a0.h hVar, T0.k kVar, boolean z7, int i8) {
        return new z.j(i7, i8, c2343x.b(i7, j7), j8, tVar.c(i7), enumC1903a0, cVar, hVar, kVar, z7);
    }

    public static C0925w m(String str) {
        kotlin.jvm.internal.l.f("<this>", str);
        try {
            return k(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final boolean n(String str) {
        kotlin.jvm.internal.l.f("method", str);
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final n5.AbstractC1586x o(n5.AbstractC1586x r7, java.util.ArrayList r8) {
        /*
            java.util.List r0 = r7.q0()
            r0.size()
            r8.size()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = P3.r.p(r8, r1)
            r0.<init>(r1)
            java.util.Iterator r8 = r8.iterator()
        L19:
            boolean r1 = r8.hasNext()
            r2 = 0
            if (r1 == 0) goto L9b
            java.lang.Object r1 = r8.next()
            s5.d r1 = (s5.C2020d) r1
            r1.getClass()
            o5.l r3 = o5.InterfaceC1704d.a
            n5.x r4 = r1.f15839b
            n5.x r5 = r1.f15840c
            r3.b(r4, r5)
            boolean r3 = kotlin.jvm.internal.l.a(r4, r5)
            if (r3 != 0) goto L91
            u4.Q r1 = r1.a
            n5.b0 r3 = r1.R()
            n5.b0 r6 = n5.b0.f13391n
            if (r3 != r6) goto L43
            goto L91
        L43:
            boolean r3 = r4.AbstractC1880i.E(r4)
            if (r3 == 0) goto L5f
            n5.b0 r3 = r1.R()
            if (r3 == r6) goto L5f
            n5.G r2 = new n5.G
            n5.b0 r3 = n5.b0.f13392o
            n5.b0 r1 = r1.R()
            if (r3 != r1) goto L5b
            n5.b0 r3 = n5.b0.f13390m
        L5b:
            r2.<init>(r5, r3)
            goto L96
        L5f:
            if (r5 == 0) goto L8b
            boolean r2 = r4.AbstractC1880i.x(r5)
            if (r2 == 0) goto L7b
            boolean r2 = r5.u0()
            if (r2 == 0) goto L7b
            n5.G r2 = new n5.G
            n5.b0 r1 = r1.R()
            if (r6 != r1) goto L77
            n5.b0 r6 = n5.b0.f13390m
        L77:
            r2.<init>(r4, r6)
            goto L96
        L7b:
            n5.G r2 = new n5.G
            n5.b0 r3 = n5.b0.f13392o
            n5.b0 r1 = r1.R()
            if (r3 != r1) goto L87
            n5.b0 r3 = n5.b0.f13390m
        L87:
            r2.<init>(r5, r3)
            goto L96
        L8b:
            r7 = 140(0x8c, float:1.96E-43)
            r4.AbstractC1880i.a(r7)
            throw r2
        L91:
            n5.G r2 = new n5.G
            r2.<init>(r4)
        L96:
            r0.add(r2)
            goto L19
        L9b:
            r8 = 6
            n5.x r7 = n5.AbstractC1566c.q(r7, r0, r2, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: f.AbstractC0841b.o(n5.x, java.util.ArrayList):n5.x");
    }

    public static void p(Window window, boolean z7) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 35) {
            AbstractC0868a.e(window, z7);
        } else {
            if (i7 >= 30) {
                AbstractC0868a.d(window, z7);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z7 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static final void q(List list, InterfaceC0967L interfaceC0967L) {
        Path path;
        int i7;
        int i8;
        float f5;
        AbstractC1555v abstractC1555v;
        float f7;
        float f8;
        float f9;
        List list2 = list;
        C0987j c0987j = (C0987j) interfaceC0967L;
        Path.FillType fillType = c0987j.a.getFillType();
        Path.FillType fillType2 = Path.FillType.EVEN_ODD;
        int i9 = 0;
        boolean z7 = fillType == fillType2;
        Path path2 = c0987j.a;
        path2.rewind();
        if (!z7) {
            fillType2 = Path.FillType.WINDING;
        }
        path2.setFillType(fillType2);
        AbstractC1555v abstractC1555v2 = list2.isEmpty() ? C1541h.f13175b : (AbstractC1555v) list2.get(0);
        int size = list2.size();
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        while (i9 < size) {
            AbstractC1555v abstractC1555v3 = (AbstractC1555v) list2.get(i9);
            if (abstractC1555v3 instanceof C1541h) {
                path2.close();
                i7 = size;
                i8 = i9;
                f5 = f10;
                path = path2;
                abstractC1555v = abstractC1555v3;
                f11 = f15;
                f13 = f11;
                f12 = f16;
            } else {
                if (abstractC1555v3 instanceof C1551r) {
                    float f17 = ((C1551r) abstractC1555v3).f13203b;
                    f13 += f17;
                    f14 += f10;
                    path2.rMoveTo(f17, f10);
                    i7 = size;
                    i8 = i9;
                    f5 = f10;
                    path = path2;
                    f15 = f13;
                    f16 = f14;
                } else if (abstractC1555v3 instanceof C1545l) {
                    C1545l c1545l = (C1545l) abstractC1555v3;
                    float f18 = c1545l.f13185b;
                    float f19 = c1545l.f13186c;
                    path2.moveTo(f18, f19);
                    f14 = f19;
                    f16 = f14;
                    i7 = size;
                    i8 = i9;
                    f5 = f10;
                    path = path2;
                    f13 = f18;
                    f15 = f13;
                } else {
                    if (abstractC1555v3 instanceof C1550q) {
                        C1550q c1550q = (C1550q) abstractC1555v3;
                        float f20 = c1550q.f13201b;
                        float f21 = c1550q.f13202c;
                        path2.rLineTo(f20, f21);
                        f13 += c1550q.f13201b;
                        f14 += f21;
                    } else if (abstractC1555v3 instanceof C1544k) {
                        C1544k c1544k = (C1544k) abstractC1555v3;
                        float f22 = c1544k.f13183b;
                        float f23 = c1544k.f13184c;
                        path2.lineTo(f22, f23);
                        f13 = c1544k.f13183b;
                        i7 = size;
                        i8 = i9;
                        f5 = f10;
                        path = path2;
                        f14 = f23;
                    } else if (abstractC1555v3 instanceof C1549p) {
                        C1549p c1549p = (C1549p) abstractC1555v3;
                        path2.rLineTo(c1549p.f13200b, f10);
                        f13 += c1549p.f13200b;
                    } else if (abstractC1555v3 instanceof C1543j) {
                        C1543j c1543j = (C1543j) abstractC1555v3;
                        path2.lineTo(c1543j.f13182b, f14);
                        f13 = c1543j.f13182b;
                    } else {
                        if (abstractC1555v3 instanceof C1553t) {
                            C1553t c1553t = (C1553t) abstractC1555v3;
                            path2.rLineTo(f10, c1553t.f13208b);
                            f9 = c1553t.f13208b;
                        } else if (abstractC1555v3 instanceof C1554u) {
                            C1554u c1554u = (C1554u) abstractC1555v3;
                            path2.lineTo(f13, c1554u.f13209b);
                            f14 = c1554u.f13209b;
                        } else if (abstractC1555v3 instanceof C1548o) {
                            C1548o c1548o = (C1548o) abstractC1555v3;
                            path2.rCubicTo(c1548o.f13194b, c1548o.f13195c, c1548o.f13196d, c1548o.f13197e, c1548o.f13198f, c1548o.f13199g);
                            f11 = c1548o.f13196d + f13;
                            f12 = c1548o.f13197e + f14;
                            f13 += c1548o.f13198f;
                            f9 = c1548o.f13199g;
                        } else if (abstractC1555v3 instanceof C1542i) {
                            C1542i c1542i = (C1542i) abstractC1555v3;
                            path2.cubicTo(c1542i.f13176b, c1542i.f13177c, c1542i.f13178d, c1542i.f13179e, c1542i.f13180f, c1542i.f13181g);
                            f11 = c1542i.f13178d;
                            f12 = c1542i.f13179e;
                            float f24 = c1542i.f13180f;
                            f14 = c1542i.f13181g;
                            i7 = size;
                            i8 = i9;
                            f5 = f10;
                            path = path2;
                            f13 = f24;
                        } else if (abstractC1555v3 instanceof C1552s) {
                            if (abstractC1555v2.a) {
                                f8 = f14 - f12;
                                f7 = f13 - f11;
                            } else {
                                f7 = f10;
                                f8 = f7;
                            }
                            C1552s c1552s = (C1552s) abstractC1555v3;
                            path2.rCubicTo(f7, f8, c1552s.f13204b, c1552s.f13205c, c1552s.f13206d, c1552s.f13207e);
                            f11 = c1552s.f13204b + f13;
                            f12 = c1552s.f13205c + f14;
                            f13 += c1552s.f13206d;
                            f9 = c1552s.f13207e;
                        } else if (abstractC1555v3 instanceof C1546m) {
                            if (abstractC1555v2.a) {
                                float f25 = 2;
                                f13 = (f13 * f25) - f11;
                                f14 = (f25 * f14) - f12;
                            }
                            C1546m c1546m = (C1546m) abstractC1555v3;
                            path2.cubicTo(f13, f14, c1546m.f13187b, c1546m.f13188c, c1546m.f13189d, c1546m.f13190e);
                            path = path2;
                            float f26 = c1546m.f13187b;
                            float f27 = c1546m.f13188c;
                            float f28 = c1546m.f13189d;
                            f14 = c1546m.f13190e;
                            i7 = size;
                            i8 = i9;
                            f5 = f10;
                            f13 = f28;
                            abstractC1555v = abstractC1555v3;
                            f12 = f27;
                            f11 = f26;
                            i9 = i8 + 1;
                            size = i7;
                            path2 = path;
                            f10 = f5;
                            abstractC1555v2 = abstractC1555v;
                            list2 = list;
                        } else {
                            path = path2;
                            if (abstractC1555v3 instanceof C1547n) {
                                float f29 = ((C1547n) abstractC1555v3).f13193d + f13;
                                float f30 = f10 + f14;
                                abstractC1555v = abstractC1555v3;
                                f5 = 0.0f;
                                i8 = i9;
                                i7 = size;
                                c0987j = c0987j;
                                j(c0987j, f13, f14, f29, f30, r2.f13191b, r2.f13192c, 0.0f);
                                f11 = f29;
                                f13 = f11;
                                f12 = f30;
                            } else {
                                i7 = size;
                                i8 = i9;
                                f5 = f10;
                            }
                        }
                        f14 += f9;
                    }
                    i7 = size;
                    i8 = i9;
                    f5 = f10;
                    path = path2;
                }
                abstractC1555v = abstractC1555v3;
                i9 = i8 + 1;
                size = i7;
                path2 = path;
                f10 = f5;
                abstractC1555v2 = abstractC1555v;
                list2 = list;
            }
            f14 = f12;
            i9 = i8 + 1;
            size = i7;
            path2 = path;
            f10 = f5;
            abstractC1555v2 = abstractC1555v;
            list2 = list;
        }
    }

    public static final v r(String str) {
        int i7;
        AbstractC0915m.k(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i8 = 0;
        char cCharAt = str.charAt(0);
        if (kotlin.jvm.internal.l.g(cCharAt, 48) < 0) {
            i7 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i7 = 0;
        }
        int i9 = 119304647;
        while (i7 < length) {
            int iDigit = Character.digit((int) str.charAt(i7), 10);
            if (iDigit < 0) {
                return null;
            }
            int i10 = i8 ^ Integer.MIN_VALUE;
            if (Integer.compare(i10, i9 ^ Integer.MIN_VALUE) > 0) {
                if (i9 != 119304647) {
                    return null;
                }
                i9 = (int) (((-1) & 4294967295L) / (4294967295L & 10));
                if (Integer.compare(i10, i9 ^ Integer.MIN_VALUE) > 0) {
                    return null;
                }
            }
            int i11 = i8 * 10;
            int i12 = iDigit + i11;
            if (Integer.compare(i12 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i7++;
            i8 = i12;
        }
        return new v(i8);
    }

    public static final x s(String str) {
        int i7;
        long j7;
        kotlin.jvm.internal.l.f("<this>", str);
        int i8 = 10;
        AbstractC0915m.k(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        char cCharAt = str.charAt(0);
        int i9 = 1;
        if (kotlin.jvm.internal.l.g(cCharAt, 48) >= 0) {
            i7 = 0;
        } else {
            if (length == 1 || cCharAt != '+') {
                return null;
            }
            i7 = 1;
        }
        long j8 = 10;
        long j9 = 0;
        long j10 = 512409557603043100L;
        while (i7 < length) {
            int iDigit = Character.digit((int) str.charAt(i7), i8);
            if (iDigit < 0) {
                return null;
            }
            int i10 = length;
            long j11 = j9 ^ Long.MIN_VALUE;
            int i11 = i7;
            if (Long.compare(j11, j10 ^ Long.MIN_VALUE) <= 0) {
                j7 = j8;
            } else {
                if (j10 != 512409557603043100L) {
                    return null;
                }
                if (j8 >= 0) {
                    long j12 = (Long.MAX_VALUE / j8) << i9;
                    j7 = j8;
                    j10 = j12 + ((((-1) - (j12 * j8)) ^ Long.MIN_VALUE) >= (j8 ^ Long.MIN_VALUE) ? i9 : 0);
                } else if (Long.MAX_VALUE < (j8 ^ Long.MIN_VALUE)) {
                    j7 = j8;
                    j10 = 0;
                } else {
                    j10 = 1;
                    j7 = j8;
                }
                if (Long.compare(j11, j10 ^ Long.MIN_VALUE) > 0) {
                    return null;
                }
            }
            long j13 = j9 * j7;
            long j14 = (iDigit & 4294967295L) + j13;
            if (Long.compare(j14 ^ Long.MIN_VALUE, j13 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i7 = i11 + 1;
            j9 = j14;
            length = i10;
            j8 = j7;
            i8 = 10;
            i9 = 1;
        }
        return new x(j9);
    }

    public static void t(C2223h c2223h, byte[] bArr) {
        long j7;
        kotlin.jvm.internal.l.f("cursor", c2223h);
        kotlin.jvm.internal.l.f("key", bArr);
        int length = bArr.length;
        int i7 = 0;
        do {
            byte[] bArr2 = c2223h.f17152o;
            int i8 = c2223h.f17153p;
            int i9 = c2223h.f17154q;
            if (bArr2 != null) {
                while (i8 < i9) {
                    int i10 = i7 % length;
                    bArr2[i8] = (byte) (bArr2[i8] ^ bArr[i10]);
                    i8++;
                    i7 = i10 + 1;
                }
            }
            long j8 = c2223h.f17151n;
            C2224i c2224i = c2223h.f17148k;
            kotlin.jvm.internal.l.c(c2224i);
            if (j8 == c2224i.f17156l) {
                throw new IllegalStateException("no more bytes");
            }
            j7 = c2223h.f17151n;
        } while (c2223h.e(j7 == -1 ? 0L : j7 + (c2223h.f17154q - c2223h.f17153p)) != -1);
    }
}

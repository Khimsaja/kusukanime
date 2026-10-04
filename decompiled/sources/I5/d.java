package I5;

import A3.u;
import A3.w;
import B1.RunnableC0016c;
import B3.AbstractC0025a;
import C2.C0034g;
import G2.C;
import G2.C0168e;
import G2.C0169f;
import G2.C0174k;
import G2.C0177n;
import G2.E;
import G2.K;
import G2.M;
import K5.Y;
import O.C0486d;
import O.C0502l;
import O.C0510p;
import O.H;
import O.T;
import O.Z;
import P3.r;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0690q;
import androidx.media3.exoplayer.ExoPlayer;
import com.kusukanime.data.OtaCheck;
import com.kusukanime.data.ScheduleDay;
import com.kusukanime.data.ScheduleItem;
import d.C0768b;
import e4.InterfaceC0821a;
import e4.k;
import e4.n;
import e4.p;
import f.AbstractC0847h;
import io.ktor.util.GzipHeaderFlags;
import java.util.List;
import kotlin.jvm.internal.l;
import o.C1609g;
import p3.AbstractC1790h;
import q3.AbstractC1856g;
import s3.AbstractC1994a;
import t3.AbstractC2048f;
import u3.AbstractC2077b;
import v3.AbstractC2152b;
import v3.z;
import w.C2165f;
import w3.AbstractC2210a;
import w3.y;
import x3.h;
import z0.U;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4069k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f4070l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f4071m;

    public /* synthetic */ d(int i7, Object obj, Object obj2) {
        this.f4069k = i7;
        this.f4070l = obj;
        this.f4071m = obj2;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f4069k) {
            case 0:
                ((e) this.f4070l).f4072l.removeCallbacks((RunnableC0016c) this.f4071m);
                break;
            case 1:
                break;
            case 2:
                ((R5.b) this.f4071m).getClass();
                ((R5.c) this.f4070l).e(null);
                break;
            case 3:
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                C c2 = (C) obj;
                l.f("$this$NavHost", c2);
                final E e7 = (E) this.f4070l;
                final int i7 = 10;
                z1.c.i(c2, "home", null, new W.a(true, -941983467, new p() { // from class: o3.f
                    @Override // e4.p
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        C1609g c1609g = (C1609g) obj2;
                        C0174k c0174k = (C0174k) obj3;
                        switch (i7) {
                            case 0:
                                C0510p c0510p = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("e", c0174k);
                                E e8 = e7;
                                boolean zH = c0510p.h(e8);
                                Object objH = c0510p.H();
                                if (zH || objH == C0502l.a) {
                                    objH = new C1641h(e8, 6);
                                    c0510p.b0(objH);
                                }
                                Bundle bundleG = c0174k.g();
                                kotlin.jvm.internal.l.c(bundleG);
                                AbstractC2048f.c((e4.k) objH, null, bundleG.getString("slug"), null, c0510p, 0, 10);
                                break;
                            case 1:
                                C0510p c0510p2 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e9 = e7;
                                boolean zH2 = c0510p2.h(e9);
                                Object objH2 = c0510p2.H();
                                T t7 = C0502l.a;
                                if (zH2 || objH2 == t7) {
                                    objH2 = new C1641h(e9, 0);
                                    c0510p2.b0(objH2);
                                }
                                e4.k kVar = (e4.k) objH2;
                                boolean zH3 = c0510p2.h(e9);
                                Object objH3 = c0510p2.H();
                                if (zH3 || objH3 == t7) {
                                    objH3 = new C1642i(e9, 0);
                                    c0510p2.b0(objH3);
                                }
                                AbstractC2077b.a(kVar, (InterfaceC0821a) objH3, null, c0510p2, 0);
                                break;
                            case 2:
                                C0510p c0510p3 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e10 = e7;
                                boolean zH4 = c0510p3.h(e10);
                                Object objH4 = c0510p3.H();
                                T t8 = C0502l.a;
                                if (zH4 || objH4 == t8) {
                                    objH4 = new C1642i(e10, 5);
                                    c0510p3.b0(objH4);
                                }
                                InterfaceC0821a interfaceC0821a = (InterfaceC0821a) objH4;
                                boolean zH5 = c0510p3.h(e10);
                                Object objH5 = c0510p3.H();
                                if (zH5 || objH5 == t8) {
                                    objH5 = new C1641h(e10, 2);
                                    c0510p3.b0(objH5);
                                }
                                AbstractC2210a.a(interfaceC0821a, (e4.k) objH5, c0510p3, 0);
                                break;
                            case 3:
                                C0510p c0510p4 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("e", c0174k);
                                Bundle bundleG2 = c0174k.g();
                                kotlin.jvm.internal.l.c(bundleG2);
                                String string = bundleG2.getString("slug");
                                kotlin.jvm.internal.l.c(string);
                                E e11 = e7;
                                boolean zH6 = c0510p4.h(e11);
                                Object objH6 = c0510p4.H();
                                Object obj6 = C0502l.a;
                                if (zH6 || objH6 == obj6) {
                                    objH6 = new C1641h(e11, 1);
                                    c0510p4.b0(objH6);
                                }
                                e4.k kVar2 = (e4.k) objH6;
                                boolean zH7 = c0510p4.h(e11);
                                Object objH7 = c0510p4.H();
                                if (zH7 || objH7 == obj6) {
                                    objH7 = new C1642i(e11, 2);
                                    c0510p4.b0(objH7);
                                }
                                InterfaceC0821a interfaceC0821a2 = (InterfaceC0821a) objH7;
                                boolean zH8 = c0510p4.h(e11);
                                Object objH8 = c0510p4.H();
                                if (zH8 || objH8 == obj6) {
                                    objH8 = new C1642i(e11, 3);
                                    c0510p4.b0(objH8);
                                }
                                AbstractC1994a.e(string, kVar2, interfaceC0821a2, (InterfaceC0821a) objH8, null, c0510p4, 0);
                                break;
                            case GzipHeaderFlags.EXTRA /* 4 */:
                                C0510p c0510p5 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("e", c0174k);
                                Bundle bundleG3 = c0174k.g();
                                kotlin.jvm.internal.l.c(bundleG3);
                                String string2 = bundleG3.getString("episode");
                                kotlin.jvm.internal.l.c(string2);
                                E e12 = e7;
                                boolean zH9 = c0510p5.h(e12) | c0510p5.f(string2);
                                Object objH9 = c0510p5.H();
                                if (zH9 || objH9 == C0502l.a) {
                                    objH9 = new C1646m(e12, null, string2);
                                    c0510p5.b0(objH9);
                                }
                                C0486d.e(c0510p5, (n) objH9, string2);
                                break;
                            case 5:
                                C0510p c0510p6 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e13 = e7;
                                boolean zH10 = c0510p6.h(e13);
                                Object objH10 = c0510p6.H();
                                T t9 = C0502l.a;
                                if (zH10 || objH10 == t9) {
                                    objH10 = new C1641h(e13, 4);
                                    c0510p6.b0(objH10);
                                }
                                e4.k kVar3 = (e4.k) objH10;
                                boolean zH11 = c0510p6.h(e13);
                                Object objH11 = c0510p6.H();
                                if (zH11 || objH11 == t9) {
                                    objH11 = new C1641h(e13, 5);
                                    c0510p6.b0(objH11);
                                }
                                A3.c.a(kVar3, (e4.k) objH11, null, c0510p6, 0);
                                break;
                            case 6:
                                C0510p c0510p7 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e14 = e7;
                                boolean zH12 = c0510p7.h(e14);
                                Object objH12 = c0510p7.H();
                                T t10 = C0502l.a;
                                if (zH12 || objH12 == t10) {
                                    objH12 = new C1641h(e14, 13);
                                    c0510p7.b0(objH12);
                                }
                                e4.k kVar4 = (e4.k) objH12;
                                boolean zH13 = c0510p7.h(e14);
                                Object objH13 = c0510p7.H();
                                if (zH13 || objH13 == t10) {
                                    objH13 = new C1641h(e14, 14);
                                    c0510p7.b0(objH13);
                                }
                                AbstractC0847h.e(kVar4, (e4.k) objH13, null, c0510p7, 0);
                                break;
                            case 7:
                                C0510p c0510p8 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e15 = e7;
                                boolean zH14 = c0510p8.h(e15);
                                Object objH14 = c0510p8.H();
                                T t11 = C0502l.a;
                                if (zH14 || objH14 == t11) {
                                    objH14 = new C1641h(e15, 11);
                                    c0510p8.b0(objH14);
                                }
                                e4.k kVar5 = (e4.k) objH14;
                                boolean zH15 = c0510p8.h(e15);
                                Object objH15 = c0510p8.H();
                                if (zH15 || objH15 == t11) {
                                    objH15 = new C1642i(e15, 12);
                                    c0510p8.b0(objH15);
                                }
                                AbstractC1856g.a(kVar5, (InterfaceC0821a) objH15, null, c0510p8, 0);
                                break;
                            case 8:
                                C0510p c0510p9 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e16 = e7;
                                boolean zH16 = c0510p9.h(e16);
                                Object objH16 = c0510p9.H();
                                Object obj7 = C0502l.a;
                                if (zH16 || objH16 == obj7) {
                                    objH16 = new C1641h(e16, 12);
                                    c0510p9.b0(objH16);
                                }
                                e4.k kVar6 = (e4.k) objH16;
                                boolean zH17 = c0510p9.h(e16);
                                Object objH17 = c0510p9.H();
                                if (zH17 || objH17 == obj7) {
                                    objH17 = new C1642i(e16, 13);
                                    c0510p9.b0(objH17);
                                }
                                AbstractC2048f.c(kVar6, (InterfaceC0821a) objH17, null, null, c0510p9, 0, 12);
                                break;
                            case 9:
                                C0510p c0510p10 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e17 = e7;
                                boolean zH18 = c0510p10.h(e17);
                                Object objH18 = c0510p10.H();
                                if (zH18 || objH18 == C0502l.a) {
                                    objH18 = new C1641h(e17, 3);
                                    c0510p10.b0(objH18);
                                }
                                AbstractC2048f.b((e4.k) objH18, null, c0510p10, 0);
                                break;
                            case 10:
                                C0510p c0510p11 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e18 = e7;
                                boolean zH19 = c0510p11.h(e18);
                                Object objH19 = c0510p11.H();
                                Object obj8 = C0502l.a;
                                if (zH19 || objH19 == obj8) {
                                    objH19 = new C1641h(e18, 7);
                                    c0510p11.b0(objH19);
                                }
                                e4.k kVar7 = (e4.k) objH19;
                                boolean zH20 = c0510p11.h(e18);
                                Object objH20 = c0510p11.H();
                                if (zH20 || objH20 == obj8) {
                                    objH20 = new C1641h(e18, 8);
                                    c0510p11.b0(objH20);
                                }
                                e4.k kVar8 = (e4.k) objH20;
                                boolean zH21 = c0510p11.h(e18);
                                Object objH21 = c0510p11.H();
                                if (zH21 || objH21 == obj8) {
                                    objH21 = new C1642i(e18, 6);
                                    c0510p11.b0(objH21);
                                }
                                AbstractC2152b.g(kVar7, kVar8, (InterfaceC0821a) objH21, null, c0510p11, 0);
                                break;
                            default:
                                C0510p c0510p12 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e19 = e7;
                                boolean zH22 = c0510p12.h(e19);
                                Object objH22 = c0510p12.H();
                                if (zH22 || objH22 == C0502l.a) {
                                    objH22 = new C1642i(e19, 1);
                                    c0510p12.b0(objH22);
                                }
                                AbstractC1790h.a((InterfaceC0821a) objH22, null, c0510p12, 0);
                                break;
                        }
                        return O3.C.a;
                    }
                }), 254);
                C0034g c0034g = new C0034g(7);
                K k7 = M.f2680d;
                C0034g c0034g2 = (C0034g) c0034g.f741l;
                c0034g2.f741l = k7;
                K k8 = (K) c0034g2.f741l;
                if (k8 == null) {
                    k8 = k7;
                }
                final int i8 = 3;
                z1.c.i(c2, "detail/{slug}", r.H(new C0168e("slug", new C0169f(k8))), new W.a(true, 161399614, new p() { // from class: o3.f
                    @Override // e4.p
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        C1609g c1609g = (C1609g) obj2;
                        C0174k c0174k = (C0174k) obj3;
                        switch (i8) {
                            case 0:
                                C0510p c0510p = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("e", c0174k);
                                E e8 = e7;
                                boolean zH = c0510p.h(e8);
                                Object objH = c0510p.H();
                                if (zH || objH == C0502l.a) {
                                    objH = new C1641h(e8, 6);
                                    c0510p.b0(objH);
                                }
                                Bundle bundleG = c0174k.g();
                                kotlin.jvm.internal.l.c(bundleG);
                                AbstractC2048f.c((e4.k) objH, null, bundleG.getString("slug"), null, c0510p, 0, 10);
                                break;
                            case 1:
                                C0510p c0510p2 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e9 = e7;
                                boolean zH2 = c0510p2.h(e9);
                                Object objH2 = c0510p2.H();
                                T t7 = C0502l.a;
                                if (zH2 || objH2 == t7) {
                                    objH2 = new C1641h(e9, 0);
                                    c0510p2.b0(objH2);
                                }
                                e4.k kVar = (e4.k) objH2;
                                boolean zH3 = c0510p2.h(e9);
                                Object objH3 = c0510p2.H();
                                if (zH3 || objH3 == t7) {
                                    objH3 = new C1642i(e9, 0);
                                    c0510p2.b0(objH3);
                                }
                                AbstractC2077b.a(kVar, (InterfaceC0821a) objH3, null, c0510p2, 0);
                                break;
                            case 2:
                                C0510p c0510p3 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e10 = e7;
                                boolean zH4 = c0510p3.h(e10);
                                Object objH4 = c0510p3.H();
                                T t8 = C0502l.a;
                                if (zH4 || objH4 == t8) {
                                    objH4 = new C1642i(e10, 5);
                                    c0510p3.b0(objH4);
                                }
                                InterfaceC0821a interfaceC0821a = (InterfaceC0821a) objH4;
                                boolean zH5 = c0510p3.h(e10);
                                Object objH5 = c0510p3.H();
                                if (zH5 || objH5 == t8) {
                                    objH5 = new C1641h(e10, 2);
                                    c0510p3.b0(objH5);
                                }
                                AbstractC2210a.a(interfaceC0821a, (e4.k) objH5, c0510p3, 0);
                                break;
                            case 3:
                                C0510p c0510p4 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("e", c0174k);
                                Bundle bundleG2 = c0174k.g();
                                kotlin.jvm.internal.l.c(bundleG2);
                                String string = bundleG2.getString("slug");
                                kotlin.jvm.internal.l.c(string);
                                E e11 = e7;
                                boolean zH6 = c0510p4.h(e11);
                                Object objH6 = c0510p4.H();
                                Object obj6 = C0502l.a;
                                if (zH6 || objH6 == obj6) {
                                    objH6 = new C1641h(e11, 1);
                                    c0510p4.b0(objH6);
                                }
                                e4.k kVar2 = (e4.k) objH6;
                                boolean zH7 = c0510p4.h(e11);
                                Object objH7 = c0510p4.H();
                                if (zH7 || objH7 == obj6) {
                                    objH7 = new C1642i(e11, 2);
                                    c0510p4.b0(objH7);
                                }
                                InterfaceC0821a interfaceC0821a2 = (InterfaceC0821a) objH7;
                                boolean zH8 = c0510p4.h(e11);
                                Object objH8 = c0510p4.H();
                                if (zH8 || objH8 == obj6) {
                                    objH8 = new C1642i(e11, 3);
                                    c0510p4.b0(objH8);
                                }
                                AbstractC1994a.e(string, kVar2, interfaceC0821a2, (InterfaceC0821a) objH8, null, c0510p4, 0);
                                break;
                            case GzipHeaderFlags.EXTRA /* 4 */:
                                C0510p c0510p5 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("e", c0174k);
                                Bundle bundleG3 = c0174k.g();
                                kotlin.jvm.internal.l.c(bundleG3);
                                String string2 = bundleG3.getString("episode");
                                kotlin.jvm.internal.l.c(string2);
                                E e12 = e7;
                                boolean zH9 = c0510p5.h(e12) | c0510p5.f(string2);
                                Object objH9 = c0510p5.H();
                                if (zH9 || objH9 == C0502l.a) {
                                    objH9 = new C1646m(e12, null, string2);
                                    c0510p5.b0(objH9);
                                }
                                C0486d.e(c0510p5, (n) objH9, string2);
                                break;
                            case 5:
                                C0510p c0510p6 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e13 = e7;
                                boolean zH10 = c0510p6.h(e13);
                                Object objH10 = c0510p6.H();
                                T t9 = C0502l.a;
                                if (zH10 || objH10 == t9) {
                                    objH10 = new C1641h(e13, 4);
                                    c0510p6.b0(objH10);
                                }
                                e4.k kVar3 = (e4.k) objH10;
                                boolean zH11 = c0510p6.h(e13);
                                Object objH11 = c0510p6.H();
                                if (zH11 || objH11 == t9) {
                                    objH11 = new C1641h(e13, 5);
                                    c0510p6.b0(objH11);
                                }
                                A3.c.a(kVar3, (e4.k) objH11, null, c0510p6, 0);
                                break;
                            case 6:
                                C0510p c0510p7 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e14 = e7;
                                boolean zH12 = c0510p7.h(e14);
                                Object objH12 = c0510p7.H();
                                T t10 = C0502l.a;
                                if (zH12 || objH12 == t10) {
                                    objH12 = new C1641h(e14, 13);
                                    c0510p7.b0(objH12);
                                }
                                e4.k kVar4 = (e4.k) objH12;
                                boolean zH13 = c0510p7.h(e14);
                                Object objH13 = c0510p7.H();
                                if (zH13 || objH13 == t10) {
                                    objH13 = new C1641h(e14, 14);
                                    c0510p7.b0(objH13);
                                }
                                AbstractC0847h.e(kVar4, (e4.k) objH13, null, c0510p7, 0);
                                break;
                            case 7:
                                C0510p c0510p8 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e15 = e7;
                                boolean zH14 = c0510p8.h(e15);
                                Object objH14 = c0510p8.H();
                                T t11 = C0502l.a;
                                if (zH14 || objH14 == t11) {
                                    objH14 = new C1641h(e15, 11);
                                    c0510p8.b0(objH14);
                                }
                                e4.k kVar5 = (e4.k) objH14;
                                boolean zH15 = c0510p8.h(e15);
                                Object objH15 = c0510p8.H();
                                if (zH15 || objH15 == t11) {
                                    objH15 = new C1642i(e15, 12);
                                    c0510p8.b0(objH15);
                                }
                                AbstractC1856g.a(kVar5, (InterfaceC0821a) objH15, null, c0510p8, 0);
                                break;
                            case 8:
                                C0510p c0510p9 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e16 = e7;
                                boolean zH16 = c0510p9.h(e16);
                                Object objH16 = c0510p9.H();
                                Object obj7 = C0502l.a;
                                if (zH16 || objH16 == obj7) {
                                    objH16 = new C1641h(e16, 12);
                                    c0510p9.b0(objH16);
                                }
                                e4.k kVar6 = (e4.k) objH16;
                                boolean zH17 = c0510p9.h(e16);
                                Object objH17 = c0510p9.H();
                                if (zH17 || objH17 == obj7) {
                                    objH17 = new C1642i(e16, 13);
                                    c0510p9.b0(objH17);
                                }
                                AbstractC2048f.c(kVar6, (InterfaceC0821a) objH17, null, null, c0510p9, 0, 12);
                                break;
                            case 9:
                                C0510p c0510p10 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e17 = e7;
                                boolean zH18 = c0510p10.h(e17);
                                Object objH18 = c0510p10.H();
                                if (zH18 || objH18 == C0502l.a) {
                                    objH18 = new C1641h(e17, 3);
                                    c0510p10.b0(objH18);
                                }
                                AbstractC2048f.b((e4.k) objH18, null, c0510p10, 0);
                                break;
                            case 10:
                                C0510p c0510p11 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e18 = e7;
                                boolean zH19 = c0510p11.h(e18);
                                Object objH19 = c0510p11.H();
                                Object obj8 = C0502l.a;
                                if (zH19 || objH19 == obj8) {
                                    objH19 = new C1641h(e18, 7);
                                    c0510p11.b0(objH19);
                                }
                                e4.k kVar7 = (e4.k) objH19;
                                boolean zH20 = c0510p11.h(e18);
                                Object objH20 = c0510p11.H();
                                if (zH20 || objH20 == obj8) {
                                    objH20 = new C1641h(e18, 8);
                                    c0510p11.b0(objH20);
                                }
                                e4.k kVar8 = (e4.k) objH20;
                                boolean zH21 = c0510p11.h(e18);
                                Object objH21 = c0510p11.H();
                                if (zH21 || objH21 == obj8) {
                                    objH21 = new C1642i(e18, 6);
                                    c0510p11.b0(objH21);
                                }
                                AbstractC2152b.g(kVar7, kVar8, (InterfaceC0821a) objH21, null, c0510p11, 0);
                                break;
                            default:
                                C0510p c0510p12 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e19 = e7;
                                boolean zH22 = c0510p12.h(e19);
                                Object objH22 = c0510p12.H();
                                if (zH22 || objH22 == C0502l.a) {
                                    objH22 = new C1642i(e19, 1);
                                    c0510p12.b0(objH22);
                                }
                                AbstractC1790h.a((InterfaceC0821a) objH22, null, c0510p12, 0);
                                break;
                        }
                        return O3.C.a;
                    }
                }), 252);
                C0034g c0034g3 = (C0034g) new C0034g(7).f741l;
                c0034g3.f741l = k7;
                K k9 = (K) c0034g3.f741l;
                if (k9 == null) {
                    k9 = k7;
                }
                final int i9 = 4;
                z1.c.i(c2, "player/{episode}", r.H(new C0168e("episode", new C0169f(k9))), new W.a(true, -522830691, new p() { // from class: o3.f
                    @Override // e4.p
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        C1609g c1609g = (C1609g) obj2;
                        C0174k c0174k = (C0174k) obj3;
                        switch (i9) {
                            case 0:
                                C0510p c0510p = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("e", c0174k);
                                E e8 = e7;
                                boolean zH = c0510p.h(e8);
                                Object objH = c0510p.H();
                                if (zH || objH == C0502l.a) {
                                    objH = new C1641h(e8, 6);
                                    c0510p.b0(objH);
                                }
                                Bundle bundleG = c0174k.g();
                                kotlin.jvm.internal.l.c(bundleG);
                                AbstractC2048f.c((e4.k) objH, null, bundleG.getString("slug"), null, c0510p, 0, 10);
                                break;
                            case 1:
                                C0510p c0510p2 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e9 = e7;
                                boolean zH2 = c0510p2.h(e9);
                                Object objH2 = c0510p2.H();
                                T t7 = C0502l.a;
                                if (zH2 || objH2 == t7) {
                                    objH2 = new C1641h(e9, 0);
                                    c0510p2.b0(objH2);
                                }
                                e4.k kVar = (e4.k) objH2;
                                boolean zH3 = c0510p2.h(e9);
                                Object objH3 = c0510p2.H();
                                if (zH3 || objH3 == t7) {
                                    objH3 = new C1642i(e9, 0);
                                    c0510p2.b0(objH3);
                                }
                                AbstractC2077b.a(kVar, (InterfaceC0821a) objH3, null, c0510p2, 0);
                                break;
                            case 2:
                                C0510p c0510p3 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e10 = e7;
                                boolean zH4 = c0510p3.h(e10);
                                Object objH4 = c0510p3.H();
                                T t8 = C0502l.a;
                                if (zH4 || objH4 == t8) {
                                    objH4 = new C1642i(e10, 5);
                                    c0510p3.b0(objH4);
                                }
                                InterfaceC0821a interfaceC0821a = (InterfaceC0821a) objH4;
                                boolean zH5 = c0510p3.h(e10);
                                Object objH5 = c0510p3.H();
                                if (zH5 || objH5 == t8) {
                                    objH5 = new C1641h(e10, 2);
                                    c0510p3.b0(objH5);
                                }
                                AbstractC2210a.a(interfaceC0821a, (e4.k) objH5, c0510p3, 0);
                                break;
                            case 3:
                                C0510p c0510p4 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("e", c0174k);
                                Bundle bundleG2 = c0174k.g();
                                kotlin.jvm.internal.l.c(bundleG2);
                                String string = bundleG2.getString("slug");
                                kotlin.jvm.internal.l.c(string);
                                E e11 = e7;
                                boolean zH6 = c0510p4.h(e11);
                                Object objH6 = c0510p4.H();
                                Object obj6 = C0502l.a;
                                if (zH6 || objH6 == obj6) {
                                    objH6 = new C1641h(e11, 1);
                                    c0510p4.b0(objH6);
                                }
                                e4.k kVar2 = (e4.k) objH6;
                                boolean zH7 = c0510p4.h(e11);
                                Object objH7 = c0510p4.H();
                                if (zH7 || objH7 == obj6) {
                                    objH7 = new C1642i(e11, 2);
                                    c0510p4.b0(objH7);
                                }
                                InterfaceC0821a interfaceC0821a2 = (InterfaceC0821a) objH7;
                                boolean zH8 = c0510p4.h(e11);
                                Object objH8 = c0510p4.H();
                                if (zH8 || objH8 == obj6) {
                                    objH8 = new C1642i(e11, 3);
                                    c0510p4.b0(objH8);
                                }
                                AbstractC1994a.e(string, kVar2, interfaceC0821a2, (InterfaceC0821a) objH8, null, c0510p4, 0);
                                break;
                            case GzipHeaderFlags.EXTRA /* 4 */:
                                C0510p c0510p5 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("e", c0174k);
                                Bundle bundleG3 = c0174k.g();
                                kotlin.jvm.internal.l.c(bundleG3);
                                String string2 = bundleG3.getString("episode");
                                kotlin.jvm.internal.l.c(string2);
                                E e12 = e7;
                                boolean zH9 = c0510p5.h(e12) | c0510p5.f(string2);
                                Object objH9 = c0510p5.H();
                                if (zH9 || objH9 == C0502l.a) {
                                    objH9 = new C1646m(e12, null, string2);
                                    c0510p5.b0(objH9);
                                }
                                C0486d.e(c0510p5, (n) objH9, string2);
                                break;
                            case 5:
                                C0510p c0510p6 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e13 = e7;
                                boolean zH10 = c0510p6.h(e13);
                                Object objH10 = c0510p6.H();
                                T t9 = C0502l.a;
                                if (zH10 || objH10 == t9) {
                                    objH10 = new C1641h(e13, 4);
                                    c0510p6.b0(objH10);
                                }
                                e4.k kVar3 = (e4.k) objH10;
                                boolean zH11 = c0510p6.h(e13);
                                Object objH11 = c0510p6.H();
                                if (zH11 || objH11 == t9) {
                                    objH11 = new C1641h(e13, 5);
                                    c0510p6.b0(objH11);
                                }
                                A3.c.a(kVar3, (e4.k) objH11, null, c0510p6, 0);
                                break;
                            case 6:
                                C0510p c0510p7 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e14 = e7;
                                boolean zH12 = c0510p7.h(e14);
                                Object objH12 = c0510p7.H();
                                T t10 = C0502l.a;
                                if (zH12 || objH12 == t10) {
                                    objH12 = new C1641h(e14, 13);
                                    c0510p7.b0(objH12);
                                }
                                e4.k kVar4 = (e4.k) objH12;
                                boolean zH13 = c0510p7.h(e14);
                                Object objH13 = c0510p7.H();
                                if (zH13 || objH13 == t10) {
                                    objH13 = new C1641h(e14, 14);
                                    c0510p7.b0(objH13);
                                }
                                AbstractC0847h.e(kVar4, (e4.k) objH13, null, c0510p7, 0);
                                break;
                            case 7:
                                C0510p c0510p8 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e15 = e7;
                                boolean zH14 = c0510p8.h(e15);
                                Object objH14 = c0510p8.H();
                                T t11 = C0502l.a;
                                if (zH14 || objH14 == t11) {
                                    objH14 = new C1641h(e15, 11);
                                    c0510p8.b0(objH14);
                                }
                                e4.k kVar5 = (e4.k) objH14;
                                boolean zH15 = c0510p8.h(e15);
                                Object objH15 = c0510p8.H();
                                if (zH15 || objH15 == t11) {
                                    objH15 = new C1642i(e15, 12);
                                    c0510p8.b0(objH15);
                                }
                                AbstractC1856g.a(kVar5, (InterfaceC0821a) objH15, null, c0510p8, 0);
                                break;
                            case 8:
                                C0510p c0510p9 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e16 = e7;
                                boolean zH16 = c0510p9.h(e16);
                                Object objH16 = c0510p9.H();
                                Object obj7 = C0502l.a;
                                if (zH16 || objH16 == obj7) {
                                    objH16 = new C1641h(e16, 12);
                                    c0510p9.b0(objH16);
                                }
                                e4.k kVar6 = (e4.k) objH16;
                                boolean zH17 = c0510p9.h(e16);
                                Object objH17 = c0510p9.H();
                                if (zH17 || objH17 == obj7) {
                                    objH17 = new C1642i(e16, 13);
                                    c0510p9.b0(objH17);
                                }
                                AbstractC2048f.c(kVar6, (InterfaceC0821a) objH17, null, null, c0510p9, 0, 12);
                                break;
                            case 9:
                                C0510p c0510p10 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e17 = e7;
                                boolean zH18 = c0510p10.h(e17);
                                Object objH18 = c0510p10.H();
                                if (zH18 || objH18 == C0502l.a) {
                                    objH18 = new C1641h(e17, 3);
                                    c0510p10.b0(objH18);
                                }
                                AbstractC2048f.b((e4.k) objH18, null, c0510p10, 0);
                                break;
                            case 10:
                                C0510p c0510p11 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e18 = e7;
                                boolean zH19 = c0510p11.h(e18);
                                Object objH19 = c0510p11.H();
                                Object obj8 = C0502l.a;
                                if (zH19 || objH19 == obj8) {
                                    objH19 = new C1641h(e18, 7);
                                    c0510p11.b0(objH19);
                                }
                                e4.k kVar7 = (e4.k) objH19;
                                boolean zH20 = c0510p11.h(e18);
                                Object objH20 = c0510p11.H();
                                if (zH20 || objH20 == obj8) {
                                    objH20 = new C1641h(e18, 8);
                                    c0510p11.b0(objH20);
                                }
                                e4.k kVar8 = (e4.k) objH20;
                                boolean zH21 = c0510p11.h(e18);
                                Object objH21 = c0510p11.H();
                                if (zH21 || objH21 == obj8) {
                                    objH21 = new C1642i(e18, 6);
                                    c0510p11.b0(objH21);
                                }
                                AbstractC2152b.g(kVar7, kVar8, (InterfaceC0821a) objH21, null, c0510p11, 0);
                                break;
                            default:
                                C0510p c0510p12 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e19 = e7;
                                boolean zH22 = c0510p12.h(e19);
                                Object objH22 = c0510p12.H();
                                if (zH22 || objH22 == C0502l.a) {
                                    objH22 = new C1642i(e19, 1);
                                    c0510p12.b0(objH22);
                                }
                                AbstractC1790h.a((InterfaceC0821a) objH22, null, c0510p12, 0);
                                break;
                        }
                        return O3.C.a;
                    }
                }), 252);
                final int i10 = 5;
                z1.c.i(c2, "search", null, new W.a(true, -1207060996, new p() { // from class: o3.f
                    @Override // e4.p
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        C1609g c1609g = (C1609g) obj2;
                        C0174k c0174k = (C0174k) obj3;
                        switch (i10) {
                            case 0:
                                C0510p c0510p = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("e", c0174k);
                                E e8 = e7;
                                boolean zH = c0510p.h(e8);
                                Object objH = c0510p.H();
                                if (zH || objH == C0502l.a) {
                                    objH = new C1641h(e8, 6);
                                    c0510p.b0(objH);
                                }
                                Bundle bundleG = c0174k.g();
                                kotlin.jvm.internal.l.c(bundleG);
                                AbstractC2048f.c((e4.k) objH, null, bundleG.getString("slug"), null, c0510p, 0, 10);
                                break;
                            case 1:
                                C0510p c0510p2 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e9 = e7;
                                boolean zH2 = c0510p2.h(e9);
                                Object objH2 = c0510p2.H();
                                T t7 = C0502l.a;
                                if (zH2 || objH2 == t7) {
                                    objH2 = new C1641h(e9, 0);
                                    c0510p2.b0(objH2);
                                }
                                e4.k kVar = (e4.k) objH2;
                                boolean zH3 = c0510p2.h(e9);
                                Object objH3 = c0510p2.H();
                                if (zH3 || objH3 == t7) {
                                    objH3 = new C1642i(e9, 0);
                                    c0510p2.b0(objH3);
                                }
                                AbstractC2077b.a(kVar, (InterfaceC0821a) objH3, null, c0510p2, 0);
                                break;
                            case 2:
                                C0510p c0510p3 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e10 = e7;
                                boolean zH4 = c0510p3.h(e10);
                                Object objH4 = c0510p3.H();
                                T t8 = C0502l.a;
                                if (zH4 || objH4 == t8) {
                                    objH4 = new C1642i(e10, 5);
                                    c0510p3.b0(objH4);
                                }
                                InterfaceC0821a interfaceC0821a = (InterfaceC0821a) objH4;
                                boolean zH5 = c0510p3.h(e10);
                                Object objH5 = c0510p3.H();
                                if (zH5 || objH5 == t8) {
                                    objH5 = new C1641h(e10, 2);
                                    c0510p3.b0(objH5);
                                }
                                AbstractC2210a.a(interfaceC0821a, (e4.k) objH5, c0510p3, 0);
                                break;
                            case 3:
                                C0510p c0510p4 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("e", c0174k);
                                Bundle bundleG2 = c0174k.g();
                                kotlin.jvm.internal.l.c(bundleG2);
                                String string = bundleG2.getString("slug");
                                kotlin.jvm.internal.l.c(string);
                                E e11 = e7;
                                boolean zH6 = c0510p4.h(e11);
                                Object objH6 = c0510p4.H();
                                Object obj6 = C0502l.a;
                                if (zH6 || objH6 == obj6) {
                                    objH6 = new C1641h(e11, 1);
                                    c0510p4.b0(objH6);
                                }
                                e4.k kVar2 = (e4.k) objH6;
                                boolean zH7 = c0510p4.h(e11);
                                Object objH7 = c0510p4.H();
                                if (zH7 || objH7 == obj6) {
                                    objH7 = new C1642i(e11, 2);
                                    c0510p4.b0(objH7);
                                }
                                InterfaceC0821a interfaceC0821a2 = (InterfaceC0821a) objH7;
                                boolean zH8 = c0510p4.h(e11);
                                Object objH8 = c0510p4.H();
                                if (zH8 || objH8 == obj6) {
                                    objH8 = new C1642i(e11, 3);
                                    c0510p4.b0(objH8);
                                }
                                AbstractC1994a.e(string, kVar2, interfaceC0821a2, (InterfaceC0821a) objH8, null, c0510p4, 0);
                                break;
                            case GzipHeaderFlags.EXTRA /* 4 */:
                                C0510p c0510p5 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("e", c0174k);
                                Bundle bundleG3 = c0174k.g();
                                kotlin.jvm.internal.l.c(bundleG3);
                                String string2 = bundleG3.getString("episode");
                                kotlin.jvm.internal.l.c(string2);
                                E e12 = e7;
                                boolean zH9 = c0510p5.h(e12) | c0510p5.f(string2);
                                Object objH9 = c0510p5.H();
                                if (zH9 || objH9 == C0502l.a) {
                                    objH9 = new C1646m(e12, null, string2);
                                    c0510p5.b0(objH9);
                                }
                                C0486d.e(c0510p5, (n) objH9, string2);
                                break;
                            case 5:
                                C0510p c0510p6 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e13 = e7;
                                boolean zH10 = c0510p6.h(e13);
                                Object objH10 = c0510p6.H();
                                T t9 = C0502l.a;
                                if (zH10 || objH10 == t9) {
                                    objH10 = new C1641h(e13, 4);
                                    c0510p6.b0(objH10);
                                }
                                e4.k kVar3 = (e4.k) objH10;
                                boolean zH11 = c0510p6.h(e13);
                                Object objH11 = c0510p6.H();
                                if (zH11 || objH11 == t9) {
                                    objH11 = new C1641h(e13, 5);
                                    c0510p6.b0(objH11);
                                }
                                A3.c.a(kVar3, (e4.k) objH11, null, c0510p6, 0);
                                break;
                            case 6:
                                C0510p c0510p7 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e14 = e7;
                                boolean zH12 = c0510p7.h(e14);
                                Object objH12 = c0510p7.H();
                                T t10 = C0502l.a;
                                if (zH12 || objH12 == t10) {
                                    objH12 = new C1641h(e14, 13);
                                    c0510p7.b0(objH12);
                                }
                                e4.k kVar4 = (e4.k) objH12;
                                boolean zH13 = c0510p7.h(e14);
                                Object objH13 = c0510p7.H();
                                if (zH13 || objH13 == t10) {
                                    objH13 = new C1641h(e14, 14);
                                    c0510p7.b0(objH13);
                                }
                                AbstractC0847h.e(kVar4, (e4.k) objH13, null, c0510p7, 0);
                                break;
                            case 7:
                                C0510p c0510p8 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e15 = e7;
                                boolean zH14 = c0510p8.h(e15);
                                Object objH14 = c0510p8.H();
                                T t11 = C0502l.a;
                                if (zH14 || objH14 == t11) {
                                    objH14 = new C1641h(e15, 11);
                                    c0510p8.b0(objH14);
                                }
                                e4.k kVar5 = (e4.k) objH14;
                                boolean zH15 = c0510p8.h(e15);
                                Object objH15 = c0510p8.H();
                                if (zH15 || objH15 == t11) {
                                    objH15 = new C1642i(e15, 12);
                                    c0510p8.b0(objH15);
                                }
                                AbstractC1856g.a(kVar5, (InterfaceC0821a) objH15, null, c0510p8, 0);
                                break;
                            case 8:
                                C0510p c0510p9 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e16 = e7;
                                boolean zH16 = c0510p9.h(e16);
                                Object objH16 = c0510p9.H();
                                Object obj7 = C0502l.a;
                                if (zH16 || objH16 == obj7) {
                                    objH16 = new C1641h(e16, 12);
                                    c0510p9.b0(objH16);
                                }
                                e4.k kVar6 = (e4.k) objH16;
                                boolean zH17 = c0510p9.h(e16);
                                Object objH17 = c0510p9.H();
                                if (zH17 || objH17 == obj7) {
                                    objH17 = new C1642i(e16, 13);
                                    c0510p9.b0(objH17);
                                }
                                AbstractC2048f.c(kVar6, (InterfaceC0821a) objH17, null, null, c0510p9, 0, 12);
                                break;
                            case 9:
                                C0510p c0510p10 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e17 = e7;
                                boolean zH18 = c0510p10.h(e17);
                                Object objH18 = c0510p10.H();
                                if (zH18 || objH18 == C0502l.a) {
                                    objH18 = new C1641h(e17, 3);
                                    c0510p10.b0(objH18);
                                }
                                AbstractC2048f.b((e4.k) objH18, null, c0510p10, 0);
                                break;
                            case 10:
                                C0510p c0510p11 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e18 = e7;
                                boolean zH19 = c0510p11.h(e18);
                                Object objH19 = c0510p11.H();
                                Object obj8 = C0502l.a;
                                if (zH19 || objH19 == obj8) {
                                    objH19 = new C1641h(e18, 7);
                                    c0510p11.b0(objH19);
                                }
                                e4.k kVar7 = (e4.k) objH19;
                                boolean zH20 = c0510p11.h(e18);
                                Object objH20 = c0510p11.H();
                                if (zH20 || objH20 == obj8) {
                                    objH20 = new C1641h(e18, 8);
                                    c0510p11.b0(objH20);
                                }
                                e4.k kVar8 = (e4.k) objH20;
                                boolean zH21 = c0510p11.h(e18);
                                Object objH21 = c0510p11.H();
                                if (zH21 || objH21 == obj8) {
                                    objH21 = new C1642i(e18, 6);
                                    c0510p11.b0(objH21);
                                }
                                AbstractC2152b.g(kVar7, kVar8, (InterfaceC0821a) objH21, null, c0510p11, 0);
                                break;
                            default:
                                C0510p c0510p12 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e19 = e7;
                                boolean zH22 = c0510p12.h(e19);
                                Object objH22 = c0510p12.H();
                                if (zH22 || objH22 == C0502l.a) {
                                    objH22 = new C1642i(e19, 1);
                                    c0510p12.b0(objH22);
                                }
                                AbstractC1790h.a((InterfaceC0821a) objH22, null, c0510p12, 0);
                                break;
                        }
                        return O3.C.a;
                    }
                }), 254);
                final int i11 = 6;
                z1.c.i(c2, "schedule", null, new W.a(true, -1891291301, new p() { // from class: o3.f
                    @Override // e4.p
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        C1609g c1609g = (C1609g) obj2;
                        C0174k c0174k = (C0174k) obj3;
                        switch (i11) {
                            case 0:
                                C0510p c0510p = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("e", c0174k);
                                E e8 = e7;
                                boolean zH = c0510p.h(e8);
                                Object objH = c0510p.H();
                                if (zH || objH == C0502l.a) {
                                    objH = new C1641h(e8, 6);
                                    c0510p.b0(objH);
                                }
                                Bundle bundleG = c0174k.g();
                                kotlin.jvm.internal.l.c(bundleG);
                                AbstractC2048f.c((e4.k) objH, null, bundleG.getString("slug"), null, c0510p, 0, 10);
                                break;
                            case 1:
                                C0510p c0510p2 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e9 = e7;
                                boolean zH2 = c0510p2.h(e9);
                                Object objH2 = c0510p2.H();
                                T t7 = C0502l.a;
                                if (zH2 || objH2 == t7) {
                                    objH2 = new C1641h(e9, 0);
                                    c0510p2.b0(objH2);
                                }
                                e4.k kVar = (e4.k) objH2;
                                boolean zH3 = c0510p2.h(e9);
                                Object objH3 = c0510p2.H();
                                if (zH3 || objH3 == t7) {
                                    objH3 = new C1642i(e9, 0);
                                    c0510p2.b0(objH3);
                                }
                                AbstractC2077b.a(kVar, (InterfaceC0821a) objH3, null, c0510p2, 0);
                                break;
                            case 2:
                                C0510p c0510p3 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e10 = e7;
                                boolean zH4 = c0510p3.h(e10);
                                Object objH4 = c0510p3.H();
                                T t8 = C0502l.a;
                                if (zH4 || objH4 == t8) {
                                    objH4 = new C1642i(e10, 5);
                                    c0510p3.b0(objH4);
                                }
                                InterfaceC0821a interfaceC0821a = (InterfaceC0821a) objH4;
                                boolean zH5 = c0510p3.h(e10);
                                Object objH5 = c0510p3.H();
                                if (zH5 || objH5 == t8) {
                                    objH5 = new C1641h(e10, 2);
                                    c0510p3.b0(objH5);
                                }
                                AbstractC2210a.a(interfaceC0821a, (e4.k) objH5, c0510p3, 0);
                                break;
                            case 3:
                                C0510p c0510p4 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("e", c0174k);
                                Bundle bundleG2 = c0174k.g();
                                kotlin.jvm.internal.l.c(bundleG2);
                                String string = bundleG2.getString("slug");
                                kotlin.jvm.internal.l.c(string);
                                E e11 = e7;
                                boolean zH6 = c0510p4.h(e11);
                                Object objH6 = c0510p4.H();
                                Object obj6 = C0502l.a;
                                if (zH6 || objH6 == obj6) {
                                    objH6 = new C1641h(e11, 1);
                                    c0510p4.b0(objH6);
                                }
                                e4.k kVar2 = (e4.k) objH6;
                                boolean zH7 = c0510p4.h(e11);
                                Object objH7 = c0510p4.H();
                                if (zH7 || objH7 == obj6) {
                                    objH7 = new C1642i(e11, 2);
                                    c0510p4.b0(objH7);
                                }
                                InterfaceC0821a interfaceC0821a2 = (InterfaceC0821a) objH7;
                                boolean zH8 = c0510p4.h(e11);
                                Object objH8 = c0510p4.H();
                                if (zH8 || objH8 == obj6) {
                                    objH8 = new C1642i(e11, 3);
                                    c0510p4.b0(objH8);
                                }
                                AbstractC1994a.e(string, kVar2, interfaceC0821a2, (InterfaceC0821a) objH8, null, c0510p4, 0);
                                break;
                            case GzipHeaderFlags.EXTRA /* 4 */:
                                C0510p c0510p5 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("e", c0174k);
                                Bundle bundleG3 = c0174k.g();
                                kotlin.jvm.internal.l.c(bundleG3);
                                String string2 = bundleG3.getString("episode");
                                kotlin.jvm.internal.l.c(string2);
                                E e12 = e7;
                                boolean zH9 = c0510p5.h(e12) | c0510p5.f(string2);
                                Object objH9 = c0510p5.H();
                                if (zH9 || objH9 == C0502l.a) {
                                    objH9 = new C1646m(e12, null, string2);
                                    c0510p5.b0(objH9);
                                }
                                C0486d.e(c0510p5, (n) objH9, string2);
                                break;
                            case 5:
                                C0510p c0510p6 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e13 = e7;
                                boolean zH10 = c0510p6.h(e13);
                                Object objH10 = c0510p6.H();
                                T t9 = C0502l.a;
                                if (zH10 || objH10 == t9) {
                                    objH10 = new C1641h(e13, 4);
                                    c0510p6.b0(objH10);
                                }
                                e4.k kVar3 = (e4.k) objH10;
                                boolean zH11 = c0510p6.h(e13);
                                Object objH11 = c0510p6.H();
                                if (zH11 || objH11 == t9) {
                                    objH11 = new C1641h(e13, 5);
                                    c0510p6.b0(objH11);
                                }
                                A3.c.a(kVar3, (e4.k) objH11, null, c0510p6, 0);
                                break;
                            case 6:
                                C0510p c0510p7 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e14 = e7;
                                boolean zH12 = c0510p7.h(e14);
                                Object objH12 = c0510p7.H();
                                T t10 = C0502l.a;
                                if (zH12 || objH12 == t10) {
                                    objH12 = new C1641h(e14, 13);
                                    c0510p7.b0(objH12);
                                }
                                e4.k kVar4 = (e4.k) objH12;
                                boolean zH13 = c0510p7.h(e14);
                                Object objH13 = c0510p7.H();
                                if (zH13 || objH13 == t10) {
                                    objH13 = new C1641h(e14, 14);
                                    c0510p7.b0(objH13);
                                }
                                AbstractC0847h.e(kVar4, (e4.k) objH13, null, c0510p7, 0);
                                break;
                            case 7:
                                C0510p c0510p8 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e15 = e7;
                                boolean zH14 = c0510p8.h(e15);
                                Object objH14 = c0510p8.H();
                                T t11 = C0502l.a;
                                if (zH14 || objH14 == t11) {
                                    objH14 = new C1641h(e15, 11);
                                    c0510p8.b0(objH14);
                                }
                                e4.k kVar5 = (e4.k) objH14;
                                boolean zH15 = c0510p8.h(e15);
                                Object objH15 = c0510p8.H();
                                if (zH15 || objH15 == t11) {
                                    objH15 = new C1642i(e15, 12);
                                    c0510p8.b0(objH15);
                                }
                                AbstractC1856g.a(kVar5, (InterfaceC0821a) objH15, null, c0510p8, 0);
                                break;
                            case 8:
                                C0510p c0510p9 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e16 = e7;
                                boolean zH16 = c0510p9.h(e16);
                                Object objH16 = c0510p9.H();
                                Object obj7 = C0502l.a;
                                if (zH16 || objH16 == obj7) {
                                    objH16 = new C1641h(e16, 12);
                                    c0510p9.b0(objH16);
                                }
                                e4.k kVar6 = (e4.k) objH16;
                                boolean zH17 = c0510p9.h(e16);
                                Object objH17 = c0510p9.H();
                                if (zH17 || objH17 == obj7) {
                                    objH17 = new C1642i(e16, 13);
                                    c0510p9.b0(objH17);
                                }
                                AbstractC2048f.c(kVar6, (InterfaceC0821a) objH17, null, null, c0510p9, 0, 12);
                                break;
                            case 9:
                                C0510p c0510p10 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e17 = e7;
                                boolean zH18 = c0510p10.h(e17);
                                Object objH18 = c0510p10.H();
                                if (zH18 || objH18 == C0502l.a) {
                                    objH18 = new C1641h(e17, 3);
                                    c0510p10.b0(objH18);
                                }
                                AbstractC2048f.b((e4.k) objH18, null, c0510p10, 0);
                                break;
                            case 10:
                                C0510p c0510p11 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e18 = e7;
                                boolean zH19 = c0510p11.h(e18);
                                Object objH19 = c0510p11.H();
                                Object obj8 = C0502l.a;
                                if (zH19 || objH19 == obj8) {
                                    objH19 = new C1641h(e18, 7);
                                    c0510p11.b0(objH19);
                                }
                                e4.k kVar7 = (e4.k) objH19;
                                boolean zH20 = c0510p11.h(e18);
                                Object objH20 = c0510p11.H();
                                if (zH20 || objH20 == obj8) {
                                    objH20 = new C1641h(e18, 8);
                                    c0510p11.b0(objH20);
                                }
                                e4.k kVar8 = (e4.k) objH20;
                                boolean zH21 = c0510p11.h(e18);
                                Object objH21 = c0510p11.H();
                                if (zH21 || objH21 == obj8) {
                                    objH21 = new C1642i(e18, 6);
                                    c0510p11.b0(objH21);
                                }
                                AbstractC2152b.g(kVar7, kVar8, (InterfaceC0821a) objH21, null, c0510p11, 0);
                                break;
                            default:
                                C0510p c0510p12 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e19 = e7;
                                boolean zH22 = c0510p12.h(e19);
                                Object objH22 = c0510p12.H();
                                if (zH22 || objH22 == C0502l.a) {
                                    objH22 = new C1642i(e19, 1);
                                    c0510p12.b0(objH22);
                                }
                                AbstractC1790h.a((InterfaceC0821a) objH22, null, c0510p12, 0);
                                break;
                        }
                        return O3.C.a;
                    }
                }), 254);
                final int i12 = 7;
                z1.c.i(c2, "bookmark", null, new W.a(true, 1719445690, new p() { // from class: o3.f
                    @Override // e4.p
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        C1609g c1609g = (C1609g) obj2;
                        C0174k c0174k = (C0174k) obj3;
                        switch (i12) {
                            case 0:
                                C0510p c0510p = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("e", c0174k);
                                E e8 = e7;
                                boolean zH = c0510p.h(e8);
                                Object objH = c0510p.H();
                                if (zH || objH == C0502l.a) {
                                    objH = new C1641h(e8, 6);
                                    c0510p.b0(objH);
                                }
                                Bundle bundleG = c0174k.g();
                                kotlin.jvm.internal.l.c(bundleG);
                                AbstractC2048f.c((e4.k) objH, null, bundleG.getString("slug"), null, c0510p, 0, 10);
                                break;
                            case 1:
                                C0510p c0510p2 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e9 = e7;
                                boolean zH2 = c0510p2.h(e9);
                                Object objH2 = c0510p2.H();
                                T t7 = C0502l.a;
                                if (zH2 || objH2 == t7) {
                                    objH2 = new C1641h(e9, 0);
                                    c0510p2.b0(objH2);
                                }
                                e4.k kVar = (e4.k) objH2;
                                boolean zH3 = c0510p2.h(e9);
                                Object objH3 = c0510p2.H();
                                if (zH3 || objH3 == t7) {
                                    objH3 = new C1642i(e9, 0);
                                    c0510p2.b0(objH3);
                                }
                                AbstractC2077b.a(kVar, (InterfaceC0821a) objH3, null, c0510p2, 0);
                                break;
                            case 2:
                                C0510p c0510p3 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e10 = e7;
                                boolean zH4 = c0510p3.h(e10);
                                Object objH4 = c0510p3.H();
                                T t8 = C0502l.a;
                                if (zH4 || objH4 == t8) {
                                    objH4 = new C1642i(e10, 5);
                                    c0510p3.b0(objH4);
                                }
                                InterfaceC0821a interfaceC0821a = (InterfaceC0821a) objH4;
                                boolean zH5 = c0510p3.h(e10);
                                Object objH5 = c0510p3.H();
                                if (zH5 || objH5 == t8) {
                                    objH5 = new C1641h(e10, 2);
                                    c0510p3.b0(objH5);
                                }
                                AbstractC2210a.a(interfaceC0821a, (e4.k) objH5, c0510p3, 0);
                                break;
                            case 3:
                                C0510p c0510p4 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("e", c0174k);
                                Bundle bundleG2 = c0174k.g();
                                kotlin.jvm.internal.l.c(bundleG2);
                                String string = bundleG2.getString("slug");
                                kotlin.jvm.internal.l.c(string);
                                E e11 = e7;
                                boolean zH6 = c0510p4.h(e11);
                                Object objH6 = c0510p4.H();
                                Object obj6 = C0502l.a;
                                if (zH6 || objH6 == obj6) {
                                    objH6 = new C1641h(e11, 1);
                                    c0510p4.b0(objH6);
                                }
                                e4.k kVar2 = (e4.k) objH6;
                                boolean zH7 = c0510p4.h(e11);
                                Object objH7 = c0510p4.H();
                                if (zH7 || objH7 == obj6) {
                                    objH7 = new C1642i(e11, 2);
                                    c0510p4.b0(objH7);
                                }
                                InterfaceC0821a interfaceC0821a2 = (InterfaceC0821a) objH7;
                                boolean zH8 = c0510p4.h(e11);
                                Object objH8 = c0510p4.H();
                                if (zH8 || objH8 == obj6) {
                                    objH8 = new C1642i(e11, 3);
                                    c0510p4.b0(objH8);
                                }
                                AbstractC1994a.e(string, kVar2, interfaceC0821a2, (InterfaceC0821a) objH8, null, c0510p4, 0);
                                break;
                            case GzipHeaderFlags.EXTRA /* 4 */:
                                C0510p c0510p5 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("e", c0174k);
                                Bundle bundleG3 = c0174k.g();
                                kotlin.jvm.internal.l.c(bundleG3);
                                String string2 = bundleG3.getString("episode");
                                kotlin.jvm.internal.l.c(string2);
                                E e12 = e7;
                                boolean zH9 = c0510p5.h(e12) | c0510p5.f(string2);
                                Object objH9 = c0510p5.H();
                                if (zH9 || objH9 == C0502l.a) {
                                    objH9 = new C1646m(e12, null, string2);
                                    c0510p5.b0(objH9);
                                }
                                C0486d.e(c0510p5, (n) objH9, string2);
                                break;
                            case 5:
                                C0510p c0510p6 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e13 = e7;
                                boolean zH10 = c0510p6.h(e13);
                                Object objH10 = c0510p6.H();
                                T t9 = C0502l.a;
                                if (zH10 || objH10 == t9) {
                                    objH10 = new C1641h(e13, 4);
                                    c0510p6.b0(objH10);
                                }
                                e4.k kVar3 = (e4.k) objH10;
                                boolean zH11 = c0510p6.h(e13);
                                Object objH11 = c0510p6.H();
                                if (zH11 || objH11 == t9) {
                                    objH11 = new C1641h(e13, 5);
                                    c0510p6.b0(objH11);
                                }
                                A3.c.a(kVar3, (e4.k) objH11, null, c0510p6, 0);
                                break;
                            case 6:
                                C0510p c0510p7 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e14 = e7;
                                boolean zH12 = c0510p7.h(e14);
                                Object objH12 = c0510p7.H();
                                T t10 = C0502l.a;
                                if (zH12 || objH12 == t10) {
                                    objH12 = new C1641h(e14, 13);
                                    c0510p7.b0(objH12);
                                }
                                e4.k kVar4 = (e4.k) objH12;
                                boolean zH13 = c0510p7.h(e14);
                                Object objH13 = c0510p7.H();
                                if (zH13 || objH13 == t10) {
                                    objH13 = new C1641h(e14, 14);
                                    c0510p7.b0(objH13);
                                }
                                AbstractC0847h.e(kVar4, (e4.k) objH13, null, c0510p7, 0);
                                break;
                            case 7:
                                C0510p c0510p8 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e15 = e7;
                                boolean zH14 = c0510p8.h(e15);
                                Object objH14 = c0510p8.H();
                                T t11 = C0502l.a;
                                if (zH14 || objH14 == t11) {
                                    objH14 = new C1641h(e15, 11);
                                    c0510p8.b0(objH14);
                                }
                                e4.k kVar5 = (e4.k) objH14;
                                boolean zH15 = c0510p8.h(e15);
                                Object objH15 = c0510p8.H();
                                if (zH15 || objH15 == t11) {
                                    objH15 = new C1642i(e15, 12);
                                    c0510p8.b0(objH15);
                                }
                                AbstractC1856g.a(kVar5, (InterfaceC0821a) objH15, null, c0510p8, 0);
                                break;
                            case 8:
                                C0510p c0510p9 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e16 = e7;
                                boolean zH16 = c0510p9.h(e16);
                                Object objH16 = c0510p9.H();
                                Object obj7 = C0502l.a;
                                if (zH16 || objH16 == obj7) {
                                    objH16 = new C1641h(e16, 12);
                                    c0510p9.b0(objH16);
                                }
                                e4.k kVar6 = (e4.k) objH16;
                                boolean zH17 = c0510p9.h(e16);
                                Object objH17 = c0510p9.H();
                                if (zH17 || objH17 == obj7) {
                                    objH17 = new C1642i(e16, 13);
                                    c0510p9.b0(objH17);
                                }
                                AbstractC2048f.c(kVar6, (InterfaceC0821a) objH17, null, null, c0510p9, 0, 12);
                                break;
                            case 9:
                                C0510p c0510p10 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e17 = e7;
                                boolean zH18 = c0510p10.h(e17);
                                Object objH18 = c0510p10.H();
                                if (zH18 || objH18 == C0502l.a) {
                                    objH18 = new C1641h(e17, 3);
                                    c0510p10.b0(objH18);
                                }
                                AbstractC2048f.b((e4.k) objH18, null, c0510p10, 0);
                                break;
                            case 10:
                                C0510p c0510p11 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e18 = e7;
                                boolean zH19 = c0510p11.h(e18);
                                Object objH19 = c0510p11.H();
                                Object obj8 = C0502l.a;
                                if (zH19 || objH19 == obj8) {
                                    objH19 = new C1641h(e18, 7);
                                    c0510p11.b0(objH19);
                                }
                                e4.k kVar7 = (e4.k) objH19;
                                boolean zH20 = c0510p11.h(e18);
                                Object objH20 = c0510p11.H();
                                if (zH20 || objH20 == obj8) {
                                    objH20 = new C1641h(e18, 8);
                                    c0510p11.b0(objH20);
                                }
                                e4.k kVar8 = (e4.k) objH20;
                                boolean zH21 = c0510p11.h(e18);
                                Object objH21 = c0510p11.H();
                                if (zH21 || objH21 == obj8) {
                                    objH21 = new C1642i(e18, 6);
                                    c0510p11.b0(objH21);
                                }
                                AbstractC2152b.g(kVar7, kVar8, (InterfaceC0821a) objH21, null, c0510p11, 0);
                                break;
                            default:
                                C0510p c0510p12 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e19 = e7;
                                boolean zH22 = c0510p12.h(e19);
                                Object objH22 = c0510p12.H();
                                if (zH22 || objH22 == C0502l.a) {
                                    objH22 = new C1642i(e19, 1);
                                    c0510p12.b0(objH22);
                                }
                                AbstractC1790h.a((InterfaceC0821a) objH22, null, c0510p12, 0);
                                break;
                        }
                        return O3.C.a;
                    }
                }), 254);
                final int i13 = 8;
                z1.c.i(c2, "genre", null, new W.a(true, 1035215385, new p() { // from class: o3.f
                    @Override // e4.p
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        C1609g c1609g = (C1609g) obj2;
                        C0174k c0174k = (C0174k) obj3;
                        switch (i13) {
                            case 0:
                                C0510p c0510p = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("e", c0174k);
                                E e8 = e7;
                                boolean zH = c0510p.h(e8);
                                Object objH = c0510p.H();
                                if (zH || objH == C0502l.a) {
                                    objH = new C1641h(e8, 6);
                                    c0510p.b0(objH);
                                }
                                Bundle bundleG = c0174k.g();
                                kotlin.jvm.internal.l.c(bundleG);
                                AbstractC2048f.c((e4.k) objH, null, bundleG.getString("slug"), null, c0510p, 0, 10);
                                break;
                            case 1:
                                C0510p c0510p2 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e9 = e7;
                                boolean zH2 = c0510p2.h(e9);
                                Object objH2 = c0510p2.H();
                                T t7 = C0502l.a;
                                if (zH2 || objH2 == t7) {
                                    objH2 = new C1641h(e9, 0);
                                    c0510p2.b0(objH2);
                                }
                                e4.k kVar = (e4.k) objH2;
                                boolean zH3 = c0510p2.h(e9);
                                Object objH3 = c0510p2.H();
                                if (zH3 || objH3 == t7) {
                                    objH3 = new C1642i(e9, 0);
                                    c0510p2.b0(objH3);
                                }
                                AbstractC2077b.a(kVar, (InterfaceC0821a) objH3, null, c0510p2, 0);
                                break;
                            case 2:
                                C0510p c0510p3 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e10 = e7;
                                boolean zH4 = c0510p3.h(e10);
                                Object objH4 = c0510p3.H();
                                T t8 = C0502l.a;
                                if (zH4 || objH4 == t8) {
                                    objH4 = new C1642i(e10, 5);
                                    c0510p3.b0(objH4);
                                }
                                InterfaceC0821a interfaceC0821a = (InterfaceC0821a) objH4;
                                boolean zH5 = c0510p3.h(e10);
                                Object objH5 = c0510p3.H();
                                if (zH5 || objH5 == t8) {
                                    objH5 = new C1641h(e10, 2);
                                    c0510p3.b0(objH5);
                                }
                                AbstractC2210a.a(interfaceC0821a, (e4.k) objH5, c0510p3, 0);
                                break;
                            case 3:
                                C0510p c0510p4 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("e", c0174k);
                                Bundle bundleG2 = c0174k.g();
                                kotlin.jvm.internal.l.c(bundleG2);
                                String string = bundleG2.getString("slug");
                                kotlin.jvm.internal.l.c(string);
                                E e11 = e7;
                                boolean zH6 = c0510p4.h(e11);
                                Object objH6 = c0510p4.H();
                                Object obj6 = C0502l.a;
                                if (zH6 || objH6 == obj6) {
                                    objH6 = new C1641h(e11, 1);
                                    c0510p4.b0(objH6);
                                }
                                e4.k kVar2 = (e4.k) objH6;
                                boolean zH7 = c0510p4.h(e11);
                                Object objH7 = c0510p4.H();
                                if (zH7 || objH7 == obj6) {
                                    objH7 = new C1642i(e11, 2);
                                    c0510p4.b0(objH7);
                                }
                                InterfaceC0821a interfaceC0821a2 = (InterfaceC0821a) objH7;
                                boolean zH8 = c0510p4.h(e11);
                                Object objH8 = c0510p4.H();
                                if (zH8 || objH8 == obj6) {
                                    objH8 = new C1642i(e11, 3);
                                    c0510p4.b0(objH8);
                                }
                                AbstractC1994a.e(string, kVar2, interfaceC0821a2, (InterfaceC0821a) objH8, null, c0510p4, 0);
                                break;
                            case GzipHeaderFlags.EXTRA /* 4 */:
                                C0510p c0510p5 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("e", c0174k);
                                Bundle bundleG3 = c0174k.g();
                                kotlin.jvm.internal.l.c(bundleG3);
                                String string2 = bundleG3.getString("episode");
                                kotlin.jvm.internal.l.c(string2);
                                E e12 = e7;
                                boolean zH9 = c0510p5.h(e12) | c0510p5.f(string2);
                                Object objH9 = c0510p5.H();
                                if (zH9 || objH9 == C0502l.a) {
                                    objH9 = new C1646m(e12, null, string2);
                                    c0510p5.b0(objH9);
                                }
                                C0486d.e(c0510p5, (n) objH9, string2);
                                break;
                            case 5:
                                C0510p c0510p6 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e13 = e7;
                                boolean zH10 = c0510p6.h(e13);
                                Object objH10 = c0510p6.H();
                                T t9 = C0502l.a;
                                if (zH10 || objH10 == t9) {
                                    objH10 = new C1641h(e13, 4);
                                    c0510p6.b0(objH10);
                                }
                                e4.k kVar3 = (e4.k) objH10;
                                boolean zH11 = c0510p6.h(e13);
                                Object objH11 = c0510p6.H();
                                if (zH11 || objH11 == t9) {
                                    objH11 = new C1641h(e13, 5);
                                    c0510p6.b0(objH11);
                                }
                                A3.c.a(kVar3, (e4.k) objH11, null, c0510p6, 0);
                                break;
                            case 6:
                                C0510p c0510p7 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e14 = e7;
                                boolean zH12 = c0510p7.h(e14);
                                Object objH12 = c0510p7.H();
                                T t10 = C0502l.a;
                                if (zH12 || objH12 == t10) {
                                    objH12 = new C1641h(e14, 13);
                                    c0510p7.b0(objH12);
                                }
                                e4.k kVar4 = (e4.k) objH12;
                                boolean zH13 = c0510p7.h(e14);
                                Object objH13 = c0510p7.H();
                                if (zH13 || objH13 == t10) {
                                    objH13 = new C1641h(e14, 14);
                                    c0510p7.b0(objH13);
                                }
                                AbstractC0847h.e(kVar4, (e4.k) objH13, null, c0510p7, 0);
                                break;
                            case 7:
                                C0510p c0510p8 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e15 = e7;
                                boolean zH14 = c0510p8.h(e15);
                                Object objH14 = c0510p8.H();
                                T t11 = C0502l.a;
                                if (zH14 || objH14 == t11) {
                                    objH14 = new C1641h(e15, 11);
                                    c0510p8.b0(objH14);
                                }
                                e4.k kVar5 = (e4.k) objH14;
                                boolean zH15 = c0510p8.h(e15);
                                Object objH15 = c0510p8.H();
                                if (zH15 || objH15 == t11) {
                                    objH15 = new C1642i(e15, 12);
                                    c0510p8.b0(objH15);
                                }
                                AbstractC1856g.a(kVar5, (InterfaceC0821a) objH15, null, c0510p8, 0);
                                break;
                            case 8:
                                C0510p c0510p9 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e16 = e7;
                                boolean zH16 = c0510p9.h(e16);
                                Object objH16 = c0510p9.H();
                                Object obj7 = C0502l.a;
                                if (zH16 || objH16 == obj7) {
                                    objH16 = new C1641h(e16, 12);
                                    c0510p9.b0(objH16);
                                }
                                e4.k kVar6 = (e4.k) objH16;
                                boolean zH17 = c0510p9.h(e16);
                                Object objH17 = c0510p9.H();
                                if (zH17 || objH17 == obj7) {
                                    objH17 = new C1642i(e16, 13);
                                    c0510p9.b0(objH17);
                                }
                                AbstractC2048f.c(kVar6, (InterfaceC0821a) objH17, null, null, c0510p9, 0, 12);
                                break;
                            case 9:
                                C0510p c0510p10 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e17 = e7;
                                boolean zH18 = c0510p10.h(e17);
                                Object objH18 = c0510p10.H();
                                if (zH18 || objH18 == C0502l.a) {
                                    objH18 = new C1641h(e17, 3);
                                    c0510p10.b0(objH18);
                                }
                                AbstractC2048f.b((e4.k) objH18, null, c0510p10, 0);
                                break;
                            case 10:
                                C0510p c0510p11 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e18 = e7;
                                boolean zH19 = c0510p11.h(e18);
                                Object objH19 = c0510p11.H();
                                Object obj8 = C0502l.a;
                                if (zH19 || objH19 == obj8) {
                                    objH19 = new C1641h(e18, 7);
                                    c0510p11.b0(objH19);
                                }
                                e4.k kVar7 = (e4.k) objH19;
                                boolean zH20 = c0510p11.h(e18);
                                Object objH20 = c0510p11.H();
                                if (zH20 || objH20 == obj8) {
                                    objH20 = new C1641h(e18, 8);
                                    c0510p11.b0(objH20);
                                }
                                e4.k kVar8 = (e4.k) objH20;
                                boolean zH21 = c0510p11.h(e18);
                                Object objH21 = c0510p11.H();
                                if (zH21 || objH21 == obj8) {
                                    objH21 = new C1642i(e18, 6);
                                    c0510p11.b0(objH21);
                                }
                                AbstractC2152b.g(kVar7, kVar8, (InterfaceC0821a) objH21, null, c0510p11, 0);
                                break;
                            default:
                                C0510p c0510p12 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e19 = e7;
                                boolean zH22 = c0510p12.h(e19);
                                Object objH22 = c0510p12.H();
                                if (zH22 || objH22 == C0502l.a) {
                                    objH22 = new C1642i(e19, 1);
                                    c0510p12.b0(objH22);
                                }
                                AbstractC1790h.a((InterfaceC0821a) objH22, null, c0510p12, 0);
                                break;
                        }
                        return O3.C.a;
                    }
                }), 254);
                final int i14 = 9;
                z1.c.i(c2, "az", null, new W.a(true, 350985080, new p() { // from class: o3.f
                    @Override // e4.p
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        C1609g c1609g = (C1609g) obj2;
                        C0174k c0174k = (C0174k) obj3;
                        switch (i14) {
                            case 0:
                                C0510p c0510p = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("e", c0174k);
                                E e8 = e7;
                                boolean zH = c0510p.h(e8);
                                Object objH = c0510p.H();
                                if (zH || objH == C0502l.a) {
                                    objH = new C1641h(e8, 6);
                                    c0510p.b0(objH);
                                }
                                Bundle bundleG = c0174k.g();
                                kotlin.jvm.internal.l.c(bundleG);
                                AbstractC2048f.c((e4.k) objH, null, bundleG.getString("slug"), null, c0510p, 0, 10);
                                break;
                            case 1:
                                C0510p c0510p2 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e9 = e7;
                                boolean zH2 = c0510p2.h(e9);
                                Object objH2 = c0510p2.H();
                                T t7 = C0502l.a;
                                if (zH2 || objH2 == t7) {
                                    objH2 = new C1641h(e9, 0);
                                    c0510p2.b0(objH2);
                                }
                                e4.k kVar = (e4.k) objH2;
                                boolean zH3 = c0510p2.h(e9);
                                Object objH3 = c0510p2.H();
                                if (zH3 || objH3 == t7) {
                                    objH3 = new C1642i(e9, 0);
                                    c0510p2.b0(objH3);
                                }
                                AbstractC2077b.a(kVar, (InterfaceC0821a) objH3, null, c0510p2, 0);
                                break;
                            case 2:
                                C0510p c0510p3 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e10 = e7;
                                boolean zH4 = c0510p3.h(e10);
                                Object objH4 = c0510p3.H();
                                T t8 = C0502l.a;
                                if (zH4 || objH4 == t8) {
                                    objH4 = new C1642i(e10, 5);
                                    c0510p3.b0(objH4);
                                }
                                InterfaceC0821a interfaceC0821a = (InterfaceC0821a) objH4;
                                boolean zH5 = c0510p3.h(e10);
                                Object objH5 = c0510p3.H();
                                if (zH5 || objH5 == t8) {
                                    objH5 = new C1641h(e10, 2);
                                    c0510p3.b0(objH5);
                                }
                                AbstractC2210a.a(interfaceC0821a, (e4.k) objH5, c0510p3, 0);
                                break;
                            case 3:
                                C0510p c0510p4 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("e", c0174k);
                                Bundle bundleG2 = c0174k.g();
                                kotlin.jvm.internal.l.c(bundleG2);
                                String string = bundleG2.getString("slug");
                                kotlin.jvm.internal.l.c(string);
                                E e11 = e7;
                                boolean zH6 = c0510p4.h(e11);
                                Object objH6 = c0510p4.H();
                                Object obj6 = C0502l.a;
                                if (zH6 || objH6 == obj6) {
                                    objH6 = new C1641h(e11, 1);
                                    c0510p4.b0(objH6);
                                }
                                e4.k kVar2 = (e4.k) objH6;
                                boolean zH7 = c0510p4.h(e11);
                                Object objH7 = c0510p4.H();
                                if (zH7 || objH7 == obj6) {
                                    objH7 = new C1642i(e11, 2);
                                    c0510p4.b0(objH7);
                                }
                                InterfaceC0821a interfaceC0821a2 = (InterfaceC0821a) objH7;
                                boolean zH8 = c0510p4.h(e11);
                                Object objH8 = c0510p4.H();
                                if (zH8 || objH8 == obj6) {
                                    objH8 = new C1642i(e11, 3);
                                    c0510p4.b0(objH8);
                                }
                                AbstractC1994a.e(string, kVar2, interfaceC0821a2, (InterfaceC0821a) objH8, null, c0510p4, 0);
                                break;
                            case GzipHeaderFlags.EXTRA /* 4 */:
                                C0510p c0510p5 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("e", c0174k);
                                Bundle bundleG3 = c0174k.g();
                                kotlin.jvm.internal.l.c(bundleG3);
                                String string2 = bundleG3.getString("episode");
                                kotlin.jvm.internal.l.c(string2);
                                E e12 = e7;
                                boolean zH9 = c0510p5.h(e12) | c0510p5.f(string2);
                                Object objH9 = c0510p5.H();
                                if (zH9 || objH9 == C0502l.a) {
                                    objH9 = new C1646m(e12, null, string2);
                                    c0510p5.b0(objH9);
                                }
                                C0486d.e(c0510p5, (n) objH9, string2);
                                break;
                            case 5:
                                C0510p c0510p6 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e13 = e7;
                                boolean zH10 = c0510p6.h(e13);
                                Object objH10 = c0510p6.H();
                                T t9 = C0502l.a;
                                if (zH10 || objH10 == t9) {
                                    objH10 = new C1641h(e13, 4);
                                    c0510p6.b0(objH10);
                                }
                                e4.k kVar3 = (e4.k) objH10;
                                boolean zH11 = c0510p6.h(e13);
                                Object objH11 = c0510p6.H();
                                if (zH11 || objH11 == t9) {
                                    objH11 = new C1641h(e13, 5);
                                    c0510p6.b0(objH11);
                                }
                                A3.c.a(kVar3, (e4.k) objH11, null, c0510p6, 0);
                                break;
                            case 6:
                                C0510p c0510p7 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e14 = e7;
                                boolean zH12 = c0510p7.h(e14);
                                Object objH12 = c0510p7.H();
                                T t10 = C0502l.a;
                                if (zH12 || objH12 == t10) {
                                    objH12 = new C1641h(e14, 13);
                                    c0510p7.b0(objH12);
                                }
                                e4.k kVar4 = (e4.k) objH12;
                                boolean zH13 = c0510p7.h(e14);
                                Object objH13 = c0510p7.H();
                                if (zH13 || objH13 == t10) {
                                    objH13 = new C1641h(e14, 14);
                                    c0510p7.b0(objH13);
                                }
                                AbstractC0847h.e(kVar4, (e4.k) objH13, null, c0510p7, 0);
                                break;
                            case 7:
                                C0510p c0510p8 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e15 = e7;
                                boolean zH14 = c0510p8.h(e15);
                                Object objH14 = c0510p8.H();
                                T t11 = C0502l.a;
                                if (zH14 || objH14 == t11) {
                                    objH14 = new C1641h(e15, 11);
                                    c0510p8.b0(objH14);
                                }
                                e4.k kVar5 = (e4.k) objH14;
                                boolean zH15 = c0510p8.h(e15);
                                Object objH15 = c0510p8.H();
                                if (zH15 || objH15 == t11) {
                                    objH15 = new C1642i(e15, 12);
                                    c0510p8.b0(objH15);
                                }
                                AbstractC1856g.a(kVar5, (InterfaceC0821a) objH15, null, c0510p8, 0);
                                break;
                            case 8:
                                C0510p c0510p9 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e16 = e7;
                                boolean zH16 = c0510p9.h(e16);
                                Object objH16 = c0510p9.H();
                                Object obj7 = C0502l.a;
                                if (zH16 || objH16 == obj7) {
                                    objH16 = new C1641h(e16, 12);
                                    c0510p9.b0(objH16);
                                }
                                e4.k kVar6 = (e4.k) objH16;
                                boolean zH17 = c0510p9.h(e16);
                                Object objH17 = c0510p9.H();
                                if (zH17 || objH17 == obj7) {
                                    objH17 = new C1642i(e16, 13);
                                    c0510p9.b0(objH17);
                                }
                                AbstractC2048f.c(kVar6, (InterfaceC0821a) objH17, null, null, c0510p9, 0, 12);
                                break;
                            case 9:
                                C0510p c0510p10 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e17 = e7;
                                boolean zH18 = c0510p10.h(e17);
                                Object objH18 = c0510p10.H();
                                if (zH18 || objH18 == C0502l.a) {
                                    objH18 = new C1641h(e17, 3);
                                    c0510p10.b0(objH18);
                                }
                                AbstractC2048f.b((e4.k) objH18, null, c0510p10, 0);
                                break;
                            case 10:
                                C0510p c0510p11 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e18 = e7;
                                boolean zH19 = c0510p11.h(e18);
                                Object objH19 = c0510p11.H();
                                Object obj8 = C0502l.a;
                                if (zH19 || objH19 == obj8) {
                                    objH19 = new C1641h(e18, 7);
                                    c0510p11.b0(objH19);
                                }
                                e4.k kVar7 = (e4.k) objH19;
                                boolean zH20 = c0510p11.h(e18);
                                Object objH20 = c0510p11.H();
                                if (zH20 || objH20 == obj8) {
                                    objH20 = new C1641h(e18, 8);
                                    c0510p11.b0(objH20);
                                }
                                e4.k kVar8 = (e4.k) objH20;
                                boolean zH21 = c0510p11.h(e18);
                                Object objH21 = c0510p11.H();
                                if (zH21 || objH21 == obj8) {
                                    objH21 = new C1642i(e18, 6);
                                    c0510p11.b0(objH21);
                                }
                                AbstractC2152b.g(kVar7, kVar8, (InterfaceC0821a) objH21, null, c0510p11, 0);
                                break;
                            default:
                                C0510p c0510p12 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e19 = e7;
                                boolean zH22 = c0510p12.h(e19);
                                Object objH22 = c0510p12.H();
                                if (zH22 || objH22 == C0502l.a) {
                                    objH22 = new C1642i(e19, 1);
                                    c0510p12.b0(objH22);
                                }
                                AbstractC1790h.a((InterfaceC0821a) objH22, null, c0510p12, 0);
                                break;
                        }
                        return O3.C.a;
                    }
                }), 254);
                final int i15 = 11;
                z1.c.i(c2, "auth", null, new W.a(true, -333245225, new p() { // from class: o3.f
                    @Override // e4.p
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        C1609g c1609g = (C1609g) obj2;
                        C0174k c0174k = (C0174k) obj3;
                        switch (i15) {
                            case 0:
                                C0510p c0510p = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("e", c0174k);
                                E e8 = e7;
                                boolean zH = c0510p.h(e8);
                                Object objH = c0510p.H();
                                if (zH || objH == C0502l.a) {
                                    objH = new C1641h(e8, 6);
                                    c0510p.b0(objH);
                                }
                                Bundle bundleG = c0174k.g();
                                kotlin.jvm.internal.l.c(bundleG);
                                AbstractC2048f.c((e4.k) objH, null, bundleG.getString("slug"), null, c0510p, 0, 10);
                                break;
                            case 1:
                                C0510p c0510p2 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e9 = e7;
                                boolean zH2 = c0510p2.h(e9);
                                Object objH2 = c0510p2.H();
                                T t7 = C0502l.a;
                                if (zH2 || objH2 == t7) {
                                    objH2 = new C1641h(e9, 0);
                                    c0510p2.b0(objH2);
                                }
                                e4.k kVar = (e4.k) objH2;
                                boolean zH3 = c0510p2.h(e9);
                                Object objH3 = c0510p2.H();
                                if (zH3 || objH3 == t7) {
                                    objH3 = new C1642i(e9, 0);
                                    c0510p2.b0(objH3);
                                }
                                AbstractC2077b.a(kVar, (InterfaceC0821a) objH3, null, c0510p2, 0);
                                break;
                            case 2:
                                C0510p c0510p3 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e10 = e7;
                                boolean zH4 = c0510p3.h(e10);
                                Object objH4 = c0510p3.H();
                                T t8 = C0502l.a;
                                if (zH4 || objH4 == t8) {
                                    objH4 = new C1642i(e10, 5);
                                    c0510p3.b0(objH4);
                                }
                                InterfaceC0821a interfaceC0821a = (InterfaceC0821a) objH4;
                                boolean zH5 = c0510p3.h(e10);
                                Object objH5 = c0510p3.H();
                                if (zH5 || objH5 == t8) {
                                    objH5 = new C1641h(e10, 2);
                                    c0510p3.b0(objH5);
                                }
                                AbstractC2210a.a(interfaceC0821a, (e4.k) objH5, c0510p3, 0);
                                break;
                            case 3:
                                C0510p c0510p4 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("e", c0174k);
                                Bundle bundleG2 = c0174k.g();
                                kotlin.jvm.internal.l.c(bundleG2);
                                String string = bundleG2.getString("slug");
                                kotlin.jvm.internal.l.c(string);
                                E e11 = e7;
                                boolean zH6 = c0510p4.h(e11);
                                Object objH6 = c0510p4.H();
                                Object obj6 = C0502l.a;
                                if (zH6 || objH6 == obj6) {
                                    objH6 = new C1641h(e11, 1);
                                    c0510p4.b0(objH6);
                                }
                                e4.k kVar2 = (e4.k) objH6;
                                boolean zH7 = c0510p4.h(e11);
                                Object objH7 = c0510p4.H();
                                if (zH7 || objH7 == obj6) {
                                    objH7 = new C1642i(e11, 2);
                                    c0510p4.b0(objH7);
                                }
                                InterfaceC0821a interfaceC0821a2 = (InterfaceC0821a) objH7;
                                boolean zH8 = c0510p4.h(e11);
                                Object objH8 = c0510p4.H();
                                if (zH8 || objH8 == obj6) {
                                    objH8 = new C1642i(e11, 3);
                                    c0510p4.b0(objH8);
                                }
                                AbstractC1994a.e(string, kVar2, interfaceC0821a2, (InterfaceC0821a) objH8, null, c0510p4, 0);
                                break;
                            case GzipHeaderFlags.EXTRA /* 4 */:
                                C0510p c0510p5 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("e", c0174k);
                                Bundle bundleG3 = c0174k.g();
                                kotlin.jvm.internal.l.c(bundleG3);
                                String string2 = bundleG3.getString("episode");
                                kotlin.jvm.internal.l.c(string2);
                                E e12 = e7;
                                boolean zH9 = c0510p5.h(e12) | c0510p5.f(string2);
                                Object objH9 = c0510p5.H();
                                if (zH9 || objH9 == C0502l.a) {
                                    objH9 = new C1646m(e12, null, string2);
                                    c0510p5.b0(objH9);
                                }
                                C0486d.e(c0510p5, (n) objH9, string2);
                                break;
                            case 5:
                                C0510p c0510p6 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e13 = e7;
                                boolean zH10 = c0510p6.h(e13);
                                Object objH10 = c0510p6.H();
                                T t9 = C0502l.a;
                                if (zH10 || objH10 == t9) {
                                    objH10 = new C1641h(e13, 4);
                                    c0510p6.b0(objH10);
                                }
                                e4.k kVar3 = (e4.k) objH10;
                                boolean zH11 = c0510p6.h(e13);
                                Object objH11 = c0510p6.H();
                                if (zH11 || objH11 == t9) {
                                    objH11 = new C1641h(e13, 5);
                                    c0510p6.b0(objH11);
                                }
                                A3.c.a(kVar3, (e4.k) objH11, null, c0510p6, 0);
                                break;
                            case 6:
                                C0510p c0510p7 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e14 = e7;
                                boolean zH12 = c0510p7.h(e14);
                                Object objH12 = c0510p7.H();
                                T t10 = C0502l.a;
                                if (zH12 || objH12 == t10) {
                                    objH12 = new C1641h(e14, 13);
                                    c0510p7.b0(objH12);
                                }
                                e4.k kVar4 = (e4.k) objH12;
                                boolean zH13 = c0510p7.h(e14);
                                Object objH13 = c0510p7.H();
                                if (zH13 || objH13 == t10) {
                                    objH13 = new C1641h(e14, 14);
                                    c0510p7.b0(objH13);
                                }
                                AbstractC0847h.e(kVar4, (e4.k) objH13, null, c0510p7, 0);
                                break;
                            case 7:
                                C0510p c0510p8 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e15 = e7;
                                boolean zH14 = c0510p8.h(e15);
                                Object objH14 = c0510p8.H();
                                T t11 = C0502l.a;
                                if (zH14 || objH14 == t11) {
                                    objH14 = new C1641h(e15, 11);
                                    c0510p8.b0(objH14);
                                }
                                e4.k kVar5 = (e4.k) objH14;
                                boolean zH15 = c0510p8.h(e15);
                                Object objH15 = c0510p8.H();
                                if (zH15 || objH15 == t11) {
                                    objH15 = new C1642i(e15, 12);
                                    c0510p8.b0(objH15);
                                }
                                AbstractC1856g.a(kVar5, (InterfaceC0821a) objH15, null, c0510p8, 0);
                                break;
                            case 8:
                                C0510p c0510p9 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e16 = e7;
                                boolean zH16 = c0510p9.h(e16);
                                Object objH16 = c0510p9.H();
                                Object obj7 = C0502l.a;
                                if (zH16 || objH16 == obj7) {
                                    objH16 = new C1641h(e16, 12);
                                    c0510p9.b0(objH16);
                                }
                                e4.k kVar6 = (e4.k) objH16;
                                boolean zH17 = c0510p9.h(e16);
                                Object objH17 = c0510p9.H();
                                if (zH17 || objH17 == obj7) {
                                    objH17 = new C1642i(e16, 13);
                                    c0510p9.b0(objH17);
                                }
                                AbstractC2048f.c(kVar6, (InterfaceC0821a) objH17, null, null, c0510p9, 0, 12);
                                break;
                            case 9:
                                C0510p c0510p10 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e17 = e7;
                                boolean zH18 = c0510p10.h(e17);
                                Object objH18 = c0510p10.H();
                                if (zH18 || objH18 == C0502l.a) {
                                    objH18 = new C1641h(e17, 3);
                                    c0510p10.b0(objH18);
                                }
                                AbstractC2048f.b((e4.k) objH18, null, c0510p10, 0);
                                break;
                            case 10:
                                C0510p c0510p11 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e18 = e7;
                                boolean zH19 = c0510p11.h(e18);
                                Object objH19 = c0510p11.H();
                                Object obj8 = C0502l.a;
                                if (zH19 || objH19 == obj8) {
                                    objH19 = new C1641h(e18, 7);
                                    c0510p11.b0(objH19);
                                }
                                e4.k kVar7 = (e4.k) objH19;
                                boolean zH20 = c0510p11.h(e18);
                                Object objH20 = c0510p11.H();
                                if (zH20 || objH20 == obj8) {
                                    objH20 = new C1641h(e18, 8);
                                    c0510p11.b0(objH20);
                                }
                                e4.k kVar8 = (e4.k) objH20;
                                boolean zH21 = c0510p11.h(e18);
                                Object objH21 = c0510p11.H();
                                if (zH21 || objH21 == obj8) {
                                    objH21 = new C1642i(e18, 6);
                                    c0510p11.b0(objH21);
                                }
                                AbstractC2152b.g(kVar7, kVar8, (InterfaceC0821a) objH21, null, c0510p11, 0);
                                break;
                            default:
                                C0510p c0510p12 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e19 = e7;
                                boolean zH22 = c0510p12.h(e19);
                                Object objH22 = c0510p12.H();
                                if (zH22 || objH22 == C0502l.a) {
                                    objH22 = new C1642i(e19, 1);
                                    c0510p12.b0(objH22);
                                }
                                AbstractC1790h.a((InterfaceC0821a) objH22, null, c0510p12, 0);
                                break;
                        }
                        return O3.C.a;
                    }
                }), 254);
                final h hVar = (h) this.f4071m;
                final int i16 = 1;
                z1.c.i(c2, "me", null, new W.a(true, -1017475530, new p() { // from class: o3.g
                    @Override // e4.p
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        C1609g c1609g = (C1609g) obj2;
                        C0174k c0174k = (C0174k) obj3;
                        switch (i16) {
                            case 0:
                                C0510p c0510p = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e8 = e7;
                                boolean zH = c0510p.h(e8);
                                Object objH = c0510p.H();
                                T t7 = C0502l.a;
                                if (zH || objH == t7) {
                                    objH = new C1642i(e8, 4);
                                    c0510p.b0(objH);
                                }
                                InterfaceC0821a interfaceC0821a = (InterfaceC0821a) objH;
                                final x3.h hVar2 = hVar;
                                boolean zH2 = c0510p.h(hVar2);
                                Object objH2 = c0510p.H();
                                if (zH2 || objH2 == t7) {
                                    final int i17 = 0;
                                    objH2 = new e4.k() { // from class: o3.k
                                        @Override // e4.k
                                        public final Object invoke(Object obj6) {
                                            OtaCheck otaCheck = (OtaCheck) obj6;
                                            switch (i17) {
                                                case 0:
                                                    kotlin.jvm.internal.l.f("info", otaCheck);
                                                    Y y7 = hVar2.f17330b;
                                                    y7.getClass();
                                                    y7.i(null, otaCheck);
                                                    break;
                                                default:
                                                    kotlin.jvm.internal.l.f("info", otaCheck);
                                                    Y y8 = hVar2.f17330b;
                                                    y8.getClass();
                                                    y8.i(null, otaCheck);
                                                    break;
                                            }
                                            return O3.C.a;
                                        }
                                    };
                                    c0510p.b0(objH2);
                                }
                                AbstractC0025a.b(interfaceC0821a, (e4.k) objH2, null, c0510p, 0);
                                break;
                            default:
                                C0510p c0510p2 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e9 = e7;
                                boolean zH3 = c0510p2.h(e9);
                                Object objH3 = c0510p2.H();
                                Object obj6 = C0502l.a;
                                if (zH3 || objH3 == obj6) {
                                    objH3 = new C1642i(e9, 7);
                                    c0510p2.b0(objH3);
                                }
                                InterfaceC0821a interfaceC0821a2 = (InterfaceC0821a) objH3;
                                boolean zH4 = c0510p2.h(e9);
                                Object objH4 = c0510p2.H();
                                if (zH4 || objH4 == obj6) {
                                    objH4 = new C1641h(e9, 9);
                                    c0510p2.b0(objH4);
                                }
                                e4.k kVar = (e4.k) objH4;
                                boolean zH5 = c0510p2.h(e9);
                                Object objH5 = c0510p2.H();
                                if (zH5 || objH5 == obj6) {
                                    objH5 = new C1641h(e9, 10);
                                    c0510p2.b0(objH5);
                                }
                                e4.k kVar2 = (e4.k) objH5;
                                final x3.h hVar3 = hVar;
                                boolean zH6 = c0510p2.h(hVar3);
                                Object objH6 = c0510p2.H();
                                if (zH6 || objH6 == obj6) {
                                    final int i18 = 1;
                                    objH6 = new e4.k() { // from class: o3.k
                                        @Override // e4.k
                                        public final Object invoke(Object obj62) {
                                            OtaCheck otaCheck = (OtaCheck) obj62;
                                            switch (i18) {
                                                case 0:
                                                    kotlin.jvm.internal.l.f("info", otaCheck);
                                                    Y y7 = hVar3.f17330b;
                                                    y7.getClass();
                                                    y7.i(null, otaCheck);
                                                    break;
                                                default:
                                                    kotlin.jvm.internal.l.f("info", otaCheck);
                                                    Y y8 = hVar3.f17330b;
                                                    y8.getClass();
                                                    y8.i(null, otaCheck);
                                                    break;
                                            }
                                            return O3.C.a;
                                        }
                                    };
                                    c0510p2.b0(objH6);
                                }
                                e4.k kVar3 = (e4.k) objH6;
                                boolean zH7 = c0510p2.h(e9);
                                Object objH7 = c0510p2.H();
                                if (zH7 || objH7 == obj6) {
                                    objH7 = new C1642i(e9, 8);
                                    c0510p2.b0(objH7);
                                }
                                InterfaceC0821a interfaceC0821a3 = (InterfaceC0821a) objH7;
                                boolean zH8 = c0510p2.h(e9);
                                Object objH8 = c0510p2.H();
                                if (zH8 || objH8 == obj6) {
                                    objH8 = new C1642i(e9, 9);
                                    c0510p2.b0(objH8);
                                }
                                InterfaceC0821a interfaceC0821a4 = (InterfaceC0821a) objH8;
                                boolean zH9 = c0510p2.h(e9);
                                Object objH9 = c0510p2.H();
                                if (zH9 || objH9 == obj6) {
                                    objH9 = new C1642i(e9, 10);
                                    c0510p2.b0(objH9);
                                }
                                InterfaceC0821a interfaceC0821a5 = (InterfaceC0821a) objH9;
                                boolean zH10 = c0510p2.h(e9);
                                Object objH10 = c0510p2.H();
                                if (zH10 || objH10 == obj6) {
                                    objH10 = new C1642i(e9, 11);
                                    c0510p2.b0(objH10);
                                }
                                AbstractC2210a.c(interfaceC0821a2, kVar, kVar2, kVar3, interfaceC0821a3, interfaceC0821a4, interfaceC0821a5, (InterfaceC0821a) objH10, null, c0510p2, 0);
                                break;
                        }
                        return O3.C.a;
                    }
                }), 254);
                C0034g c0034g4 = (C0034g) new C0034g(7).f741l;
                c0034g4.f741l = k7;
                K k10 = (K) c0034g4.f741l;
                if (k10 != null) {
                    k7 = k10;
                }
                List listH = r.H(new C0168e("slug", new C0169f(k7)));
                final int i17 = 0;
                z1.c.i(c2, "genre/{slug}", listH, new W.a(true, -720735542, new p() { // from class: o3.f
                    @Override // e4.p
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        C1609g c1609g = (C1609g) obj2;
                        C0174k c0174k = (C0174k) obj3;
                        switch (i17) {
                            case 0:
                                C0510p c0510p = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("e", c0174k);
                                E e8 = e7;
                                boolean zH = c0510p.h(e8);
                                Object objH = c0510p.H();
                                if (zH || objH == C0502l.a) {
                                    objH = new C1641h(e8, 6);
                                    c0510p.b0(objH);
                                }
                                Bundle bundleG = c0174k.g();
                                kotlin.jvm.internal.l.c(bundleG);
                                AbstractC2048f.c((e4.k) objH, null, bundleG.getString("slug"), null, c0510p, 0, 10);
                                break;
                            case 1:
                                C0510p c0510p2 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e9 = e7;
                                boolean zH2 = c0510p2.h(e9);
                                Object objH2 = c0510p2.H();
                                T t7 = C0502l.a;
                                if (zH2 || objH2 == t7) {
                                    objH2 = new C1641h(e9, 0);
                                    c0510p2.b0(objH2);
                                }
                                e4.k kVar = (e4.k) objH2;
                                boolean zH3 = c0510p2.h(e9);
                                Object objH3 = c0510p2.H();
                                if (zH3 || objH3 == t7) {
                                    objH3 = new C1642i(e9, 0);
                                    c0510p2.b0(objH3);
                                }
                                AbstractC2077b.a(kVar, (InterfaceC0821a) objH3, null, c0510p2, 0);
                                break;
                            case 2:
                                C0510p c0510p3 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e10 = e7;
                                boolean zH4 = c0510p3.h(e10);
                                Object objH4 = c0510p3.H();
                                T t8 = C0502l.a;
                                if (zH4 || objH4 == t8) {
                                    objH4 = new C1642i(e10, 5);
                                    c0510p3.b0(objH4);
                                }
                                InterfaceC0821a interfaceC0821a = (InterfaceC0821a) objH4;
                                boolean zH5 = c0510p3.h(e10);
                                Object objH5 = c0510p3.H();
                                if (zH5 || objH5 == t8) {
                                    objH5 = new C1641h(e10, 2);
                                    c0510p3.b0(objH5);
                                }
                                AbstractC2210a.a(interfaceC0821a, (e4.k) objH5, c0510p3, 0);
                                break;
                            case 3:
                                C0510p c0510p4 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("e", c0174k);
                                Bundle bundleG2 = c0174k.g();
                                kotlin.jvm.internal.l.c(bundleG2);
                                String string = bundleG2.getString("slug");
                                kotlin.jvm.internal.l.c(string);
                                E e11 = e7;
                                boolean zH6 = c0510p4.h(e11);
                                Object objH6 = c0510p4.H();
                                Object obj6 = C0502l.a;
                                if (zH6 || objH6 == obj6) {
                                    objH6 = new C1641h(e11, 1);
                                    c0510p4.b0(objH6);
                                }
                                e4.k kVar2 = (e4.k) objH6;
                                boolean zH7 = c0510p4.h(e11);
                                Object objH7 = c0510p4.H();
                                if (zH7 || objH7 == obj6) {
                                    objH7 = new C1642i(e11, 2);
                                    c0510p4.b0(objH7);
                                }
                                InterfaceC0821a interfaceC0821a2 = (InterfaceC0821a) objH7;
                                boolean zH8 = c0510p4.h(e11);
                                Object objH8 = c0510p4.H();
                                if (zH8 || objH8 == obj6) {
                                    objH8 = new C1642i(e11, 3);
                                    c0510p4.b0(objH8);
                                }
                                AbstractC1994a.e(string, kVar2, interfaceC0821a2, (InterfaceC0821a) objH8, null, c0510p4, 0);
                                break;
                            case GzipHeaderFlags.EXTRA /* 4 */:
                                C0510p c0510p5 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("e", c0174k);
                                Bundle bundleG3 = c0174k.g();
                                kotlin.jvm.internal.l.c(bundleG3);
                                String string2 = bundleG3.getString("episode");
                                kotlin.jvm.internal.l.c(string2);
                                E e12 = e7;
                                boolean zH9 = c0510p5.h(e12) | c0510p5.f(string2);
                                Object objH9 = c0510p5.H();
                                if (zH9 || objH9 == C0502l.a) {
                                    objH9 = new C1646m(e12, null, string2);
                                    c0510p5.b0(objH9);
                                }
                                C0486d.e(c0510p5, (n) objH9, string2);
                                break;
                            case 5:
                                C0510p c0510p6 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e13 = e7;
                                boolean zH10 = c0510p6.h(e13);
                                Object objH10 = c0510p6.H();
                                T t9 = C0502l.a;
                                if (zH10 || objH10 == t9) {
                                    objH10 = new C1641h(e13, 4);
                                    c0510p6.b0(objH10);
                                }
                                e4.k kVar3 = (e4.k) objH10;
                                boolean zH11 = c0510p6.h(e13);
                                Object objH11 = c0510p6.H();
                                if (zH11 || objH11 == t9) {
                                    objH11 = new C1641h(e13, 5);
                                    c0510p6.b0(objH11);
                                }
                                A3.c.a(kVar3, (e4.k) objH11, null, c0510p6, 0);
                                break;
                            case 6:
                                C0510p c0510p7 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e14 = e7;
                                boolean zH12 = c0510p7.h(e14);
                                Object objH12 = c0510p7.H();
                                T t10 = C0502l.a;
                                if (zH12 || objH12 == t10) {
                                    objH12 = new C1641h(e14, 13);
                                    c0510p7.b0(objH12);
                                }
                                e4.k kVar4 = (e4.k) objH12;
                                boolean zH13 = c0510p7.h(e14);
                                Object objH13 = c0510p7.H();
                                if (zH13 || objH13 == t10) {
                                    objH13 = new C1641h(e14, 14);
                                    c0510p7.b0(objH13);
                                }
                                AbstractC0847h.e(kVar4, (e4.k) objH13, null, c0510p7, 0);
                                break;
                            case 7:
                                C0510p c0510p8 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e15 = e7;
                                boolean zH14 = c0510p8.h(e15);
                                Object objH14 = c0510p8.H();
                                T t11 = C0502l.a;
                                if (zH14 || objH14 == t11) {
                                    objH14 = new C1641h(e15, 11);
                                    c0510p8.b0(objH14);
                                }
                                e4.k kVar5 = (e4.k) objH14;
                                boolean zH15 = c0510p8.h(e15);
                                Object objH15 = c0510p8.H();
                                if (zH15 || objH15 == t11) {
                                    objH15 = new C1642i(e15, 12);
                                    c0510p8.b0(objH15);
                                }
                                AbstractC1856g.a(kVar5, (InterfaceC0821a) objH15, null, c0510p8, 0);
                                break;
                            case 8:
                                C0510p c0510p9 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e16 = e7;
                                boolean zH16 = c0510p9.h(e16);
                                Object objH16 = c0510p9.H();
                                Object obj7 = C0502l.a;
                                if (zH16 || objH16 == obj7) {
                                    objH16 = new C1641h(e16, 12);
                                    c0510p9.b0(objH16);
                                }
                                e4.k kVar6 = (e4.k) objH16;
                                boolean zH17 = c0510p9.h(e16);
                                Object objH17 = c0510p9.H();
                                if (zH17 || objH17 == obj7) {
                                    objH17 = new C1642i(e16, 13);
                                    c0510p9.b0(objH17);
                                }
                                AbstractC2048f.c(kVar6, (InterfaceC0821a) objH17, null, null, c0510p9, 0, 12);
                                break;
                            case 9:
                                C0510p c0510p10 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e17 = e7;
                                boolean zH18 = c0510p10.h(e17);
                                Object objH18 = c0510p10.H();
                                if (zH18 || objH18 == C0502l.a) {
                                    objH18 = new C1641h(e17, 3);
                                    c0510p10.b0(objH18);
                                }
                                AbstractC2048f.b((e4.k) objH18, null, c0510p10, 0);
                                break;
                            case 10:
                                C0510p c0510p11 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e18 = e7;
                                boolean zH19 = c0510p11.h(e18);
                                Object objH19 = c0510p11.H();
                                Object obj8 = C0502l.a;
                                if (zH19 || objH19 == obj8) {
                                    objH19 = new C1641h(e18, 7);
                                    c0510p11.b0(objH19);
                                }
                                e4.k kVar7 = (e4.k) objH19;
                                boolean zH20 = c0510p11.h(e18);
                                Object objH20 = c0510p11.H();
                                if (zH20 || objH20 == obj8) {
                                    objH20 = new C1641h(e18, 8);
                                    c0510p11.b0(objH20);
                                }
                                e4.k kVar8 = (e4.k) objH20;
                                boolean zH21 = c0510p11.h(e18);
                                Object objH21 = c0510p11.H();
                                if (zH21 || objH21 == obj8) {
                                    objH21 = new C1642i(e18, 6);
                                    c0510p11.b0(objH21);
                                }
                                AbstractC2152b.g(kVar7, kVar8, (InterfaceC0821a) objH21, null, c0510p11, 0);
                                break;
                            default:
                                C0510p c0510p12 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e19 = e7;
                                boolean zH22 = c0510p12.h(e19);
                                Object objH22 = c0510p12.H();
                                if (zH22 || objH22 == C0502l.a) {
                                    objH22 = new C1642i(e19, 1);
                                    c0510p12.b0(objH22);
                                }
                                AbstractC1790h.a((InterfaceC0821a) objH22, null, c0510p12, 0);
                                break;
                        }
                        return O3.C.a;
                    }
                }), 252);
                final int i18 = 1;
                z1.c.i(c2, "history", null, new W.a(true, -1404965847, new p() { // from class: o3.f
                    @Override // e4.p
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        C1609g c1609g = (C1609g) obj2;
                        C0174k c0174k = (C0174k) obj3;
                        switch (i18) {
                            case 0:
                                C0510p c0510p = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("e", c0174k);
                                E e8 = e7;
                                boolean zH = c0510p.h(e8);
                                Object objH = c0510p.H();
                                if (zH || objH == C0502l.a) {
                                    objH = new C1641h(e8, 6);
                                    c0510p.b0(objH);
                                }
                                Bundle bundleG = c0174k.g();
                                kotlin.jvm.internal.l.c(bundleG);
                                AbstractC2048f.c((e4.k) objH, null, bundleG.getString("slug"), null, c0510p, 0, 10);
                                break;
                            case 1:
                                C0510p c0510p2 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e9 = e7;
                                boolean zH2 = c0510p2.h(e9);
                                Object objH2 = c0510p2.H();
                                T t7 = C0502l.a;
                                if (zH2 || objH2 == t7) {
                                    objH2 = new C1641h(e9, 0);
                                    c0510p2.b0(objH2);
                                }
                                e4.k kVar = (e4.k) objH2;
                                boolean zH3 = c0510p2.h(e9);
                                Object objH3 = c0510p2.H();
                                if (zH3 || objH3 == t7) {
                                    objH3 = new C1642i(e9, 0);
                                    c0510p2.b0(objH3);
                                }
                                AbstractC2077b.a(kVar, (InterfaceC0821a) objH3, null, c0510p2, 0);
                                break;
                            case 2:
                                C0510p c0510p3 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e10 = e7;
                                boolean zH4 = c0510p3.h(e10);
                                Object objH4 = c0510p3.H();
                                T t8 = C0502l.a;
                                if (zH4 || objH4 == t8) {
                                    objH4 = new C1642i(e10, 5);
                                    c0510p3.b0(objH4);
                                }
                                InterfaceC0821a interfaceC0821a = (InterfaceC0821a) objH4;
                                boolean zH5 = c0510p3.h(e10);
                                Object objH5 = c0510p3.H();
                                if (zH5 || objH5 == t8) {
                                    objH5 = new C1641h(e10, 2);
                                    c0510p3.b0(objH5);
                                }
                                AbstractC2210a.a(interfaceC0821a, (e4.k) objH5, c0510p3, 0);
                                break;
                            case 3:
                                C0510p c0510p4 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("e", c0174k);
                                Bundle bundleG2 = c0174k.g();
                                kotlin.jvm.internal.l.c(bundleG2);
                                String string = bundleG2.getString("slug");
                                kotlin.jvm.internal.l.c(string);
                                E e11 = e7;
                                boolean zH6 = c0510p4.h(e11);
                                Object objH6 = c0510p4.H();
                                Object obj6 = C0502l.a;
                                if (zH6 || objH6 == obj6) {
                                    objH6 = new C1641h(e11, 1);
                                    c0510p4.b0(objH6);
                                }
                                e4.k kVar2 = (e4.k) objH6;
                                boolean zH7 = c0510p4.h(e11);
                                Object objH7 = c0510p4.H();
                                if (zH7 || objH7 == obj6) {
                                    objH7 = new C1642i(e11, 2);
                                    c0510p4.b0(objH7);
                                }
                                InterfaceC0821a interfaceC0821a2 = (InterfaceC0821a) objH7;
                                boolean zH8 = c0510p4.h(e11);
                                Object objH8 = c0510p4.H();
                                if (zH8 || objH8 == obj6) {
                                    objH8 = new C1642i(e11, 3);
                                    c0510p4.b0(objH8);
                                }
                                AbstractC1994a.e(string, kVar2, interfaceC0821a2, (InterfaceC0821a) objH8, null, c0510p4, 0);
                                break;
                            case GzipHeaderFlags.EXTRA /* 4 */:
                                C0510p c0510p5 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("e", c0174k);
                                Bundle bundleG3 = c0174k.g();
                                kotlin.jvm.internal.l.c(bundleG3);
                                String string2 = bundleG3.getString("episode");
                                kotlin.jvm.internal.l.c(string2);
                                E e12 = e7;
                                boolean zH9 = c0510p5.h(e12) | c0510p5.f(string2);
                                Object objH9 = c0510p5.H();
                                if (zH9 || objH9 == C0502l.a) {
                                    objH9 = new C1646m(e12, null, string2);
                                    c0510p5.b0(objH9);
                                }
                                C0486d.e(c0510p5, (n) objH9, string2);
                                break;
                            case 5:
                                C0510p c0510p6 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e13 = e7;
                                boolean zH10 = c0510p6.h(e13);
                                Object objH10 = c0510p6.H();
                                T t9 = C0502l.a;
                                if (zH10 || objH10 == t9) {
                                    objH10 = new C1641h(e13, 4);
                                    c0510p6.b0(objH10);
                                }
                                e4.k kVar3 = (e4.k) objH10;
                                boolean zH11 = c0510p6.h(e13);
                                Object objH11 = c0510p6.H();
                                if (zH11 || objH11 == t9) {
                                    objH11 = new C1641h(e13, 5);
                                    c0510p6.b0(objH11);
                                }
                                A3.c.a(kVar3, (e4.k) objH11, null, c0510p6, 0);
                                break;
                            case 6:
                                C0510p c0510p7 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e14 = e7;
                                boolean zH12 = c0510p7.h(e14);
                                Object objH12 = c0510p7.H();
                                T t10 = C0502l.a;
                                if (zH12 || objH12 == t10) {
                                    objH12 = new C1641h(e14, 13);
                                    c0510p7.b0(objH12);
                                }
                                e4.k kVar4 = (e4.k) objH12;
                                boolean zH13 = c0510p7.h(e14);
                                Object objH13 = c0510p7.H();
                                if (zH13 || objH13 == t10) {
                                    objH13 = new C1641h(e14, 14);
                                    c0510p7.b0(objH13);
                                }
                                AbstractC0847h.e(kVar4, (e4.k) objH13, null, c0510p7, 0);
                                break;
                            case 7:
                                C0510p c0510p8 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e15 = e7;
                                boolean zH14 = c0510p8.h(e15);
                                Object objH14 = c0510p8.H();
                                T t11 = C0502l.a;
                                if (zH14 || objH14 == t11) {
                                    objH14 = new C1641h(e15, 11);
                                    c0510p8.b0(objH14);
                                }
                                e4.k kVar5 = (e4.k) objH14;
                                boolean zH15 = c0510p8.h(e15);
                                Object objH15 = c0510p8.H();
                                if (zH15 || objH15 == t11) {
                                    objH15 = new C1642i(e15, 12);
                                    c0510p8.b0(objH15);
                                }
                                AbstractC1856g.a(kVar5, (InterfaceC0821a) objH15, null, c0510p8, 0);
                                break;
                            case 8:
                                C0510p c0510p9 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e16 = e7;
                                boolean zH16 = c0510p9.h(e16);
                                Object objH16 = c0510p9.H();
                                Object obj7 = C0502l.a;
                                if (zH16 || objH16 == obj7) {
                                    objH16 = new C1641h(e16, 12);
                                    c0510p9.b0(objH16);
                                }
                                e4.k kVar6 = (e4.k) objH16;
                                boolean zH17 = c0510p9.h(e16);
                                Object objH17 = c0510p9.H();
                                if (zH17 || objH17 == obj7) {
                                    objH17 = new C1642i(e16, 13);
                                    c0510p9.b0(objH17);
                                }
                                AbstractC2048f.c(kVar6, (InterfaceC0821a) objH17, null, null, c0510p9, 0, 12);
                                break;
                            case 9:
                                C0510p c0510p10 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e17 = e7;
                                boolean zH18 = c0510p10.h(e17);
                                Object objH18 = c0510p10.H();
                                if (zH18 || objH18 == C0502l.a) {
                                    objH18 = new C1641h(e17, 3);
                                    c0510p10.b0(objH18);
                                }
                                AbstractC2048f.b((e4.k) objH18, null, c0510p10, 0);
                                break;
                            case 10:
                                C0510p c0510p11 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e18 = e7;
                                boolean zH19 = c0510p11.h(e18);
                                Object objH19 = c0510p11.H();
                                Object obj8 = C0502l.a;
                                if (zH19 || objH19 == obj8) {
                                    objH19 = new C1641h(e18, 7);
                                    c0510p11.b0(objH19);
                                }
                                e4.k kVar7 = (e4.k) objH19;
                                boolean zH20 = c0510p11.h(e18);
                                Object objH20 = c0510p11.H();
                                if (zH20 || objH20 == obj8) {
                                    objH20 = new C1641h(e18, 8);
                                    c0510p11.b0(objH20);
                                }
                                e4.k kVar8 = (e4.k) objH20;
                                boolean zH21 = c0510p11.h(e18);
                                Object objH21 = c0510p11.H();
                                if (zH21 || objH21 == obj8) {
                                    objH21 = new C1642i(e18, 6);
                                    c0510p11.b0(objH21);
                                }
                                AbstractC2152b.g(kVar7, kVar8, (InterfaceC0821a) objH21, null, c0510p11, 0);
                                break;
                            default:
                                C0510p c0510p12 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e19 = e7;
                                boolean zH22 = c0510p12.h(e19);
                                Object objH22 = c0510p12.H();
                                if (zH22 || objH22 == C0502l.a) {
                                    objH22 = new C1642i(e19, 1);
                                    c0510p12.b0(objH22);
                                }
                                AbstractC1790h.a((InterfaceC0821a) objH22, null, c0510p12, 0);
                                break;
                        }
                        return O3.C.a;
                    }
                }), 254);
                final int i19 = 0;
                z1.c.i(c2, "settings", null, new W.a(true, -2089196152, new p() { // from class: o3.g
                    @Override // e4.p
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        C1609g c1609g = (C1609g) obj2;
                        C0174k c0174k = (C0174k) obj3;
                        switch (i19) {
                            case 0:
                                C0510p c0510p = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e8 = e7;
                                boolean zH = c0510p.h(e8);
                                Object objH = c0510p.H();
                                T t7 = C0502l.a;
                                if (zH || objH == t7) {
                                    objH = new C1642i(e8, 4);
                                    c0510p.b0(objH);
                                }
                                InterfaceC0821a interfaceC0821a = (InterfaceC0821a) objH;
                                final x3.h hVar2 = hVar;
                                boolean zH2 = c0510p.h(hVar2);
                                Object objH2 = c0510p.H();
                                if (zH2 || objH2 == t7) {
                                    final int i172 = 0;
                                    objH2 = new e4.k() { // from class: o3.k
                                        @Override // e4.k
                                        public final Object invoke(Object obj62) {
                                            OtaCheck otaCheck = (OtaCheck) obj62;
                                            switch (i172) {
                                                case 0:
                                                    kotlin.jvm.internal.l.f("info", otaCheck);
                                                    Y y7 = hVar2.f17330b;
                                                    y7.getClass();
                                                    y7.i(null, otaCheck);
                                                    break;
                                                default:
                                                    kotlin.jvm.internal.l.f("info", otaCheck);
                                                    Y y8 = hVar2.f17330b;
                                                    y8.getClass();
                                                    y8.i(null, otaCheck);
                                                    break;
                                            }
                                            return O3.C.a;
                                        }
                                    };
                                    c0510p.b0(objH2);
                                }
                                AbstractC0025a.b(interfaceC0821a, (e4.k) objH2, null, c0510p, 0);
                                break;
                            default:
                                C0510p c0510p2 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e9 = e7;
                                boolean zH3 = c0510p2.h(e9);
                                Object objH3 = c0510p2.H();
                                Object obj6 = C0502l.a;
                                if (zH3 || objH3 == obj6) {
                                    objH3 = new C1642i(e9, 7);
                                    c0510p2.b0(objH3);
                                }
                                InterfaceC0821a interfaceC0821a2 = (InterfaceC0821a) objH3;
                                boolean zH4 = c0510p2.h(e9);
                                Object objH4 = c0510p2.H();
                                if (zH4 || objH4 == obj6) {
                                    objH4 = new C1641h(e9, 9);
                                    c0510p2.b0(objH4);
                                }
                                e4.k kVar = (e4.k) objH4;
                                boolean zH5 = c0510p2.h(e9);
                                Object objH5 = c0510p2.H();
                                if (zH5 || objH5 == obj6) {
                                    objH5 = new C1641h(e9, 10);
                                    c0510p2.b0(objH5);
                                }
                                e4.k kVar2 = (e4.k) objH5;
                                final x3.h hVar3 = hVar;
                                boolean zH6 = c0510p2.h(hVar3);
                                Object objH6 = c0510p2.H();
                                if (zH6 || objH6 == obj6) {
                                    final int i182 = 1;
                                    objH6 = new e4.k() { // from class: o3.k
                                        @Override // e4.k
                                        public final Object invoke(Object obj62) {
                                            OtaCheck otaCheck = (OtaCheck) obj62;
                                            switch (i182) {
                                                case 0:
                                                    kotlin.jvm.internal.l.f("info", otaCheck);
                                                    Y y7 = hVar3.f17330b;
                                                    y7.getClass();
                                                    y7.i(null, otaCheck);
                                                    break;
                                                default:
                                                    kotlin.jvm.internal.l.f("info", otaCheck);
                                                    Y y8 = hVar3.f17330b;
                                                    y8.getClass();
                                                    y8.i(null, otaCheck);
                                                    break;
                                            }
                                            return O3.C.a;
                                        }
                                    };
                                    c0510p2.b0(objH6);
                                }
                                e4.k kVar3 = (e4.k) objH6;
                                boolean zH7 = c0510p2.h(e9);
                                Object objH7 = c0510p2.H();
                                if (zH7 || objH7 == obj6) {
                                    objH7 = new C1642i(e9, 8);
                                    c0510p2.b0(objH7);
                                }
                                InterfaceC0821a interfaceC0821a3 = (InterfaceC0821a) objH7;
                                boolean zH8 = c0510p2.h(e9);
                                Object objH8 = c0510p2.H();
                                if (zH8 || objH8 == obj6) {
                                    objH8 = new C1642i(e9, 9);
                                    c0510p2.b0(objH8);
                                }
                                InterfaceC0821a interfaceC0821a4 = (InterfaceC0821a) objH8;
                                boolean zH9 = c0510p2.h(e9);
                                Object objH9 = c0510p2.H();
                                if (zH9 || objH9 == obj6) {
                                    objH9 = new C1642i(e9, 10);
                                    c0510p2.b0(objH9);
                                }
                                InterfaceC0821a interfaceC0821a5 = (InterfaceC0821a) objH9;
                                boolean zH10 = c0510p2.h(e9);
                                Object objH10 = c0510p2.H();
                                if (zH10 || objH10 == obj6) {
                                    objH10 = new C1642i(e9, 11);
                                    c0510p2.b0(objH10);
                                }
                                AbstractC2210a.c(interfaceC0821a2, kVar, kVar2, kVar3, interfaceC0821a3, interfaceC0821a4, interfaceC0821a5, (InterfaceC0821a) objH10, null, c0510p2, 0);
                                break;
                        }
                        return O3.C.a;
                    }
                }), 254);
                final int i20 = 2;
                z1.c.i(c2, "edit-profile", null, new W.a(true, 1521540839, new p() { // from class: o3.f
                    @Override // e4.p
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        C1609g c1609g = (C1609g) obj2;
                        C0174k c0174k = (C0174k) obj3;
                        switch (i20) {
                            case 0:
                                C0510p c0510p = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("e", c0174k);
                                E e8 = e7;
                                boolean zH = c0510p.h(e8);
                                Object objH = c0510p.H();
                                if (zH || objH == C0502l.a) {
                                    objH = new C1641h(e8, 6);
                                    c0510p.b0(objH);
                                }
                                Bundle bundleG = c0174k.g();
                                kotlin.jvm.internal.l.c(bundleG);
                                AbstractC2048f.c((e4.k) objH, null, bundleG.getString("slug"), null, c0510p, 0, 10);
                                break;
                            case 1:
                                C0510p c0510p2 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e9 = e7;
                                boolean zH2 = c0510p2.h(e9);
                                Object objH2 = c0510p2.H();
                                T t7 = C0502l.a;
                                if (zH2 || objH2 == t7) {
                                    objH2 = new C1641h(e9, 0);
                                    c0510p2.b0(objH2);
                                }
                                e4.k kVar = (e4.k) objH2;
                                boolean zH3 = c0510p2.h(e9);
                                Object objH3 = c0510p2.H();
                                if (zH3 || objH3 == t7) {
                                    objH3 = new C1642i(e9, 0);
                                    c0510p2.b0(objH3);
                                }
                                AbstractC2077b.a(kVar, (InterfaceC0821a) objH3, null, c0510p2, 0);
                                break;
                            case 2:
                                C0510p c0510p3 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e10 = e7;
                                boolean zH4 = c0510p3.h(e10);
                                Object objH4 = c0510p3.H();
                                T t8 = C0502l.a;
                                if (zH4 || objH4 == t8) {
                                    objH4 = new C1642i(e10, 5);
                                    c0510p3.b0(objH4);
                                }
                                InterfaceC0821a interfaceC0821a = (InterfaceC0821a) objH4;
                                boolean zH5 = c0510p3.h(e10);
                                Object objH5 = c0510p3.H();
                                if (zH5 || objH5 == t8) {
                                    objH5 = new C1641h(e10, 2);
                                    c0510p3.b0(objH5);
                                }
                                AbstractC2210a.a(interfaceC0821a, (e4.k) objH5, c0510p3, 0);
                                break;
                            case 3:
                                C0510p c0510p4 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("e", c0174k);
                                Bundle bundleG2 = c0174k.g();
                                kotlin.jvm.internal.l.c(bundleG2);
                                String string = bundleG2.getString("slug");
                                kotlin.jvm.internal.l.c(string);
                                E e11 = e7;
                                boolean zH6 = c0510p4.h(e11);
                                Object objH6 = c0510p4.H();
                                Object obj6 = C0502l.a;
                                if (zH6 || objH6 == obj6) {
                                    objH6 = new C1641h(e11, 1);
                                    c0510p4.b0(objH6);
                                }
                                e4.k kVar2 = (e4.k) objH6;
                                boolean zH7 = c0510p4.h(e11);
                                Object objH7 = c0510p4.H();
                                if (zH7 || objH7 == obj6) {
                                    objH7 = new C1642i(e11, 2);
                                    c0510p4.b0(objH7);
                                }
                                InterfaceC0821a interfaceC0821a2 = (InterfaceC0821a) objH7;
                                boolean zH8 = c0510p4.h(e11);
                                Object objH8 = c0510p4.H();
                                if (zH8 || objH8 == obj6) {
                                    objH8 = new C1642i(e11, 3);
                                    c0510p4.b0(objH8);
                                }
                                AbstractC1994a.e(string, kVar2, interfaceC0821a2, (InterfaceC0821a) objH8, null, c0510p4, 0);
                                break;
                            case GzipHeaderFlags.EXTRA /* 4 */:
                                C0510p c0510p5 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("e", c0174k);
                                Bundle bundleG3 = c0174k.g();
                                kotlin.jvm.internal.l.c(bundleG3);
                                String string2 = bundleG3.getString("episode");
                                kotlin.jvm.internal.l.c(string2);
                                E e12 = e7;
                                boolean zH9 = c0510p5.h(e12) | c0510p5.f(string2);
                                Object objH9 = c0510p5.H();
                                if (zH9 || objH9 == C0502l.a) {
                                    objH9 = new C1646m(e12, null, string2);
                                    c0510p5.b0(objH9);
                                }
                                C0486d.e(c0510p5, (n) objH9, string2);
                                break;
                            case 5:
                                C0510p c0510p6 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e13 = e7;
                                boolean zH10 = c0510p6.h(e13);
                                Object objH10 = c0510p6.H();
                                T t9 = C0502l.a;
                                if (zH10 || objH10 == t9) {
                                    objH10 = new C1641h(e13, 4);
                                    c0510p6.b0(objH10);
                                }
                                e4.k kVar3 = (e4.k) objH10;
                                boolean zH11 = c0510p6.h(e13);
                                Object objH11 = c0510p6.H();
                                if (zH11 || objH11 == t9) {
                                    objH11 = new C1641h(e13, 5);
                                    c0510p6.b0(objH11);
                                }
                                A3.c.a(kVar3, (e4.k) objH11, null, c0510p6, 0);
                                break;
                            case 6:
                                C0510p c0510p7 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e14 = e7;
                                boolean zH12 = c0510p7.h(e14);
                                Object objH12 = c0510p7.H();
                                T t10 = C0502l.a;
                                if (zH12 || objH12 == t10) {
                                    objH12 = new C1641h(e14, 13);
                                    c0510p7.b0(objH12);
                                }
                                e4.k kVar4 = (e4.k) objH12;
                                boolean zH13 = c0510p7.h(e14);
                                Object objH13 = c0510p7.H();
                                if (zH13 || objH13 == t10) {
                                    objH13 = new C1641h(e14, 14);
                                    c0510p7.b0(objH13);
                                }
                                AbstractC0847h.e(kVar4, (e4.k) objH13, null, c0510p7, 0);
                                break;
                            case 7:
                                C0510p c0510p8 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e15 = e7;
                                boolean zH14 = c0510p8.h(e15);
                                Object objH14 = c0510p8.H();
                                T t11 = C0502l.a;
                                if (zH14 || objH14 == t11) {
                                    objH14 = new C1641h(e15, 11);
                                    c0510p8.b0(objH14);
                                }
                                e4.k kVar5 = (e4.k) objH14;
                                boolean zH15 = c0510p8.h(e15);
                                Object objH15 = c0510p8.H();
                                if (zH15 || objH15 == t11) {
                                    objH15 = new C1642i(e15, 12);
                                    c0510p8.b0(objH15);
                                }
                                AbstractC1856g.a(kVar5, (InterfaceC0821a) objH15, null, c0510p8, 0);
                                break;
                            case 8:
                                C0510p c0510p9 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e16 = e7;
                                boolean zH16 = c0510p9.h(e16);
                                Object objH16 = c0510p9.H();
                                Object obj7 = C0502l.a;
                                if (zH16 || objH16 == obj7) {
                                    objH16 = new C1641h(e16, 12);
                                    c0510p9.b0(objH16);
                                }
                                e4.k kVar6 = (e4.k) objH16;
                                boolean zH17 = c0510p9.h(e16);
                                Object objH17 = c0510p9.H();
                                if (zH17 || objH17 == obj7) {
                                    objH17 = new C1642i(e16, 13);
                                    c0510p9.b0(objH17);
                                }
                                AbstractC2048f.c(kVar6, (InterfaceC0821a) objH17, null, null, c0510p9, 0, 12);
                                break;
                            case 9:
                                C0510p c0510p10 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e17 = e7;
                                boolean zH18 = c0510p10.h(e17);
                                Object objH18 = c0510p10.H();
                                if (zH18 || objH18 == C0502l.a) {
                                    objH18 = new C1641h(e17, 3);
                                    c0510p10.b0(objH18);
                                }
                                AbstractC2048f.b((e4.k) objH18, null, c0510p10, 0);
                                break;
                            case 10:
                                C0510p c0510p11 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e18 = e7;
                                boolean zH19 = c0510p11.h(e18);
                                Object objH19 = c0510p11.H();
                                Object obj8 = C0502l.a;
                                if (zH19 || objH19 == obj8) {
                                    objH19 = new C1641h(e18, 7);
                                    c0510p11.b0(objH19);
                                }
                                e4.k kVar7 = (e4.k) objH19;
                                boolean zH20 = c0510p11.h(e18);
                                Object objH20 = c0510p11.H();
                                if (zH20 || objH20 == obj8) {
                                    objH20 = new C1641h(e18, 8);
                                    c0510p11.b0(objH20);
                                }
                                e4.k kVar8 = (e4.k) objH20;
                                boolean zH21 = c0510p11.h(e18);
                                Object objH21 = c0510p11.H();
                                if (zH21 || objH21 == obj8) {
                                    objH21 = new C1642i(e18, 6);
                                    c0510p11.b0(objH21);
                                }
                                AbstractC2152b.g(kVar7, kVar8, (InterfaceC0821a) objH21, null, c0510p11, 0);
                                break;
                            default:
                                C0510p c0510p12 = (C0510p) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.l.f("$this$composable", c1609g);
                                kotlin.jvm.internal.l.f("it", c0174k);
                                E e19 = e7;
                                boolean zH22 = c0510p12.h(e19);
                                Object objH22 = c0510p12.H();
                                if (zH22 || objH22 == C0502l.a) {
                                    objH22 = new C1642i(e19, 1);
                                    c0510p12.b0(objH22);
                                }
                                AbstractC1790h.a((InterfaceC0821a) objH22, null, c0510p12, 0);
                                break;
                        }
                        return O3.C.a;
                    }
                }), 254);
                break;
            case 8:
                l.f("$this$DisposableEffect", (H) obj);
                C0177n c0177n = new C0177n(2, (z) this.f4071m);
                AbstractC0690q abstractC0690q = (AbstractC0690q) this.f4070l;
                abstractC0690q.a(c0177n);
                break;
            case 9:
                l.f("$this$DisposableEffect", (H) obj);
                C0177n c0177n2 = new C0177n(3, (y) this.f4071m);
                AbstractC0690q abstractC0690q2 = (AbstractC0690q) this.f4070l;
                abstractC0690q2.a(c0177n2);
                break;
            case 10:
                l.f("$this$DisposableEffect", (H) obj);
                break;
            case 11:
                Context context = (Context) obj;
                l.f("c", context);
                F2.E e8 = new F2.E(context);
                e8.setPlayer((ExoPlayer) this.f4070l);
                e8.setUseController(true);
                e8.setShowNextButton(false);
                e8.setShowPreviousButton(false);
                e8.setControllerShowTimeoutMs(5000);
                e8.setControllerHideOnTouch(true);
                e8.setControllerAutoShow(true);
                e8.setControllerVisibilityListener(new C0768b((Z) this.f4071m));
                e8.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                break;
            case 12:
                C2165f c2165f = (C2165f) obj;
                l.f("$this$LazyRow", c2165f);
                Z z7 = (Z) this.f4070l;
                c2165f.x0(((List) z7.getValue()).size(), null, w.k.f16736n, new W.a(true, 879183948, new v3.d(1, (Z) this.f4071m, z7)));
                break;
            default:
                C2165f c2165f2 = (C2165f) obj;
                l.f("$this$LazyColumn", c2165f2);
                List<ScheduleItem> items = ((ScheduleDay) this.f4070l).getItems();
                c2165f2.x0(items.size(), new U(5, new s3.T(17), items), new u(15, items), new W.a(true, -632812321, new w(items, (k) this.f4071m, 10)));
                break;
        }
        return O3.C.a;
    }
}

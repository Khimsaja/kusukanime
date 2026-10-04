package x3;

import D3.l;
import L.E0;
import O.C0486d;
import O.C0502l;
import O.C0509o0;
import O.C0510p;
import O.T;
import O.Z;
import O3.C;
import Z5.A;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.kusukanime.data.OtaCheck;
import com.kusukanime.data.OtaInfo;
import e4.InterfaceC0821a;
import e4.k;
import e4.n;
import u3.C2076a;

/* renamed from: x3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2254a {
    public static final W.a a = new W.a(false, -238328231, new C2076a(17));

    /* renamed from: b, reason: collision with root package name */
    public static final W.a f17311b = new W.a(false, 1634291029, new C2076a(18));

    public static final void a(final h hVar, C0510p c0510p, final int i7) {
        OtaInfo latest;
        c0510p.T(-40142836);
        if (((i7 | (c0510p.h(hVar) ? 4 : 2)) & 3) == 2 && c0510p.y()) {
            c0510p.M();
        } else {
            c0510p.O();
            if ((i7 & 1) != 0 && !c0510p.x()) {
                c0510p.M();
            }
            c0510p.q();
            Context context = (Context) c0510p.k(AndroidCompositionLocals_androidKt.f10669b);
            C c2 = C.a;
            boolean zH = c0510p.h(hVar) | c0510p.h(context);
            Object objH = c0510p.H();
            Object obj = C0502l.a;
            if (zH || objH == obj) {
                objH = new c(null, context, hVar);
                c0510p.b0(objH);
            }
            C0486d.e(c0510p, (n) objH, c2);
            Z zV = C0486d.v(hVar.f17331c, c0510p);
            Z zV2 = C0486d.v(hVar.f17333e, c0510p);
            Z zV3 = C0486d.v(hVar.f17335g, c0510p);
            Z zV4 = C0486d.v(hVar.f17337i, c0510p);
            Object objH2 = c0510p.H();
            if (objH2 == obj) {
                objH2 = C0486d.K(null, T.f7049p);
                c0510p.b0(objH2);
            }
            Z z7 = (Z) objH2;
            OtaCheck otaCheck = (OtaCheck) zV.getValue();
            if (otaCheck == null || (latest = otaCheck.getLatest()) == null) {
                C0509o0 c0509o0S = c0510p.s();
                if (c0509o0S != null) {
                    final int i8 = 0;
                    c0509o0S.f7111d = new n(hVar, i7, i8) { // from class: x3.b

                        /* renamed from: k, reason: collision with root package name */
                        public final /* synthetic */ int f17312k;

                        /* renamed from: l, reason: collision with root package name */
                        public final /* synthetic */ h f17313l;

                        {
                            this.f17312k = i8;
                        }

                        @Override // e4.n
                        public final Object invoke(Object obj2, Object obj3) {
                            int i9 = this.f17312k;
                            C0510p c0510p2 = (C0510p) obj2;
                            ((Integer) obj3).getClass();
                            switch (i9) {
                                case 0:
                                    AbstractC2254a.a(this.f17313l, c0510p2, C0486d.V(9));
                                    break;
                                case 1:
                                    AbstractC2254a.a(this.f17313l, c0510p2, C0486d.V(9));
                                    break;
                                default:
                                    AbstractC2254a.a(this.f17313l, c0510p2, C0486d.V(9));
                                    break;
                            }
                            return C.a;
                        }
                    };
                    return;
                }
                return;
            }
            OtaCheck otaCheck2 = (OtaCheck) zV.getValue();
            if (otaCheck2 == null || !otaCheck2.getUpdate()) {
                C0509o0 c0509o0S2 = c0510p.s();
                if (c0509o0S2 != null) {
                    final int i9 = 1;
                    c0509o0S2.f7111d = new n(hVar, i7, i9) { // from class: x3.b

                        /* renamed from: k, reason: collision with root package name */
                        public final /* synthetic */ int f17312k;

                        /* renamed from: l, reason: collision with root package name */
                        public final /* synthetic */ h f17313l;

                        {
                            this.f17312k = i9;
                        }

                        @Override // e4.n
                        public final Object invoke(Object obj2, Object obj3) {
                            int i92 = this.f17312k;
                            C0510p c0510p2 = (C0510p) obj2;
                            ((Integer) obj3).getClass();
                            switch (i92) {
                                case 0:
                                    AbstractC2254a.a(this.f17313l, c0510p2, C0486d.V(9));
                                    break;
                                case 1:
                                    AbstractC2254a.a(this.f17313l, c0510p2, C0486d.V(9));
                                    break;
                                default:
                                    AbstractC2254a.a(this.f17313l, c0510p2, C0486d.V(9));
                                    break;
                            }
                            return C.a;
                        }
                    };
                    return;
                }
                return;
            }
            String version_name = latest.getVersion_name();
            boolean zF = c0510p.f(latest) | c0510p.h(context);
            Object objH3 = c0510p.H();
            if (zF || objH3 == obj) {
                objH3 = new io.github.jan.supabase.auth.d(context, latest, z7, 6);
                c0510p.b0(objH3);
            }
            C0486d.c(version_name, (k) objH3, c0510p);
            boolean zF2 = c0510p.f(zV) | c0510p.h(hVar);
            Object objH4 = c0510p.H();
            if (zF2 || objH4 == obj) {
                objH4 = new A(13, hVar, zV);
                c0510p.b0(objH4);
            }
            E0.a((InterfaceC0821a) objH4, W.f.b(-1816098620, new l(context, hVar, latest, z7, zV2, 1), c0510p), null, W.f.b(-426804606, new A3.l(hVar, context, zV, 11), c0510p), W.f.b(962489408, new D3.c(7, latest), c0510p), W.f.b(1657136415, new l(latest, zV3, zV2, zV4, z7, 2), c0510p), null, 0L, 0L, 0L, 0L, 0.0f, null, c0510p, 1772592, 16276);
        }
        C0509o0 c0509o0S3 = c0510p.s();
        if (c0509o0S3 != null) {
            final int i10 = 2;
            c0509o0S3.f7111d = new n(hVar, i7, i10) { // from class: x3.b

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ int f17312k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ h f17313l;

                {
                    this.f17312k = i10;
                }

                @Override // e4.n
                public final Object invoke(Object obj2, Object obj3) {
                    int i92 = this.f17312k;
                    C0510p c0510p2 = (C0510p) obj2;
                    ((Integer) obj3).getClass();
                    switch (i92) {
                        case 0:
                            AbstractC2254a.a(this.f17313l, c0510p2, C0486d.V(9));
                            break;
                        case 1:
                            AbstractC2254a.a(this.f17313l, c0510p2, C0486d.V(9));
                            break;
                        default:
                            AbstractC2254a.a(this.f17313l, c0510p2, C0486d.V(9));
                            break;
                    }
                    return C.a;
                }
            };
        }
    }
}

package androidx.compose.ui.platform;

import D.D0;
import D.K;
import D0.b;
import F.w;
import H.M;
import L2.f;
import O.AbstractC0505m0;
import O.C0486d;
import O.C0502l;
import O.C0507n0;
import O.C0509o0;
import O.C0510p;
import O.C0525y;
import O.S0;
import O.T;
import O.Z;
import O3.C;
import W.a;
import X.j;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import c.C0743e;
import com.kusukanime.R;
import e4.k;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import o.C1622t;
import p.C1724K;
import t1.AbstractC2034a;
import z0.AbstractC2455l0;
import z0.C2435b0;
import z0.C2454l;
import z0.C2458n;
import z0.C2461o0;
import z0.C2463p0;
import z0.C2471u;
import z0.P;
import z0.Q;
import z0.S;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\" \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\u000e\u0010\b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"LO/m0;", "Landroidx/lifecycle/v;", "getLocalLifecycleOwner", "()LO/m0;", "getLocalLifecycleOwner$annotations", "()V", "LocalLifecycleOwner", "Landroid/content/res/Configuration;", "configuration", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {
    public static final C0525y a = new C0525y(P.f18658m);

    /* renamed from: b, reason: collision with root package name */
    public static final S0 f10669b = new S0(P.f18659n);

    /* renamed from: c, reason: collision with root package name */
    public static final S0 f10670c = new S0(P.f18660o);

    /* renamed from: d, reason: collision with root package name */
    public static final S0 f10671d = new S0(P.f18661p);

    /* renamed from: e, reason: collision with root package name */
    public static final S0 f10672e = new S0(P.f18662q);

    /* renamed from: f, reason: collision with root package name */
    public static final S0 f10673f = new S0(P.f18663r);

    public static final void a(C2471u c2471u, a aVar, C0510p c0510p, int i7) {
        Z z7;
        boolean z8;
        c0510p.T(1396852028);
        if ((((c0510p.h(c2471u) ? 4 : 2) | i7 | (c0510p.h(aVar) ? 32 : 16)) & 19) == 18 && c0510p.y()) {
            c0510p.M();
        } else {
            Context context = c2471u.getContext();
            Object objH = c0510p.H();
            Object obj = C0502l.a;
            if (objH == obj) {
                objH = C0486d.K(new Configuration(context.getResources().getConfiguration()), T.f7049p);
                c0510p.b0(objH);
            }
            Z z9 = (Z) objH;
            Object objH2 = c0510p.H();
            if (objH2 == obj) {
                objH2 = new D0(3, z9);
                c0510p.b0(objH2);
            }
            c2471u.setConfigurationChangeObserver((k) objH2);
            Object objH3 = c0510p.H();
            if (objH3 == obj) {
                objH3 = new C2435b0();
                c0510p.b0(objH3);
            }
            C2435b0 c2435b0 = (C2435b0) objH3;
            C2454l viewTreeOwners = c2471u.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            Object objH4 = c0510p.H();
            f fVar = viewTreeOwners.f18782b;
            if (objH4 == obj) {
                Object parent = c2471u.getParent();
                l.d("null cannot be cast to non-null type android.view.View", parent);
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                LinkedHashMap linkedHashMap = null;
                String strValueOf = tag instanceof String ? (String) tag : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view.getId());
                }
                String str = j.class.getSimpleName() + ':' + strValueOf;
                w wVarB = fVar.b();
                Bundle bundleT = wVarB.t(str);
                if (bundleT != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str2 : bundleT.keySet()) {
                        Z z10 = z9;
                        ArrayList parcelableArrayList = bundleT.getParcelableArrayList(str2);
                        l.d("null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }", parcelableArrayList);
                        linkedHashMap.put(str2, parcelableArrayList);
                        z9 = z10;
                        bundleT = bundleT;
                    }
                }
                z7 = z9;
                C2458n c2458n = C2458n.f18812p;
                S0 s02 = X.l.a;
                X.k kVar = new X.k(linkedHashMap, c2458n);
                try {
                    wVarB.J(str, new C0743e(2, kVar));
                    z8 = true;
                } catch (IllegalArgumentException unused) {
                    z8 = false;
                }
                Object c2461o0 = new C2461o0(kVar, new C2463p0(z8, wVarB, str));
                c0510p.b0(c2461o0);
                objH4 = c2461o0;
            } else {
                z7 = z9;
            }
            Object obj2 = (C2461o0) objH4;
            C c2 = C.a;
            boolean zH = c0510p.h(obj2);
            Object objH5 = c0510p.H();
            if (zH || objH5 == obj) {
                objH5 = new C1622t(17, obj2);
                c0510p.b0(objH5);
            }
            C0486d.c(c2, (k) objH5, c0510p);
            Configuration configuration = (Configuration) z7.getValue();
            Object objH6 = c0510p.H();
            if (objH6 == obj) {
                objH6 = new D0.a();
                c0510p.b0(objH6);
            }
            D0.a aVar2 = (D0.a) objH6;
            Object objH7 = c0510p.H();
            Object obj3 = objH7;
            if (objH7 == obj) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                c0510p.b0(configuration2);
                obj3 = configuration2;
            }
            Configuration configuration3 = (Configuration) obj3;
            Object objH8 = c0510p.H();
            if (objH8 == obj) {
                objH8 = new Q(configuration3, aVar2);
                c0510p.b0(objH8);
            }
            Q q6 = (Q) objH8;
            boolean zH2 = c0510p.h(context);
            Object objH9 = c0510p.H();
            if (zH2 || objH9 == obj) {
                objH9 = new C1724K(28, context, q6);
                c0510p.b0(objH9);
            }
            C0486d.c(aVar2, (k) objH9, c0510p);
            Object objH10 = c0510p.H();
            if (objH10 == obj) {
                objH10 = new b();
                c0510p.b0(objH10);
            }
            b bVar = (b) objH10;
            Object objH11 = c0510p.H();
            if (objH11 == obj) {
                objH11 = new S(bVar);
                c0510p.b0(objH11);
            }
            S s7 = (S) objH11;
            boolean zH3 = c0510p.h(context);
            Object objH12 = c0510p.H();
            if (zH3 || objH12 == obj) {
                objH12 = new C1724K(29, context, s7);
                c0510p.b0(objH12);
            }
            C0486d.c(bVar, (k) objH12, c0510p);
            AbstractC0505m0 abstractC0505m0 = AbstractC2455l0.f18801t;
            C0486d.b(new C0507n0[]{a.a((Configuration) z7.getValue()), f10669b.a(context), AbstractC2034a.a.a(viewTreeOwners.a), f10672e.a(fVar), X.l.a.a(obj2), f10673f.a(c2471u.getView()), f10670c.a(aVar2), f10671d.a(bVar), abstractC0505m0.a(Boolean.valueOf(((Boolean) c0510p.k(abstractC0505m0)).booleanValue() | c2471u.getScrollCaptureInProgress$ui_release()))}, W.f.b(1471621628, new K(c2471u, c2435b0, aVar, 7), c0510p), c0510p, 56);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new M(i7, 23, c2471u, aVar);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final AbstractC0505m0 getLocalLifecycleOwner() {
        return AbstractC2034a.a;
    }
}

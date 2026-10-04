package d3;

import D4.S;
import H5.AbstractC0281w;
import O4.q;
import P3.E;
import P3.y;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import androidx.lifecycle.AbstractC0690q;
import androidx.lifecycle.InterfaceC0694v;
import f3.InterfaceC0879e;
import f6.AbstractC0905c;
import f6.C0920r;
import g3.AbstractC0945d;
import g3.AbstractC0946e;
import java.util.LinkedHashMap;

/* renamed from: d3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0796h {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public C0791c f11261b;

    /* renamed from: c, reason: collision with root package name */
    public Object f11262c;

    /* renamed from: d, reason: collision with root package name */
    public T2.k f11263d;

    /* renamed from: e, reason: collision with root package name */
    public e3.e f11264e;

    /* renamed from: f, reason: collision with root package name */
    public final y f11265f;

    /* renamed from: g, reason: collision with root package name */
    public final S f11266g;

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f11267h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f11268i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f11269j;

    /* renamed from: k, reason: collision with root package name */
    public final q f11270k;

    /* renamed from: l, reason: collision with root package name */
    public e3.i f11271l;

    /* renamed from: m, reason: collision with root package name */
    public e3.g f11272m;

    /* renamed from: n, reason: collision with root package name */
    public AbstractC0690q f11273n;

    /* renamed from: o, reason: collision with root package name */
    public e3.i f11274o;

    /* renamed from: p, reason: collision with root package name */
    public e3.g f11275p;

    public C0796h(Context context) {
        this.a = context;
        this.f11261b = AbstractC0945d.a;
        this.f11262c = null;
        this.f11263d = null;
        this.f11264e = null;
        this.f11265f = y.f7779k;
        this.f11266g = null;
        this.f11267h = null;
        this.f11268i = true;
        this.f11269j = true;
        this.f11270k = null;
        this.f11271l = null;
        this.f11272m = null;
        this.f11273n = null;
        this.f11274o = null;
        this.f11275p = null;
    }

    public final C0797i a() {
        AbstractC0690q abstractC0690q;
        e3.i iVar;
        AbstractC0690q abstractC0690qF;
        Object obj = this.f11262c;
        if (obj == null) {
            obj = C0799k.a;
        }
        Object obj2 = obj;
        T2.k kVar = this.f11263d;
        C0791c c0791c = this.f11261b;
        Bitmap.Config config = c0791c.f11247g;
        e3.e eVar = this.f11264e;
        if (eVar == null) {
            eVar = c0791c.f11246f;
        }
        e3.e eVar2 = eVar;
        InterfaceC0879e interfaceC0879e = c0791c.f11245e;
        S s7 = this.f11266g;
        C0920r c0920rL = s7 != null ? s7.l() : null;
        if (c0920rL == null) {
            c0920rL = AbstractC0946e.f11706b;
        } else {
            Bitmap.Config config2 = AbstractC0946e.a;
        }
        C0920r c0920r = c0920rL;
        LinkedHashMap linkedHashMap = this.f11267h;
        C0804p c0804p = linkedHashMap != null ? new C0804p(AbstractC0905c.G(linkedHashMap)) : null;
        if (c0804p == null) {
            c0804p = C0804p.f11323b;
        }
        C0804p c0804p2 = c0804p;
        C0791c c0791c2 = this.f11261b;
        boolean z7 = c0791c2.f11248h;
        boolean z8 = c0791c2.f11249i;
        EnumC0790b enumC0790b = c0791c2.f11253m;
        EnumC0790b enumC0790b2 = c0791c2.f11254n;
        EnumC0790b enumC0790b3 = c0791c2.f11255o;
        AbstractC0281w abstractC0281w = c0791c2.a;
        AbstractC0281w abstractC0281w2 = c0791c2.f11242b;
        AbstractC0281w abstractC0281w3 = c0791c2.f11243c;
        AbstractC0281w abstractC0281w4 = c0791c2.f11244d;
        AbstractC0690q abstractC0690q2 = this.f11273n;
        Context context = this.a;
        if (abstractC0690q2 == null) {
            Object baseContext = context;
            while (true) {
                if (baseContext instanceof InterfaceC0694v) {
                    abstractC0690qF = ((InterfaceC0694v) baseContext).f();
                    break;
                }
                if (!(baseContext instanceof ContextWrapper)) {
                    abstractC0690qF = null;
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            if (abstractC0690qF == null) {
                abstractC0690qF = C0795g.a;
            }
            abstractC0690q = abstractC0690qF;
        } else {
            abstractC0690q = abstractC0690q2;
        }
        e3.i iVar2 = this.f11271l;
        if (iVar2 == null) {
            e3.i dVar = this.f11274o;
            if (dVar == null) {
                dVar = new e3.d(context);
            }
            iVar = dVar;
        } else {
            iVar = iVar2;
        }
        e3.g gVar = this.f11272m;
        if (gVar == null && (gVar = this.f11275p) == null) {
            if ((iVar2 instanceof e3.j ? (e3.j) iVar2 : null) != null) {
                throw null;
            }
            gVar = e3.g.f11353l;
        }
        e3.g gVar2 = gVar;
        q qVar = this.f11270k;
        C0802n c0802n = qVar != null ? new C0802n(AbstractC0905c.G(qVar.a)) : null;
        if (c0802n == null) {
            c0802n = C0802n.f11315l;
        }
        return new C0797i(this.a, obj2, kVar, config, eVar2, this.f11265f, interfaceC0879e, c0920r, c0804p2, this.f11268i, z7, z8, this.f11269j, enumC0790b, enumC0790b2, enumC0790b3, abstractC0281w, abstractC0281w2, abstractC0281w3, abstractC0281w4, abstractC0690q, iVar, gVar2, c0802n, new C0792d(this.f11271l, this.f11272m, this.f11264e), this.f11261b);
    }

    public C0796h(C0797i c0797i, Context context) {
        this.a = context;
        this.f11261b = c0797i.f11300z;
        this.f11262c = c0797i.f11276b;
        this.f11263d = c0797i.f11277c;
        C0792d c0792d = c0797i.f11299y;
        this.f11264e = c0792d.f11257c;
        this.f11265f = c0797i.f11280f;
        this.f11266g = c0797i.f11282h.j();
        this.f11267h = E.t0(c0797i.f11283i.a);
        this.f11268i = c0797i.f11284j;
        this.f11269j = c0797i.f11287m;
        this.f11270k = new q(c0797i.f11298x);
        this.f11271l = c0792d.a;
        this.f11272m = c0792d.f11256b;
        if (c0797i.a == context) {
            this.f11273n = c0797i.f11295u;
            this.f11274o = c0797i.f11296v;
            this.f11275p = c0797i.f11297w;
        } else {
            this.f11273n = null;
            this.f11274o = null;
            this.f11275p = null;
        }
    }
}

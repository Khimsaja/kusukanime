package F0;

import D.C0042b;
import P3.y;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import w0.X;
import y0.AbstractC2359f;
import y0.C2349D;
import y0.InterfaceC2366m;
import y0.Y;

/* loaded from: classes.dex */
public final class n {
    public final a0.p a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2102b;

    /* renamed from: c, reason: collision with root package name */
    public final C2349D f2103c;

    /* renamed from: d, reason: collision with root package name */
    public final i f2104d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2105e;

    /* renamed from: f, reason: collision with root package name */
    public n f2106f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2107g;

    public n(a0.p pVar, boolean z7, C2349D c2349d, i iVar) {
        this.a = pVar;
        this.f2102b = z7;
        this.f2103c = c2349d;
        this.f2104d = iVar;
        this.f2107g = c2349d.f17672l;
    }

    public static /* synthetic */ List h(n nVar, int i7) {
        return nVar.g((i7 & 1) != 0 ? !nVar.f2102b : false, (i7 & 2) == 0);
    }

    public final n a(f fVar, e4.k kVar) {
        i iVar = new i();
        iVar.f2097l = false;
        iVar.f2098m = false;
        kVar.invoke(iVar);
        n nVar = new n(new m(kVar), false, new C2349D(true, this.f2107g + (fVar != null ? 1000000000 : 2000000000)), iVar);
        nVar.f2105e = true;
        nVar.f2106f = this;
        return nVar;
    }

    public final void b(C2349D c2349d, ArrayList arrayList) {
        Q.d dVarU = c2349d.u();
        int i7 = dVarU.f7829m;
        if (i7 > 0) {
            Object[] objArr = dVarU.f7827k;
            int i8 = 0;
            do {
                C2349D c2349d2 = (C2349D) objArr[i8];
                if (c2349d2.E() && !c2349d2.f17668Q) {
                    if (c2349d2.f17660G.f(8)) {
                        arrayList.add(P3.r.c(c2349d2, this.f2102b));
                    } else {
                        b(c2349d2, arrayList);
                    }
                }
                i8++;
            } while (i8 < i7);
        }
    }

    public final Y c() {
        if (this.f2105e) {
            n nVarJ = j();
            if (nVarJ != null) {
                return nVarJ.c();
            }
            return null;
        }
        InterfaceC2366m interfaceC2366mZ = P3.r.z(this.f2103c);
        if (interfaceC2366mZ == null) {
            interfaceC2366mZ = this.a;
        }
        return AbstractC2359f.t(interfaceC2366mZ, 8);
    }

    public final void d(ArrayList arrayList) {
        List listO = o(false);
        int size = listO.size();
        for (int i7 = 0; i7 < size; i7++) {
            n nVar = (n) listO.get(i7);
            if (nVar.l()) {
                arrayList.add(nVar);
            } else if (!nVar.f2104d.f2098m) {
                nVar.d(arrayList);
            }
        }
    }

    public final g0.d e() {
        Y yC = c();
        if (yC != null) {
            if (!yC.P0().f10414w) {
                yC = null;
            }
            if (yC != null) {
                return X.f(yC).K(yC, true);
            }
        }
        return g0.d.f11658e;
    }

    public final g0.d f() {
        Y yC = c();
        if (yC != null) {
            if (!yC.P0().f10414w) {
                yC = null;
            }
            if (yC != null) {
                return X.e(yC);
            }
        }
        return g0.d.f11658e;
    }

    public final List g(boolean z7, boolean z8) {
        if (!z7 && this.f2104d.f2098m) {
            return y.f7779k;
        }
        if (!l()) {
            return o(z8);
        }
        ArrayList arrayList = new ArrayList();
        d(arrayList);
        return arrayList;
    }

    public final i i() {
        boolean zL = l();
        i iVar = this.f2104d;
        if (!zL) {
            return iVar;
        }
        i iVar2 = new i();
        iVar2.f2097l = iVar.f2097l;
        iVar2.f2098m = iVar.f2098m;
        iVar2.f2096k.putAll(iVar.f2096k);
        n(iVar2);
        return iVar2;
    }

    public final n j() {
        C2349D c2349dS;
        n nVar = this.f2106f;
        if (nVar != null) {
            return nVar;
        }
        C2349D c2349d = this.f2103c;
        boolean z7 = this.f2102b;
        if (z7) {
            c2349dS = c2349d.s();
            while (c2349dS != null) {
                i iVarO = c2349dS.o();
                if (iVarO != null && iVarO.f2097l) {
                    break;
                }
                c2349dS = c2349dS.s();
            }
            c2349dS = null;
        } else {
            c2349dS = null;
        }
        if (c2349dS == null) {
            C2349D c2349dS2 = c2349d.s();
            while (true) {
                if (c2349dS2 == null) {
                    c2349dS = null;
                    break;
                }
                if (c2349dS2.f17660G.f(8)) {
                    c2349dS = c2349dS2;
                    break;
                }
                c2349dS2 = c2349dS2.s();
            }
        }
        if (c2349dS == null) {
            return null;
        }
        return P3.r.c(c2349dS, z7);
    }

    public final i k() {
        return this.f2104d;
    }

    public final boolean l() {
        return this.f2102b && this.f2104d.f2097l;
    }

    public final boolean m() {
        if (this.f2105e || !h(this, 4).isEmpty()) {
            return false;
        }
        C2349D c2349dS = this.f2103c.s();
        while (true) {
            if (c2349dS == null) {
                c2349dS = null;
                break;
            }
            i iVarO = c2349dS.o();
            if (iVarO != null && iVarO.f2097l) {
                break;
            }
            c2349dS = c2349dS.s();
        }
        return c2349dS == null;
    }

    public final void n(i iVar) {
        if (this.f2104d.f2098m) {
            return;
        }
        List listO = o(false);
        int size = listO.size();
        for (int i7 = 0; i7 < size; i7++) {
            n nVar = (n) listO.get(i7);
            if (!nVar.l()) {
                for (Map.Entry entry : nVar.f2104d.f2096k.entrySet()) {
                    t tVar = (t) entry.getKey();
                    Object value = entry.getValue();
                    LinkedHashMap linkedHashMap = iVar.f2096k;
                    Object obj = linkedHashMap.get(tVar);
                    kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>", tVar);
                    Object objInvoke = tVar.f2154b.invoke(obj, value);
                    if (objInvoke != null) {
                        linkedHashMap.put(tVar, objInvoke);
                    }
                }
                nVar.n(iVar);
            }
        }
    }

    public final List o(boolean z7) {
        if (this.f2105e) {
            return y.f7779k;
        }
        ArrayList arrayList = new ArrayList();
        b(this.f2103c, arrayList);
        if (z7) {
            t tVar = q.f2146s;
            i iVar = this.f2104d;
            LinkedHashMap linkedHashMap = iVar.f2096k;
            Object obj = linkedHashMap.get(tVar);
            if (obj == null) {
                obj = null;
            }
            f fVar = (f) obj;
            if (fVar != null && iVar.f2097l && !arrayList.isEmpty()) {
                arrayList.add(a(fVar, new C0042b(5, fVar)));
            }
            t tVar2 = q.a;
            if (linkedHashMap.containsKey(tVar2) && !arrayList.isEmpty() && iVar.f2097l) {
                Object obj2 = linkedHashMap.get(tVar2);
                if (obj2 == null) {
                    obj2 = null;
                }
                List list = (List) obj2;
                String str = list != null ? (String) P3.q.t0(list) : null;
                if (str != null) {
                    arrayList.add(0, a(null, new l(str, 0)));
                }
            }
        }
        return arrayList;
    }
}

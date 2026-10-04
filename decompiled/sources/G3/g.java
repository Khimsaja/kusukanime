package G3;

import java.lang.reflect.InvocationTargetException;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class g extends j {

    /* renamed from: d, reason: collision with root package name */
    public static final C0181a f2801d = new C0181a(1);
    public final C a;

    /* renamed from: b, reason: collision with root package name */
    public final f[] f2802b;

    /* renamed from: c, reason: collision with root package name */
    public final F.w f2803c;

    public g(C c2, TreeMap treeMap) {
        this.a = c2;
        this.f2802b = (f[]) treeMap.values().toArray(new f[treeMap.size()]);
        this.f2803c = F.w.E((String[]) treeMap.keySet().toArray(new String[treeMap.size()]));
    }

    @Override // G3.j
    public final Object a(m mVar) throws IllegalAccessException, IllegalArgumentException {
        try {
            Object objE = this.a.e();
            try {
                mVar.e();
                while (mVar.m()) {
                    int iO = mVar.O(this.f2803c);
                    if (iO == -1) {
                        mVar.P();
                        mVar.T();
                    } else {
                        f fVar = this.f2802b[iO];
                        fVar.f2799b.set(objE, fVar.f2800c.a(mVar));
                    }
                }
                mVar.i();
                return objE;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        } catch (InstantiationException e7) {
            throw new RuntimeException(e7);
        } catch (InvocationTargetException e8) {
            H3.e.h(e8);
            throw null;
        }
    }

    @Override // G3.j
    public final void c(p pVar, Object obj) throws IllegalAccessException, IllegalArgumentException {
        try {
            pVar.e();
            for (f fVar : this.f2802b) {
                pVar.i(fVar.a);
                fVar.f2800c.c(pVar, fVar.f2799b.get(obj));
            }
            o oVar = (o) pVar;
            oVar.f2828o = false;
            oVar.H(3, 5, '}');
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public final String toString() {
        return "JsonAdapter(" + this.a + ")";
    }
}

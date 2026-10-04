package G3;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* renamed from: G3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0182b extends j {

    /* renamed from: d, reason: collision with root package name */
    public static final C0181a f2786d = new C0181a(0);

    /* renamed from: e, reason: collision with root package name */
    public static final C0181a f2787e = new C0181a(3);
    public final /* synthetic */ int a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final j f2788b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2789c;

    public C0182b(x xVar, Type type, Type type2) {
        Set set = H3.e.a;
        this.f2788b = xVar.a(type, set, null);
        this.f2789c = xVar.a(type2, set, null);
    }

    @Override // G3.j
    public final Object a(m mVar) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                mVar.b();
                while (mVar.m()) {
                    arrayList.add(this.f2788b.a(mVar));
                }
                mVar.g();
                Object objNewInstance = Array.newInstance((Class<?>) this.f2789c, arrayList.size());
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    Array.set(objNewInstance, i7, arrayList.get(i7));
                }
                return objNewInstance;
            default:
                u uVar = new u();
                mVar.e();
                while (mVar.m()) {
                    n nVar = (n) mVar;
                    if (nVar.m()) {
                        nVar.f2820t = nVar.c0();
                        nVar.f2817q = 11;
                    }
                    Object objA = this.f2788b.a(mVar);
                    Object objA2 = ((j) this.f2789c).a(mVar);
                    Object objPut = uVar.put(objA, objA2);
                    if (objPut != null) {
                        throw new D6.r("Map key '" + objA + "' has multiple values at path " + mVar.j() + ": " + objPut + " and " + objA2);
                    }
                }
                mVar.i();
                return uVar;
        }
    }

    @Override // G3.j
    public final void c(p pVar, Object obj) {
        switch (this.a) {
            case 0:
                pVar.b();
                int length = Array.getLength(obj);
                for (int i7 = 0; i7 < length; i7++) {
                    this.f2788b.c(pVar, Array.get(obj, i7));
                }
                ((o) pVar).H(1, 2, ']');
                return;
            default:
                pVar.e();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    if (entry.getKey() == null) {
                        throw new D6.r("Map key is null at " + pVar.g());
                    }
                    int iM = pVar.m();
                    if (iM != 5 && iM != 3) {
                        throw new IllegalStateException("Nesting problem.");
                    }
                    pVar.f2828o = true;
                    this.f2788b.c(pVar, entry.getKey());
                    ((j) this.f2789c).c(pVar, entry.getValue());
                }
                o oVar = (o) pVar;
                oVar.f2828o = false;
                oVar.H(3, 5, '}');
                return;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return this.f2788b + ".array()";
            default:
                return "JsonAdapter(" + this.f2788b + "=" + ((j) this.f2789c) + ")";
        }
    }

    public C0182b(Class cls, j jVar) {
        this.f2789c = cls;
        this.f2788b = jVar;
    }
}

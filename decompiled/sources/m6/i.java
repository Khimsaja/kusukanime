package m6;

import java.io.IOException;

/* loaded from: classes.dex */
public final class i extends i6.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f13021e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f13022f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f13023g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(String str, Object obj, Object obj2, int i7) {
        super(str, true);
        this.f13021e = i7;
        this.f13022f = obj;
        this.f13023g = obj2;
    }

    @Override // i6.a
    public final long a() {
        long jA;
        v[] vVarArr;
        int i7 = 0;
        switch (this.f13021e) {
            case 0:
                n nVar = (n) this.f13022f;
                nVar.f13046k.a(nVar, (A) ((kotlin.jvm.internal.x) this.f13023g).f12720k);
                return -1L;
            case 1:
                try {
                    ((n) this.f13022f).f13046k.b((v) this.f13023g);
                } catch (IOException e7) {
                    n6.o oVar = n6.o.a;
                    n6.o oVar2 = n6.o.a;
                    String str = "Http2Connection.Listener failure for " + ((n) this.f13022f).f13048m;
                    oVar2.getClass();
                    n6.o.i(str, 4, e7);
                    try {
                        ((v) this.f13023g).c(2, e7);
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                A3.q qVar = (A3.q) this.f13022f;
                A a = (A) this.f13023g;
                kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                n nVar2 = (n) qVar.f179l;
                synchronized (nVar2.f13044G) {
                    synchronized (nVar2) {
                        try {
                            A a7 = nVar2.f13038A;
                            A a8 = new A();
                            a8.b(a7);
                            a8.b(a);
                            xVar.f12720k = a8;
                            jA = a8.a() - a7.a();
                            vVarArr = (jA == 0 || nVar2.f13047l.isEmpty()) ? null : (v[]) nVar2.f13047l.values().toArray(new v[0]);
                            A a9 = (A) xVar.f12720k;
                            kotlin.jvm.internal.l.f("<set-?>", a9);
                            nVar2.f13038A = a9;
                            nVar2.f13055t.c(new i(nVar2.f13048m + " onSettings", nVar2, xVar, i7), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        nVar2.f13044G.b((A) xVar.f12720k);
                    } catch (IOException e8) {
                        nVar2.b(2, 2, e8);
                    }
                }
                if (vVarArr != null) {
                    int length = vVarArr.length;
                    while (i7 < length) {
                        v vVar = vVarArr[i7];
                        synchronized (vVar) {
                            vVar.f13094f += jA;
                            if (jA > 0) {
                                vVar.notifyAll();
                            }
                        }
                        i7++;
                    }
                }
                return -1L;
        }
    }
}

package U4;

import B1.G;
import R4.C0570a;
import R4.C0586q;
import X4.AbstractC0608e;
import X4.AbstractC0613j;
import X4.AbstractC0618o;
import X4.C0607d;
import X4.C0609f;
import X4.C0611h;
import X4.r;
import java.io.IOException;

/* loaded from: classes.dex */
public final class d extends AbstractC0618o {

    /* renamed from: t, reason: collision with root package name */
    public static final d f9250t;

    /* renamed from: u, reason: collision with root package name */
    public static final C0570a f9251u = new C0570a(27);

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC0608e f9252k;

    /* renamed from: l, reason: collision with root package name */
    public int f9253l;

    /* renamed from: m, reason: collision with root package name */
    public b f9254m;

    /* renamed from: n, reason: collision with root package name */
    public c f9255n;

    /* renamed from: o, reason: collision with root package name */
    public c f9256o;

    /* renamed from: p, reason: collision with root package name */
    public c f9257p;

    /* renamed from: q, reason: collision with root package name */
    public c f9258q;

    /* renamed from: r, reason: collision with root package name */
    public byte f9259r;

    /* renamed from: s, reason: collision with root package name */
    public int f9260s;

    static {
        d dVar = new d();
        f9250t = dVar;
        dVar.f9254m = b.f9234q;
        c cVar = c.f9242q;
        dVar.f9255n = cVar;
        dVar.f9256o = cVar;
        dVar.f9257p = cVar;
        dVar.f9258q = cVar;
    }

    public d() {
        this.f9259r = (byte) -1;
        this.f9260s = -1;
        this.f9252k = AbstractC0608e.f9883k;
    }

    @Override // X4.w
    public final boolean a() {
        if (this.f9259r == 1) {
            return true;
        }
        this.f9259r = (byte) 1;
        return true;
    }

    @Override // X4.AbstractC0605b
    public final int c() {
        int i7 = this.f9260s;
        if (i7 != -1) {
            return i7;
        }
        int iG = (this.f9253l & 1) == 1 ? G.g(1, this.f9254m) : 0;
        if ((this.f9253l & 2) == 2) {
            iG += G.g(2, this.f9255n);
        }
        if ((this.f9253l & 4) == 4) {
            iG += G.g(3, this.f9256o);
        }
        if ((this.f9253l & 8) == 8) {
            iG += G.g(4, this.f9257p);
        }
        if ((this.f9253l & 16) == 16) {
            iG += G.g(5, this.f9258q);
        }
        int size = this.f9252k.size() + iG;
        this.f9260s = size;
        return size;
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j d() {
        return C0586q.i();
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j e() {
        C0586q c0586qI = C0586q.i();
        c0586qI.l(this);
        return c0586qI;
    }

    @Override // X4.AbstractC0605b
    public final void f(G g4) throws IOException {
        c();
        if ((this.f9253l & 1) == 1) {
            g4.D(1, this.f9254m);
        }
        if ((this.f9253l & 2) == 2) {
            g4.D(2, this.f9255n);
        }
        if ((this.f9253l & 4) == 4) {
            g4.D(3, this.f9256o);
        }
        if ((this.f9253l & 8) == 8) {
            g4.D(4, this.f9257p);
        }
        if ((this.f9253l & 16) == 16) {
            g4.D(5, this.f9258q);
        }
        g4.G(this.f9252k);
    }

    public final boolean i() {
        return (this.f9253l & 4) == 4;
    }

    public d(C0586q c0586q) {
        this.f9259r = (byte) -1;
        this.f9260s = -1;
        this.f9252k = c0586q.f9896k;
    }

    public d(C0609f c0609f, C0611h c0611h) {
        this.f9259r = (byte) -1;
        this.f9260s = -1;
        this.f9254m = b.f9234q;
        c cVar = c.f9242q;
        this.f9255n = cVar;
        this.f9256o = cVar;
        this.f9257p = cVar;
        this.f9258q = cVar;
        C0607d c0607d = new C0607d();
        G gS = G.s(c0607d, 1);
        boolean z7 = false;
        while (!z7) {
            try {
                try {
                    int iN = c0609f.n();
                    if (iN != 0) {
                        a aVarI = null;
                        if (iN == 10) {
                            if ((this.f9253l & 1) == 1) {
                                b bVar = this.f9254m;
                                bVar.getClass();
                                aVarI = new a(0);
                                aVarI.h(bVar);
                            }
                            b bVar2 = (b) c0609f.g(b.f9235r, c0611h);
                            this.f9254m = bVar2;
                            if (aVarI != null) {
                                aVarI.h(bVar2);
                                this.f9254m = aVarI.f();
                            }
                            this.f9253l |= 1;
                        } else if (iN == 18) {
                            if ((this.f9253l & 2) == 2) {
                                c cVar2 = this.f9255n;
                                cVar2.getClass();
                                aVarI = c.i(cVar2);
                            }
                            c cVar3 = (c) c0609f.g(c.f9243r, c0611h);
                            this.f9255n = cVar3;
                            if (aVarI != null) {
                                aVarI.i(cVar3);
                                this.f9255n = aVarI.g();
                            }
                            this.f9253l |= 2;
                        } else if (iN == 26) {
                            if ((this.f9253l & 4) == 4) {
                                c cVar4 = this.f9256o;
                                cVar4.getClass();
                                aVarI = c.i(cVar4);
                            }
                            c cVar5 = (c) c0609f.g(c.f9243r, c0611h);
                            this.f9256o = cVar5;
                            if (aVarI != null) {
                                aVarI.i(cVar5);
                                this.f9256o = aVarI.g();
                            }
                            this.f9253l |= 4;
                        } else if (iN == 34) {
                            if ((this.f9253l & 8) == 8) {
                                c cVar6 = this.f9257p;
                                cVar6.getClass();
                                aVarI = c.i(cVar6);
                            }
                            c cVar7 = (c) c0609f.g(c.f9243r, c0611h);
                            this.f9257p = cVar7;
                            if (aVarI != null) {
                                aVarI.i(cVar7);
                                this.f9257p = aVarI.g();
                            }
                            this.f9253l |= 8;
                        } else if (iN != 42) {
                            if (!c0609f.q(iN, gS)) {
                            }
                        } else {
                            if ((this.f9253l & 16) == 16) {
                                c cVar8 = this.f9258q;
                                cVar8.getClass();
                                aVarI = c.i(cVar8);
                            }
                            c cVar9 = (c) c0609f.g(c.f9243r, c0611h);
                            this.f9258q = cVar9;
                            if (aVarI != null) {
                                aVarI.i(cVar9);
                                this.f9258q = aVarI.g();
                            }
                            this.f9253l |= 16;
                        }
                    }
                    z7 = true;
                } catch (r e7) {
                    e7.f9907k = this;
                    throw e7;
                } catch (IOException e8) {
                    r rVar = new r(e8.getMessage());
                    rVar.f9907k = this;
                    throw rVar;
                }
            } catch (Throwable th) {
                try {
                    gS.m();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    throw th2;
                }
                throw th;
            }
        }
        try {
            gS.m();
        } catch (IOException unused2) {
        } finally {
            this.f9252k = c0607d.g();
        }
    }
}
